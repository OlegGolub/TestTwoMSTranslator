package ogr.oleg.test.translator.repository;

import ogr.oleg.test.translator.entity.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<WordEntity, String> {

  WordEntity findBySourceWord(String word);
}
