package lab2.task1;

public class Solution1_3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(7);
        Box box3 = new Box(3, 9, 2);

        System.out.println(String.valueOf(box1.getSurface()) + ' ' + String.valueOf(box1.getVolume()));
        System.out.println(String.valueOf(box2.getSurface()) + ' ' + String.valueOf(box2.getVolume()));
        System.out.println(String.valueOf(box3.getSurface()) + ' ' + String.valueOf(box3.getVolume()));
    }
}