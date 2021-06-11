<?php
// Importamos el archivo 'car.php' para poder acceder a la clase padre Car.
require_once('car.php');

// Creamos la clase UberPool que hereda de Car, y sus atributos con la siguiente sintaxis. 
class UberPool extends Car {
   public $brand;
   public $model;

   // Creamos el método constructor.
   // Primero, método de acceso.
   // Segundo, keyword 'function' y keyword '__construct'. le pasamos los parámetros obligatorios. Y luego accedemos a ellos a través de 'this->'.
   // Accedemos a la clase padre a traves de 'parent::__construct'.
   // Le pasamos los parámetros obligatorios del constructor.
   // Pasamos los parámetros obligatorios. Y luego accedemos a ellos a través de 'this->'.
   public function __construct($license, $driver, $brand, $model) {
   parent::__construct($license, $driver);
   $this->brand = $brand;
   $this->model = $model;
  }
}
?>