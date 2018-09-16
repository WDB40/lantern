package core.controller;

import core.model.Word;
import core.model.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/API")
@RestController
public class WordRestController {

    @Autowired
    WordRepository wordRepository;
/*
    @RequestMapping("/addWord")
    public Word addWord(@RequestParam String word, @RequestParam String definition,
                        @RequestParam String usedInSentence, @RequestParam String pronunciation) {

        Word newWord = new Word(word, definition, usedInSentence, pronunciation);
        wordRepository.save(newWord);

        return newWord;
    }
    */

    @PostMapping("/addWord")
    public String addWord(@Valid Word word, BindingResult result){

        if(result.hasErrors()){
            return "Bad";
        }
        else{
            wordRepository.save(word);
            return "Good";
        }
    }
}