/* 19.- Realice un codigo que muestre todos los números primos comprendidos entre el 2 y un valor límite que se preguntará al ejecutar el diagrama. Recuerde que un número primo es aquél que puede dividirse únicamente por sí mismo y por la unidad. Una manera de decidir si un número es primo, es dividirlo por todos los números comprendidos entre el 1 y él mismo. Si se encuentra que el número es divisible por alguno de ellos, se deduce que ese número no es primo. 
Sacchetti, Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int limite;
    int i;
    int j;
    int contador;
    /* int primo; */
    System.out.println("Ingrese el limite");
    limite = scanner.nextInt();
    for (i = 2; i <= limite; i++) {
      contador = 0;
      for (j = 1; j <= i; j++) {
        if (i % j == 0) {
          contador++; 
        }
      }
      if (contador == 2) {
        System.out.println(i);  
      }
    }
    scanner.close();

  }

}