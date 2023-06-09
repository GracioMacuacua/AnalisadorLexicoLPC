package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Token;
import model.Token.Classe;

public class Gramatica {

    private static final List<String> PALAVRAS_RESERVADAS = Arrays.asList("div", "or", "and", "not", "if", "then", "else",
            "of", "while", "do", "begin", "end", "read", "write", "var", "array", "function", "procedure",
            "program", "true", "false", "char", "integer", "boolean", "real");

    private static final List<String> OPERADORES = Arrays.asList("+", "-", "*", "/", ":", "=", "<>", "<", ">", "<=", ">=", ":=");

    private static final List<String> SIMBOLOS_ESPECIAIS = Arrays.asList(",", ";", ".", "(", ")");

    public static List<Token> verificar(String codigo) {

        List<Token> listaTokens = new ArrayList<>();
        int i = 0;
        int linha = 1;
        int tamanho = codigo.length();

        while (i < tamanho) {
            char caractereAtual = codigo.charAt(i);

            // Ignora espaços em branco e quebras de linha
            if (caractereAtual == ' ') {
                i++;
                continue;
            } else if (caractereAtual == '\n') {
                linha++;
                i++;
                continue;
            }

            // Verifica e adiciona palavras reservadas, identificadores e literais de
            // caracteres
            if (Character.isLetter(caractereAtual) || caractereAtual == '_') {
                StringBuilder lexemaBuilder = new StringBuilder();
                lexemaBuilder.append(caractereAtual);
                i++;

                while (i < tamanho) {
                    caractereAtual = codigo.charAt(i);

                    if (Character.isLetterOrDigit(caractereAtual) || caractereAtual == '_') {
                        lexemaBuilder.append(caractereAtual);
                        i++;
                    } else {
                        break;
                    }
                }

                String lexema = lexemaBuilder.toString();

                if (PALAVRAS_RESERVADAS.contains(lexema.toLowerCase())) {
                    listaTokens.add(new Token(Classe.RESERVED_WORD, lexema, linha));
                } else {
                    listaTokens.add(new Token(Classe.IDENTIFIER, lexema, linha));
                }
            } else if (Character.isDigit(caractereAtual)) {
                StringBuilder lexemaBuilder = new StringBuilder();
                lexemaBuilder.append(caractereAtual);
                i++;

                while (i < tamanho) {
                    caractereAtual = codigo.charAt(i);

                    if (Character.isDigit(caractereAtual) || caractereAtual == '.') {
                        lexemaBuilder.append(caractereAtual);
                        i++;
                    } else {
                        break;
                    }
                }

                String lexema = lexemaBuilder.toString();

                listaTokens.add(new Token(Classe.NUMBER, lexema, linha));
            } else if (isOperador(caractereAtual)) {
                StringBuilder lexemaBuilder = new StringBuilder();
                lexemaBuilder.append(caractereAtual);
                i++;

                while (i < tamanho) {
                    caractereAtual = codigo.charAt(i);

                    if (isOperador(caractereAtual) || caractereAtual == '=') {
                        lexemaBuilder.append(caractereAtual);
                        i++;
                    } else {
                        break;
                    }
                }

                String lexema = lexemaBuilder.toString();

                if (OPERADORES.contains(lexema)) {
                    listaTokens.add(new Token(Classe.OPERATOR, lexema, linha));
                }
            } else if (isDelimitador(caractereAtual)) {
                StringBuilder lexemaBuilder = new StringBuilder();
                lexemaBuilder.append(caractereAtual);
                i++;

                while (i < tamanho) {
                    caractereAtual = codigo.charAt(i);

                    if (isDelimitador(caractereAtual)) {
                        lexemaBuilder.append(caractereAtual);
                        i++;
                    } else {
                        break;
                    }
                }

                String lexema = lexemaBuilder.toString();

                if (SIMBOLOS_ESPECIAIS.contains(lexema)) {
                    listaTokens.add(new Token(Classe.SPECIAL_SYMBOL, lexema, linha));
                }
            }

            i++;
        }

        return listaTokens;

    }

    private static boolean isDelimitador(char arg) {

        if (SIMBOLOS_ESPECIAIS.contains(String.valueOf(arg))) {
            return true;
        }

        return false;
    }

    private static boolean isOperador(char arg) {

        if (OPERADORES.contains(String.valueOf(arg))) {
            return true;
        }

        return false;
    }

}
