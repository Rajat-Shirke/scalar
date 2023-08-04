package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press ⌃R or click the green arrow button in the gutter to run the code.
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 100; i++) {
            NumberPrinter num = new NumberPrinter(i);
            executor.execute(num);
            // Press ⌃D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing ⌘F8.
            
        }

        executor.shutdown();
    }
}