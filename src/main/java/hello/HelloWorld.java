package hello;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args) {
		//LocalTime currentTime = new LocalTime();
		//System.out.println("The current local time is: " + currentTime);
	//	Greeter greeter = new Greeter();
	//	System.out.println(greeter.sayHello());
		

		List<CadastroPlaca> lista = new ArrayList<>();
		
		int opc1 =0;
		
		lista.add(new CadastroPlaca("abc1234"));
		lista.add(new CadastroPlaca("dsr4993"));
		lista.add(new CadastroPlaca("abc5171"));
		
			
	}
	private static CadastroPlaca pesquisarPlaca(List<CadastroPlaca>lista) {
		CadastroPlaca aux= null;
		String consultaPlaca = JOptionPane.showInputDialog("Digite a placa:");
			for (CadastroPlaca cp: lista) {
				if (aux == null) {
					JOptionPane.showMessageDialog( null ,"placa não encontrada!");
				}else {
					JOptionPane.showMessageDialog(null, "Placa encontrada! \n Status: HABILITADA.");
					
				}
			}
		
		return aux;


}
}