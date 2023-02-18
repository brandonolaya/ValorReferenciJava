public class porReferencia2 {
    public static void main(String[] args) {
        int[] edades = {10,35,12,56}; //se pasa por valor

        System.out.println("i con valor = ");
        for (int i:edades) {
            System.out.println("edad = " + i);
        }
        System.out.println("\n");

        prueba(edades);
        for (int i:edades) {
            System.out.println("edadx = " + i);
        }
        System.out.println("Final metodo test por REferencia" );
    }

    public  static void prueba(int[] edades){ // se pasa por valor y no por refencia
        System.out.println("inicializando metodo prueba por Referencia");
        for (int i = 0; i<edades.length; i++){
            edades[i] = edades[i] + 30;
        }

    }

}
