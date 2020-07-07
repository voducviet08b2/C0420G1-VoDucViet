package CaseStudy;

import java.io.Serializable;

public class Word implements Serializable {
    private static final long serialVersionUID = 1L;
    private String keyword;
    private String pronoun;
    private String noun;
    private String adjective;
    private String verb;
    private String synonymous;

    public Word(String keyword, String pronoun, String noun, String adjective, String verb, String synonymous) {
        this.keyword = keyword;
        this.pronoun = pronoun;
        this.noun = noun;
        this.adjective = adjective;
        this.verb = verb;
        this.synonymous = synonymous;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getSynonymous() {
        return synonymous;
    }

    @Override
    public String toString() {
        return "Word{" +
                "keyword='" + keyword + '\'' +
                ", pronoun='" + pronoun + '\'' +
                ", noun='" + noun + '\'' +
                ", adjective='" + adjective + '\'' +
                ", verb='" + verb + '\'' +
                ", synonymous='" + synonymous + '\'' +
                '}';
    }

    public void setSynonymous(String synonymous) {
        this.synonymous = synonymous;
    }
}
