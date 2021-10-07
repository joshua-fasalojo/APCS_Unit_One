import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
        final int door = 15;
        final int window = 10;
    System.out.print("What is the length of the room?");
    double length = s.nextDouble();
    System.out.print("What is the width of the room?");
    double width = s.nextDouble();
    System.out.print("What is the height of the room?");
    double height = s.nextDouble();
    System.out.print("How many doors are in the room?");
    int howManyDoors = s.nextInt();
    System.out.print("How many windows are in the room?");
    int howManyWindows = s.nextInt();
    double areaOfRoom = length * width + height * width + length * height + height * width + length * height;
    double totalWindowArea = howManyWindows * 10;
    double totalDoorArea = howManyDoors * 15;
    double totalPaint = areaOfRoom - totalDoorArea - totalWindowArea;
    double gallonOfPaint =   totalPaint / 350;
    System.out.print("You need this amount of paint" + gallonOfPaint);




    }

}
