import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String tekst = scanner.nextLine();
        int z;
          for (int i=0; i<tekst.length(); i++)
          {
            char c = tekstAt(i);

            if (character.isLowerCase(c))
                {
                  c = character.toUpperCase(c);
                  z++;
                }
          }
        
          System.out.print("Tekst po zmianie: "+tekst);
        }
        }
  
