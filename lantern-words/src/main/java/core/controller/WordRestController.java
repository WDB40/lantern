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
import java.util.Optional;

@RequestMapping("/API")
@RestController
public class WordRestController {

    @Autowired
    WordRepository wordRepository;

    @RequestMapping("/getWordById")
    public Optional<Word> getWordByName(@RequestParam Integer id){

        Optional<Word> foundWord = wordRepository.findById(id);

        if(foundWord.isPresent()){
            return foundWord;
        }
        else{
            return Optional.empty();
        }

    }

}