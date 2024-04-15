package projeto1;

public class Jogador  extends Pessoa {
	 private int score;
	 private double money; // Dinheiro ganho pelo jogador

	    public Jogador(String name, int score, double money) {
	        super(name);
	        if (score < 0) {
	            throw new IllegalArgumentException("Pontuação não pode ser negativa.");
	        }
	        if (money < 0) {
	            throw new IllegalArgumentException("Dinheiro não pode ser negativo.");
	        }
	        this.score = score;
	        this.money = money;
	    }

	    public int getScore() {
	        return score;
	    }
	    public double getMoney() {
	        return money;
	    }

	    public void setScore(int score) {
	    	 if (score < 0) {
	             throw new IllegalArgumentException("Pontuação não pode ser negativa.");
	         }
	        this.score = score;
	    }
	    public void setMoney(double money) {
	    	if (money < 0) {
	            throw new IllegalArgumentException("Dinheiro não pode ser negativo.");
	        }
	        this.money = money;
	    }

}
