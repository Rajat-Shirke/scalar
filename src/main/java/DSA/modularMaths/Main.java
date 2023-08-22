package DSA.modularMaths;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        pairSumModM p = new pairSumModM();
        int[] inpArr = new int[]{1,2,3,4,5};
        int B= 2;
        int ans = p.solve(inpArr,B);
        int dummy=-1;
    }
}