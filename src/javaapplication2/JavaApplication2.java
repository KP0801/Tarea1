package javaapplication2;

import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication2 {

    public static void main(String[] args) {
        ArrayList<Autos> listaAutos = new ArrayList();
        ArrayList<Perros> listaPerros = new ArrayList();
        ArrayList<RAM> listaRAM = new ArrayList();
        Scanner sc = new Scanner(System.in);

        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("Quiere introducir dato a un arreglo  o mostrarlo?");
            System.out.println("1=Introducir");
            System.out.println("2=Mostrarlo");
            int eleccion = sc.nextInt();
            if (eleccion == 1) {
                System.out.println("Cual objeto quiere introducir?");
                System.out.println("Autos=1 , Perros=2 , RAM=3");
                sc.nextLine();
                int eleccion2 = sc.nextInt();

                switch (eleccion2) {
                    case 1: {
                        System.out.println(" Ingrese la Marca");
                        sc.nextLine();
                        String marca = sc.nextLine();
                        System.out.println("Ingrese Color ");
                        String color = sc.nextLine();
                        System.out.println("Ingrese Precio");
                        int precio = sc.nextInt();
                        Autos a = new Autos(marca, color, precio);
                        listaAutos.add(a);
                        break;
                    }
                    case 2: {
                        System.out.println("Ingrese el nombre");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese la raza ");
                        String raza = sc.nextLine();
                        System.out.println("Ingrese genero");
                        String genero = sc.nextLine();
                        Perros p = new Perros(nombre, raza, genero);
                        listaPerros.add(p);
                        break;
                    }
                    case 3: {
                        System.out.println("Ingrese los mhz ");
                        int mhz = sc.nextInt();
                        System.out.println("Ingrese los Gb");
                        int gb = sc.nextInt();
                        System.out.println("Tiene RGB?");
                        sc.nextLine();
                        String rgb = sc.nextLine();
                        RAM r = new RAM(mhz, gb, rgb);
                        listaRAM.add(r);
                        break;
                    }
                    default:
                        System.out.println("Eleccion incorrecta");
                        break;
                }

            } else if (eleccion == 2) {
                System.out.println("Mostrar Autos =1");
                System.out.println("Mostrar Perros=2");
                System.out.println("Mostrar RAM=3");
                int eleccion3 = sc.nextInt();
                switch (eleccion3) {
                    case 1: {
                        for (int i = 0; i < listaAutos.size(); i++) {
                            System.out.println(listaAutos.get(i));
                        }
                        break;
                    }
                    case 2: {
                        for (int j = 0; j < listaPerros.size(); j++) {
                            System.out.println(listaPerros.get(j));
                        }
                        break;
                    }
                    case 3: {
                        for (int k = 0; k < listaRAM.size(); k++) {
                            System.out.println(listaRAM.get(k));
                        }
                        break;
                    }
                    default:
                        System.out.println("Opcion Incorrecta");
                        break;
                }
            }
            System.out.println("Desea continuar? s/n");
            resp = sc.next().charAt(0);
        }

    }
}

class Autos {

    String marca;
    String color;
    int precio;

    public Autos(String marca, String color, int precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public Autos() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Autos{" + "marca=" + marca + ", color=" + color + ", precio=" + precio + '}';
    }

}

class Perros {

    String nombre;
    String raza;
    String genero;

    public Perros(String nombre, String raza, String genero) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Perros{" + "nombre=" + nombre + ", raza=" + raza + ", genero=" + genero + '}';
    }

}

class RAM {

    int mhz;
    int gb;
    String rgb;

    public RAM(int mhz, int gb, String rgb) {
        this.mhz = mhz;
        this.gb = gb;
        this.rgb = rgb;
    }

    public int getMhz() {
        return mhz;
    }

    public void setMhz(int mhz) {
        this.mhz = mhz;
    }

    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "RAM{" + "mhz=" + mhz + ", gb=" + gb + ", rgb=" + rgb + '}';
    }

}
