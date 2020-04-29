
public class CheckAge {
    public static void main(String[] args) {
        try{
            int i = Integer.parseInt(args[0]);
            if(checkAge(i)){
                System.out.println("チェック終了");
            }
        }catch(UserAgeException e){ //前のエラーとつながっている
            System.out.println(e.getMessage());
            System.out.println("入力された値:" + e.getAge());
        }catch(NumberFormatException e){
            System.out.println("引数として数値を入力して下さい");
            System.out.println(e.getMessage());
        }
    }

    private static boolean checkAge(int age) throws UserAgeException{
        if(age < 0){
            throw new UsetAgeException(age, "年齢がマイナス値です");
        }
        return true;
    }
}