// Creamos la clase UberX que hereda de la clase Car.
// Declaramos los atributos propios de la clase UberX.
class UberX extends Car {
    String brand;
    String model;

   // Debemos definir el contructor que coincida con la clase que se está heredando (la clase padre o, también llamada, superclase).
   // Primero, usamos el keyword 'public' para el acceso.
   // Segundo, nombre del método (tiene que ser el mismo que el de la clase).
   // Tercero, le pasamos los parámetros que queremos que sean obligatorios para instanciar un objeto de esa clase. Por convención, estos parámetros deben tener el mismo nombre que los declarados en la clase. Estos parámetros son variables locales a este constructor.
   public UberX(String license, Account driver, String brand, String model) {
       // Usamos la keyword 'super' para referirnos a los atributos y a los métodos de la clase padre y le pasamos los parámetros obligatorios de esa clase.
       // Le pasamos las variables restantes. La variable global de la clase se debe corresponder con la variable local del método constructor, por lo que la referimos usando la keyword 'this.'. De esta manera, accedemos a ella.
       super(license, driver);
       this.brand = brand;
       this.model = model;
   }
   @Override
   public void setPassenger(Integer passenger) {
    if(passenger == 4) {
        super.setPassenger(passenger);
     } else {
        System.out.println("Necesitas asignar 4 pasajeros");
     }  
       
   }

    // Con override se sobreescribe el método que viene de la clase padre Car (polimorfismo).
    @Override
    void printDataCar() {
        // Accedemos al método de la clase padre.
        super.printDataCar();
        System.out.println("Model: " + model + " Brand: " + brand);
    }
}
