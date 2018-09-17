package core.controller;

import core.model.Word;
import core.model.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class WordController {

    @Autowired
    WordRepository wordRepository;

    @GetMapping("/addWord")
    public String addWord(Word word) {
        return "addWord";
    }

    @PostMapping("/addWord")
    public String addWord(@Valid Word word, BindingResult result){

        if(result.hasErrors()){
            return "addWord";
        }
        else{
            wordRepository.save(word);
            return "Good";
        }
    }
}
