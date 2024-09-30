package ar.edu.davinci;

class CajaAhorro extends CuentaBancaria {

    public CajaAhorro(String id) {
        super(id);
    }

    @Override
    protected boolean puedeExtraer(double cantidad) {
        return (saldo >= cantidad);
    }
}

