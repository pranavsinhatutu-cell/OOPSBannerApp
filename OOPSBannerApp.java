public class OOPSBannerApp {


    public static void main(String[] args) {

        System.out.println("******************************");
        System.out.println("        OOPS BANNER          ");
        System.out.println("******************************");

        Banner b = new Banner();
        b.printBanner();
    }
}

class Banner {

    Banner() {
        System.out.println("Banner Object Created");
    }

    void printBanner() {
        System.out.println("******************************");
        System.out.println("        OOPS BANNER          ");
        System.out.println("******************************");
    }
}
