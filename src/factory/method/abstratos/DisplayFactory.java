package factory.method.abstratos;

import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;

public abstract class DisplayFactory {
    public abstract StandardDisplay createStandardDisplay(Double inches);

    public abstract FoldableDisplay createFoldableDisplay(Double inches);



}
