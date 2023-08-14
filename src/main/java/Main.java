import DSA.Adv_Array;
import DSA.designLinkedListfromMatrix;
import DSA.longestPalindrome;
import Threads.NumberPrinter;
import Threads.test;

import java.util.ArrayList;
import java.util.Map;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press ⌃R or click the green arrow button in the gutter to run the code.
//test t = new test();
//t.findMod("842554936302263",41);
//        for (int i = 1; i <= 100; i++) {
//            NumberPrinter num = new NumberPrinter(i);
//            Thread t = new Thread(num);
//            t.start();
//            // Press ⌃D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing ⌘F8.
//
//        }

//        longestPalindrome l = new longestPalindrome();
//        //int val = l.minCut("zdMTZF3Jb8zrOpMUF6NW9yacjRudIgpEsq8pVtBffgRq8NfbNVdrQdWLDgSS");
//        int val = l.minCut("abbxsss");
//        //int val = l.minCut("apjesgpsxoeiokmqmfgvjslcjukbqxpsobyhjpbgdfruqdkeiszrlmtwgfxyfostpqczidfljwfbbrflkgdvtytbgqalguewnhvvmcgxboycffopmtmhtfizxkmeftcucxpobxmelmjtuzigsxnncxpaibgpuijwhankxbplpyejxmrrjgeoevqozwdtgospohznkoyzocjlracchjqnggbfeebmuvbicbvmpuleywrpzwsihivnrwtxcukwplgtobhgxukwrdlszfaiqxwjvrgxnsveedxseeyeykarqnjrtlaliyudpacctzizcftjlunlgnfwcqqxcqikocqffsjyurzwysfjmswvhbrmshjuzsgpwyubtfbnwajuvrfhlccvfwhxfqthkcwhatktymgxostjlztwdxritygbrbibdgkezvzajizxasjnrcjwzdfvdnwwqeyumkamhzoqhnqjfzwzbixclcxqrtniznemxeahfozp");
//
//
//Adv_Array l = new Adv_Array();
//int[][] ar = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//int ans =l.solve(ar,2);
//        int dumm=-1;


        designLinkedListfromMatrix ll = new designLinkedListfromMatrix();
        char[] ip_task = new char[]{'i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','i','d','p','d','p','d','d','p','p','p','p','p','d','d','p','d','d','d','p','d','p','d','d','d','d','d','p','p','p','p','p','p','d','p','d','p','d','d','d','p','p'};
        int[] ip_position = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,25,0,53,0,12,54,0,0,0,0,0,39,42,0,47,45,35,0,13,0,18,59,47,43,38,0,0,0,0,0,0,8,0,8,0,39,60,16,0,0};
        int[] ip_value = new int[]{226,875,604,550,498,875,847,633,793,872,313,440,331,582,188,476,722,402,890,713,421,930,579,459,278,818,320,549,240,528,367,835,20,170,903,242,943,802,145,291,224,400,43,355,83,26,816,477,425,543,211,799,185,5,184,150,572,626,109,807,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 100; i++) {
            if(ip_task[i]=='i')
            {
                designLinkedListfromMatrix.insert_node(ip_position[i],ip_value[i]);
            } else if (ip_task[i]=='d') {
                designLinkedListfromMatrix.delete_node(ip_position[i]);
            }
            else
            {
                designLinkedListfromMatrix.print_ll();
            }
        }

        int dummy=-1;
    }
}