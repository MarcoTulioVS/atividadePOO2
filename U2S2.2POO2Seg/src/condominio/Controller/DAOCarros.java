/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.Controller;

import condominio.Model.Carros;
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
public class DAOCarros {
    
    private Connection conexao = new conecta().getConnection();
   
    public void inserir(Carros cars)
    {

        try {
            PreparedStatement stmt ;
            
            String sql = "INSERT INTO carros (marca,modelo,placa,cor,id_apartamento) VALUES (?,?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1,cars.getMarca());
            stmt.setString(2,cars.getModelo());
            stmt.setString(3,cars.getPlaca());
            stmt.setString(4,cars.getCor());
            stmt.setInt(5,cars.getId_apartamento());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        }
      
    }
    
   public ArrayList<Carros>  lista()
   {
       ArrayList<Carros> apart = new ArrayList<>();
       Connection conexao = new conecta().getConnection(); 
       PreparedStatement stmt = null;
       ResultSet rs = null;
       try {
            String sql = "SELECT * FROM carros";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next())
            {
            Carros cars = new Carros();
            cars.setMarca(rs.getString("marca"));
            cars.setModelo(rs.getString("modelo"));
            cars.setPlaca(rs.getString("placa"));
            cars.setCor(rs.getString("cor"));
            cars.setId_apartamento(rs.getInt("id_apartamento"));
            
            apart.add(cars);
            }
             stmt.close();
       } catch (SQLException e) {
       }

        return apart;
   }   
    
    
   
    public void Update(Carros cars)
    {
        PreparedStatement stmt ;
            
            String sql = "UPDATE carros SET marca=?,modelo=?,placa=?,cor=?,id_apartamento=? WHERE id=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1,cars.getMarca());
            stmt.setString(2,cars.getModelo());
            stmt.setString(3,cars.getPlaca());
            stmt.setString(4,cars.getCor());
            stmt.setInt(5,cars.getId_apartamento());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Deletar(Carros cars)
    {
        PreparedStatement stmt ;
            
            String sql = " DELETE FROM carros WHERE id=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, cars.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
}
