package exerc6;

public class Napolitana implements Pizza{
    @Override
    public void preparar(){
        System.out.println("molho, presunto, queijo, tomate e orégano");
    }

    @Override
    public void aquecer(){
        System.out.println("19 Minutos");
    }

    @Override
    public void cobrar(){
        System.out.println("R$ 75,00");
    }
}
