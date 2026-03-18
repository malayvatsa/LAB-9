import java.io.*;
import java.util.Scanner;

class BinaryCompare {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first binary file:");
        String f1 = sc.nextLine();

        System.out.println("Enter second binary file:");
        String f2 = sc.nextLine();

        FileInputStream fis1 = new FileInputStream(f1);
        FileInputStream fis2 = new FileInputStream(f2);

        int b1, b2;
        int pos = 1;
        boolean diff = false;

        while (true) {
            b1 = fis1.read();
            b2 = fis2.read();

            if (b1 == -1 && b2 == -1)
                break;

            if (b1 != b2) {
                System.out.println("Two files are not equal: byte position at which two files differ is " + pos);
                diff = true;
                break;
            }

            pos++;
        }

        if (!diff)
            System.out.println("Two files are equal");

        fis1.close();
        fis2.close();
        sc.close();
    }
}