package ogr.oleg.test.translator.validator.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ogr.oleg.test.translator.validator.WordValidator;
import org.springframework.stereotype.Component;

@Component
public class WordValidatorImpl implements WordValidator {
  String regex = "[а-яёА-ЯЁ]+";
  @Override
  public boolean validate(String word) {
    Pattern pattern = Pattern.compile(regex);
    Matcher m = pattern.matcher(word);
    return m.find();
  }
}
