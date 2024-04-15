package projeto1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class JogoTest1 {
	@Test
    public void testStart() {
		Jogador player = new Jogador("Daniel", 0, 0.0);
		Pergunta[] questions = {
		        new Pergunta("Qual é a capital do Brasil?", new String[]{"Rio de Janeiro", "Brasília", "São Paulo"}, 0, 100)
		};
		Jogo jogo = new Jogo(player, questions);
        
        // ACERTANDO a primeira pergunta
		 jogo.start();
         assertEquals(1, player.getScore());
         assertEquals(100, player.getMoney(),0.001);
      
         
	}
}

