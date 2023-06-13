package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FicheiroIO {

    public String importarCodigo() {
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = file.showSaveDialog(null);
        if (i == 0) {
            File arquivo = file.getSelectedFile();
            return lerFicheiro(arquivo);
        }

        return null;
    }

    public String lerFicheiro(File file) {
        String string;
        String conteudo = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            do {
                string = bufferedReader.readLine();
                if (string != null) {
                    conteudo += string + "\n";
                }
            } while (string != null);

            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return conteudo;
    }

}
