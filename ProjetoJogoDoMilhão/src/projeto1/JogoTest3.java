package projeto1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JogoTest3 {
	@Test
    public void testStart() {
		Jogador player = new Jogador("Daniel", 0, 0.0);
		Pergunta[] questions = {
		        new Pergunta("Qual é a capital do Brasil?", new String[]{"Rio de Janeiro", "Brasília", "São Paulo"}, 0, 100),
		        new Pergunta("Quem escreveu Dom Quixote?", new String[]{"Miguel de Cervantes", "William Shakespeare", "Charles Dickens"}, 0, 100),
		};
		Jogo jogo = new Jogo(player, questions);
        
        //ACERTANDO a primeira pergunta e ERRANDO a segunda pergunta
		 jogo.start();
         assertEquals(1, player.getScore());
         assertEquals(10.0, player.getMoney()/10,0.001); //Ganha apenas 10% do valor
      
	}

}
