/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.View;

import condominio.Controller.DAOProprietario;
import condominio.Model.Proprietarios;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;


public class Proprietario extends javax.swing.JFrame {

   
    public Proprietario() {
        initComponents();
        lerDados();
    }

    public void lerDados()
    {
    DefaultTableModel modelo = (DefaultTableModel)jTproprietario.getModel();
    DAOProprietario daop = new DAOProprietario();
    modelo.setNumRows(0);
        for (Proprietarios p: daop.Listar()) {
            modelo.addRow(new Object[]
            {
            p.getId_proprietario(),
            p.getNome(),
            p.getCpf(),
            p.getTelefone(),
            p.getEmail(),
            p.getData(),
            p.getApartamento(),
            p.getBloco()
            
            });
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jTcpf = new javax.swing.JTextField();
        jTtelefone = new javax.swing.JTextField();
        jTemail = new javax.swing.JTextField();
        jTdata = new javax.swing.JTextField();
        jTapartamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTbloco = new javax.swing.JTextField();
        jBgravar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTproprietario = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jTcodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 37, 16);

        jLabel2.setText("Cpf");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 30, 22, 16);

        jLabel3.setText("Telefone");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 30, 60, 16);

        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 100, 60, 16);

        jLabel5.setText("Data_Nascimento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 100, 130, 16);

        jLabel6.setText("Apartamento");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 90, 100, 20);
        getContentPane().add(jTnome);
        jTnome.setBounds(120, 60, 250, 26);
        getContentPane().add(jTcpf);
        jTcpf.setBounds(390, 60, 110, 26);
        getContentPane().add(jTtelefone);
        jTtelefone.setBounds(520, 60, 120, 26);
        getContentPane().add(jTemail);
        jTemail.setBounds(110, 120, 160, 26);
        getContentPane().add(jTdata);
        jTdata.setBounds(290, 120, 110, 26);
        getContentPane().add(jTapartamento);
        jTapartamento.setBounds(420, 120, 80, 26);

        jLabel7.setText("Bloco");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 90, 34, 16);
        getContentPane().add(jTbloco);
        jTbloco.setBounds(540, 120, 60, 26);

        jBgravar.setText("Gravar");
        jBgravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarActionPerformed(evt);
            }
        });
        getContentPane().add(jBgravar);
        jBgravar.setBounds(20, 380, 97, 60);

        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });
        getContentPane().add(jBsair);
        jBsair.setBounds(300, 380, 75, 60);

        jTproprietario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTproprietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Cpf", "Telefone", "E-mail", "Data_Nascimento", "Apartamento", "Bloco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTproprietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTproprietarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTproprietario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 760, 180);

        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBalterar);
        jBalterar.setBounds(120, 380, 86, 60);

        jTcodigo.setEnabled(false);
        getContentPane().add(jTcodigo);
        jTcodigo.setBounds(30, 60, 50, 26);

        jLabel8.setText("Codigo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 40, 45, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
       dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarActionPerformed
       String nome = jTnome.getText().toString().trim();
       String cpf = jTcpf.getText().toString().trim();
       String telefone = jTtelefone.getText().toString().trim();
       String email = jTemail.getText();
       Date data = Date.valueOf(jTdata.getText());
       int apartamento = Integer.parseInt(jTapartamento.getText().toString().trim());
       int bloco = Integer.parseInt(jTbloco.getText().toString().trim());
       
       Proprietarios p = new Proprietarios();
       p.setNome(nome);
       p.setCpf(cpf);
       p.setTelefone(telefone);
       p.setEmail(email);
       p.setData(data);
       p.setApartamento(apartamento);
       p.setBloco(bloco);
       
        DAOProprietario daop = new DAOProprietario();
        daop.Inserir(p);
        lerDados();
        jTcodigo.setText("");
       jTnome.setText("");
       jTcpf.setText("");
       jTtelefone.setText("");
       jTemail.setText("");
       jTdata.setText("");
       jTapartamento.setText("");
       jTbloco.setText("");
        
    }//GEN-LAST:event_jBgravarActionPerformed

    private void jTproprietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTproprietarioMouseClicked
       if(jTproprietario.getSelectedRow() != -1)
       {
       jTcodigo.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),0).toString());
       jTnome.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),1).toString());
       jTcpf.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),2).toString());
       jTtelefone.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),3).toString());
       jTemail.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),4).toString());
       jTdata.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),5).toString());
       jTapartamento.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),6).toString());
       jTbloco.setText(jTproprietario.getValueAt(jTproprietario.getSelectedRow(),7).toString());
       }
    }//GEN-LAST:event_jTproprietarioMouseClicked

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
       int codigo = Integer.parseInt(jTcodigo.getText().toString().trim());
       String nome = jTnome.getText().toString().trim();
       String cpf = jTcpf.getText().toString().trim();
       String telefone = jTtelefone.getText().toString().trim();
       String email = jTemail.getText();
       Date data = Date.valueOf(jTdata.getText());
       int apartamento = Integer.parseInt(jTapartamento.getText().toString().trim());
       int bloco = Integer.parseInt(jTbloco.getText().toString().trim());
       
       Proprietarios p = new Proprietarios();
       p.setId_proprietario(codigo);
       p.setNome(nome);
       p.setCpf(cpf);
       p.setTelefone(telefone);
       p.setEmail(email);
       p.setData(data);
       p.setApartamento(apartamento);
       p.setBloco(bloco);
       
        DAOProprietario daop = new DAOProprietario();
        daop.Alterar(p);
        lerDados();
       jTcodigo.setText("");
       jTnome.setText("");
       jTcpf.setText("");
       jTtelefone.setText("");
       jTemail.setText("");
       jTdata.setText("");
       jTapartamento.setText("");
       jTbloco.setText("");
    }//GEN-LAST:event_jBalterarActionPerformed

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
            java.util.logging.Logger.getLogger(Proprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proprietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBgravar;
    private javax.swing.JButton jBsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTapartamento;
    private javax.swing.JTextField jTbloco;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTdata;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTable jTproprietario;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables
}
