package Change;

public class Change {
    public static void main(String[] args) {
        int deta[] = {6, 4, 3, 7, 1};

        int deta_number = 5;

        int temp;

        for(int i = deta_number -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(deta[j] > deta[i]){
                    temp = deta[j];
                    deta[j] = deta[j+1];
                    deta[j+1] = temp;
                }
            }
        }
        for(int k = 0; k < deta.length; k++){
            System.out.println(deta_number);
        }
    }
}