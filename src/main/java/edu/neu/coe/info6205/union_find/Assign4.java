package edu.neu.coe.info6205.union_find;

import edu.neu.coe.info6205.util.Benchmark_Timer;

/**
 * @author Dayu Jia
 * @NUID 001569081
 * @date 2020/10/12
 */
public class Assign4 {

    private static void QU1(int n) {
        UF_HWQUPC uf_hwqupc1 = new UF_HWQUPC(n);
        while (uf_hwqupc1.components() > 1) {
            int x, y;
            x = (int) (Math.random() * n);
            y = (int) (Math.random() * n);
            uf_hwqupc1.connect(x, y);
        }
    }
    private static void QU2(int n) {
        UF_HWQUPC uf_hwqupc2 = new UF_HWQUPC(n);
        while (uf_hwqupc2.components() > 1) {
            int x, y;
            x = (int) (Math.random() * n);
            y = (int) (Math.random() * n);
            uf_hwqupc2.connect2(x, y);
        }
    }


    public static void main(String[] args) {

        Benchmark_Timer benchmarkTimer1 = new Benchmark_Timer("Simple One Pass", b -> QU1(50000));
        double time1 = benchmarkTimer1.runFromSupplier(() -> 50000, 100);

        Benchmark_Timer benchmarkTimer2 = new Benchmark_Timer("Simple One Pass", b -> QU2(50000));
        double time2 = benchmarkTimer2.runFromSupplier(() -> 50000, 100);


        System.out.println("One loop cost time:" + time1);
        System.out.println("Two loops cost time:" + time2);
    }

}
