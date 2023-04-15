import factory.method.abstratos.DisplayFactory;
import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;
import factory.method.fabricaMarcas.SamsungDisplayFactory;
import factory.method.impl.XiamiFoldableDisplay;

public class MainFactoryMethod {
	
	public static void main(String args[]) {
		DisplayFactory factory = null;
		StandardDisplay display = null;
		FoldableDisplay display1 = null;

		factory = new SamsungDisplayFactory();
		display = factory.createStandardDisplay(6.1);
		display.setCaracteristicas("preto, fino, leve");
		display.fluxoComplexo();


		factory = new SamsungDisplayFactory();
		display1 = factory.createFoldableDisplay(7.9);
		display1.setCaracteristicas("Grande, grosso, pesado");
		display1.fluxoCompleto();


		
	}

}
