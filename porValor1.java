public class porValor1 {
    public static void main(String[] args) {
        int i = 10; //se pasa por valor
        Integer num = 100;

        System.out.println("i con valor = " + i);
        System.out.println("num con valor = " + num);
        prueba(i);
        test(num);
        System.out.println("i = " + i);
        System.out.println("num = " + num);

    }

    public  static void prueba(int i){ // se pasa por valor y no por refencia
        System.out.println("inicializando metodo prueba " + i);
        i = 200;
        System.out.println("Final metodo test " + i);
    }

    public  static void test(Integer num){ // se por refencia estos objetos son inmutables
        System.out.println("inicializando metodo test " + num);
        num = 200;
        System.out.println("Final metodo test " + num);
    }
}
