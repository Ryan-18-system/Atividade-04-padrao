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
    public  void create(){
        System.out.println("CRIANDO DISPLAY PADRAO");
        System.out.println("RODANDO TESTE");
        this.qualiTest();
        System.out.println("Essas são as suas características "+ features);
    };
    protected  abstract void qualiTest();

}
