// Importamos ArrayList y Map de la librería de java.util
import java.util.ArrayList;
import java.util.Map;

// Creamos la clase UberBlack que hereda de la clase Car.
// Declaramos los atributos propios de la clase UberBlack.
class UberBlack extends Car {
    // Usamos Map para asignar clave-valor. Los cuales serán un 'String' para representar la marca, y un arreglo en forma de lista compuesto por un 'String' para el modelo, y un 'Integer' para el año. Luego pasamos el nombre del atributo.
    // También definimos un arreglo en forma de lista para el material de los asientos que puede ser vinilo o piel.
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    // Debemos definir el contructor que coincida con la clase que se está heredando (la clase padre o, también llamada, superclase).
    // Primero, usamos el keyword 'public' para el acceso.
    // Segundo, nombre del método (tiene que ser el mismo que el de la clase).
    // Tercero, le pasamos los parámetros que queremos que sean obligatorios para instanciar un objeto de esa clase. Por convención, estos parámetros deben tener el mismo nombre que los declarados en la clase. Estos parámetros son variables locales a este constructor.
    public UberBlack(String license, Account driver,
                    Map<String, Map<String, Integer>> typeCarAccepted, 
                    ArrayList<String> seatsMaterial) {
        // Usamos la keyword 'super' para referirnos a los atributos y a los métodos de la clase padre y le pasamos los parámetros obligatorios de esa clase.
        // Le pasamos las variables restantes. La variable global de la clase se debe corresponder con la variable local del método constructor, por lo que la referimos usando la keyword 'this.'. De esta manera, accedemos a ella.
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

        
    }
}
