# Taller 3 SOLID

### 1.	Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.
    Correcto, dado que Liskov Substitution Principle especifica que las clases derivables debería poder ser sustituidas por su clase padre.

### 2.	Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.
	No es necesaria, su presencia implica agregar nuevos metodos de aderezo cada vez que añada un postre. Lo cual Rompe el principio OPEN CLOSED.
	Moviendo los metodos a la clase Postre, cada postre nuevo puede sobrescribir los metodos segun sus necesidades.

### 3.	Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados, deben estar en otra clase por si cambia la fórmula de cálculo. La clase nueva debe llamarse Procesos.ManejadorDePrecio.
    Single Responsability Principle se aplica en este caso ya que resulta mejor separar los métodos que alteran el precio.

### 4.	Enum Adicionales.Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre y un método abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente dicho método. También, sobrescriba el método toString() en la clase Aderezo, para que devuelva el nombre del aderezo en mayúsculas.


### 5.	Paquete Leche y la clase Procesos.ManejadorDeLeche. En el main descomente las instrucciones para realizar el cambio del tipo de leche utilizada en cada postre, luego analice como solucionar el error generado en la clase Leche.LecheDeslactosada.


## Colaboradores
Rogwi Cajas
Walter Santacruz
Eduardo Mora
Daniel Sanchez
Jeffrey Prado