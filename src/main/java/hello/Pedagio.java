package hello;

import java.util.ArrayList;
import java.util.List;

public class Pedagio {

	private String codigoPedagio;
	private String local;
	private double valorPassagem;
	
	List<Pedagio> listaPedagios = new ArrayList();
	
	public Pedagio() {
		listaPedagios.add(new Pedagio("p1", "Imigrantes", 23.00));
		listaPedagios.add(new Pedagio("p2", "Castelo Branco", 12.00));
		listaPedagios.add(new Pedagio("p3", "Bandeirantes", 5.00));
	}

	public Pedagio(String codigoPedagio, String local, double d) {
		super();
		this.codigoPedagio = codigoPedagio;
		this.local = local;
		this.valorPassagem = d;
	}

	public String getCodigoPedagio() {
		return codigoPedagio;
	}

	public void setCodigoPedagio(String codigoPedagio) {
		this.codigoPedagio = codigoPedagio;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(int valorPassagem) {
		this.valorPassagem = valorPassagem;
	}
	
	public double getValorPassagem(String codigoPedagio) {
		for(Pedagio x : listaPedagios) {
			if(x.getCodigoPedagio() == codigoPedagio) {
				return x.getValorPassagem();
			}
		}
		
		return 0;
	}
	
	

	
}

