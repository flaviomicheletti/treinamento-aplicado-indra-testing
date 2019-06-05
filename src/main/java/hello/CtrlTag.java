package hello;

import java.util.Arrays;
import java.util.List;

public class CtrlTag {

	List<Tag> tags = Arrays.asList(new Tag("1234", 200), new Tag("4568", 0));
	
	public boolean validaTag(String tag) {
		for(int i=0; i<tags.size(); i++) {
			if(tags.get(i).getnTag() == tag) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validaSaldo(String tag) {
		for(int i=0; i<tags.size(); i++) {
			if(tags.get(i).getnTag() == tag) {
				if(tags.get(i).getSaldo() > 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int validaSaldoAtualizado(String tag, int valorDebito) {
		for(int i=0; i<tags.size(); i++) {
			if(tags.get(i).getnTag() == tag) {
				tags.get(i).atualizarTag(valorDebito);
				return tags.get(i).getSaldo();
			}
		}
		
		return 0;
		
	}
}
