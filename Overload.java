
public class Overload {
    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.dispaly(10);
        ol.dispaly(7, 17);
        ol.dispaly(4.29);
    }

    private void dispaly(int i) {
        System.out.println("受け取った引数" + i);
    }

    private void dispaly(int i, int j) {
        System.out.println("受け取った引数" + (i + j);
    }

    private void dispaly(double d) {
        System.out.println("受け取った引数" + d);
    }
}