package entities;

public class Students {
	private String name;
	private String email;
	
	public Students(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + ", " + email;
	}
}
