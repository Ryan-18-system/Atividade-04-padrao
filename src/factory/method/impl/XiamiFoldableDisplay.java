package factory.method.impl;

import factory.method.display.FoldableDisplay;

import java.util.concurrent.TimeUnit;

public class XiamiFoldableDisplay extends FoldableDisplay {

    public XiamiFoldableDisplay(Double inches) {
        super(inches);
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
