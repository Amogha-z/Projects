import java.util.Arrays;

public class MinimumCommonInTwoArrays {
    int ind1 = 0;
    int ind2 = 0;
    int min = -1;
    public int findCommon(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        int ele1 = 0;
        int ele2 = 0;
        if(array1.length >=1 && array2.length >=1){
            while (ind1 < array1.length && ind2 < array2.length) {
                ele1 = array1[ind1];
                ele2 = array2[ind2];
                
                if(ele1 == ele2){
                    return ele1;
                }else if (ele1 < ele2){
                    ind1++;
                }else{
                    ind2 ++;
                }
            }
            return -1;    
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 9, 2, 8, 6};
        int[] array2 = {5, 7, 0, 4, 1};
        MinimumCommonInTwoArrays obj = new MinimumCommonInTwoArrays();
        System.out.println(obj.findCommon(array1, array2));
    }
}
