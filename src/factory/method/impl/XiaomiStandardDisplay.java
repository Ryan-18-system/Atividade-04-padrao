package factory.method.impl;

import factory.method.display.StandardDisplay;

import java.util.concurrent.TimeUnit;

public class XiaomiStandardDisplay extends StandardDisplay {
    public XiaomiStandardDisplay(Double inches) {
        super(inches);
    }
    public void setCaracteristicas(String features){
        super.features = features;
    }

    @Override
    protected void montar() {
        System.out.println("CRIANDO DISPLAY PADRAO");
        System.out.println("Essas são as suas características "+ super.features);
        System.out.println("RODANDO TESTE");

    }

    @Override
    protected void qualiTest() {
        System.out.print("Teste de Qualidade: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(4L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK (passed)");
    }

}
