import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        int [] ratings = {2,1,3,4,2,3};

        int result = candy(ratings);
        System.out.println("The Result:"+result);
    }
    public static int candy(int [] ratings){
        int [] candies = new int[ratings.length];
        Arrays.fill(candies,1);

        for(int i=1; i<ratings.length; i++){
            if(ratings[i]>ratings[i-1])
                candies[i]=candies[i-1]+1;
        }

        for(int i=ratings.length-1; i>0; i--){
            if(ratings[i-1] < ratings[i] && candies[i]>=candies[i-1])
                candies[i-1]=candies[i]+1;
        }

        for(int candy : candies)
            System.out.print(candy+" ");


        return Arrays.stream(candies).sum();
    }
}
