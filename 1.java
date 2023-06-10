import java.util*;

public class 1{

public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int Score1 = 0, Score2 = 0;
            int n = sc.nextInt();
            int xA[] = new int[n];
            for (int i = 0; i < n; i++) {
                xA[i] = sc.nextInt();
            }
            int xB[] = new int[n];
            for (int i = 0; i < n; i++) {
                xB[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (xA[i] > 0 && xB[i] > 0) {
                    Score1 += 1;
                    Score2 = Score1;
                } else {
                    Score1 = 0;
                }
            }
            System.out.println("Score : " + max(Score1, Score2));
            t--;
        }
        sc.close();
    }
    }
