package view;

import controller.FicheiroIO;
import controller.Gramatica;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Token;
import model.Cronometro;

/**
 *
 * @author HelioSimango
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public Tela() {
        initComponents();
        counter = new NumeroLinha(textareaCodigo);
        scrollpaneCodigo.setRowHeaderView(counter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        containerbotoes = new javax.swing.JPanel();
        lblNovoFicheiro = new javax.swing.JLabel();
        lblImportarFicheiro = new javax.swing.JLabel();
        lblIniciarAnalise = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane3 = new javax.swing.JSplitPane();
        scrollpaneCodigo = new javax.swing.JScrollPane();
        textareaCodigo = new javax.swing.JTextArea();
        scrollpaneErros = new javax.swing.JScrollPane();
        taErros = new javax.swing.JTextArea();
        scrollpaneTabela = new javax.swing.JScrollPane();
        tabelaTokens = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirArquivo = new javax.swing.JMenuItem();
        limparTexto = new javax.swing.JMenuItem();
        executarCodigo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        containerbotoes.setBackground(new java.awt.Color(153, 153, 153));

        lblNovoFicheiro.setForeground(new java.awt.Color(255, 255, 255));
        lblNovoFicheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_file_60px.png"))); // NOI18N
        lblNovoFicheiro.setToolTipText("Novo código");
        lblNovoFicheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNovoFicheiroMouseClicked(evt);
            }
        });

        lblImportarFicheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_folder_60px.png"))); // NOI18N
        lblImportarFicheiro.setToolTipText("Importar código");
        lblImportarFicheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImportarFicheiroMouseClicked(evt);
            }
        });

        lblIniciarAnalise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_play_60px.png"))); // NOI18N
        lblIniciarAnalise.setToolTipText("Iniciar análise");
        lblIniciarAnalise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarAnaliseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout containerbotoesLayout = new javax.swing.GroupLayout(containerbotoes);
        containerbotoes.setLayout(containerbotoesLayout);
        containerbotoesLayout.setHorizontalGroup(
            containerbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerbotoesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(containerbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNovoFicheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIniciarAnalise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImportarFicheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        containerbotoesLayout.setVerticalGroup(
            containerbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerbotoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblNovoFicheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblImportarFicheiro)
                .addGap(28, 28, 28)
                .addComponent(lblIniciarAnalise)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setDividerLocation(680);

        jSplitPane3.setDividerLocation(450);
        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        textareaCodigo.setBackground(new java.awt.Color(255, 255, 255));
        textareaCodigo.setColumns(20);
        textareaCodigo.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        textareaCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textareaCodigo.setRows(5);
        textareaCodigo.setTabSize(4);
        scrollpaneCodigo.setViewportView(textareaCodigo);

        jSplitPane3.setTopComponent(scrollpaneCodigo);

        taErros.setEditable(false);
        taErros.setBackground(new java.awt.Color(255, 255, 255));
        taErros.setColumns(20);
        taErros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        taErros.setForeground(new java.awt.Color(0, 0, 0));
        taErros.setRows(5);
        taErros.setTabSize(0);
        scrollpaneErros.setViewportView(taErros);

        jSplitPane3.setRightComponent(scrollpaneErros);

        jSplitPane2.setLeftComponent(jSplitPane3);

        tabelaTokens.setBackground(new java.awt.Color(255, 255, 255));
        tabelaTokens.setForeground(new java.awt.Color(0, 0, 0));
        tabelaTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Token", "Linha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTokens.setMinimumSize(new java.awt.Dimension(300, 500));
        scrollpaneTabela.setViewportView(tabelaTokens);

        jSplitPane2.setRightComponent(scrollpaneTabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(containerbotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("File");

        abrirArquivo.setText("Abrir arquivo");
        abrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArquivoActionPerformed(evt);
            }
        });
        jMenu1.add(abrirArquivo);

        limparTexto.setText("Limpar código");
        limparTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTextoActionPerformed(evt);
            }
        });
        jMenu1.add(limparTexto);

        executarCodigo.setText("Executar");
        executarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarCodigoActionPerformed(evt);
            }
        });
        jMenu1.add(executarCodigo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIniciarAnaliseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarAnaliseMouseClicked
        executar();
    }//GEN-LAST:event_lblIniciarAnaliseMouseClicked

    private void lblImportarFicheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImportarFicheiroMouseClicked
        importarCodigo();
    }//GEN-LAST:event_lblImportarFicheiroMouseClicked

    private void lblNovoFicheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNovoFicheiroMouseClicked
        textareaCodigo.setText(null);
        DefaultTableModel model = (DefaultTableModel) tabelaTokens.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_lblNovoFicheiroMouseClicked

    private void abrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArquivoActionPerformed
        importarCodigo();
    }//GEN-LAST:event_abrirArquivoActionPerformed

    private void limparTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTextoActionPerformed
        textareaCodigo.setText(null);
        DefaultTableModel model = (DefaultTableModel) tabelaTokens.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_limparTextoActionPerformed

    private void executarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarCodigoActionPerformed
        executar();
    }//GEN-LAST:event_executarCodigoActionPerformed

    private void importarCodigo() {
        FicheiroIO ficheiro = new FicheiroIO();
        String codigo = ficheiro.importarCodigo();
        if (codigo != null) {
            textareaCodigo.setText(codigo);
        }
    }

    private void executar() {
        String codigo = textareaCodigo.getText();
        Gramatica gramatica = new Gramatica();
        DefaultTableModel model = (DefaultTableModel) tabelaTokens.getModel();
        model.setNumRows(0);
        Cronometro cronometro = new Cronometro();
        cronometro.start();
        List<Token> lista = gramatica.verificar(codigo);
        taErros.setText("\n\n\n\tAnálise concluída com sucesso em " + String.valueOf(cronometro.stop()) + " milissegundos.");
        cronometro.reiniciarCronometro();
        lista.forEach(t -> {
            Object[] r = {t.getClasseDoLexema(), t.getLexema(), t.getLinhaDoLexema()};
            model.addRow(r);
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirArquivo;
    private javax.swing.JPanel containerbotoes;
    private javax.swing.JMenuItem executarCodigo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JLabel lblImportarFicheiro;
    private javax.swing.JLabel lblIniciarAnalise;
    private javax.swing.JLabel lblNovoFicheiro;
    private javax.swing.JMenuItem limparTexto;
    private javax.swing.JScrollPane scrollpaneCodigo;
    private javax.swing.JScrollPane scrollpaneErros;
    private javax.swing.JScrollPane scrollpaneTabela;
    private javax.swing.JTextArea taErros;
    private javax.swing.JTable tabelaTokens;
    private javax.swing.JTextArea textareaCodigo;
    // End of variables declaration//GEN-END:variables
    private NumeroLinha counter;
}
