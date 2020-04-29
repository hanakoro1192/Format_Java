import java.util.HashSet;
import java.util.Iterator;

public class UserHashSetIterator {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("こんにちは");
        hs.add("Hello");
        hs.add("Bonjour");
        hs.add("Hola");

        int size = hs.size();
        System.out.println("データ数" + size);

        System.out.println("データを一つ削除します");
        hs.remove("Bonjour");

        Iterator<String> ite = hs.iterator(); //Iteratorは配列からデータを取り出す作業
        while(ite.hasNext()){
            String data = ite.next();
            System.out.println(data);
        }
    }
}