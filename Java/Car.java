// Creamos la clase Car y sus atributos.
// El nombre de la clase debe tener el mismo nombre que del archivo.
class Car {
   // Estos parámetros son variables globales.
   // Los encapsulamos con el modificador de acceso 'private' para que nadie pueda acceder a ellos y cambiarlos.
   private Integer id;
   private String license;
   private Account driver;
   private Integer passenger;

   // Creamos el método contructor.
   // Primero, usamos el keyword 'public' para el acceso.
   // Segundo, nombre del método (tiene que ser el mismo que el de la clase).
   // Tercero, le pasamos los parámetros que queremos que sean obligatorios para instanciar un objeto de esa clase. Por convención, estos parámetros deben tener el mismo nombre que los declarados en la clase. Estos parámetros son variables locales a este constructor.
   public Car(String license, Account driver) {
      // La variable global de la clase se debe corresponder con la variable local del método constructor, por lo que la referimos usando la keyword 'this.'. De esta manera, accedemos a ella.
      this.license = license;
      this.driver = driver;
   }

   // Creamos el método printDataCard
   /**
    * Imprime los datos en pantalla de la clase Car.
    * @see Aclaración: Debemos usar 'drive.name' para acceder al nombre del conductor, debido a que 'name' es un atributo de la clase Account que hace referencia al driver.  
    * @return void Solo imprime un mensaje en pantalla.
    */
   void printDataCar() {
      // Validamos que el dato 'passenger' sea distinto de null para imprimir los datos.
      if(passenger != null) {
         System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passenger);
      }
   }

   // Creamos el método 'getter' del atributo 'passenger' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'Integer'.
   // Tercero, nombre del getter.
   // Cuarto, retornamos el dato.
   public Integer getPassenger() {
      return passenger;
   }

   // Creamos el método 'setter' del atributo 'passenger' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'void', ya que no devuelve nada, solo se asigna un dato.
   // Tercero, nombre del getter.
   // Cuarto, le pasamos como parámetro el tipo y nombre de dato que recibe.
   // Accedemos al atributo de la clase Car a través del keyword 'this' y le asignamos el parámetro del setter.
   public void setPassenger(Integer passenger) {
      // Validamos que el número de pasajeros sea igual a 4.
      
         this.passenger = passenger;
      
   }

   // Creamos el método 'getter' del atributo 'id' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'Integer'.
   // Tercero, nombre del getter.
   // Cuarto, retornamos el dato.
   public Integer getId() {
      return id;
   }

   // Creamos el método 'setter' del atributo 'id' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'void', ya que no devuelve nada, solo se asigna un dato.
   // Tercero, nombre del getter.
   // Cuarto, le pasamos como parámetro el tipo y nombre de dato que recibe.
   // Accedemos al atributo de la clase Car a través del keyword 'this' y le asignamos el parámetro del setter.
   public void setId(Integer id) {
      this.id = id;
   }

   // Creamos el método 'getter' del atributo 'license' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'String'.
   // Tercero, nombre del getter.
   // Cuarto, retornamos el dato.
   public String getLicense() {
      return license;
   }

   // Creamos el método 'setter' del atributo 'license' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'void', ya que no devuelve nada, solo se asigna un dato.
   // Tercero, nombre del getter.
   // Cuarto, le pasamos como parámetro el tipo y nombre de dato que recibe.
   // Accedemos al atributo de la clase Car a través del keyword 'this' y le asignamos el parámetro del setter.
   public void setLicense(String license) {
      this.license = license;
   }

   // Creamos el método 'getter' del atributo 'driver' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'Account'.
   // Tercero, nombre del getter.
   // Cuarto, retornamos el dato.
   public Account getDriver() {
      return driver;
   }

   // Creamos el método 'setter' del atributo 'driver' para poder accederlo y modificarlo dentro de la clase.
   // Primero, definimos el método de acceso 'public'.
   // Segundo, tipo de dato que recibe 'void', ya que no devuelve nada, solo se asigna un dato.
   // Tercero, nombre del getter.
   // Cuarto, le pasamos como parámetro el tipo y nombre de dato que recibe.
   // Accedemos al atributo de la clase Car a través del keyword 'this' y le asignamos el parámetro del setter.
   public void setDriver(Account driver) {
      this.driver = driver;
   }

   
}
