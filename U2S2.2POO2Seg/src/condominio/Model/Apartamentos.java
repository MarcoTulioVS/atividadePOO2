
package condominio.Model;


public class Apartamentos {
    private int id_apartamento;
    private int numero;
    private int andar;
    private int bloco;
    private int qtde_quartos;
    private double metragem;

    public int getId_apartamento() {
        return id_apartamento;
    }

    public void setId_apartamento(int id_apartamento) {
        this.id_apartamento = id_apartamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getQtde_quartos() {
        return qtde_quartos;
    }

    public void setQtde_quartos(int qtde_quartos) {
        this.qtde_quartos = qtde_quartos;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }
    
}
