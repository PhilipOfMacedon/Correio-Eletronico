/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correio.gui;

import correio.core.Correio;
import correio.core.Mensagem;
import correio.utils.RMIUtils;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author filip
 */
public class TerminalCliente extends javax.swing.JFrame {

    private final String username;
    private final String password;
    private final Correio servidor;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public TerminalCliente(String usuario, String senha, String hostname) {
        username = usuario;
        password = senha;
        servidor = RMIUtils.getStub(hostname);
        initComponents();
        labelUser.setText("Usuário: " + usuario);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        painelDeAbas = new javax.swing.JTabbedPane();
        painelMensagens = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoMensagemRecebida = new javax.swing.JTextArea();
        labelRemetente = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        buttonProxima = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelNaoLidas = new javax.swing.JLabel();
        painelEscrever = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textDestinatario = new javax.swing.JTextField();
        textTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMensagemEscrever = new javax.swing.JTextArea();
        buttonEnviar = new javax.swing.JButton();
        labelCaracteres = new javax.swing.JLabel();
        painelUser = new javax.swing.JPanel();
        labelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Correio");

        painelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelTitulo.setPreferredSize(new java.awt.Dimension(523, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CORREIO");

        buttonSair.setBackground(new java.awt.Color(255, 153, 51));
        buttonSair.setText("SAIR");
        buttonSair.setFocusable(false);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(buttonSair))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addGroup(painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelTitulo, java.awt.BorderLayout.PAGE_START);

        painelDeAbas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                painelDeAbasStateChanged(evt);
            }
        });

        jLabel5.setText("Remetente:");

        jLabel6.setText("Título:");

        jLabel7.setText("Mensagem:");

        campoMensagemRecebida.setEditable(false);
        campoMensagemRecebida.setColumns(20);
        campoMensagemRecebida.setLineWrap(true);
        campoMensagemRecebida.setRows(5);
        campoMensagemRecebida.setWrapStyleWord(true);
        jScrollPane3.setViewportView(campoMensagemRecebida);

        labelRemetente.setText("-");

        labelTitulo.setText("-");

        buttonProxima.setText("Próxima");
        buttonProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProximaActionPerformed(evt);
            }
        });

        jLabel8.setText("Data:");

        labelData.setText("-");

        labelNaoLidas.setText("Mensagens não lidas:");

        javax.swing.GroupLayout painelMensagensLayout = new javax.swing.GroupLayout(painelMensagens);
        painelMensagens.setLayout(painelMensagensLayout);
        painelMensagensLayout.setHorizontalGroup(
            painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMensagensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMensagensLayout.createSequentialGroup()
                        .addComponent(labelNaoLidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonProxima))
                    .addGroup(painelMensagensLayout.createSequentialGroup()
                        .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(painelMensagensLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTitulo)
                                    .addComponent(labelRemetente)
                                    .addComponent(labelData))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelMensagensLayout.setVerticalGroup(
            painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMensagensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelRemetente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonProxima)
                    .addComponent(labelNaoLidas))
                .addContainerGap())
        );

        painelDeAbas.addTab("Mensagens", painelMensagens);

        jLabel2.setText("Destinatário:");

        jLabel3.setText("Título:");

        jLabel4.setText("Mensagem:");

        campoMensagemEscrever.setColumns(20);
        campoMensagemEscrever.setLineWrap(true);
        campoMensagemEscrever.setRows(5);
        campoMensagemEscrever.setWrapStyleWord(true);
        campoMensagemEscrever.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoMensagemEscreverKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(campoMensagemEscrever);

        buttonEnviar.setText("Enviar");
        buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarActionPerformed(evt);
            }
        });

        labelCaracteres.setText("Caracteres:");

        javax.swing.GroupLayout painelEscreverLayout = new javax.swing.GroupLayout(painelEscrever);
        painelEscrever.setLayout(painelEscreverLayout);
        painelEscreverLayout.setHorizontalGroup(
            painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscreverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEscreverLayout.createSequentialGroup()
                        .addGroup(painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDestinatario)
                            .addComponent(textTitulo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEscreverLayout.createSequentialGroup()
                        .addComponent(labelCaracteres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEnviar)))
                .addContainerGap())
        );
        painelEscreverLayout.setVerticalGroup(
            painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscreverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEscreverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEnviar)
                    .addComponent(labelCaracteres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelDeAbas.addTab("Escrever", painelEscrever);

        getContentPane().add(painelDeAbas, java.awt.BorderLayout.CENTER);

        painelUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelUser.setMaximumSize(new java.awt.Dimension(32767, 32));
        painelUser.setMinimumSize(new java.awt.Dimension(0, 32));
        painelUser.setPreferredSize(new java.awt.Dimension(523, 32));

        labelUser.setText("Usuário:");

        javax.swing.GroupLayout painelUserLayout = new javax.swing.GroupLayout(painelUser);
        painelUser.setLayout(painelUserLayout);
        painelUserLayout.setHorizontalGroup(
            painelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUser)
                .addContainerGap(460, Short.MAX_VALUE))
        );
        painelUserLayout.setVerticalGroup(
            painelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        getContentPane().add(painelUser, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximaActionPerformed
        try {
            Mensagem mensagem = servidor.getMensagem(username, password);
            painelDeAbasStateChanged(null);
            if (mensagem == null) {
                labelRemetente.setText("-");
                labelTitulo.setText("-");
                labelData.setText("-");
                campoMensagemRecebida.setText("");
            } else {
                labelRemetente.setText(mensagem.getUserNameRemetente());
                labelTitulo.setText(mensagem.getTitulo());
                labelData.setText(dateFormat.format(mensagem.getData()));
                campoMensagemRecebida.setText(mensagem.getTexto());
            }
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, "UÉ, o servidor deu pala auahua",
                            "Deu ruim", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonProximaActionPerformed

    private void campoMensagemEscreverKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMensagemEscreverKeyTyped
        labelCaracteres.setText("Caracteres: " + campoMensagemEscrever.getText().length());
    }//GEN-LAST:event_campoMensagemEscreverKeyTyped

    private void buttonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarActionPerformed
        String destinatario = textDestinatario.getText();
        String titulo = textTitulo.getText();
        String texto = campoMensagemEscrever.getText();
        if (destinatario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pra quem tu vai enviar, fera?",
                            "Oxe", JOptionPane.WARNING_MESSAGE);
        } else if (titulo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "E a mensagem é sobre o que?",
                            "Oxe", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Mensagem mensagem = new Mensagem(username, titulo, texto, new Date());
                servidor.sendMensagem(username, password, mensagem, destinatario);
                JOptionPane.showMessageDialog(null, "Correio enviado meu parceiro!",
                            "Fechou então", JOptionPane.INFORMATION_MESSAGE);
                textDestinatario.setText("");
                textTitulo.setText("");
                campoMensagemEscrever.setText("");
                labelCaracteres.setText("Caracteres: 0");
            } catch (RemoteException ex) {
                JOptionPane.showMessageDialog(null, "UÉ, o servidor deu pala auahua",
                            "Deu ruim", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonEnviarActionPerformed

    private void painelDeAbasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_painelDeAbasStateChanged
        try {
            int naoLidas = servidor.getNMensagens(username, password);
            labelNaoLidas.setText("Mensagens não lidas: " + naoLidas);
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, "UÉ, o servidor deu pala auahua",
                            "Deu ruim", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_painelDeAbasStateChanged

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JButton buttonProxima;
    private javax.swing.JButton buttonSair;
    private javax.swing.JTextArea campoMensagemEscrever;
    private javax.swing.JTextArea campoMensagemRecebida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCaracteres;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelNaoLidas;
    private javax.swing.JLabel labelRemetente;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTabbedPane painelDeAbas;
    private javax.swing.JPanel painelEscrever;
    private javax.swing.JPanel painelMensagens;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JPanel painelUser;
    private javax.swing.JTextField textDestinatario;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}
