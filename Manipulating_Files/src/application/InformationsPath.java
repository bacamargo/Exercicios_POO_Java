package application;

import java.io.File;
import java.util.Scanner;

public class InformationsPath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String filePath = sc.nextLine();

        File path = new File(filePath);

        System.out.println("getName: " + path.getName());

        System.out.println("getParent: " + path.getParent());

        System.out.println("getPath: " + path.getPath());

        sc.close();
    }

}
