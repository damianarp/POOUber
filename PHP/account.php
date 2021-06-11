<?php
// Creamos la clase Account y sus atributos con la siguiente sintaxis. 
class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    // Creamos el método constructor.
    // Primero, método de acceso.
    // Segundo, keyword 'function' y keyword '__construct', le pasamos los parámetros obligatorios. Y luego accedemos a ellos a través de 'this->'.
    public function __construct($name, $document) {
        $this->name = $name;
        $this->document = $document;
    }
}

?>