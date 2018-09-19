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
    public Word getWordByName(@RequestParam Integer id){

        Optional<Word> foundWord = wordRepository.findById(id);

        //Google the best way to use the Optional.ifPresent and .Else functions to fix this.
        if(foundWord.isPresent()){
            return foundWord.get();
        }
        else{
            return null;
        }

    }

}