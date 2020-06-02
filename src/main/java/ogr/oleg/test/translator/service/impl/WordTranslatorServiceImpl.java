package ogr.oleg.test.translator.service.impl;

import ogr.oleg.test.translator.entity.WordEntity;
import ogr.oleg.test.translator.repository.WordRepository;
import ogr.oleg.test.translator.service.WordTranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordTranslatorServiceImpl implements WordTranslatorService {

  @Autowired
  WordRepository wordRepository;

  @Override
  public String translateTheWord(String word){
    WordEntity  wordEntity = wordRepository.findBySourceWord(word);
    return wordEntity!=null ? wordEntity.getTranslation() : null;
  }
}
