package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.config.DatabaseDatasource;

import java.util.List;

@Component
public class NamesRepository {
    private DatabaseDatasource databaseDatasource;

    @Autowired
    public NamesRepository(DatabaseDatasource databaseDatasource) {
        this.databaseDatasource = databaseDatasource;
    }

    public List<String> getAll() {
        return databaseDatasource.getDatabase();
    }
}
