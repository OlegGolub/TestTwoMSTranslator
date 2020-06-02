package ogr.oleg.test.translator.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ogr.oleg.test.translator.service.WordTranslatorService;
import ogr.oleg.test.translator.validator.WordValidator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translate")
@Api(value = "wordTranslatorController")
public class WordTranslatorController {

    @Autowired
    private WordTranslatorService  wordTranslatorService;

    @Autowired
    private WordValidator wordValidator;

    @ApiOperation(value = "Get translation the word ", nickname = "WordTranslatorController.translateWord",
        notes = "translate by word")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK")})
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> translateWord(@RequestParam String word){
        if(!wordValidator.validate(word)) {
            return new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED);
        }
        else {
            String translateWord = wordTranslatorService.translateTheWord(word);
            if(StringUtils.isEmpty(translateWord)){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }else {
                return ResponseEntity.ok(translateWord);
            }
        }
    }
}
