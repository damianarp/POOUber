<?php
// Importamos los archivos necesarios para poder acceder a ellos.
require_once('car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('uberBlack.php');
require_once('uberVan.php');

// Creamos el objeto de uberX. Y le pasamos los datos de los parámetros definidos en el constructor.
// En este caso, los parámetros obligatorios son 'license' y 'driver', 'brand' y 'model', pero los datos 'driver' provienen de la clase Account, por lo que tenemos que pasar la clase Account como parámetro dentro del objeto car y pasarle como parámetro el 'name' y el 'document', ya que son los parámetros obligatorios definidos en el método constructor de la clase Account.
$uberX = new UberX("AHT456", new Account("Damián Arp", "55555"), "Chevrolet", "Spark");

// Imprimimos los datos.
// Primero, comolocamos el nombre del objeto, seguido de la sintaxis para llamar a un método en php '->'.
// Usamos el método printDataCar creado en la clase Car.
$uberX->printDataCar();


// Creamos el objeto de uberPool. Y le pasamos los datos de los parámetros definidos en el constructor.
// En este caso, los parámetros obligatorios son 'license' y 'driver', 'brand' y 'model', pero los datos 'driver' provienen de la clase Account, por lo que tenemos que pasar la clase Account como parámetro dentro del objeto car y pasarle como parámetro el 'name' y el 'document', ya que son los parámetros obligatorios definidos en el método constructor de la clase Account.
$uberPool = new UberPool("HYD594", new Account("Gastón Arp", "66666"), "Ford", "Fiesta");

// Imprimimos los datos.
// Primero, comolocamos el nombre del objeto, seguido de la sintaxis para llamar a un método en php '->'.
// Usamos el método printDataCar creado en la clase Car.
$uberPool->printDataCar();
?>