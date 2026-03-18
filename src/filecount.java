import java.io.*;
import java.util.Scanner;

class FileCount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name:");
        String file = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int chars = 0;
        int lines = 0;
        int words = 0;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();

            String[] w = line.trim().split("\\s+");
            if (!line.trim().isEmpty())
                words += w.length;
        }

        br.close();
        sc.close();

        System.out.println("No. of characters - " + chars);
        System.out.println("No. of lines - " + lines);
        System.out.println("No. of words - " + words);
    }
}