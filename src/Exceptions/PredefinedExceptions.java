package Exceptions;

import java.util.Scanner;

public class PredefinedExceptions {
    public static void main(String[] args) {
       try {
           int[] numbers = {1, 5, 3, 11, 8};
           System.out.println("Enter an index");
           Scanner scanner = new Scanner(System.in);
           int index = scanner.nextInt();
           System.out.println("numbers[" + index + "]=" + numbers[index]);
           System.out.println("Enter a numeric string : ");
           String ch=scanner.next();
           int nb=Integer.parseInt(ch);
           System.out.println("the introduced integer is " +nb);
       }/*catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Error: Index out of bounds");
       }
       catch (NumberFormatException e){
           System.out.println("Error: introduce digits only.");
        }*/ catch (Exception e) {
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("Bloc Finally.");
       }

        System.out.println("End of program.");
    }
}
