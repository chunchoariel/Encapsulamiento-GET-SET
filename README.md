# Encapsulamiento-GET-SET

## Notas

* Las propiedades pueden ser Publicas(public) o Privadas(private),
* Cuando nosotros podemos acceder desde fuera de una clase a sus propiedades directamente, estaríamos diciendo que las propiedades son públicas.
* Las propiedades pueden ser pública-privada.
* Cual es la diferencia entre una propiedad pública y una propiedad privada? Una propiedad privada, solamente únicamente y exclusivamente la podre utilizar en la implementación de la clase, dentro de la clase.
*  Y cuando es pública la podré utilizar tanto dentro de la clase, como en mi programa.
* La encapsulación, consiste en jugar con los tipos públicos y privados de forma que desde la clase los manipule y desde fuera de la clase los pueda utilizar.
* Para encapsular debemos declarar las propiedades de la clase como privadas y luego nos inventamos una serie de funciones. Dos funciones, por cada una de las propiedades. A esto lo llamamos GETTERS Y SETTERS.
* Los llamamos GETTERS y SETTERS, porque estas funciones tienen como tarea modificar la propiedad o darnos el valor de la propiedad.
* La función SETTER, acepta un parámetro y cuyo único cometido, asignan el valor que se le pasa como parámetro a la propiedad de la clase.
* La función GETTER, esta función no acepta parámetros pero devuelve un texto. Y devuelve el texto de clase de la propiedad.
* Se llama encapsulación, porque estamos encapsulando las propiedades para acceder a ellas únicamente a través de funciones.
* No es obligatorio, pero si uno tiene una variable de tipo "private", que se quiere acceder desde fuera de esa clase, no desde la propia clase, si no desde fuera si se tiene que implementar el get y set.
* El tema de public o private, se refiere a las propiedades que al fin y al cabo, por así decirlo variables que pertenecen a una clase. Dentro de una clase no hay variables globales ni variables locales. Si no que hay variables de clase de la clase en sí, o variables locales a una función.
* Cuando tenemos un tipo de dato boolean, el setter es exactamente igual. Cuando implementamos un getter para un boolean el getter se llamara “is” seguido de la variable.
* La encapsulación consiste en que vamos a permitir que se modifiquen ciertas variables privadas de una clase a través de métodos GET y SET.
* La clase dentro de una función es un método.
