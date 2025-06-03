package FernandoVelasquez_20240216;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static TreeMap<Integer, Integer> productos = new TreeMap<>();
    // primero guardo el id y despues la cantidad en stock
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int opc = 0;
        productos.put(2024013, 10);
        productos.put(2024015, 2);
        productos.put(2024014, 32);
        productos.put(2024016, 100);
        productos.put(2024017, 31);
        productos.put(2024018, 60);

        System.out.println("--------------Listado de productos-------------");
        System.out.println(productos);

        do {
            System.out.println("--Escoga una opción");
            System.out.println("1. Actualiza el stock de un producto");
            System.out.println("2.Mostrar los productos");
            System.out.println("3.Mostrar los productos y su stock bajo");
            System.out.println("4.Salir");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                //Actualizar un stock
                    updateStock();
                    break;
                case 2:
                //mostrar un producto
                    mostrarProductos();
                    break;

                case 3:
                    StockBajo();
                //Mostrar el producto y el stock

                    break;
            }

        } while (opc <= 3 && opc >0);



    }

    public static void mostrarProductos(){
        for (Map.Entry<Integer,Integer> entrada: productos.entrySet()){
            System.out.println("Los productos disponibles son:" + entrada.getKey() + " y su stock es de: " + entrada.getValue());
        }
    }


    public static void updateStock () {
        //Pedir el id
        System.out.println("Escriba el id del producto");
        //Guardar el id
        int ID = sc.nextInt();
        int NStock = 0;
        //Buscar el id
        if (productos.get(ID) == null) {
            System.out.println("No existe el producto");
        } else {
            System.out.println("Ingrese la nueva cantidad de stock");
            NStock = sc.nextInt();
            for (Map.Entry<Integer, Integer> entrada : productos.entrySet()) {
                if (entrada.getKey() == ID)
                entrada.setValue(NStock);
            }
            System.out.println("Se actualizo el stock");
        }

    }

    public static void StockBajo() {
        for(Map.Entry<Integer,Integer> entrada: productos.entrySet()){
            if (entrada.getValue() <10){
                System.out.println("Stock menor a 10");
                System.out.println("ID del producto: " + entrada.getKey() + " sotck disponible: " + entrada.getValue());
            }
        }
    }

}

