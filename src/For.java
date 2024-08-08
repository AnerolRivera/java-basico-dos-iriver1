//Ejercicio 3 sumatoria con For y While

public class For {
    //Suma con bucle For
    public static void main(String[] args) {
    //Declara variable que guarda el valor de la suma
        int sumafor = 0;
    //Crear el bucle For
        for(int i=1; i<=10; i++){
            sumafor = sumafor + i;
            System.out.println("La suma `" + i + "` es: " + sumafor);
        }
        System.out.println("La suma total del 1 al 10 es: " + sumafor);


    }


}
