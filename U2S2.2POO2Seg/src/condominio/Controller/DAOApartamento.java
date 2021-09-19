/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.Controller;

import java.sql.PreparedStatement;
import condominio.Model.Apartamentos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAOApartamento {
    private Connection conexao = new conecta().getConnection();
   
    public void inserir(Apartamentos ap)
    {

        try {
            PreparedStatement stmt ;
            
            String sql = "INSERT INTO apartamentos (numero,andar,bloco,qtde_quartos,metragem) VALUES (?,?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,ap.getNumero());
            stmt.setInt(2,ap.getAndar());
            stmt.setInt(3,ap.getBloco());
            stmt.setInt(4,ap.getQtde_quartos());
            stmt.setDouble(5,ap.getMetragem());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        }
      
    }
    
   public ArrayList<Apartamentos>  lista()
   {
       ArrayList<Apartamentos> apart = new ArrayList<>();
       Connection conexao = new conecta().getConnection(); 
       PreparedStatement stmt = null;
       ResultSet rs = null;
       try {
            String sql = "SELECT * FROM apartamentos";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next())
            {
            Apartamentos ap = new Apartamentos();
            ap.setId_apartamento(rs.getInt("id_apartamento"));
            ap.setNumero(rs.getInt("numero"));
            ap.setAndar(rs.getInt("andar"));
            ap.setBloco(rs.getInt("bloco"));
            ap.setQtde_quartos(rs.getInt("qtde_quartos"));
            ap.setMetragem(rs.getDouble("metragem"));
            apart.add(ap);
            }
             stmt.close();
       } catch (SQLException e) {
       }

        return apart;
   }   
    
    
   
    public void Update(Apartamentos ap)
    {
        PreparedStatement stmt ;
            
            String sql = "UPDATE apartamentos SET numero=?,andar=?,bloco=?,qtde_quartos=?,metragem=? WHERE id_apartamento=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,ap.getNumero());
            stmt.setInt(2,ap.getAndar());
            stmt.setInt(3,ap.getBloco());
            stmt.setInt(4,ap.getQtde_quartos());
            stmt.setDouble(5,ap.getMetragem());
            stmt.setInt(6, ap.getId_apartamento());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Deletar(Apartamentos ap)
    {
        PreparedStatement stmt ;
            
            String sql = " DELETE FROM apartamentos WHERE id_apartamento=?";
        try {
         
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, ap.getId_apartamento());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
