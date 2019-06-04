package hello;

import java.util.Arrays;
import java.util.List;

public class Veiculo {
	private String placa;
	private String habilitado;
	private String tag;
	
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, String habilitado, String tag) {
		super();
		this.placa = placa;
		this.habilitado = habilitado;
		this.tag = tag;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
	
	
}
