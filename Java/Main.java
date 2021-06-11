// El nombre de la clase debe tener el mismo nombre que del archivo.
class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase UberX.
        // Primero, tipo de clase. En este caso, UberX.
        // Segundo nombre del objeto (mismo nombre que la clase).
        // Tercero, keyword 'new' + método constructor.
        // Le pasamos los parámetros obligatorios definidos en el método constructor.
        
        UberX uberX = new UberX("AMQ123", new Account("Damián Arp", "55555"), "Chevrolet", "Spark");

        // Asignamos el dato al atributo restante del objeto a través de su setter.
        uberX.setPassenger(7);

        // Accedemos a los datos, con el método que creamos en la clase.
        uberX.printDataCar();

        // Creamos otro objeto de la clase Car.
        // Le pasamos los parámetros obligatorios definidos en el método constructor.
        // En este caso, los parámetros obligatorios son 'license' y 'driver', pero los datos 'driver' provienen de la clase Account, por lo que tenemos que crear un nuevo objeto Account como parámetro dentro del objeto car y pasarle como parámetro el 'name' y el 'document', ya que son los parámetros obligatorios definidos en el método constructor de la clase Account.
        UberVan uberVan = new UberVan("JYD486", new Account("Gastón Arp", "66666"), "Ford", "Fiesta");

        // Asignamos el dato al atributo restante del objeto a través de su setter.
        uberVan.setPassenger(7);

        // Accedemos a los datos, con el método que creamos en la clase.
        uberVan.printDataCar();        
    }
}