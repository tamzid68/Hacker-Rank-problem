public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {8,9,7,3,5,6,1,4,2};
        BubbleSort bsn = new BubbleSort();
        bsn.printArray(arr);

        selectuinSirt(arr);
        System.out.println("\n"+"After Sorting");

        bsn.printArray(arr);
    }
    public static void selectuinSirt(int arr[]){
        for(int i=0; i<arr.length; i++){
            int smailen = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[smailen])
                    smailen=j;
            }
            int temp = arr[smailen];
            arr[smailen]=arr[i];
            arr[i]=temp;
        }
    }

}
