package factory.method.fabricaMarcas;

import factory.method.abstratos.DisplayFactory;
import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;
import factory.method.impl.SamsungFoldableDisplay;
import factory.method.impl.SamsungStandardDisplay;

public class SamsungDisplayFactory extends DisplayFactory {
    @Override
    public StandardDisplay createStandardDisplay(Double inches) {
        return new SamsungStandardDisplay(inches);
    }

    @Override
    public FoldableDisplay createFoldableDisplay(Double inches) {
        return new SamsungFoldableDisplay(inches);
    }
}
