package entity;

public class User {
	
	private String cpf;
	private String name;
	
	public User(String cpf, String name) {
		this.cpf = cpf;
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getName() {
		return name;
	}


}
