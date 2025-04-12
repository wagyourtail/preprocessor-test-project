package xyz.wagyourtail;

public class TestMain {

    public static void main(String[] args) {
        #if DEBUG
            System.out.println("DEBUG");
        #else
            System.out.println("NOT DEBUG");
        #endif
    }

}
