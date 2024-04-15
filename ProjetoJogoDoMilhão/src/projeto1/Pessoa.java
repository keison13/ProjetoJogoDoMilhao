package projeto1;

public class Pessoa {
	    private String name;

	    public Pessoa(String name) {
	    	if (name == null || name.trim().isEmpty()) {
	            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
	        }
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
}
