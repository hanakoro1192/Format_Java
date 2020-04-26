public class CheckNumber {
    public static void main(String[] args) {
        CheckNumber cn = CheckNumber();
        try{
            System.out.print(cn.parse(args[0]));
        }catch(Exception e){
            System.out.println("例外処理：" + e.getMessage());
        }
    }

    public int parse(String str) throws Exception{
        int i = Integer.parseInt(str);
        if(i < 0){
            throw new Exception("正の数を入力して下さい");
        }
        return i;
    }
}