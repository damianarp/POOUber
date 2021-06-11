# encoding: utf-8

# Importamos el archivo car y el nombre de la clase.
from car import Car

# Colocamos la condición de entrada de la aplicación.
if __name__ == "__main__":
    print("Hola Mundo") # Imprimimos Hola Mundo.
    
    # Creamos el objeto de la clase Car.
    # Primero, nombramos el objeto (mismo nombre que la clase).
    # Segundo, asignamos el metodo constructor que viene por defecto al crear la clase.
    car = Car()
    
    # Asignamos datos a los atributos del objeto.
    car.license = "AMS345"
    car.driver = "Damian Arp"
    car.passenger = 2
    
    # Imprimimos los datos utilizando el método vars, dentro del método print y le pasamos el objeto como parámetro.
    print(vars(car))
    
    # Creamos otro objeto de la clase Car.
    car2 = Car()
    
    # Asignamos datos a los atributos del objeto.
    car2.license = "RJH765"
    car2.driver = "Gaston Arp"
    car2.passenger = 4
    
    # Imprimimos los datos utilizando el método vars, dentro del método print y le pasamos el objeto como parámetro.
    print(vars(car2))