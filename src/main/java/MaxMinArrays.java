import java.util.Arrays;

public class MaxMinArrays {

    public static int[] solve (int[] arr){
        Arrays.sort(arr);
        int[] resultArray = new int[arr.length];

        int indexResult =0;
        int indexStart = 0;
        int indexEnd = arr.length -1;

        while(indexStart<=indexEnd){

            if(indexResult<arr.length){
                resultArray[indexResult]=arr[indexEnd];
            }

            indexResult++;
            if(indexResult<arr.length){
                resultArray[indexResult]=arr[indexStart];
            }

            indexStart++;
            indexEnd--;
            indexResult++;
        }

        return  resultArray;
    }
}
