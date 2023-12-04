package cz.fei.upce.cv11.binarni.operace;

public class App {

    public static void main(String[] args) {
        PlanovacOperaci planovacOperaci = new PlanovacOperaci();
        
        planovacOperaci.nastavOperaci(new Scitani());
        System.out.println(planovacOperaci.provedOperaci(5, 5));
        
        planovacOperaci.nastavOperaci(new Nasobeni());
        System.out.println(planovacOperaci.provedOperaci(5, 5));
        
        planovacOperaci.nastavOperaci((double prvniOperand, double druhyOperand) -> prvniOperand - druhyOperand);
        System.out.println(planovacOperaci.provedOperaci(5, 5));
        
    }
    
    public static double provedOperaci(BinarniOperace operace, double prvni, double druhy) {
        return operace.vypocitej(prvni, druhy);
    }
}
