package dal;

import java.util.List;

public interface Dao<Entity> {

    Entity findById(Integer id);
    Entity save(Entity entity);
    Entity update(Entity entity);
    Entity delete(Integer id);
    List<Entity> findAll();
}
