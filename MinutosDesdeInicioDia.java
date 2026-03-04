import java.util.Scanner; 

public class MinutosDesdeInicioDia { 
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 

    int hora = lerInteiro(scanner, "Digite a hora (0-23):", 0, 23); 
    int minutos = lerInteiro(scanner, "Digite os minutos (0-59):", 0, 59); 

    final int MINUTOS_POR_HORA = 60; 
    int minutosDesdeInicioDia = (hora * MINUTOS_POR_HORA) + minutos; 
    System.out.println("Minutos desde o início do dia: " + minutosDesdeInicioDia); 
  } 

  private static int lerInteiro(Scanner scanner, String mensagem, int min, int max) { 
    while (true) { 
      try { 
        System.out.println(mensagem); 
        int valor = scanner.nextInt(); 
        if (valor >= min && valor <= max) { 
          return valor; 
        } else { 
          System.out.println("Valor inválido. Por favor, tente novamente."); 
        } 
      } catch (Exception e) { 
        System.out.println("Valor inválido. Por favor, tente novamente."); 
        scanner.next(); 
      } 
    } 
  } 
} 