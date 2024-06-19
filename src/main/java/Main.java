// Kolokwium zaliczeniowe myk pyk
/* Napisz program, który wypisuje długość danego łańcucha znaków:
- Program powinien wczytać łańcuch znaków wprowadzony przez użytkownika.
- Obliczyć długość łańcucha.
- Wyświetlić wynik.
  */
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner SkanerZaliczeniowy = new Scanner(System.in);
    System.out.println("Podaj tekst: ");
    String NowyTekst = SkanerZaliczeniowy.nextLine();

    System.out.println("Długość tekstu to: " + NowyTekst.length());
  }

}