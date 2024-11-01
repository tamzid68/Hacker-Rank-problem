import java.util.*;


public class List<I extends Number> {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        java.util.List<Integer> integerList  = new ArrayList<Integer>(n);

        for(int i = 0; i < n; i++){
            integerList.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            String command = sc.next();
            if(command.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                integerList.add(x, y);
            } else if (command.equals("Delete")) {
                int x = sc.nextInt();
                integerList.remove(x);
            }
        }
        for (Integer value : integerList) {
            System.out.print(value + " ");
        }
    }
}
