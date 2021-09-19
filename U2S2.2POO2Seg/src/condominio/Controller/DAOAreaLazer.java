/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.Controller;

import condominio.Model.AreaLazer;
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
public class DAOAreaLazer {
     private Connection conexao = new conecta().getConnection();
   
    public void inserir(AreaLazer arl)
    {

        try {
            PreparedStatement stmt ;
            
            String sql = "INSERT INTO arealazer (descricao) VALUES (?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1,arl.getDescricao());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        }
      
    }
    
   public ArrayList<AreaLazer>  lista()
   {
       ArrayList<AreaLazer> apart = new ArrayList<>();
       Connection conexao = new conecta().getConnection(); 
       PreparedStatement stmt = null;
       ResultSet rs = null;
       try {
            String sql = "SELECT * FROM arealazer";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next())
            {
            AreaLazer arl = new AreaLazer();
            arl.setId(rs.getInt("id"));
            arl.setDescricao(rs.getString("descricao"));
            apart.add(arl);
            }
             stmt.close();
       } catch (SQLException e) {
       }

        return apart;
   }   
    
    
   
    public void Update(AreaLazer arl)
    {
        PreparedStatement stmt ;
            
            String sql = "UPDATE arealazer SET descricao=? WHERE id=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,arl.getId());
            stmt.setString(2,arl.getDescricao());
           
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Deletar(AreaLazer arl)
    {
        PreparedStatement stmt ;
            
            String sql = " DELETE FROM arealazer WHERE id_apartamento=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, arl.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
