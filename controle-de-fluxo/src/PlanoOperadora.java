public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        /*
         * if (plano == "B") {
         * System.out.println("100 minutos de ligação");
         * } else if (plano == "M") {
         * System.out.println("100 minutos de ligação");
         * System.out.println("Whats e Instagram grátis");
         * } else if (plano == "T") {
         * System.out.println("100 minutos de ligação");
         * System.out.println("Whats e Instagram grátis");
         * System.out.println("5Gb Youtube");
         * } else
         * System.out.println("Escolha uma opção válida [B,M,T]");
         */

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Escolha uma opção válida [B,M,T]");
                break;
                
        }

    }

}
