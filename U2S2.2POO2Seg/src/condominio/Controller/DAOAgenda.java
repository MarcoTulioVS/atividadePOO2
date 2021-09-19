/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.Controller;

import condominio.Model.Agenda;
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
public class DAOAgenda {
    
    private Connection conexao = new conecta().getConnection();
   
    public void inserir(Agenda ag)
    {

        try {
           
            PreparedStatement stmt ;
            
            String sql = "INSERT INTO agenda (data,id_morador) VALUES (?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1,ag.getData());
            stmt.setInt(2,ag.getId_morador());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        }
      
    }
    
   public ArrayList<Agenda>  lista()
   {
       ArrayList<Agenda> agend = new ArrayList<>();
       Connection conexao = new conecta().getConnection(); 
       PreparedStatement stmt = null;
       ResultSet rs = null;
       try {
            String sql = "SELECT * FROM agenda";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next())
            {
            Agenda ag = new Agenda();
            ag.setId(rs.getInt("id"));
            ag.setData(rs.getString("data"));
            ag.setId_morador(rs.getInt("id_morador"));
            agend.add(ag);
            }
             stmt.close();
       } catch (SQLException e) {
       }

        return agend;
   }   
    
    
   
    public void Update(Agenda ag)
    {
        PreparedStatement stmt ;
            
            String sql = "UPDATE agenda SET data=?,id_morador=? WHERE id=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1,ag.getData());
            stmt.setInt(2,ag.getId_morador());
            stmt.setInt(3,ag.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Deletar(Agenda ag)
    {
        PreparedStatement stmt ;
            
            String sql = " DELETE FROM agenda WHERE id=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, ag.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    
}
