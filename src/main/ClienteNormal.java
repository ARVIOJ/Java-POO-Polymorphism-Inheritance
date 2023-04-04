// subclase 2 ClienteNormal
package main;

public class ClienteNormal extends Cliente {

    private final double IMPUESTO = 0.16;

    public ClienteNormal(int id, String direccion) {
        super(id, direccion);
    }

    @Override
    public double cobrar() {
        return cantidad * precio * (1 + IMPUESTO);
    }
}
