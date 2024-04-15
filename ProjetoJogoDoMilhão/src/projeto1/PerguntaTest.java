package projeto1;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PerguntaTest {
	 @Test
	    public void testGetQuestionText() {
	        String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
	        Pergunta pergunta = new Pergunta("Qual a capital do Brasil", options, 0, 100.0);
	        assertEquals("Qual a capital do Brasil", pergunta.getQuestionText());
	    }
	 @Test(expected = IllegalArgumentException.class)
		public void testInvalidQuestionText() {
			String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
			new Pergunta("", options, 0, 100.0);
		}
	 @Test
		public void testBoundaryQuestionText() {
			String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
			Pergunta pergunta = new Pergunta("Q", options, 0, 100.0);
			assertEquals("Q", pergunta.getQuestionText());
		}
	 
	 
	 @Test
	    public void testGetOptions() {
	        String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
	        Pergunta pergunta = new Pergunta("Qual a capital do Brasil", options, 0, 100.0);
	        assertArrayEquals(options, pergunta.getOptions());
	    }
	 @Test(expected = IllegalArgumentException.class)
		public void testInvalidOptions() {
			String[] options = {"Opção 1"};
			new Pergunta("Qual a capital do Brasil", options, 0, 100.0);
		}
	 @Test
		public void testBoundaryOptions() {
			String[] options = {"Opção 1", "Opção 2"};
			Pergunta pergunta = new Pergunta("Qual a capital do Brasil", options, 0, 100.0);
			assertArrayEquals(options, pergunta.getOptions());
		}
	 

	    @Test
	    public void testGetCorrectAnswerIndex() {
	        String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
	        Pergunta pergunta = new Pergunta("Qual a capital do Brasil", options, 0, 100.0);
	        assertEquals(0, pergunta.getCorrectAnswerIndex());
	    }
	    @Test(expected = IllegalArgumentException.class)
		public void testInvalidCorrectAnswerIndex() {
			String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
			new Pergunta("Qual a capital do Brasil", options, 5, 100.0);
		}
	    @Test
		public void testBoundaryCorrectAnswerIndex() {
			String[] options = {"Opção 1", "Opção 2"};
			Pergunta pergunta = new Pergunta("Qual a capital do Brasil", options, 1, 100.0);
			assertEquals(1, pergunta.getCorrectAnswerIndex());
		}
	    

	    @Test
	    public void testGetValue() {
	        String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
	        Pergunta pergunta = new Pergunta("Qual a capital do Brasil", options, 0, 100.0);
	        assertEquals(100.0, pergunta.getValue(),0.001);
	    }
	    @Test(expected = IllegalArgumentException.class)
		public void testInvalidValue() {
			String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
			new Pergunta("Qual a capital do Brasil", options, 0, -1.0);
		}
	    @Test
		public void testBoundaryValue() {
			String[] options = {"Opção 1", "Opção 2", "Opção 3","Opção4"};
			Pergunta pergunta = new Pergunta("Qual a capital do Brasil", options, 0, 0.0);
			assertEquals(0.0, pergunta.getValue(),0.001);
		}

}
