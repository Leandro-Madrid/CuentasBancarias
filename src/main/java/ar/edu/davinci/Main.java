package ar.edu.davinci;

public class Main {
    public static void main(String[] args) {
        CajaAhorro CajaAhorro = new CajaAhorro("CA1");
        CajaAhorro.depositar(100);
        CajaAhorro.extraer(50);
        CajaAhorro.extraer(70);

        CuentaCorriente cuentaCorriente = new CuentaCorriente("CC1", 200);
        cuentaCorriente.depositar(100);
        cuentaCorriente.extraer(250);
        cuentaCorriente.extraer(100);
    }
}
