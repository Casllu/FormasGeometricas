import org.example.etidades.Circulo;
import org.example.etidades.Retangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testes {

	@Test
	public void verificaArea(){
		Retangulo retangle = new Retangulo();
		double area = retangle.area(5, 3);
		Assertions.assertEquals(15, area);
	}
	@Test
	public void verificaPerimetro(){
		Retangulo retangle = new Retangulo();
		double perimeter = retangle.perimeter(5, 3);
		Assertions.assertEquals(16, perimeter);
	}


}
