package projeto1;

public class Pergunta{
	    private String questionText;
	    private String[] options;
	    private int correctAnswerIndex;
	    private double value; // Valor em dinheiro da pergunta

	    public Pergunta(String questionText, String[] options, int correctAnswerIndex, double value) {
	    	 if (questionText == null || questionText.trim().isEmpty()) {
	             throw new IllegalArgumentException("Texto da pergunta não pode ser nulo ou vazio.");
	         }
	         if (options == null || options.length < 2) {
	             throw new IllegalArgumentException("Deve haver pelo menos duas opções.");
	         }
	         if (correctAnswerIndex < 0 || correctAnswerIndex >= options.length) {
	             throw new IllegalArgumentException("Índice de resposta correta inválido.");
	         }
	         if (value < 0) {
	             throw new IllegalArgumentException("Valor não pode ser negativo.");
	         }
	        this.questionText = questionText;
	        this.options = options;
	        this.correctAnswerIndex = correctAnswerIndex;
	        this.value = value;
	    }

	    public String getQuestionText() {
	        return questionText;
	    }

	    public String[] getOptions() {
	        return options;
	    }

	    public int getCorrectAnswerIndex() {
	        return correctAnswerIndex;
	    }
	    public double getValue() {
	        return value;
	    }

}




