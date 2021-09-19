/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.Controller;
import condominio.Model.Correios;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tulio
 */
public class DAOCorreios {
    private Connection conexao = new conecta().getConnection();
   
    public void inserir(Correios cor)
    {

        try {
            PreparedStatement stmt ;
            
            String sql = "INSERT INTO correios (cod_documento,id_morador) VALUES (?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,cor.getCod_documento());
            stmt.setInt(2,cor.getId_morador());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        }
      
    }
    
   public ArrayList<Correios>  lista()
   {
       ArrayList<Correios> corr = new ArrayList<>();
       Connection conexao = new conecta().getConnection(); 
       PreparedStatement stmt = null;
       ResultSet rs = null;
       try {
            String sql = "SELECT * FROM apartamentos";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next())
            {
            Correios cor = new Correios();
            cor.setId(rs.getInt("id"));
            cor.setCod_documento(rs.getInt("cod_documento"));
            cor.setId_morador(rs.getInt("id_morador"));
            corr.add(cor);
            }
             stmt.close();
       } catch (SQLException e) {
       }

        return corr;
   }   
    
    
   
    public void Update(Correios cor)
    {
        PreparedStatement stmt ;
            
            String sql = "UPDATE correios SET cod_documento=?,id_morador=?, WHERE id=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,cor.getCod_documento());
            stmt.setInt(2,cor.getId_morador());
            stmt.setInt(3,cor.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Deletar(Correios cor)
    {
        PreparedStatement stmt ;
            
            String sql = " DELETE FROM correios WHERE id=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, cor.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
