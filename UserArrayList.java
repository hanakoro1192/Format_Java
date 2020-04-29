import java.util.ArrayList;

public class UserArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("おはようございます");
        al.add("morning");
        al.add("こんにちは");

        int size = al.size();
        System.out.println("データ数" + size);

        al.set(2, "Hola");

        for(int i = 0; i < al.size(); i++){
            String data = al.get(i);
            System.out.println(data);
        }
    }
}