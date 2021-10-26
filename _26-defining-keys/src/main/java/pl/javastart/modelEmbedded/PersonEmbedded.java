package pl.javastart.modelEmbedded;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class PersonEmbedded implements Serializable {
    @EmbeddedId
    private PersonEmbeddedKey key;
    private Integer age;

    public PersonEmbeddedKey getKey() {
        return key;
    }

    public void setKey(PersonEmbeddedKey key) {
        this.key = key;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
