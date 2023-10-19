public class App {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSaque = 30.0;

        if (saldo >= valorSaque) {
            saldo = saldo - valorSaque;
            System.out.println("Saldo atual: " + saldo);
        } else
            System.out.println("Saldo insuficiente. Saldo atual: " + saldo);


        
    }
}
