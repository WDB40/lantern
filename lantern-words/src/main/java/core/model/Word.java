package core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @NotEmpty
    private String wordName;

    @NotEmpty
    private String definition;

    @NotEmpty
    private String usedInSentence;

    @NotEmpty
    private String pronunciation;

    public Word(String wordName, String definition, String usedInSentence, String pronunciation) {
        this.wordName = wordName;
        this.definition = definition;
        this.usedInSentence = usedInSentence;
        this.pronunciation = pronunciation;
    }

    public Integer getId() {
        return Id;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getUsedInSentence() {
        return usedInSentence;
    }

    public void setUsedInSentence(String usedInSentence) {
        this.usedInSentence = usedInSentence;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }
}
