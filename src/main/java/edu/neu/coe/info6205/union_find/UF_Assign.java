package edu.neu.coe.info6205.union_find;

/**
 * @author Dayu Jia
 * @NUID 001569081
 * @date 2020/10/5
 */
public class UF_Assign {

    private static int count(int n) {
        UF_HWQUPC uf_hwqupc = new UF_HWQUPC(n);
        int step = 0;
        while (uf_hwqupc.components() > 1) {
            int x, y;
            x = (int) (Math.random() * n);
            y = (int) (Math.random() * n);
            uf_hwqupc.connect(x, y);
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        int m;
        for (int i = 1; i < 11; i++) {
            m = 0;
            //int n = i * i * 100;
            int n = i * i * 1000;
            for (int j = 0; j < 200; j++) {
                m += count(n);
            }
            double x = m / 200.0;
            System.out.println(x);

        }
    }
}
