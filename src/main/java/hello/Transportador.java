package hello;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transportador {

    private String idTransportador;
    private String nome;
    private ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

    //Construtor com dados mockados
    public Transportador() {
        this.listaVeiculos.add(new Veiculo("ABC1234", "Active", "0000"));
    }

    //Getter e Setter IdTransportados
    public String getIdTransportador() { return idTransportador; }
    public void setIdTransportador(String idTransportador) { this.idTransportador = idTransportador; }

    //Getter e Setter Nome
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    //Getter e Setter ListaVeiculos
    public List<Veiculo> getListaVeiculos() { return listaVeiculos; }
    public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) { this.listaVeiculos = listaVeiculos; }

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
