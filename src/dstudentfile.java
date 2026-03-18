import java.io.*;
import java.util.Scanner;

class StudentFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rollno:");
        int rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Subject:");
        String subject = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter existing file name:");
        String fileName = sc.nextLine();

        FileWriter fw = new FileWriter(fileName);
        fw.write("Roll Number:"+rollno + "\nName:" + name + "\nSubject:" + subject + "\nMarks:" + marks + "\n");
        fw.close();

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String line;
        System.out.println("Content of file:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        sc.close();
    }
}