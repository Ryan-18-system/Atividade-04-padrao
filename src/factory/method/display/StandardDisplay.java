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
    public void montar(){
        System.out.println("CRIANDO DISPLAY PADRAO");
        System.out.println("RODANDO TESTE");
        this.qualiTest();
        System.out.println("Essas são as suas características "+ features);
    }
    protected  abstract void qualiTest();
}
