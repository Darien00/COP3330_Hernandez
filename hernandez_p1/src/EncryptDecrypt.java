import java.util.Scanner;

public class EncryptDecrypt {



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            Encryptor test1 = new Encryptor();
            Decryptor test2 = new Decryptor();

            System.out.print("Enter a 4 digit number:");
            int number = input.nextInt();

            test1.encrypt(number);

            System.out.printf("%d%n",test1.encrypt(number));

            System.out.printf("%d%n",test2.decrypt(test1.encrypt(number)));

        }

    }


