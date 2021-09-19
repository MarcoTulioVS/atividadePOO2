
package condominio.View;
import condominio.Model.Apartamentos;
import condominio.Controller.DAOApartamento;

import javax.swing.table.DefaultTableModel;


public class Apartamento extends javax.swing.JFrame {

    public Apartamento() {
        initComponents();   
        LerTabela();
    }

   public void LerTabela(){
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       modelo.setNumRows(0);
       DAOApartamento daoaP = new DAOApartamento();
       for(Apartamentos ap: daoaP.lista()){
       modelo.addRow(new Object[]{
         ap.getId_apartamento(),
         ap.getNumero(),
         ap.getAndar(),
         ap.getBloco(),
         ap.getQtde_quartos(),
         ap.getMetragem()
         
       });
       }
       
       }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtAndar = new javax.swing.JTextField();
        jtBloco = new javax.swing.JTextField();
        jtQtde_Quartos = new javax.swing.JTextField();
        jtMetragem = new javax.swing.JTextField();
        jbGravar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jBdeletar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 45, 16);

        jLabel2.setText("Andar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 50, 37, 16);

        jLabel3.setText("Bloco");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 34, 16);

        jLabel4.setText("Quantidade Quartos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 120, 126, 16);

        jLabel5.setText("Metragem");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 120, 80, 16);

        jtCodigo.setEnabled(false);
        getContentPane().add(jtCodigo);
        jtCodigo.setBounds(40, 80, 40, 26);
        getContentPane().add(jtAndar);
        jtAndar.setBounds(270, 80, 100, 26);

        jtBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBlocoActionPerformed(evt);
            }
        });
        getContentPane().add(jtBloco);
        jtBloco.setBounds(30, 150, 90, 26);
        getContentPane().add(jtQtde_Quartos);
        jtQtde_Quartos.setBounds(130, 150, 90, 26);
        getContentPane().add(jtMetragem);
        jtMetragem.setBounds(280, 150, 90, 26);

        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGravar);
        jbGravar.setBounds(420, 10, 90, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero", "Andar", "Bloco", "Qtde_Quartos", "Metragem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 520, 140);

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 60, 90, 50);

        jLabel6.setText("Numero");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 50, 60, 16);
        getContentPane().add(jtNumero);
        jtNumero.setBounds(150, 80, 100, 26);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condominio/View/exit.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 160, 90, 60);

        jBdeletar.setText("Deletar");
        jBdeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeletarActionPerformed(evt);
            }
        });
        getContentPane().add(jBdeletar);
        jBdeletar.setBounds(420, 110, 90, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpa(){
    
        jtCodigo.setText("");
        jtNumero.setText("");
        jtAndar.setText("");
        jtBloco.setText("");
        jtQtde_Quartos.setText("");
        jtMetragem.setText("");
        jtNumero.requestFocus();
    
    }
    
    
    
    
    private void jtBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBlocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBlocoActionPerformed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
       int numero = Integer.parseInt(jtNumero.getText().toString().trim());
       int andar = Integer.parseInt(jtAndar.getText().toString().trim());
       int bloco = Integer.parseInt(jtBloco.getText().toString().trim());
       int qtde_quartos = Integer.parseInt(jtQtde_Quartos.getText().toString().trim());
       double metragem = Double.parseDouble(jtMetragem.getText().toString().trim());
       
       Apartamentos ap = new Apartamentos();
       ap.setNumero(numero);
       ap.setAndar(andar);
       ap.setBloco(bloco);
       ap.setQtde_quartos(qtde_quartos);
       ap.setMetragem(metragem);
       
       DAOApartamento daoInserir = new DAOApartamento();
       daoInserir.inserir(ap);
       LerTabela();
       limpa();
       
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int codigo = Integer.parseInt(jtCodigo.getText().toString().trim());
       int numero = Integer.parseInt(jtNumero.getText().toString().trim());
       int andar = Integer.parseInt(jtAndar.getText().toString().trim());
       int bloco = Integer.parseInt(jtBloco.getText().toString().trim());
       int qtde_quartos = Integer.parseInt(jtQtde_Quartos.getText().toString().trim());
       double metragem = Double.parseDouble(jtMetragem.getText().toString().trim());
       
       Apartamentos ap = new Apartamentos();
       ap.setId_apartamento(codigo);
       ap.setNumero(numero);
       ap.setAndar(andar);
       ap.setBloco(bloco);
       ap.setQtde_quartos(qtde_quartos);
       ap.setMetragem(metragem);
       
       DAOApartamento daoAlterar = new DAOApartamento();
       daoAlterar.Update(ap);
       LerTabela();
       limpa();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
  
       
        
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       if (jTable1.getSelectedRow() != -1) {
        jtCodigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        jtNumero.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
        jtAndar.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
        jtBloco.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
        jtQtde_Quartos.setText(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
        jtMetragem.setText(jTable1.getValueAt(jTable1.getSelectedRow(),5).toString());
       
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBdeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeletarActionPerformed
       int codigo = Integer.parseInt(jtCodigo.getText().toString().trim());
       int numero = Integer.parseInt(jtNumero.getText().toString().trim());
       int andar = Integer.parseInt(jtAndar.getText().toString().trim());
       int bloco = Integer.parseInt(jtBloco.getText().toString().trim());
       int qtde_quartos = Integer.parseInt(jtQtde_Quartos.getText().toString().trim());
       double metragem = Double.parseDouble(jtMetragem.getText().toString().trim());
       
       Apartamentos ap = new Apartamentos();
       ap.setId_apartamento(codigo);
       ap.setNumero(numero);
       ap.setAndar(andar);
       ap.setBloco(bloco);
       ap.setQtde_quartos(qtde_quartos);
       ap.setMetragem(metragem);
       
       DAOApartamento daoDeletar = new DAOApartamento();
       daoDeletar.Deletar(ap);
       LerTabela();
        limpa();
    }//GEN-LAST:event_jBdeletarActionPerformed

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
            java.util.logging.Logger.getLogger(Apartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdeletar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JTextField jtAndar;
    private javax.swing.JTextField jtBloco;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtMetragem;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtQtde_Quartos;
    // End of variables declaration//GEN-END:variables
}
