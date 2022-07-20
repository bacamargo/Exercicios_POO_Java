package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CircleShape;
import entities.RectangleShape;
import entities.Shape;
import entities.enums.Color;

public class ExercicioShape {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(type == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new RectangleShape(color, width, height));
            }
            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new CircleShape(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape sh : list){
            System.out.println(String.format("%.2f", sh.area()));
        }

        sc.close();
    }   
}