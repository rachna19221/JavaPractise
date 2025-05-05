package arrayPrac;

public class firstAndLastOccur {
    public static void occurence(){
        int arr[] = {1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 };
        int num=1;
        int first=0;
        int last=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num && first ==0){
                first=i+1;
            }
            if(arr[i]==num && first !=0){
                last=i+1;
            }
        }
        System.out.println(" the first occurence  "+first+ " and last occurence "+last+ " for number "+num );
    }
}
