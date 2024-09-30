package ar.edu.davinci;

class CuentaCorriente extends CuentaBancaria {
    private double descubierto;

    public CuentaCorriente(String id, double descubierto) {
        super(id);
        this.descubierto = descubierto;
    }

    @Override
    protected boolean puedeExtraer(double cantidad) {
        return (saldo + descubierto >= cantidad);
    }
}
