package TwoSearch;

public class TwoSearch {
    public static void main(String[] args) {
        int[] deta = {2,10,11,12,39,43,45,52,57,63,65,66,73,76,83,97};
        int search = 5;
        int left = 0;
        int right = 9;
        int middle = (left + right) / 2;

        while((left <= right) && (search != deta[middle])){
            if(search < deta[middle]){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
            middle = (left + right) / 2;
        }
    }
}