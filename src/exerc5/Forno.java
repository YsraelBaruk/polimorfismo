package exerc5;

public class Forno {
    public void fabricar(PizzaCalabresa pzz){
        pzz.preparar();
        pzz.assar();
        pzz.cobrar();
    }

    public void fabricar(PizzaNapolitana pz){
        pz.montar();
        pz.aquecer();
        pz.pagar();
    }
}
