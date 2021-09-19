
package condominio.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import condominio.Model.Proprietarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAOProprietario {
    
  private Connection conexao = new conecta().getConnection(); 
    PreparedStatement stmt = null; 
    ResultSet rs = null;
    
 public void Inserir(Proprietarios pro) 
 {
     try {
         String sql = "INSERT INTO proprietarios (nome,cpf,telefone,email,data,apartamento,bloco) VALUES (?,?,?,?,?,?,?)";
         stmt = conexao.prepareStatement(sql);
         stmt.setString(1, pro.getNome());
         stmt.setString(2, pro.getCpf());
         stmt.setString(3, pro.getTelefone());
         stmt.setString(4, pro.getEmail());
         stmt.setDate(5, pro.getData());
         stmt.setInt(6, pro.getApartamento());
         stmt.setInt(7, pro.getBloco());
         stmt.execute();
         JOptionPane.showMessageDialog(null,"Dados cadastrados com Sucesso!!!");
         stmt.close();
     } catch (Exception e) {
     }
 } 
 
 public void Alterar(Proprietarios pro) 
 {
     try {
         String sql = "UPDATE proprietarios SET nome= ?,cpf=?,telefone=?,email=?,data=?,apartamento=?,bloco=? WHERE id_proprietario = ?";
         stmt = conexao.prepareStatement(sql);
         stmt.setString(1, pro.getNome());
         stmt.setString(2, pro.getCpf());
         stmt.setString(3, pro.getTelefone());
         stmt.setString(4, pro.getEmail());
         stmt.setDate(5, pro.getData());
         stmt.setInt(6, pro.getApartamento());
         stmt.setInt(7, pro.getBloco());
         stmt.setInt(8, pro.getId_proprietario());
         stmt.execute();
         JOptionPane.showMessageDialog(null,"Dados Alterados com Sucesso!!!");
         stmt.close();
     } catch (Exception e) {
     }
 } 
 
 public ArrayList<Proprietarios> Listar()
 {
     
     ArrayList<Proprietarios> listaDados = new ArrayList<>();
     try {
         String sql = "SELECT * FROM proprietarios";
         stmt = conexao.prepareStatement(sql);
         rs = stmt.executeQuery();
         while(rs.next())
         {
         Proprietarios p = new Proprietarios();
         p.setId_proprietario(rs.getInt("id_proprietario"));
         p.setNome(rs.getString("nome"));
         p.setCpf(rs.getString("cpf"));
         p.setTelefone(rs.getString("telefone"));
         p.setEmail(rs.getString("email"));
         p.setData(rs.getDate("data"));
         p.setApartamento(rs.getInt("apartamento"));
         p.setBloco(rs.getInt("bloco"));
         listaDados.add(p);
         }
     } catch (SQLException e) {
     }
      return listaDados;
 }
    
}
