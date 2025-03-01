package exerc1;

public class Main {
    public static void main(String[] args) {
        //Chamada do método normal
        Torcedor tocd = new Torcedor();
        tocd.torcer();

        //Chamadas polimórficas
        tocd = new Corinthians();
        tocd.torcer();

        tocd = new Palmeiras();
        tocd.torcer();

        tocd = new Santos();
        tocd.torcer();
    }
}
