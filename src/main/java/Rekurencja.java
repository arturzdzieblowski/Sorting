public class Rekurencja {
    public static void main(String[] args) {

        System.out.println(silniaRekurencyjna(5));
//        int liczba = 1;
//
//
//        for (int i = 1; i <= 5; i++) {
//            liczba *=i;
//
//
//        }
//        System.out.println(liczba);

    }


    public static int silniaRekurencyjna (int n) {
        if (n==0)
            return 1;
        else
            return (n*silniaRekurencyjna(n-1));
    }

}
