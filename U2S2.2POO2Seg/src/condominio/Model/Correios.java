/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.Model;

/**
 *
 * @author marcelo
 */
public class Correios {
    /*
 id, cod_documento,id_morador
*/
    
    private int id;
    private int cod_documento;
    private int id_morador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod_documento() {
        return cod_documento;
    }

    public void setCod_documento(int cod_documento) {
        this.cod_documento = cod_documento;
    }

    public int getId_morador() {
        return id_morador;
    }

    public void setId_morador(int id_morador) {
        this.id_morador = id_morador;
    }
    
    
    
}
