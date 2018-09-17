package core.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordViewTest {

    @Test
    public void getWordName(){

        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        assertEquals("Code", wordView.getWordName());
    }

    @Test
    public void setWordName() {
        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        wordView.setWordName("Coding");
        assertEquals("Coding", wordView.getWordName());
    }

    @Test
    public void getDefinition(){
        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        assertEquals("To program instructions", wordView.getDefinition());
    }

    @Test
    public void setDefinition(){
        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        wordView.setDefinition("To write software.");
        assertEquals("To write software.", wordView.getDefinition());
    }

    @Test
    public void getUsedInSentence(){
        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        assertEquals("I want to code.", wordView.getUsedInSentence());
    }

    @Test
    public void setUsedInSentence(){
        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        wordView.setUsedInSentence("I am learning to code.");
        assertEquals("I am learning to code.", wordView.getUsedInSentence());
    }

    @Test
    public void getPronunciation(){
        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        assertEquals("co-duh", wordView.getPronunciation());
    }

    @Test
    public void setPronunciation(){
        WordView wordView = new WordView("Code",
                "To program instructions", "I want to code.", "co-duh");
        wordView.setPronunciation("ka-oh-duh");
        assertEquals("ka-oh-duh", wordView.getPronunciation());
    }
}