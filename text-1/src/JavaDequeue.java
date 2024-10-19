import java.util.*;

public class JavaDequeue {
    public static void main(String []args)
    {
                Scanner in = new Scanner(System.in);
                Deque<Integer> deque = new ArrayDeque<>();
                int n = in.nextInt();
                int m = in.nextInt();

                HashSet<Integer> hs = new HashSet<>();
                int max = -1;
                for (int i = 0; i < n; i++) {
                    int num = in.nextInt();

                    deque.add(num);
                    hs.add(num);

                    // If the window size reaches 'm'
                    if (deque.size() == m) {
                        // Update max based on the unique elements count
                        max = Math.max(max, hs.size());

                        // Slide the window: remove the first element
                        int first = deque.remove();
                        if (!deque.contains(first)) {
                            hs.remove(first);
                        }
                    }
                }
                System.out.println(max);
                in.close();

    }
}
