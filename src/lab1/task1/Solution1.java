package lab1.task1;

public class Solution1 {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.color = "green";
        monitor1.dimensions = 17.5f;
        monitor1.resolution = 1080;

        Monitor monitor2 = new Monitor();
        monitor2.color = "red";
        monitor2.dimensions = 80.5f;
        monitor2.resolution = 8640;

        if (monitor1.color != monitor2.color) {
            System.out.printf("The monitors colors are different\n");
        } else {
            System.out.printf("The monitors colors are the same\n");
        }

        if (monitor1.dimensions > monitor2.dimensions) {
            System.out.printf("The first monitor dimensions are bigger\n");
        } else if (monitor1.dimensions < monitor2.dimensions) {
            System.out.printf("The first monitor dimensions are smaller\n");
        } else {
            System.out.printf("The monitors dimensions are the same\n");
        }

        if (monitor1.resolution > monitor2.resolution) {
            System.out.printf("The first monitors resolution is higher\n");
        } else if (monitor1.resolution < monitor2.resolution) {
            System.out.printf("The first monitors resolution is lower\n");
        } else {
            System.out.printf("The monitors resolution are the same\n");
        }
    }
}
