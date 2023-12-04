package cz.fei.upce.cv11.binarni.operace;

public class PlanovacOperaci {
    private BinarniOperace operace;
    
    public void nastavOperaci(BinarniOperace operace) {
        this.operace = operace;
    }
    
    public double provedOperaci(double prvni, double druhy) {
        return this.operace.vypocitej(prvni, druhy);
    }
}
