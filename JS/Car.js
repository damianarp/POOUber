// Creamos la clase Car, le pasamos los parámetros obligatorios y automáticamente ya los toma como parámetros del método constructor y los instancia.
function Car(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

/** Creamos un método para imprimir los datos en pantalla.
Primero, escribimos el nombre de la clase.
Segundo, usamos el método '.prototype' seguido de '.nombreDelMetodo' y le decimos que sea una función.

*/ 
Car.prototype.printDataCar = function() {
    // Imprimimos en consola y le pasamos los parámetros.
    console.log(this.driver); // Imprime un json con atributo 'name' y 'document'.
    console.log(this.driver.name); // Imprime el 'name'.
    console.log(this.driver.document); // Imprime el 'document'.

}