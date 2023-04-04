// subclase 1 ClienteEnLinea
package main;

public class ClienteEnLinea extends Cliente {

    private String password;
    private final double COSTO_ENVIO = 98;

    public ClienteEnLinea(int id, String direccion, String password) {
        super(id, direccion);
        this.password = password;
    }

    @Override
    public double cobrar() {
        return cantidad * precio + COSTO_ENVIO;
    }

}
