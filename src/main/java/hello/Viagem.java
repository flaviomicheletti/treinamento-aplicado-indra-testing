package hello;

import java.util.ArrayList;

public class Viagem {
	
	private Transportador transportador;
	private String status;
	private String tipo;
	
	ArrayList<Pedagio> listaPedagio = new ArrayList<>();

	public Viagem(Transportador transportador, String status, String tipo, ArrayList<Pedagio> listaPedagio) {
		super();
		this.transportador = transportador;
		this.status = status;
		this.tipo = tipo;
		this.listaPedagio = listaPedagio;
	}
	
	public Viagem() {
		
	}

	public String finalizarViagem () {
		boolean viagemFinalizada = false;
		
		if(viagemFinalizada == true) {
		 status = "Viagem Finalizada";
		}
		return "ok!";
	
	}
	
	public String cancelarViagem () {
		boolean CancelDurante = false;
		
		if( CancelDurante == true) {
			return status= "Viagem Cancelada Durante a viagem";
		}else {
			return status = "Viagem Cancelada antes do início.";
		}
	}

	public Transportador getTransportador() {
		return transportador;
	}

	public void setTransportador(Transportador transportador) {
		this.transportador = transportador;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Pedagio> getListaPedagio() {
		return listaPedagio;
	}

	public void setListaPedagio(ArrayList<Pedagio> listaPedagio) {
		this.listaPedagio = listaPedagio;
	}
	

}
