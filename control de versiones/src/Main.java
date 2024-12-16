
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Random ran = new Random();
     int [][] array = new int[5][5] ;
     for (int i = 0 ; i < 5 ; i++){
         for (int j =0 ; j< 5 ; j++ ){
             array[i][j] = ran.nextInt(101);

         }
     }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("ingrese el numero para buscar :");
        int numeroParaBuscar = scanner.nextInt();
        boolean numeroEncontrado  = false ;
        for (int i = 0 ; i < 5 ; i++){
            for (int j =0 ; j< 5 ; j++ ){
                if (array[i][j] == numeroParaBuscar){
                    System.out.println("EL numero esta en la fila " + i + " " + "columna " + j);
                    numeroEncontrado = true ;
                }
            }
        }
        if (!numeroEncontrado){
            System.out.println("EL numero no esta en la matriz") ;
        }else {
            System.out.println("El numero esta en la matriz") ;
        }

    }
}