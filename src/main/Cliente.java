// superclase Cliente esta tendrá a las subclases ClienteEnLinea y ClienteNormal

package main;

public abstract class Cliente {

    protected int id;
    protected int cantidad;
    protected double precio;
    protected String direccion;

    public Cliente(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public void comprar(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public abstract double cobrar();

    @Override
    public String toString() {
        return "El cliente " + id + " pagará " + cobrar() + " por " + cantidad + " artículos.";
    }

}
