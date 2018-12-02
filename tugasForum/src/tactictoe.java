public class tactictoe {

        private static final int BARIS = 3;
        private static final int KOLOM = 3;

        public static void main(String[] args) {
            printBoard();
        }
        private static void printBoard() {
            for (int baris = 0; baris < BARIS; baris++) {
                for (int kolom = 0; kolom < KOLOM; kolom++) {
                    System.out.print(" X ");
                    if (kolom != KOLOM - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (baris != BARIS-1) {
                    System.out.println("-----------");
                }
            }
            System.out.println();
        }

}
