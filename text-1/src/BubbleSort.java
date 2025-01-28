public class BubbleSort {
    public static void main(String [] args){
      int number[] = {7,8,3,5,1,2,4,6};
        printArray(number);

      reverseNumber(number);
        System.out.println("\n"+"After reverse");

        printArray(number);
    }

    public static void printArray(int[] number) {
        for(int i : number)
            System.out.print(i+" ");
    }

    public static void reverseNumber(int num[]){
        for(int i=0; i<num.length-1; i++){
            for(int j=0; j<num.length-i-1; j++){
                if(num[j]<num[j+1]){
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}
