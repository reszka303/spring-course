package pl.javastart.dao;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

@Transactional
public abstract class GenericDao<T, K> {
    @PersistenceContext
    private EntityManager entityManager;
    private Class<T> type;

    @SuppressWarnings("unchecked")
    GenericDao() {
        type = (Class<T>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public void save(T entity) {
        entityManager.persist(entity);
    }

    public T get(K key) {
        T find = entityManager.find(type, key);
        return find;
    }

    public void remove(T entity) {
        T managedEntity = entityManager.merge(entity);
        entityManager.remove(managedEntity);
    }
}
