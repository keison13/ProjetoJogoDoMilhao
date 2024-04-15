package projeto1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JogadorTest {
	@Test
    public void testGetScore() {
        Jogador jogador = new Jogador("Danilo", 100, 500.0);
        assertEquals(100, jogador.getScore());
    }
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidScore() {
		new Jogador("Danilo", -1, 500.0);
	}
	@Test
	public void testBoundaryScore() {
		Jogador jogador = new Jogador("Danilo", 0, 500.0);
		assertEquals(0, jogador.getScore());
	}
	

    @Test
    public void testGetMoney() {
        Jogador jogador = new Jogador("Danilo",100, 500.0);
        assertEquals(500.0, jogador.getMoney(),0.001); //Usando a precisão 0.001 devido a tratar de um numero Double
    }
    @Test(expected = IllegalArgumentException.class)
	public void testInvalidMoney() {
		new Jogador("Danilo", 100, -1.0);
	}
    @Test
	public void testBoundaryMoney() {
		Jogador jogador = new Jogador("Danilo", 100, 0.0);
		assertEquals(0.0, jogador.getMoney(),0.001); 
	}
    
    Jogador jogador = new Jogador("Danilo", 100, 500.0);
    @Test
    public void testSetScore() {
        jogador.setScore(200);
        assertEquals(200, jogador.getScore());
    }
    @Test
    public void test1SetScore() {
        jogador.setScore(2);
        assertEquals(2, jogador.getScore());
    }
    @Test
    public void test2SetScore() {
        jogador.setScore(1);
        assertEquals(1, jogador.getScore());
    }
    @Test
    public void test3SetScore() {
        jogador.setScore(10);
        assertEquals(10, jogador.getScore());
    }
    @Test(expected = IllegalArgumentException.class)
	public void testInvalidSetScore() {
		Jogador jogador = new Jogador("Danilo", 100, 500.0);
		jogador.setScore(-1);
	}
    @Test
	public void testBoundarySetScore() {
		Jogador jogador = new Jogador("Danilo", 100, 500.0);
		jogador.setScore(0);
		assertEquals(0, jogador.getScore());
	}
    

    @Test
    public void testSetMoney() {
        Jogador jogador = new Jogador("Danilo", 100, 500.0);
        jogador.setMoney(1000.0);
        assertEquals(1000.0, jogador.getMoney(),0.001); 
    }
    @Test(expected = IllegalArgumentException.class)
	public void testInvalidSetMoney() {
		Jogador jogador = new Jogador("Danilo", 100, 500.0);
		jogador.setMoney(-1.0);
	}
    @Test
	public void testBoundarySetMoney() {
		Jogador jogador = new Jogador("Danilo", 100, 500.0);
		jogador.setMoney(0.0);
		assertEquals(0.0, jogador.getMoney(),0.001); 
	}
}
