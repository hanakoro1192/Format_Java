package Insert;

public class Insert {
    public static void main(String[] args){
        int[] deta = {6, 4, 3, 7, 1};

        int deta_Number = 5;
        int temp;

        for(int i = 1; i < deta_Number; i++){
            int j = i;
            while((j > 0) && (deta[j-1] > deta[j])){
                if(deta[j-1] > deta[j]){
                    temp = deta[j-1];
                    deta[j-1] = deta[j];
                    deta[j] = temp;
                }
            }
            for(int k = 0; k < deta.length; k++){
                System.out.println(deta[i]);
            }
        }
    }
}