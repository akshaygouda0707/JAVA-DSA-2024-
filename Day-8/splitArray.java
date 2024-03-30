public class splitArray {
    public static void main(String[] args) {
int arr[]={7,2,5,10,8};
int m=2;
        System.out.println(splitArr(arr,m));
    }
    static  int splitArr(int[]arr,int m){
        int start=0;
        int end=0;
        for(int i:arr){
            start=Math.max(start,i);
            end+=i;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int peice=1;
            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    peice++;
                }else{
                    sum+=num;
                }

            }
            if(peice>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}
