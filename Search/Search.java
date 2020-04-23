//選択法
package Search;

class Search{
    public static void main(String[] args) {
        int deta[] = {15, 35, 84, 98};

        int deta_Number = 5;
        int temp;
        
        for(int i = 0; i < deta_Number - 1; i++){
            for(int j = 0; j < 5; j++){
                if(deta[i] > deta[j]){
                    temp = deta[i];
                    deta[i] = deta[j];
                    deta[j] = i;
                }
            }
    
            for(int k = 0; k < deta.length; i++){
                System.out.println(deta[i]);
            }
        }
    }
}