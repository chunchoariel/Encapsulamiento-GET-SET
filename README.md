# Encapsulamiento-GET-SET

## Notas

//Las propiedades pueden ser Publicas(public) o Privadas(private),

//Cuando nosotros podemos acceder desde fuera de una clase a sus propiedades directamente, estariamos diciendo que las
    //propiedades son publicas.
//Las propiedades pueden ser de 3 tipos, publica-privada-
//Cual es la diferencia entre una propiedad publica y una propiedad privada? Una propiedad privada, solamente unica-
    //mente y exclusivamente la podre utilizar en la implementación de la clase, dentro de la clase.
// Y cuando es publica la podre utilizar tanto dentro de la clase, como en mi programa.
//La encapsulacion, consiste en jugar con los tipos publicos y privados de forma que desde la clase los manipule y desde
    //fuera de la clase los pueda utilizar.
//Para encapsular debemos declarar las propiedades de la clase como privadas y luego nos inventamos una serie de funcio-
    //nes. Dos funciones, por cada una de las propiedades. A esto lo llamamos GETTERS Y SETTERS.
//Los llamamos GETTERS y SETTERS, por que estas funciones tienen como tarea modificar la propiedad o darnos el valor de
    //la propiedad.

//La funcion SETTER, acepta un parametro y cuyo unico cometido, asigan el valor que se le pasa como parametro a la
    //propiedad de la clase.

//La funcion GETTER, esta funcion no acepta parametros pero devuelve un texto. Y devuelve el texto de calse de la propie
    //dad.

//Se llama encapsulacion, porque estamos encapsulando las propiedades para acceder a ellas unicamente a traves de funcio
    //nes.

//No es obligatorio pero si uno tiene una variable de tipo "private", que se quiere acceder desde fuera de esa clase, no
    //no desde la propia clase, si no desde fuera si se tiene que implementar el get y set.

//El tema de public o private, se refiere a las propiedades que al fin y al cabo, por asi decirlo variables que pertene
    //cen a una clase. Dentro de una clase no hay variables globales ni variables locales. Si no que hay variables de
    //clase de la clase en si, o variables locales a una funcion.

//Cuando tenemos un tipo de dato boolean, el seter es exactamente igual. Cuando implementamos un getter para un boolean
    //el getter se llamara is seguido de la variable.

//La encapsulacion conciste en que vamos a permitir que se modifiquen ciertas variables privadas de una clase a traves
    //de metodos GET y SET.

//La clase dentro de una funcion es metodo
