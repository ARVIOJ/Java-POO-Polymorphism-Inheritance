package main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int id;
        String direccion;
        String password;
        int cantidad;
        double precio;
        
        System.out.print("Ingrese el ID del en linea: ");
        id = ent.nextInt();
        
        System.out.print("Ingrese la dirección del cliente en linea: ");
        direccion = ent.next();
        
        System.out.print("Ingrese la su password: ");
        password = ent.next();
        
        System.out.print("Ingrese la cantidad de artículos comprados por el cliente en linea: ");
        cantidad = ent.nextInt();
        
        System.out.print("Ingrese el precio de los artículos comprados por el cliente en linea: ");
        precio = ent.nextDouble();
        
        ClienteEnLinea c1 = new ClienteEnLinea(id, direccion, password);
        c1.comprar(cantidad,precio);
        
        
        
        
        System.out.print("Ingrese el ID del en linea: ");
        id = ent.nextInt();
        System.out.print("Ingrese la dirección del cliente en linea: ");
        direccion = ent.next();
        System.out.print("Ingrese la su password: ");
        password = ent.next();
        System.out.print("Ingrese la cantidad de artículos comprados por el cliente en linea: ");
        cantidad = ent.nextInt();
        System.out.print("Ingrese el precio de los artículos comprados por el cliente en linea: ");
        precio = ent.nextDouble();
        ClienteEnLinea c2 = new ClienteEnLinea(id, direccion, password);
        c2.comprar(cantidad,precio);
        
        
        
        System.out.print("Ingrese el ID del Cliente normal: ");
        id = ent.nextInt();
        System.out.print("Ingrese la dirección del cliente normal: ");
        direccion = ent.next();
        System.out.print("Ingrese la cantidad de artículos comprados por el cliente normal: ");
        cantidad = ent.nextInt();
        System.out.print("Ingrese el precio de los artículos comprados por el cliente normal: ");
        precio = ent.nextDouble();
        ClienteNormal c3 = new ClienteNormal(id, direccion);
        c3.comprar(cantidad,precio);
        
        
        System.out.print("Ingrese el ID del Cliente normal: ");
        id = ent.nextInt();
        System.out.print("Ingrese la dirección del cliente normal: ");
        direccion = ent.next();
        System.out.print("Ingrese la cantidad de artículos comprados por el cliente normal: ");
        cantidad = ent.nextInt();
        System.out.print("Ingrese el precio de los artículos comprados por el cliente normal: ");
        precio = ent.nextDouble();
        ClienteNormal c4 = new ClienteNormal(id, direccion);
        c4.comprar(cantidad,precio);


        Cliente[] clientes = new Cliente[4];

        clientes[0] = c1;
        clientes[1] = c2;
        clientes[2] = c3;
        clientes[3] = c4;
        
        for (Cliente cliente : clientes) {
            cliente.cobrar();
            System.out.println(cliente);
        }
     
    }

}
