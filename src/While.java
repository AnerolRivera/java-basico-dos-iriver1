//Ejercicio 3 sumatoria con For y While
public class While {
    //Suma con bucle While
    public static void main(String[] args) {
     //Declarar variables para guaradr el valor de la suma y la variable contador:
        int sumaW = 0;
        int contador = 1;
     //Crear bucle While
        while(contador != 11){
            sumaW += contador ;
            System.out.println("La suma `" + contador + "` es: " + sumaW);
            contador ++;
        }
        System.out.println("La suma total del 1 al 10 es: " + sumaW);
    }


}
