package core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @NotEmpty
    @Size(max = 25)
    private String word;

    @NotEmpty
    private String definition;

    @NotEmpty
    private String usedInSentence;

    @NotEmpty
    private String pronunciation;

    public Word(String word, String definition, String usedInSentence, String pronunciation) {
        this.word = word;
        this.definition = definition;
        this.usedInSentence = usedInSentence;
        this.pronunciation = pronunciation;
    }

    public Integer getId() {
        return Id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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
