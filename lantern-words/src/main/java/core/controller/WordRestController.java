package core.controller;

import core.model.Word;
import core.model.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/API")
@RestController
public class WordRestController {

    @Autowired
    WordRepository wordRepository;

//    Uncomment this method if we are unable to do it via passing the object

//    @RequestMapping("/addWord")
//    public Word addWord(@RequestParam String word, @RequestParam String definition,
//                        @RequestParam String usedInSentence, @RequestParam String pronunciation){
//
//        Word newWord = new Word(word, definition, usedInSentence, pronunciation);
//        wordRepository.save(newWord);
//
//        return newWord;
//    }

    //Testing if we can just pass the word object to the API
    @RequestMapping("/addWord")
    public Word addWord(@RequestParam Word word){

        wordRepository.save(word);

        return word;
    }
}
