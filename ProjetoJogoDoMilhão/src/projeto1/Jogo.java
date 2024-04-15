package projeto1;
import java.util.*;

public class Jogo {
    private Jogador player;
    private Pergunta[] questions;
    private int currentQuestionIndex;
    private double multiplier; // Multiplicador para o valor da pergunta

    public Jogo(Jogador player, Pergunta[] questions) {
    	 if (player == null) {
             throw new IllegalArgumentException("Jogador não pode ser nulo.");
         }
         if (questions == null || questions.length == 0) {
             throw new IllegalArgumentException("Deve haver pelo menos uma pergunta.");
         }
        this.player = player;
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.multiplier = 1.0;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
			for (Pergunta question : questions) {
			    System.out.println(question.getQuestionText());
			    String[] options = question.getOptions();
			    for (int i = 0; i < options.length; i++) {
			        System.out.println((i + 1) + ". " + options[i]);
			    }

			    int answer;
			    do {
			        System.out.print("Digite o número da sua resposta: ");
			        answer = scanner.nextInt();
			        if (answer < 1 || answer > options.length) {
			        	throw new IllegalArgumentException("Opção inválida. Por favor, escolha uma opção válida.");
			        }
			    } while (answer < 1 || answer > options.length);

			    if (answer - 1 == question.getCorrectAnswerIndex()) {
			        player.setScore(player.getScore() + 1);
			        double questionValue = question.getValue() * multiplier;
			        player.setMoney(player.getMoney() + questionValue);
			        System.out.println("Resposta correta!");
			        System.out.println("Sua pontuação atual é: " + player.getScore());
			        System.out.println("Seu dinheiro atual é: " + player.getMoney() + "Reais");
			        multiplier *= 2;

			        if (player.getMoney() >= 1000000) {
			            System.out.println("Parabéns! Você atingiu R$1.000.000! Temos um vencedor!!");
			            break;
			        } else {
			            System.out.println("Você quer continuar ou deseja sair com sua quantia atual? (1: Continuar, 2: sair com quantia atual)");
			            int continueGame = scanner.nextInt();
			            if (continueGame == 2) {
			                System.out.println("Fim do jogo! Sua pontuação final é: " + player.getScore());
			                System.out.println("E vai levar pra casa: " + player.getMoney() + "Reais");
			                break;
			            }
			        }
			    } else {
			        System.out.println("Resposta errada. A resposta correta era: " + options[question.getCorrectAnswerIndex()]);
			        System.out.println("Fim do jogo! Sua pontuação final é: " + player.getScore());
			        System.out.println("Como você errou, ganhará apenas 10% do seu dinheiro atual, sendo: " + (player.getMoney() / 10) + "Reais");
			        break;
			    }

			    System.out.println("-----------------------------------");
			}
				scanner.close();
		}
    }
    
}
