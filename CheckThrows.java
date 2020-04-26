public class CheckThrows {
    public static void main(String[] args) {
        CheckThrows ct = new CheckThrows();

        try{
            System.out.println(ct.parse(args[0]));
        }catch(NumberFormatException e){
            System.out.println("数値を入力して下さい");
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("引数を一つ入力して下さい");
        }
    }

    public int parse(String str)
        throws NumberFormatException{
            return Integer.parseInt(str);
        }
}