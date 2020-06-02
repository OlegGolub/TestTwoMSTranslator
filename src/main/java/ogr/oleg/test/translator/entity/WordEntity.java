package ogr.oleg.test.translator.entity;

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
  private String sourceWord;
  private String translation;
}
