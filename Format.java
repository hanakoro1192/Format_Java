//学んだ内容
import java.math.*;
import java.text.DecimalFormat;

class Format{
    public static void main(String[] args){

        String str1 = args[0];
        String str2 = args[1];

        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);

        int w = i + j;

        System.out.println(w);

        double d = 3.14;
        System.out.println((int)d);

        System.out.println(String.format("%s", (int)d+1));

        DecimalFormat format = new DecimalFormat("04.#");
        System.out.println(format.format(d+1));

        double e = 3.14;
        double f = 1;

        BigDecimal a = new BigDecimal(e);
        BigDecimal b = new BigDecimal(f);
        BigDecimal c = a.add(b);

        System.out.println(c);
    }
}