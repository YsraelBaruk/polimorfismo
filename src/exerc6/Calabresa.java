package exerc6;

public class Calabresa implements Pizza {
    @Override
    public void preparar(){
        System.out.println("molho, queijo, calabresa, cebola e tomate");
    }

    @Override
    public void aquecer(){
        System.out.println("15 Minutos");
    }

    @Override
    public void cobrar(){
        System.out.println("R$ 80,00");
    }
}
