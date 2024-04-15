package projeto1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PessoaTest {
	
	@Test
	  public void testGetName() {
		 Pessoa pessoa = new Pessoa("keison");
		 assertEquals("keison", pessoa.getName());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidName() {
		new Pessoa("");
	}
	@Test
	public void testBoundaryName() {
		Pessoa pessoa = new Pessoa("k");
		assertEquals("k", pessoa.getName());
	}

}
