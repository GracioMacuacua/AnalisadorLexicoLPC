package model;

public class Token {

    private Classe classeDoLexema;
    private String lexema;
    private int linhaDoLexema;

    public enum Classe {
        RESERVED_WORD, IDENTIFIER, SPECIAL_SYMBOL, OPERATOR, NUMBER
    }

    public Token(Classe classeDoLexema, String lexema, int linhaDoLexema) {
        this.classeDoLexema = classeDoLexema;
        this.lexema = lexema;
        this.linhaDoLexema = linhaDoLexema;
    }

    public Classe getClasseDoLexema() {
        return classeDoLexema;
    }

    public void setClasseDoLexema(Classe classeLexema) {
        this.classeDoLexema = classeLexema;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getLinhaDoLexema() {
        return linhaDoLexema;
    }

    public void setLinhaDoLexema(int linhaDoLexema) {
        this.linhaDoLexema = linhaDoLexema;
    }

    @Override
    public String toString() {
        return "<" + getClasseDoLexema() + ", " + getLexema() + " , " + getLinhaDoLexema() + ">";
    }

}