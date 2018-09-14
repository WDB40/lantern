package core.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {

    Word word = new Word("Hyper", "To be excited", "I am hyper","hi-per");

    @Test
    public void getWord() {

        assertEquals("Hyper", word.getWord());
    }

    @Test
    public void setWord() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void getDefinition() {

        assertEquals("To be excited", word.getDefinition());
    }

    @Test
    public void setDefinition() {
    }

    @Test
    public void getUsedInSentence() {
        assertEquals("I am hyper", word.getUsedInSentence());
    }

    @Test
    public void setUsedInSentence() {
    }

    @Test
    public void getPronunciation() {
        assertEquals("hi-per", word.getPronunciation());
    }

    @Test
    public void setPronunciation() {
    }
}