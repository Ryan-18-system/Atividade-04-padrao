package factory.method.display;

public abstract  class FoldableDisplay {
    protected String features;
    private   Double inches;

    public FoldableDisplay(Double inches) {
        this.inches = inches;
    }
    public void setCaracteristicas(String features){
        this.features = features;
    }
    public void fluxoCompleto(){
        this.montar();
        this.qualiTest();
    }
    public  abstract void montar();
    protected  abstract void qualiTest();

}
