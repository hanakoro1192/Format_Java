import java.util.HashMap;

public class UserHashMap {
public static void main(String[] args) {
    HashMap<String, String> hm = new HashMap<String, String>();

    hm.put("日本語", "こんにちは");
    hm.put("英語", "Hello");
    hm.put("スペイン語", "Bonjour");
    hm.put("フランス語", "Hola");

    int size = hm.size();
    System.out.println("データ数" + size);

    System.out.println("データを１セット用意します");
    hm.remove("フランス語");

    size = hm.size();
    System.out.println("データ数" + size);

    System.out.println(hm.get("日本語"));
    System.out.println(hm.get("英語"));
    System.out.println(hm.get("スペイン語"));

    }
}