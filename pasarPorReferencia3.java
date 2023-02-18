class Persona{
   private String nombre;

   public void modificar(String nuevoNombre){
       this.nombre = nuevoNombre;
   }
    public String leerNombre(){
       return this.nombre;
    }
}


public class pasarPorReferencia3 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificar("Brandon");

        //System.out.println("persona = " + persona.nombre);// no es accesible por que es privado
        System.out.println("persona = " + persona.leerNombre());
        prueba(persona);
        System.out.println("\n");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
    }

    //metodo para modificar lo que tiene la clase
    public  static void prueba(Persona persona){ // se pasa por valor y no por refencia
        System.out.println("inicializando metodo prueba por Referencia");
        persona.modificar("Valentin");
        System.out.println("final del metodo");
    }

}
