package ogr.oleg.test.translator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "words")
public class WordEntity {

  @Id
  @GeneratedValue
  private String id;

  @Column(name="source_word")
  private String sourceWord;

  @Column(name="translation")
  private String translation;
}
