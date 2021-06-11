// Creamos un objeto de la clase Car.
// Primero, keyword 'var' y nombre del objeto (mismo nombre que la clase).
// Segundo, keyword 'new' + método constructor.
// Le pasamos los parámetros obligatorios definidos en el método constructor.
// En este caso, los parámetros obligatorios son 'license' y 'driver', pero los datos 'driver' provienen de la clase Account, por lo que tenemos que pasarle la clase Account como parámetro dentro del objeto car y pasarle como parámetro el 'name' y el 'document', ya que son los parámetros obligatorios definidos en el método constructor de la clase Account.
var car = new Car("AMD123", new Account("Damián Arp", "55555"));

// Asignamos datos al atributo restante del objeto.
car.passenger = 4;

// Accedemos a los datos, con el método que creamos en la clase.
car.printDataCar();