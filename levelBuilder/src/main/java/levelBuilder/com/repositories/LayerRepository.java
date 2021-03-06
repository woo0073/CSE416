package levelBuilder.com.repositories;

import levelBuilder.com.entities.LayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LayerRepository extends JpaRepository<LayerEntity, Integer> {
    List<LayerEntity> findByMapName(String mapName); //find all the layers in a given map
}
