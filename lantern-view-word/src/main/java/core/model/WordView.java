package core.model;

public class WordView {

    private String wordName;
    private String definition;
    private String usedInSentence;
    private String pronunciation;

    public WordView(String wordName, String definition, String usedInSentence, String pronunciation){
        this.wordName = wordName;
        this.definition = definition;
        this.usedInSentence = usedInSentence;
        this.pronunciation = pronunciation;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getDefinition(){
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
