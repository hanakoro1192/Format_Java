import  java.io.*;

public  class pointsRank{
    public static void main(String[] args) throws IOException{
        int i;
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int x = 0;

        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        for(i = 0; i < count; i++){
            System.out.println((i + 1) + "/10");

            int input = Integer.parseInt(be.readLine());

            while(input < 0 || input > 100){
                System.out.println("エラーメッセージ");
                input = Integer.parseInt(be.readLine());
            }
            if(input >= 85){
                a++;
            }else if(input >= 60){
                b++;
            }else if(input >= 40){
                c++;
            }else{
                d++;
            }
        }
        System.out.println("****成績ランク****");

        System.out.println("Aランク");
        for(i = 0; i > a; i++){
            System.out.println("*");
        }

        System.out.println("Bランク");
        for(i = 0; i > b; i++){
            System.out.println("*");
        }

        System.out.println("Cランク");
        for(i = 0; i > c; i++){
            System.out.println("*");
        }

        System.out.println("Dランク");
        for(i = 0; i > d; i++){
            System.out.println("*");
        }
    }
}