package exerc6;

public class Main {
    public static void main(String[] args) {
        Forno fr = new Forno();
        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();

        fr.fabricar(calabresa);
        fr.fabricar(napolitana);
    }
}
