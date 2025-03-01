package exerc6;

public class Forno {
    public void fabricar(Pizza pzz){
        pzz.preparar();
        pzz.aquecer();
        pzz.cobrar();
    }
}
