package com.educacioit.programa;

import com.educacioit.modelo.Cliente;
import com.educacioit.modelo.Documento;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int dni;
        List<String> productosList = new ArrayList<>();
        productosList.add("mesa");
        productosList.add("monitor");

        Cliente cliente1 = new Cliente(new Documento("cuit", 12345), "cliete de telefonia", productosList);
        Cliente cliente2 = new Cliente(new Documento("dni", 12549999), "cliete de telecentro", productosList);
        Map<Documento, Cliente> clienteMap = new HashMap<>();

        //si tiene el mismo tipo de doc y numero se actualiza ese cliente con el nuevo cliente ingresado,
        //esto es porque estamos usando el docuemto como numero de clave del mapa ya que este no puede tener claves duplicadas
        //osea si podes ingresar un cliente con un numero de documneto igual si existe pero no lo agrega si ya existe si no que lo actualiza
        clienteMap.put(cliente1.getDocumento(), cliente1);
        clienteMap.put(cliente2.getDocumento(), cliente2);

        System.out.println("ingrese numero de dni:");
        dni = teclado.nextInt();
        Documento documento = new Documento("cuit", dni);
        System.out.println("cantidad de clientes "+ clienteMap.size());

        //verificar si el dni del cliente esta en el sistema
        Cliente cliente = clienteMap.get(documento);
        if (cliente != null) {
            System.out.println("el cliente existe en el sistema: " + cliente.toString());
        } else
            System.out.println("el cliente no existe en el sistema");
    }
}
