package hello;

import java.util.Arrays;
import java.util.List;

public class Tag {
	private String nTag;
	private int saldo;
	
	
	public Tag() {
		
	}
	
	public Tag(String nTag, int saldo) {
		this.nTag = nTag;
		this.saldo = saldo;
	}

	public String getnTag() {
		return nTag;
	}

	public void setnTag(String nTag) {
		this.nTag = nTag;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void atualizarTag(int valorDebito) {
		this.saldo -= valorDebito;
	}
	
	

}
