package baitapvenha.baitap3;

public class BaiTap3 {
    public static void main(String[] args) {
        Runnable lazyRunnable = new LazyPrimeFactorization();
        Runnable optimizedRunnable = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyRunnable);
        Thread optimizedThread = new Thread(optimizedRunnable);

        lazyThread.start();
        optimizedThread.start();
    }
}
