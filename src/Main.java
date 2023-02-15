import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String args[]){
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String symbole = "@#!~$%^&*+=:><?|+[{]}/";
        String combination = upper_case + lower_case + number + symbole ;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter tha password length : ");
        int length = scanner.nextInt();
        scanner.close();

        char[] password = new char[length];

        for(int i=0; i<length; i++){
            password[i] = combination.charAt(random.nextInt(combination.length()));
        }
        System.out.print("Tha Genarated Randome Password is : " + new String(password));
    }
}