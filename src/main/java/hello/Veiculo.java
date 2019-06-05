package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Veiculo {
	private String placa;
	private String placaStatus;
	private String tag;
	private String tagStatus;
	
	List <Veiculo> listaVeiculo = new ArrayList<>();
	
	public String listandoVeiculo () {
		
		listaVeiculo.add(new Veiculo("abc123","Placa Habilitada","tag1","TagComSaldo"));
		listaVeiculo.add(new Veiculo("abc000","Placa Desabilitada","tag2","TagSemSaldo"));
	
		return "ok";
	}
	
	public boolean placaIsValid (String placa) {
		for (Veiculo v : listaVeiculo) {
			if (v.getPlaca().equalsIgnoreCase("abc123")) {
				return true;
			}
		}
		return false;
	}
	
	public String statusPlaca () {
		for (Veiculo v: listaVeiculo) {
			if (v.getPlacaStatus().equalsIgnoreCase("Placa Habilitada")) {
				return "Placa Habilitada!";
			}
		}
		return "Placa Desabilitada";
	}
	
	public boolean tagIsValid (String tag) {
		for (Veiculo v : listaVeiculo) {
			if (v.getTag() == tag) {
				return true;
			}
		}
		return false;
	}
	
	public String statusTag () {
		for (Veiculo v: listaVeiculo) {
			if (v.getTagStatus().equalsIgnoreCase("TagComSaldo")) {
				return "Com Saldo";
			}else {
				return "Sem Saldo";
			}
		}
		return "ok";
	}
	
	public Veiculo(String placa, String placaStatus, String tag, String tagStatus) {
		super();
		this.placa = placa;
		this.placaStatus = placaStatus;
		this.tag = tag;
		this.tagStatus = tagStatus;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlacaStatus() {
		return placaStatus;
	}

	public void setPlacaStatus(String placaStatus) {
		this.placaStatus = placaStatus;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTagStatus() {
		return tagStatus;
	}

	public void setTagStatus(String tagStatus) {
		this.tagStatus = tagStatus;
	}

	

	public Veiculo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}