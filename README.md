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




