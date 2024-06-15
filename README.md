<h1 align="center">Conversor de monedas</h1>
<p align="center">
  <img src="https://raw.githubusercontent.com/rgonzalezarre/ChallengeONE-ConversorMonedas/master/img/Default_robot_que_convierte_monedas_de_distintos_paises_dibujo_2.jpg" alt="Robot conversor de monedas" width=300>
</p>
<p>
  <img src="https://img.shields.io/badge/Version-1.11.1-light" alt="Versión">
  <img src="https://img.shields.io/badge/Status-Upgrading-red" alt="Status">
  <img src="https://img.shields.io/badge/Release%20date-june-blue" alt="Release date">
</p>
<h3>Objetivo.</h3>
<p>El objetivo del proyecto es implementar todos los conocimientos adquiridos en el curso de Alura LATAM DE Java orientado a objetos en un solo proyecto que sirve para convertir una cantidad especifica de dinero en las diferentes divisas del mundo</p>
<h3>Funcionalidad.</h3>
<p>Este proyecto solo cuenta con una funcionalidad(Por el momento)
</p>

- Convertir una cantidad de dinero a un número limitado de divisas (USD, ARS, COP, BRL).

<h3>Uso</h3>
<p>- Para su uso se tiene que ingresar de primera mano una de las opciones disponibles para hacer cambio de monedas</p>
<p>- Despues ingresar el monto de esa moneda a convertir</p>
<p>- Finalmente el programa entregara el resultado en como una salida de impresion.</p>
<h3>Estructura.</h3>
<p>El programa consta de 3 clases:</p>

- La primera (Principal), contiene el menu de opciones a demas de redirigirte a la funcion que se encarga de toda la logica de programacion.
- La segunda (ConversorMonedas), como dije anteriormente, proporciona el como funciona todo el programa, contiene la creacion de archivos json a partir de una API, la creacion de un objeto con ese json y finalmente la operacion y manipulacion de datos para su posterior impresion.
- La tercer y ultima clase (Moneda) guarda un objeto que guarda el nombre de la moneda y su valor de cambio a la moneda a la que se hara el cambio.
<h3>Manejo de excepciones.</h3>
<p>Basicamente el programa maneja excepciones de cuando se ingresan valores alfanumericos en vez de numeros y en el caso de las opciones iniciales, para cuando utilizas algo que no sea un valor entero.</p>
<h3>Autor.</h3>
<p>Este codigo, asi como la realizacion de esta documentacion es totalmente de mi autoria (Gonzalez Rafael)</p>
