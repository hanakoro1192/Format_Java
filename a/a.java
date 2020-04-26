public class a {
    public static void main(String[] args) {
        boolean isBroken = false;
        boolean isAssign = true;
        while(!isBroken) {
            System.out.print("⭐️");
            if (!isAssign) {
                break;
            }
            // isBroken = !isAssign;
            // isAssign = isBroken;
        }
    }
}