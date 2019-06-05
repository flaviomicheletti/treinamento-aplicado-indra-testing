package hello;

import java.util.Arrays;
import java.util.List;

public class CtrlTag {

	//Declaração de lista para mockar os dados
	List<Tag> tags = Arrays.asList(
			new Tag("1234", 200),
			new Tag("4568", 0)
	);

	//Método para validar a Tag
	public boolean validaTag(String tagProcurada) {

		//Loop procurando a tag no array
		for(int i=0; i<tags.size(); i++) {
			if(tags.get(i).getnTag() == tagProcurada) {
				return true;
			}
		}
		return false;
	}

	//Método para validar o saldo
	public boolean validaSaldo(String tag) {

		//Loop procurando a tag no array
		for(int i=0; i<tags.size(); i++) {
			if(tags.get(i).getnTag() == tag) {
				if(tags.get(i).getSaldo() > 0) {
					return true;
				}
			}
		}
		return false;
	}

	//Método para debitar valor do saldo
	public int validaSaldoAtualizado(String tag, int valorDebito) {

		//Loop procurando a tag no array
		for(int i=0; i<tags.size(); i++) {
			if(tags.get(i).getnTag() == tag) {
				tags.get(i).atualizarTag(valorDebito);
				return tags.get(i).getSaldo();
			}
		}
		return 0;
	}
}
