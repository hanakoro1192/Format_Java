import java.io.*;

public class makesSales {
    public static void main(String[] args) throws IOException {
        //変数宣言
        int i = 0;
        int x = 0;

        int no = 0;
        int c;
        int t;
        int k;
        int s;

        int a = 0;

        int[] Product_code = {101,102,201,202,301,302,401,402,901,902};
        String[] Product_name = {"Milk","MangoJuice","PotatoChips","Chocolate","Plainbread","Raiceball","Pencile","Eraser","Pot","FryingPan" };
        int[] Product_quantity = {148,105,218,105,139,120,210,150,1800,3980};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("*****ProductList****");
        System.out.println("ProductCode" + " " + "ProductName");

        for(x = 0 ; a == 0 && x < 28; x++){
            System.out.println("Product_Code");

            no = Integer.parseInt(br.readLine());
            if(no != 0){
                for(i = 0; i < 10; i++){
                    if(no == Product_code[i]){
                        System.out.println("ProductName;" + Product_name[i]);
                        System.out.println("Price;" + Product_quantity[i]);
                        System.out.println("Quantity:");
                        k = Integer.parseInt(br.readLine());
                        s = k * Product_quantity[i];
                        System.out.println("Sum" + s);
                        System.out.println("----------");
                        exportCVS(Product_code, Product_quantity, k, s, i);
                        break;
                    }else{
                        if(i == 9){
                            System.out.println("error");
                        }
                    }
                }
            }else{
                System.out.println("SalsesData" + "is" + "desu");
                break;
            }
        }
    }

    public static void exportCVS(int[] Product_code,int[] Product_quantity,int k,int s,int i) {
        try{
            FileWriter fw = new FileWriter("c:\\java\\makeSales .csv", false);  
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));


            pw.print(Product_code[i]);
            pw.print(",");
            pw.print(Product_quantity[i]);
            pw.print(",");
            pw.print(k);
            pw.print(",");
            pw.print(s);
            pw.print(",");
            pw.println();
            pw.close();
            
            System.out.println("filewrite complete");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}