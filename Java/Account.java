// Creamos la clase Account y sus atributos. 
// El nombre de la clase debe tener el mismo nombre que del archivo.
class Account {
    Integer id; // Estos parámetros son variables globales.
    String name;
    String document;
    String email;
    String password;

    // Creamos el método contructor.
   // Primero, usamos el keyword 'public' para el acceso.
   // Segundo, nombre del método (tiene que ser el mismo que el de la clase).
   // Tercero, le pasamos los parámetros que queremos que sean obligatorios para instanciar un objeto de esa clase. Por convención, estos parámetros deben tener el mismo nombre que los declarados en la clase. Estos parámetros son variables locales a este constructor.
   public Account(String name, String document) {
        this.name = name;
        this.document = document;
   }
}
