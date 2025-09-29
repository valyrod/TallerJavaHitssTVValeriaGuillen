# Taller Java TV 2025 – Ejercicios 
**Nombre:** Valeria María Guillén López

Este repositorio contiene los ejercicios que se van realizando a lo largo del taller.  
Cada ejercicio incluye una breve descripción, la fecha en que fue asignado y su respectivo código.

---

## Ejercicios

### Ejercicio 1 – *Ejercicio de Cadenas*
**Fecha:** 06/08/2025  

**Descripción:**  

La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos. Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable). Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser: N.es_A.ia_E.pe

**Ubicación:** [`/ejercicios/ProgramaManejoDeNombres.java`](./ejercicios/ProgramaManejoDeNombres.java)  

---

### Ejercicio 2 – *Ejercicio 1 Bucle For*
**Fecha:** 12/08/2025

**Descripción:**  

Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*). Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.

**Ubicación:** [`/ejercicios/Ejercicio1BucleFor.java`](./ejercicios/Ejercicio1BucleFor.java)  

---

### Ejercicio 3 – *Ejercicio 2 Bucle For*
**Fecha:** 12/08/2025 

**Descripción:** 

Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere: Calcular el menor número e imprimir el valor. Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!"

**Ubicación:** [`/ejercicios/Ejercicio2BucleFor.java`](./ejercicios/Ejercicio2BucleFor.java)  

---

### Ejercicio 4 – *Ejercicio calificaciones*
**Fecha:** 13/08/2025 

**Descripción:**  

Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas inferiores a 6 y la cantidad de notas iguales a 1, además mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es menor que 1.0 o mayor que 10.0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.

**Ubicación:** [`/ejercicios/Ejercicio3.java`](./ejercicios/Ejercicio3.java)  

---

### Ejercicio 5 – *Ejercicio Restaurante*
**Fecha:** 14/08/2025 

**Descripción:**  

Un restaurante necesita un programa que permita al cajero:

 Mostrar un menú de opciones:
1. Registrar un pedido.
2. Mostrar el total de ventas.
3. Salir del sistema.

Cada pedido se registra ingresando el precio.
El programa debe seguir mostrando el menú hasta que el cajero elija Salir.
Validar que el precio sea positivo antes de sumarlo a las ventas.

**Ubicación:** [`/ejercicios/EjercicioRestaurante.java`](./ejercicios/EjercicioRestaurante.java)  

---

### Ejercicio 6 – *Ejercicio 2 Arrays*
**Fecha:** 19/08/2025 

**Descripción:**  

Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: [1, 2, 3, 3, 4, 5, 5, 5, 6, 7]

Como resultado debería imprimir lo siguiente:
1. La mayor ocurrencias es: 3
2. El elemento que más se repite es: 5

En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.

**Ubicación:** [`/ejercicios/ArrayEjercicio2.java`](./ejercicios/ArrayEjercicio2.java)  

---

### Ejercicio 7 – *Ejercicio 3 Matrices*
**Fecha:** 20/08/2025

**Descripción:**  
Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo como relleno.

El tamaño de la X se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.
El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

Por ejemplo para n=5 se obtiene:

```plaintext
X___X
_X_X_
__X__
_X_X_
X___X
```
 

Por ejemplo para n=6 se obtiene:
```plaintext
X____X
_X__X_
__XX__
__XX__
_X__X_
X____X
```
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.

**Ubicación:** [`/ejercicios/MatricesEjercicio3.java`](./ejercicios/MatricesEjercicio3.java)  

---

### Ejercicio 8 – *Ejercicio de Sistema Bancario*
**Fecha:** 27/08/2025 

**Descripción:**  

Una institución bancaria necesita un sistema básico para administrar cuentas bancarias y registrar sus transacciones.

Cada cuenta creada debe tener un ID único que se genere automáticamente sin que el usuario lo proporcione. Lo mismo debe ocurrir con cada transacción registrada.

El sistema debe permitir las siguientes funcionalidades:

1.  **Crear cuentas bancarias**
    * Cada cuenta debe tener un **ID único**, el **nombre del titular** y el **saldo actual**.

2.  **Realizar operaciones bancarias**
    * **Depósito**: Aumentar el saldo de la cuenta.
    * **Retiro**: Disminuir el saldo, siempre que haya suficiente dinero disponible.

3.  **Registrar transacciones asociadas a las cuentas**
    * Cada transacción debe tener un **ID único automático**, el **tipo de operación** (depósito o retiro), el **monto** y la **cuenta asociada**.

4.  **Mostrar información**
    * Visualizar el detalle de las cuentas y el historial de las transacciones realizadas.

Ejemplo de funcionamiento esperado

1.  **Crear dos cuentas:**
    * Ana con $5000
    * Luis con $10000

2.  **Realizar operaciones:**
    * Ana deposita $2000 y retira $1000.
    * Luis retira $3000 y deposita $1500.

3.  **Visualizar resultados:**
    * El sistema debe mostrar el detalle de cada cuenta y un historial de las transacciones con sus IDs únicos.

**Ubicación:** [`/ejercicios/SistemaBancario`](./ejercicios/sistemaBancario) 

---

### Ejercicio 9 – *Ejercicio de Sistema de Pedidos*
**Fecha:** 28/08/2025 

**Descripción:**

Este proyecto implementa un mini sistema de pedidos en Java. El objetivo es utilizar adecuadamente las enumeraciones (enums) para definir los estados, prioridades y métodos de pago de un pedido, y una clase para representar el pedido en sí.

Paso 1: Creación de Enumeraciones (enums)
Se crearon tres enumeraciones, cada una con un propósito específico y con un valor asociado a sus constantes:
1. OrderStatus: Define los estados posibles de un pedido (NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED). Cada estado tiene una descripción asociada.
2. OrderPriority: Define los niveles de prioridad de un pedido (LOW, MEDIUM, HIGH). Cada nivel tiene un número de atención (1 = baja, 3 = alta).
3. PaymentMethod: Define los métodos de pago aceptados (CASH, CARD, TRANSFER). Cada método tiene una descripción completa.

Paso 2: Creación de la Clase Order
Se creó una clase Order que encapsula toda la información de un pedido. Sus atributos son:
- int id: Identificador único del pedido.
- String customer: Nombre del cliente.
- OrderStatus status: El estado actual del pedido.
- OrderPriority priority: El nivel de prioridad del pedido.
- PaymentMethod paymentMethod: El método de pago utilizado.
La clase también incluye un método showDetails() que imprime en la consola todos los detalles del pedido de manera legible.

Paso 3: Clase Principal TestMain
La clase TestMain contiene el método main y sirve como punto de entrada del programa. En ella, se realizan las siguientes acciones:
1. Se crean tres instancias diferentes de la clase Order con distintos valores para sus atributos.
2. Se llama al método showDetails() de cada instancia para mostrar sus datos en pantalla.

Estructura del Proyecto
El código está organizado en paquetes para una mejor práctica de programación, siguiendo la siguiente estructura:
SISTEMADEPEDIDOS/
├── clases/
│   └── Order.java
├── enums/
│   ├── OrderPriority.java
│   ├── OrderStatus.java
│   └── PaymentMethod.java
└── test/
    └── TestMain.java

Ejemplo de Salida Esperada
Pedido #1
Cliente: Ana
Estado: NEW -> Pedido creado
Prioridad: HIGH (Nivel 3)
Método de pago: CARD -> Tarjeta de crédito/débito

Pedido #2
Cliente: Luis
Estado: SHIPPED -> Pedido enviado
Prioridad: MEDIUM (Nivel 2)
Método de pago: CASH -> Efectivo

Pedido #3
Cliente: Carlos
Estado: CANCELLED -> Pedido cancelado
Prioridad: LOW (Nivel 1)
Método de pago: TRANSFER -> Transferencia bancaria

**Ubicación:** [`/ejercicios/sistemaDePedidos`](./ejercicios/sistemaDePedidos)  

---

### Ejercicio 10 – *Ejercicio de Compañia de Empleados*
**Fecha:** 01/09/2025 

**Descripción:** 

Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su área (modificable) y a todos los empleados se les puede aumentar el sueldo, se pide una jerarquía de clase de los tipos de persona mencionados, tomando como base la figura del diagrama UML de clases.

Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un constructor y el toString() con sobre-escritura, para Gerente además el método setter de presupuesto.

También incluir una clase main con algún ejemplo de un Gerente e imprimir todos sus datos (y heredados) vía toString().

**Ubicación:** [`/ejercicios/companiaDeEmpleados`](./ejercicios/companiaDeEmpleados)  

---

### Ejercicio 11 – *Ejercicio Mamíferos*
**Fecha:** 03/09/2025 

**Descripción:** 

Se requiere escribir un programa para la administración de animales de un zoológico, inicialmente para los mamíferos, para leones, lobos, tigres, guepardos y perros salvaje africano.

Se necesita diseñar una jerarquía de clases en común a todos ellos, por ejemplo, para los felinos (León, Tigre y Guepardo) vamos a necesitar la clase abstracta Felino, para los caninos (Lobo y Perro) vamos a necesitar la clase abstracta Canino y una clase que sea en común para todos ellos, la clase abstracta Mamífero.

Para todos los mamíferos mencionados se requieren de los siguientes atributos en común (que deberán de implementar en la clase abstracta Mamífero): el hábitat (string), altura (decimal), largo (decimal), peso (decimal), nombre científico (string) con sus respectivos métodos getters, usar constructor para inicializar los datos. También se necesitan 4 métodos abstractos que deberán implementar los tipos concretos: comer(), dormir(), correr(), comunicarse(), todos devuelven String.

Todos los caninos deberán tener además de lo anterior los atributos color (String), tamaño colmillos (decimal) e inicializar los datos mediante constructor con sus métodos getters.

Todos los felinos deberán tener los atributos tamaño garras (decimal) y velocidad (int), inicializar los datos mediante constructor y sus métodos getters.

Respecto a los tipos concretos:

El León además tiene número manada (int) y potencia de rugido en decibel (decimal)

El Tigre tiene el atributo especie tigre (string)

El Guepardo sin atributos adicionales

El Lobo tiene número de camada (int) y especielobo (string)

El Perro tiene fuerza de mordida en psi (int)

Los métodos abstractos comer(), dormir(), correr() y comunicarse() tienen que ser implementados por las clases concretas devolviendo un string con alguna frase u oración que sea de acuerdo a cada tipo y que interactúe con sus atributos. No hay una regla para implementar estos métodos, pueden aplicar la creatividad, por ejemplo en la clase León el método comer() podría ser implementado devolviendo la cadena "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas", o para el Lobo el método dormir() devolver "El Lobo " + color + " duerme en las cavernas de " + hábitat.

Al final crear la clase con el método main llamada EjemploMamíferos y crear algunas instancias de ejemplo de cada clase concreta, entre 5 a 7 objetos, asociado al tipo más genérico posible y mostrar los datos en consola. Por ejemplo:

```plaintext
Mamifero[] mamiferos = new Mamifero[6];
Mamifero leon = new Leon(120d, 5, 7.5f, 58, "Sur Africa", 120, 220, 190);
Mamifero guepardo = new Guepardo(4.9f, 130, "Africa", 94, 140, 72);
....
mamiferos[0] = leon;
mamiferos[1] = guepardo;
....
for (Mamifero animal : mamiferos) {
....
}
....
```

**Ubicación:** [`/ejercicios/mamiferos`](./ejercicios/mamiferos)  

---

### Ejercicio 12 – *Ejercicio de Interfaces Catalogo*
**Fecha:** 03/09/2025 

**Descripción:** 

El objetivo de esta práctica es exponer los conceptos que hay detrás del polimorfismo implementando clases abstractas e interfaces.
Se requiere crear un catálogo de producto con un diseño de jerarquía de clases y uso de interfaces para los métodos (o comportamiento).


Primero, vamos a tener las interfaces que describen el comportamiento que deberán tener las clases de la jerarquía:
1. La interface IProducto con dos firmas de métodos int getPrecio() y double getPrecioVenta().
2. La interface IElectronico con una firma de método String getFabricante().
3. La interface ILibro con 4 firmas de métodos:
- Date getFechaPublicacion();
- String getAutor();
- String getTitulo();
- String getEditorial();


Segundo, vamos a tener las clases abstractas para las diferentes especializaciones de productos:
1. La clase abstracta Producto que debe implementar la interface IProducto y tener el atributo precio con su respectivo método getter y el constructor.
2. La clase abstracta Electronico que debe implementar la interface IElectronico, con el atributo fabricante con su respectivo método getter y constructor.


Tercero, las 4 clases concretas que deben heredar de las clases abstractas, y si corresponde implementar alguna interface:
1. La clase IPhone, poner especial atención en el extends de Electronico y en el método que debe implementar getPrecioVenta() de la interface IProducto, sus atributos color y modelo del tipo string con sus respectivos métodos getter y el constructor.
2. La clase TvLcd, poner especial atención en el extends de Electronico y en el método que debe implementar getPrecioVenta(), su atributo pulgada (int) con su respectivo método get y el constructor.
3. La clase Libro que debe de extender de Producto e implementar el método getPrecioVenta(), además debe tener 4 atributos fechaPublicacion (Date), autor (string), título (string) y editorial (string) con sus respectivos métodos getters y el constructor. Pero además debe implementar la interface ILibro.
4. Finalmente, la clase Comics con en el extends de Libro e implementar el método de la interface getPrecioVenta() y su atributo personaje (string) con su respectivo método getter y constructor.


Al final crear la clase con el método main llamada ProyectoCatalogo y crear algunas instancias de ejemplo de cada clase concreta, entre 4 a 7 objetos, asociado al tipo más genérico posible y mostrar los datos en consola. Por ejemplo:

```plaintext
IProducto[] productos = new Producto[6];
…
productos[2] = new TvLcd(340000, "Sony", 40);
productos[3] = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
productos[4] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
…
```

**Ubicación:** [`/ejercicios/interfacesCatalogo`](./ejercicios/interfacesCatalogo)  

---

### Ejercicio 13 – *Ejercicio de Gestión y Validación de Usuarios*
**Fecha:** 08/09/2025 

**Descripción:** 

Haz un programa que lea un archivo de texto con nombres de usuarios. Si el archivo no existe, captura la excepción. Además, valida que cada nombre tenga al menos 3 caracteres; si no, lanza una excepción personalizada NombreInvalidoException.

**Ubicación:** [`/ejercicios/gestionValidacionDeUsuarios`](./ejercicios/gestionValidacionDeUsuarios)  

---

### Ejercicio 14 – *Ejercicio de Carrito de Supermercado*
**Fecha:** 10/09/2025 

**Descripción:** 

Entonces como requerimiento vamos a tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas tienen en común dos atributos el nombre (string) y precio (double) que deben heredar de la clase padre Producto, pero además cada una van a tener dos atributos propios adicionales, sus métodos getter y constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios).

Para el ejemplo de la clase main se pide crear un objeto bolsa para cada tipo de producto con 5 elementos, se debe mostrar por cada bolsa el detalle completo de sus elementos, el precio, nombre y los atributos adicionales sin realizar cast de ningún tipo, ni toString().

**Ubicación:** [`/ejercicios/carritoSupermercado`](./ejercicios/carritoSupermercado)  

---

### Ejercicio 15 – *Ejercicio de Facturación*
**Fecha:** 15/09/2025 

**Descripción:** 

Realiza una clase con metodos estaticos, los cuales son:

1.- Guardar en un archivo la factura, con la siguiente nomenclatura en el nombre del archivo: "factura_idFactura.txt", todas las facturas se guardan en una carpeta llamada "facturas"
    
    Ejemplo: Archivos.guardarFactura(f1);
    
2.- Leer la factura y mostrar en consola
    
    Ejemplo: Archivos.leerFactura(idFactura);

3.- Listar los nombres de todas las facturas existentes

     factura_1.txt
     factura_2.txt

**Ubicación:** [`/ejercicios/sistemaTV`](./ejercicios/sistemaTV)  

---

### Ejercicio 16 – *Ejercicio Proyecto Vuelo*
**Fecha:** 18/09/2025 

**Descripción:** 

Una lista de objetos List del tipo Vuelo que mantenga el mismo orden de registro de la tabla.

La clase Vuelo debe contener los atributos nombre (string), origen (string), destino (string), fecha de llegada que incluya fecha y hora (java.time.LocalTime, java.time.LocalDate) y cantidad de pasajeros.

Se pide ordenar por llegada de forma ascendente, obtener el último vuelo en llegar y también se pide el vuelo que tiene menor número de pasajeros.

El resultado final debería ser, similar a:

```plaintext
... listado ordenado por fecha llegada ascendente ...

El último vuelo en llegar es CMP 111: Panama City, aterriza el Tue Aug 31 15:15:00 2021

El vuelo con menor número de pasajeros es AVA 241: Bogota, con 25 pasajeros.
```

**Ubicación:** [`/ejercicios/proyectoVuelo`](./ejercicios/proyectoVuelo)  

---

### Ejercicio 17 – *Ejercicio de Gestión de un Torneo Deportivo Universitario*
**Fecha:** 22/09/2025 

**Descripción:** 

La universidad organiza un torneo deportivo con varias disciplinas (fútbol, básquetbol, voleibol, etc.).

Cada disciplina tiene un conjunto de jugadores inscritos.

Requisitos del sistema:

1. Registro de jugadores en cada disciplina
     - Cada jugador se identifica por un ID único y tiene un nombre.
     - No se permiten jugadores duplicados (un jugador no puede inscribirse dos veces en la misma disciplina).

2. Mostrar inscripciones con distintas implementaciones de `Set`:
     - Usar `HashSet` → para verificar rápidamente inscripciones, sin importar el orden.
     - Usar `LinkedHashSet` → para mostrar los jugadores en el orden en que se inscribieron.
     - Usar `TreeSet` → para mostrar a los jugadores ordenados alfabéticamente por nombre.

3. Operaciones requeridas:
     - Registrar un jugador en una disciplina (evitar duplicados).
     - Mostrar todos los jugadores inscritos en cada disciplina, de acuerdo con la implementación de `Set`.
     - Buscar si un jugador está inscrito en cierta disciplina.
     - Eliminar un jugador de una disciplina.

4.  El usuario puede elegir del menú distintas operaciones:
    1.  Mostrar jugadores por deporte.
    2.  Contar jugadores en cada disciplina.
    3.  Fusionar equipos (unión).
    4.  Ver jugadores en común (intersección).
    5.  Transferir un jugador de un deporte a otro.
    6.  Mostrar todos los jugadores ordenados por nombre.
    7.  Mostrar todos los jugadores en orden de inscripción.
    8.  Mostrar ranking de jugadores por ID.
    9.  Salir

Pruebas:

1. Contar jugadores inscritos en cada disciplina
     - Muestra cuántos jugadores hay inscritos en fútbol, básquetbol y vóleibol.

2. Fusionar equipos
     - Supón que fútbol y básquetbol harán un entrenamiento conjunto.
     - Une los jugadores de ambos equipos.
     - Muestra los jugadores únicos.

3. Encontrar jugadores comunes entre deportes
     - Un estudiante puede estar inscrito en más de un deporte.
     - Encuentra los jugadores que están inscritos tanto en fútbol como en básquetbol.

4. Mover jugadores de un deporte a otro
     - Un jugador se transfiere de básquetbol a fútbol.
     - Elimínalo de básquetbol y agrégalo al de fútbol.

5. Mostrar jugadores ordenados por nombre
     - Inserta todos los jugadores de todos los deportes y muéstralos en orden alfabético.

6. Generar un listado en orden de inscripción
     - Simula inscribir jugadores en varios deportes.

7. Ranking de jugadores por ID
     - Inserta a todos los jugadores ordenados por ID.
     - Muestra el ranking de jugadores con el ID más bajo al más alto.

**Ubicación:** [`/ejercicios/gestionTorneoDeportivoUniversitario`](./ejercicios/gestionTorneoDeportivoUniversitario)  

---

### Ejercicio 18 – *Ejercicio de Gestión de Inventario en una Tienda de Deportes*
**Fecha:** 24/09/2025 

**Descripción:** 

Una cadena de tiendas de deportes maneja miles de productos (tenis, camisetas, balones, etc.). 

Cada producto tiene:
1. Código único (SKU)
2. Nombre del producto
3. Categoría (fútbol, baloncesto, running, etc.)
4. Stock disponible en cada sucursal

El reto es gestionar el inventario de manera eficiente:
1. Poder acceder rápidamente a un producto por su código.
2. Mantener los productos ordenados por nombre para listados.
3. Mantener el orden de inserción para reportes de recepción de mercancía.

Requisitos del sistema:

1. Registrar productos en el inventario.
2. Consultar un producto en O(1) usando su código SKU.
3. Generar un reporte de productos en el orden en que fueron agregados.
4. Generar un reporte de productos ordenados alfabéticamente por nombre.
5. Actualizar stock cuando se registren ventas o lleguen nuevas unidades.

**Ubicación:** [`/ejercicios/gestionInventarioTiendaDeportes`](./ejercicios/gestionInventarioTiendaDeportes)  

---

### Ejercicio 19 – *Ejercicio Sistema Universitario*
**Fecha:** 25/09/2025 

**Descripción:** 

La universidad desea un sistema para gestionar cursos, estudiantes y profesores con control de conflictos de horarios:

1. Cursos:
    - Cada curso tiene un nombre, un profesor, y fechas de inicio y fin.
    - Los estudiantes inscritos no deben duplicarse.
    - Un curso puede usarse para detectar solapamientos de fechas.

2. Estudiantes:
    - Cada estudiante tiene un ID único y un nombre.
    - Un estudiante puede inscribirse en varios cursos, pero no en cursos con fechas que se traslapan.

3. Profesores:
    - Cada profesor puede impartir varios cursos.

4. Requisitos del sistema:
    - Inscribir un estudiante en un curso solo si no hay conflicto de fechas con otros cursos en los que ya esté inscrito.
    - Retirar un estudiante de un curso.
    - Listar los cursos de un estudiante.
    - Listar cursos de un profesor.
    - Listar cursos activos en una fecha determinada.

5. Estructuras sugeridas:
    - Usar Set<Student> para los estudiantes de cada curso.
    - Usar Map<String, Course> para gestionar los cursos por nombre.

**Ubicación:** [`/ejercicios/sistemaUniversitario`](./ejercicios/sistemaUniversitario)  

---

### Ejercicio 20 – *Ejercicio de frase Lambda*
**Fecha:** 29/09/2025 

**Descripción:** 

Expresión Lambda que elimine espacios, comas y puntos de una frase y además devuelva la frase convertida en mayúsculas.

**Ubicación:** [`/ejercicios/fraseLamda`](./ejercicios/fraseLamda)  

---


