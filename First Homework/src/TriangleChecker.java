import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the first side:");
        double side1 =  sc.nextDouble();
        System.out.print("Enter the length of the second side:");
        double side2 =  sc.nextDouble();
        System.out.print("Enter the length of the third side:");
        double side3 =  sc.nextDouble();


        if(isTriangle(side1,side2,side3)){
            String triangleType = getTriangleType(side1,side2,side3);
            System.out.println("The triangle is " + triangleType + ".");
        }else {
            System.out.println("The input does not form a valid triangle");
        }

        sc.close();




    }


    public static boolean isTriangle(double side1, double side2,double side3){
        return  side1+side2> side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public static String getTriangleType(double side1, double side2, double side3){
        if(side1 == side2 && side2 == side3){
            return "equilateral";
        } else if (side1==side2 || side2 == side3|| side3 == side1) {
            return "isosceles";
        }else {
            return "scalene";
        }
    }
    }

