package hello;

public class CadastroPlaca {

	
	private String placa ="abc1234";

	public CadastroPlaca() {
	
	}

	public String getPlaca() {
		
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Boolean validarPlaca() {
		
		return true;

	}
	
	public String statusPlaca () {
		String status = "ativo" ;
		
		return status;
	}
}
