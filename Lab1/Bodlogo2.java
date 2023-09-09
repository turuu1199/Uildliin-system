package Lab1;

public class Bodlogo2 {
    public static void main (String args[]) {
        float r = 60, c = 40, color = 16;
        float pixel = (r * c * color) / 8;
        float ram = pixel / 1024;
        System.out.print("LAB1/Bodlogo2: " + "RAM:" + ram + "KB\n");
    }
}
