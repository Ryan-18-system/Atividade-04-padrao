import factory.method.abstratos.DisplayFactory;
import factory.method.display.StandardDisplay;
import factory.method.fabricaMarcas.SamsungDisplayFactory;

public class MainFactoryMethod {
	
	public static void main(String args[]) {
		DisplayFactory factory = null;
		StandardDisplay display = null;

		factory = new SamsungDisplayFactory();
		display = factory.createStandardDisplay(6.1);
		display.setCaracteristicas("preto, fino, leve");
		display.montar();

		
	}

}
