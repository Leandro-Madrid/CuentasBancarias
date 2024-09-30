package ar.edu.davinci;

abstract class CuentaBancaria {
    protected double saldo;
    protected String id;

    public CuentaBancaria(String id) {
        this.id = id;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depositados: " + cantidad + ". Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public final void extraer(double cantidad) {
        if (puedeExtraer(cantidad)) {
            realizarExtraccion(cantidad);
            System.out.println("Extracción de " + cantidad + " realizada. Saldo restante: " + saldo);
        } else {
            System.out.println("No se puede realizar la extracción de " + cantidad + ". Saldo actual: " + saldo);
        }
    }

    protected abstract boolean puedeExtraer(double cantidad);

    protected void realizarExtraccion(double cantidad) {
        saldo -= cantidad;
    }
}
