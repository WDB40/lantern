package core.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {



    @Test
    public void getWord() {

        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        assertEquals("Hyper", word.getWord());
    }

    @Test
    public void setWord() {

        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        word.setWord("After");
        assertEquals("After", word.getWord());
    }

    @Test
    public void getId() {
    }

    @Test
    public void getDefinition() {

        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        assertEquals("To be excited", word.getDefinition());
    }

    @Test
    public void setDefinition() {

        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        word.setDefinition("To be hype");
        assertEquals("To be hype", word.getDefinition());
    }

    @Test
    public void getUsedInSentence() {
        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        assertEquals("I am hyper", word.getUsedInSentence());
    }

    @Test
    public void setUsedInSentence() {

        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        word.setUsedInSentence("I am not hyper");
        assertEquals("I am not hyper", word.getUsedInSentence());
    }

    @Test
    public void getPronunciation() {
        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        assertEquals("hi-per", word.getPronunciation());
    }

    @Test
    public void setPronunciation() {
        Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");
        word.setPronunciation("high-pur");
        assertEquals("high-pur", word.getPronunciation());
    }
}