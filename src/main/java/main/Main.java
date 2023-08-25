package main;

import coleccion.Coleccion;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion(4);
        coleccion.add("hola0");
        coleccion.add("hola1");
        coleccion.add("hola2");
        coleccion.add("hola3");
        coleccion.add(new File("prueba.txt"));

    }

    public static String  validar(Object o){
        String data = null;
        
        return data;
    }
}
