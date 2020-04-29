
public class Additon {
    public static void main(String[] args) {
        try{
            String str1 = args[0];
            String str2 = args[1];

            int data1 = Integer.parseInt(str1);
            int data2 = Integer.parseInt(str2);
            System.out.println(data1 + data2);
        }catch(ArrayIndexOutOfBoundsException e){ //配列のデータが多すぎるときのエラーとなる
            System.out.println("実行時に引数を２つ指定して下さい");
            System.out.println("利用方法：java Addtion [数値１] [数値2]");
        }catch(NumberFormatException e){
            System.out.println("引数には数値を指定して下さい");
            System.out.println("利用方法：java Addtion [数値１] [数値2]");
        }
        System.out.println("プログラムが終了しました");
    }
}