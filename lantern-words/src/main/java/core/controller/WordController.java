package core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordController {

    @GetMapping("/addWord")
    public String addWord() {
        return "addWord";
    }
}
