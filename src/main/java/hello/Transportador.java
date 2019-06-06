package hello;

import java.util.ArrayList;

public class Transportador {

    private String idTransportador;
    private String nome;
    private ArrayList<Veiculo> listaVeiculos;

    public Transportador() {
    }

    public String getIdTransportador() {
        return idTransportador;
    }
    public void setIdTransportador(String idTransportador) {
        this.idTransportador = idTransportador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
    public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    //Método pare retornar um veículo selecionado pela placa
    public Veiculo getVeiculoByPlaca(String placaProcurada){
        for(Veiculo veiculo : listaVeiculos) {
            if(veiculo.getPlaca() == placaProcurada) {
                return veiculo;
            }
        }
        return null;
    }
}
