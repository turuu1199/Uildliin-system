package Lab1;

public class Bodlogo6 {
    public static void main(String args[]) {
        int pageNum = 100, rowNum = 20, charNum = 60, sum = pageNum * rowNum * charNum;
        int ram = 1024 * 4;
        System.out.println("Temdegtiin too: " + sum);
        System.out.println("Byte too: " + sum);
        System.out.println("RAM: " + ram + "Byte");
        float t = (float) sum / 1024;
        System.out.println("Zartsuulah hugtsaa: " + t + "SECONDS | " + t / 60 + " MINUTES");

    }
}
