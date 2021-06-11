<?php
// Importamos el archivo 'account.php' para poder acceder al objeto 'driver'.
require_once('account.php');

// Creamos la clase Car y sus atributos con la siguiente sintaxis.
class Car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    // Creamos el método constructor.
    // Primero, método de acceso.
    // Segundo, keyword 'function' y keyword '__construct', le pasamos los parámetros obligatorios. Y luego accedemos a ellos a través de 'this->'.
    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    // Imprimimos los datos.
    public function printDataCar() {
        echo "Licencia: $this->license Driver: ".$this->driver->name;
    }
}

?>