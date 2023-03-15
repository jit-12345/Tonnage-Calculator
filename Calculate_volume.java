import java.util.*;

class Calculate_volume {
    public static int findVolume(int length, int breadth, int height) {
        //its generally convert into volume 
        //its the original function to calculate the volume
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,breadth,height");
        //here the three inputs are taken
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        //here i called the function that calculate the volume
        System.out.println(findVolume(l, b, h));

    }
}