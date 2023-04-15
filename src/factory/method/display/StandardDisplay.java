package factory.method.display;

public abstract class StandardDisplay {
    protected String features = null;
    private Double inches;

    public StandardDisplay(Double inches) {
        this.inches = inches;
    }
    public void setCaracteristicas(String features){
        this.features = features;
    }

    public void fluxoComplexo(){
        this.montar();
        this.qualiTest();
    }
    protected abstract void montar();
    protected  abstract void qualiTest();
}
