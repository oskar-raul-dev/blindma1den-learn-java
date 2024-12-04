# Sesión 008

## Preguntas para el análisis de un algoritmo

Cuando nos enfrentamos a un algoritmo o problema en general,  previo a 
hacer el diagrama o a _echar la primera línea de código_ debemos tomar al menos unos minutos  para hacer un análisis de la situación y comprender el problema que se pide resolver.

Como guía práctica, ante un problema podemos hacernos las siguientes preguntas:

1. ¿Cuáles son los datos de entrada del problema? 
    - Datos.
	- Formato de estos datos.
	- Métodos de entrada como: 
		- teclado.
		- disco.
		- red…
	- etc.
2. ¿Cuáles son los resultados o salidas que conforman la solución al problema?
	- Tipo de datos de salida.
	- Unidades de medida.
	- Formato de las salidas.
	- Reportes.
	- Medio de salida:
		- Pantalla.
		- Impresora.
		- Archivo en disco.
		- Audio.
		- Vídeo.
	- etc.
3. ¿Cuáles son los pasos a seguir para resolver el problema?
	- Pasos algorítmicos.
	- Fórmulas matemáticas.
	- Casos borde.
	- Validación de datos de entrada.
	- Transformaciones de datos.
	- Resultados intermedios. ¿Es útil almacenar resultados intermedios?
4. Requisitos adicionales o no funcionales:
	- Reglas de negocio.
	- Consideraciones de performance.
	- Consideraciones legales en cuanto a formatos o almacenamiento.

## Ejercicios simples para diagrama de flujo

Algoritmos simples, clasificados en 3 tipos:
- Flujo simple de instrucciones sin bifurcación.
- Algoritmos con una o varias bifurcaciones simples.
- Algoritmos con una o varias bifurcaciones compuestas o anidadas.

## Problemas de algoritmos con Flujo simple de instrucciones

1. **Suma de dos números**: 
	Escriba un algoritmo que pida al usuario dos 
	números enteros y muestre su suma.

2. **Generación de un número al cuadrado**: 
	Escriba un algoritmo que solicite	un número entero y muestre su
	cuadrado.
   
3. **Cálculo del área de un triángulo**: 
	Desarrolle un algoritmo que reciba la base y la altura de un triángulo y calcule su área usando la fórmula:..

	$$Area = \frac{base * altura}{2}$$
	
4. **Contador de caracteres**: 
	Escriba un algoritmo que pida una cadena de texto y cuente cuántos caracteres tiene (sin contar espacios o tabuladores).

5. **Conversión de grados Celsius a Fahrenheit**: 
	Cree un algoritmo que 	solicite una temperatura en grados Celsius y 
	la convierta a Fahrenheit utilizando la fórmula:  

	$$Fahrenheit = \(Celsius * \frac{9}{5} \) + 32$$

6. **Cálculo de la distancia recorrida**: 
	Diseñe un algoritmo que reciba la velocidad de un automóvil en 
	`km/h` y el tiempo en horas, y calcule la distancia recorrida.
	
	$$Distancia = Velocidad * Tiempo$$

7. **Cálculo del promedio de tres notas**: 
	Diseñe un algoritmo que pida al usuario tres notas y calcule la suma, el
	producto, el promedio, y la media geométrica mostrando el resultado de
	todos estos valores. Utilice un acumulador para llevar los resultados
	parciales.  

	$$Promedio = \frac{Nota_1 + Nota_2 + Nota_3}{3}$$

	$$Media_Geométrica = \root{3}\of{Nota_1 \cdot Nota2 \cdot Nota3}$$

8. **Conversión de monedas**: 
	Desarrolle un algoritmo que reciba una cantidad en  USD y la convierta a
	MXN, usando un tipo de cambio fijo también recibido como entrada.

9. **Juego de lanzamiento de dados**: 
	Diseñe un algoritmo que simule el lanzamiento de dos dados y muestre la
	suma de los resultados.

10. **Conversión de minutos a horas y minutos**: 
	Diseñe un algoritmo que reciba un número de horas entre `0.0` y `99.99`
	con hasta dos decimales y lo convierta al formato

	`HORAS:MINUTOS:SEGUNDOS`.

11. **Dígitos menos significativos**: 
	Cree un algoritmo que reciba un número entero mayor a `1000` y muestre
	los `3` dígitos menos significativos del número.

12. **Búsqueda de subdirectorios**: 
	Escriba un algoritmo que dada una ruta de directorios UNIX, escriba 
	la ruta de los `3` últimos subdirectorios. Ejemplo para el directorio `/home/user/projects/cs/compiler` debe devolver `projects/cs/compiler`.

13. **Conversión a Snake Case**: 
	Escriba un algoritmo que reciba un string que contiene varias palabras
	separadas por un espacio cada una y que devuelva el nombre de una
	variable en _snake case_ en minúsculas a partir de dichas palabras
	
	_Ejemplo_: si la entrada es `Direccion Hab Usuario` el algoritmo debe
	mostrar `direccion_hab_usuario`.


## Problemas de algoritmos con bifurcaciones simples
 
1. **Determinar si un número es par o impar**: 
	Cree un algoritmo que reciba un número entero y determine si es par o impar, mostrando un mensaje correspondiente.

2. **Calificación de un estudiante**: 
	Desarrolle un algoritmo que reciba una nota (`0`-`100`) y muestre 
	_Aprobado_ si la nota es mayor o igual a `60`, o _Reprobado_ en caso
	contrario.

3. **Clasificación de edad**: 
	Escriba un algoritmo que pida la edad de 	una persona  y clasifique
	como _Menor de edad_ (menor a `18` años) o _Mayor de edad_ (`18` años 
	o más).

4. **Conteo de personas por edad**: 
	Escriba un algoritmo que lea las edades de `4` personas y muestre el
	total de personas que son menores de edad. Usar el problema  
	anterior como subrutina. Use un acumulador para llevar el 
	resultado parcial.

5. **Juego de la suerte**: 
	Diseñe un algoritmo donde el usuario ingresa un número del `1` al `10`.
	Si 	el número es par, muestre _¡Tienes suerte!_. Si es impar, muestre
	 _¡Inténtalo de nuevo!_.

6. **Juego de rol**: 
	Cree un algoritmo en el que el usuario debe elegir entre tres personajes
	(_guerrero_, _mago_, _arquero_). Según la elección, presente diferentes 
	habilidades y debilidades.

7. **Simulador de compras**: 
	Escriba un algoritmo que pida el total de una compra y determine si el
	usuario tiene suficiente dinero (definido por  un monto fijo). Si no,
	muestra un mensaje con la cantidad que le falta formateado a `2`
	decimales.
 
8. **Número a día de la semana**: 
	Se solicita un valor al usuario entre `1` y `7`, haga un algoritmo que
	imprima el día de la semana con la correspondencia `1 - Lunes`, 
	`2 - Martes`, ... , `7 - Domingo`, o un mensaje de error si se ingresa 
	un valor no válido.


9. **Cálculo de salario neto** 
	Calcular el pago total de salario de un obrero en una semana. La jornada
	legal es de `40` horas semanales y horas extras se pagan al `50%`
	adicional a la hora legal.
	
	- Se pide el costo de la hora.
	- Se pide el total de horas trabajadas en la semana.
	- El algoritmo debe imprimir (todo a dos decimales) 
		- horas extras trabajadas.
		- salario base horas legales.
		- total a pagar por horas extras.
		
10. **Cálculo descuentos sobre el salario bruto**: 
	Calcular los descuentos de un empleado en la nación de Narnia. De acuerdo a las leyes narnianas se tiene que:
	
	- Si el empleado gana menos de `3` salarios mínimos se descuenta `3%` de
	salud y `2%` de fondo de pensiones.
	- Si gana más de `3` salarios mínimos se descuenta `5%` de salud y `3.5%`
	de pensiones.
	- Retención de fuente de impuesto sobre la renta:
		- Si gana menos de `4` salarios mínimos no tiene retención 
		en fuente.
		- Si gana más de cuatro salarios mínimos se le hace un `7%` de
		retención en fuente.
	- Algunos empleados pueden solicitar un descuento voluntario para 
	la caja de ahorros de la empresa el cual puede oscilar entre `1%` y un `10%` (los valores porcentuales pueden tener máximo una cifra decimal.
		
	Escriba un algoritmo que reciba como entrada el monto del salario 
	mínimo vigente en Narnia, el salario del empleado expresado cantidad de
	salarios mínimos (puede ser con una cifra decimal) y si el empleado 
	tiene descuento por caja de ahorros, solicite el porcentaje de dicho
	descuento.	
	
	Debe mostrar (todos los montos formateados `2` decimales):
	- Salario en bruto.
	- Total de descuento por salud.
	- Total de descuento por fondo de pensiones.
	- Total de descuento por retención en fuente.
	- Total de descuento por caja de ahorros si lo tiene.
	- Salario neto o líquido del mes.

11. **Menú de opciones para usuario**: 
	Cree un algoritmo que implemente un menú de selección simple del `1` al 
	`5` que:
	
	- Imprima cada opción con un texto descriptivo.
	- Solicite que se ingrese un número entre `1` y `5`.
	- Si el número ingresado es válido mostrar la elección, en caso 
	contrario mostrar un mensaje de error.

## Problemas de algoritmos con bifurcaciones compuestas

1. **Clasificación de notas**: 
	Diseñe un algoritmo que reciba una nota (`0`-`100`) y clasifique al 
	estudiante en:
	- _Excelente_ (`90`-`100`) 
	- _Bueno_ (`75`-`89`) 
	- _Suficiente_ (`60`-`74`)
	- _Insuficiente_ (menor a `60`).
	
2. **Clasificación de un triángulo**: 
	Cree un algoritmo que reciba las longitudes de tres lados de un 
	triángulo y muestre cuál es el tipo de triángulo según las longitudes 
	de los lados. Las posibles respuestas son:
	- _Equilátero_ (Todos los lados con la misma longitud) 
	- _Isósceles_  (Dos lados con la misma longitud)
	- _Escaleno_ (Todos los lados con distintas longitudes)
	
3. **Clasificación de películas**: 
	Cree un algoritmo que reciba una calificación (de `1` a `5`) y muestre 
	un mensaje según la calificación: 
	- _Mala_.
	- _Regular_.
	- _Buena_. 
	- _Muy buena_. 
	- _Excelente_.

4. **Clasificación de películas**: 
	Cree un algoritmo que implemente la conversión de calificaciones de la
 	escala del `1` al `100` a la escala americana en letras. El algoritmo 
	debe recibir como entrada una calificación numérica en el rango de `1`
	a `100`. 
	
	Debe mostrar la calificación equivalente en la escala americana, así 
	como indicar si el estudiante ha aprobado o suspendido.
	
	La equivalencia entre los sistemas de calificación está en la siguiente
	tabla:
	
	| Calificación (1-100) | Escala Americana | Estado      |
	|-----------------------|------------------|-------------|
	| 90 - 100              | A+               | Aprobado    |
	| 80 - 89               | A                | Aprobado    |
	| 75 - 79               | B+               | Aprobado    |
	| 70 - 74               | B                | Aprobado    |
	| 65 - 69               | C+               | Aprobado    |
	| 60 - 64               | C                | Aprobado    |
	| 55 - 59               | D+               | Aprobado    |
	| 50 - 54               | D                | Aprobado    |
	| 0 - 49                | F                | Reprobado   |

5. **Escala de Beaufort** 
	La escala de Beaufort es una escala que clasifica la velocidad del 
	viento en diferentes categorías, desde calma hasta huracanes. Esta 
	escala se utiliza comúnmente en meteorología y náutica para describir 
	las condiciones del viento y su efecto en el mar. Los valores de esta
	escala se sumarizan en la siguiente tabla:

	| Número de Beaufort | Velicidad del viento en  Nudos | Denominación                         | Aspecto del mar                                                                   |  Efectos en tierra                                                                                                         |
	|-------------------|------------------------------|------------------------------------|------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|
	| 0                  |  < 1                           | _Calma_                              | Despejado                                                                         | Calma, el humo asciende verticalmente                                                                                      |
	| 1                  |  1 a 3                         | _Ventolina_                          | Pequeñas olas, pero sin espuma                                                    | El humo indica la dirección del viento                                                                                     |
	| 2                  |  4 a 6                         | _Flojito (Brisa muy débil)_          | Crestas de apariencia vítrea, sin romper                                          | Se caen las hojas de los árboles, empiezan a moverse los molinos de los campos                                             |
	| 3                  |  7 a 10                        | _Flojo (Brisa Ligera)_               | Pequeñas olas, crestas rompientes.                                                | Se agitan las hojas, ondulan las banderas                                                                                  |
	| 4                  |  11 a 16                       | _Bonancible (Brisa moderada)_        | Borreguillos numerosos, olas cada vez más largas                                  | Se levanta polvo y papeles, se agitan las copas de los árboles                                                             |
	| 5                  |  17 a 21                       | _Fresquito (Brisa fresca)_           | Olas medianas y alargadas, borreguillos muy abundantes                            | Pequeños movimientos de los árboles, superficie de los lagos ondulada                                                      |
	| 6                  |  22 a 27                       | _Fresco (Brisa fuerte)_              | Comienzan a formarse olas grandes, crestas rompientes, espuma                     | Se mueven las ramas de los árboles, dificultad para mantener abierto el paraguas                                           |
	| 7                  |  28 a 33                       | _Frescachón (Viento fuerte)_         | Mar gruesa, con espuma arrastrada en dirección del viento                         | Se mueven los árboles grandes, dificultad para caminar contra el viento                                                    |
	| 8                  |  34 a 40                       | _Temporal (Viento duro) _            | Grandes olas rompientes, franjas de espuma                                        | Se quiebran las copas de los árboles, circulación de personas muy difícil, los vehículos se mueven por sí mismos.          |
	| 9                  |  41 a 47                       | _Temporal fuerte (Muy duro)_         | Olas muy grandes, rompientes. Visibilidad mermada                                 | Daños en árboles, imposible caminar con normalidad. Se empiezan a dañar las construcciones. Arrastre de vehículos.         |
	| 10                 |  48 a 55                       | _Temporal duro (Temporal)_           | Olas muy gruesas con crestas empenachadas. Superficie del mar blanca.             | Árboles arrancados, daños en la estructura de las construcciones. Daños mayores en objetos a la intemperie.                |
	| 11                 |  56 a 63                       | _Temporal muy duro (Borrasca)_       | Olas excepcionalmente grandes, mar completamente blanca, visibilidad muy reducida | Destrucción en todas partes, lluvias muy intensas, inundaciones muy altas. Voladura de personas y de otros muchos objetos. |
	| 12                 |  +64                           | _Temporal huracanado''' (Huracán)_ | Olas excepcionalmente grandes, mar blanca, visibilidad nula                         | Voladura de vehículos, árboles, casas, techos y personas. Puede generar un Ciclón tropical o  tifón                        |

	Diseñe un algoritmo que realice las siguientes tareas:
	- Lectura de la velocidad del viento en km/h.
	- Convertir la velocidad a nudos. 
	- Clasificar la velocidad del viento según la escala de Beaufort.
	- Mostrar velocidad del viento en nudos y denominación.
	

6. **Escalas de Medición de Sismos: Richter y Mercalli**: 

	La escala de Richter es una herramienta de medición logarítmica que se
	utiliza para cuantificar la magnitud de un terremoto, basándose en la
	amplitud de las ondas sísmicas registradas por un sismógrafo. Esta 
	escala se determina a partir del valor máximo de la amplitud de las 
	ondas sísmicas, expresada en milímetros, y se calcula mediante la siguiente fórmula aproximada:

	$$M_L = \log_{10}(A / A_0)$$

	donde 
	
	- $`M_L`$ representa la magnitud en la escala de Richter.
	- $`A`$ es la amplitud máxima de la onda medida. 
	- $`A_0`$ es la amplitud en milímetros correspondiente al punto de referencia del sismógrafo.

	La escala de Ritcher se presenta en la sieguiente tabla:
	

	| Magnitud de Onda (A) | Denominación                          | Descripción                          |
	|-----------------------|---------------------------------------|--------------------------------------|
	| 0.0 - 1.9             | Micro sismos                          | Generalmente no son perceptibles.   |
	| 2.0 - 2.9             | Muy débil                             | Apenas perceptible.                 |
	| 3.0 - 3.9             | Débil                                 | Sentido por algunas personas en reposo. |
	| 4.0 - 4.9             | Moderado                              | Sentido por muchas personas; puede causar daños menores. |
	| 5.0 - 5.9             | Fuerte                                | Puede causar daños leves en estructuras. |
	| 6.0 - 6.9             | Muy fuerte                            | Puede ocasionar daños significativos. |
	| 7.0 - 7.9             | Grande                                | Puede generar daños severos en áreas extensas. |
	| 8.0 o más             | Extraordinario                        | Provoca daños catastróficos a gran escala. |
	
	
	Por otro lado, la escala de Mercalli evalúa la intensidad de un terremoto
	basándose en sus efectos observables en la superficie terrestre y en las
	estructuras construidas. Esta escala es de carácter subjetivo y puede
	variar en función de la ubicación geográfica y las características del
	terreno. Se presenta en la siguiente tabla:
	
	
	| Valor | Nombre         | Descripción                                               |
	|-------|----------------|----------------------------------------------------------|
	| I     | No sentido     | No se siente, salvo por algunos bajo condiciones favorables. |
	| II    | Muy débil      | Sentido solo por un número limitado de personas, especialmente en reposo. |
	| III   | Débil          | Sentido por muchas personas, pero no se asocia a daños significativos. |
	| IV    | Moderado       | Sentido por la mayoría; algunos objetos pueden caerse.  |
	| V     | Fuerte         | Causante de daños moderados; puede generar caídas de objetos. |
	| VI    | Muy fuerte     | Daños significativos en estructuras; se percibe en áreas extensas. |
	| VII   | Destructivo    | Daños graves en muchas estructuras; algunos colapsos de edificios. |
	| VIII  | Devastador     | Daños severos en áreas amplias; colapsos frecuentes de estructuras. |
	| IX    | Catastrófico   | Daños muy graves en edificaciones; ocurren fallas de terreno. |
	| X    | Extremo        | Destrucción total de edificaciones; deslizamientos de tierra frecuentes. |

	
	La tabla de equivalencia entre la escala de Ritcher y la escala de Mercalli es la siguiente:
	
	

	| Magnitud en Richter | Intensidad en Mercalli |
	|---------------------|------------------------|
	| 0.0 - 1.9           | I                      |
	| 2.0 - 3.9           | II                     |
	| 4.0 - 4.9           | IV                     |
	| 5.0 - 5.9           | VI                     |
	| 6.0 - 6.9           | VII                    |
	| 7.0 - 7.9           | VIII                   |
	| 8.0 o más           | IX                     |

	
	Desarrolle un algoritmo que reciba como entrada el coeficiente decimal 
	$`k`$ a $`3`$ cifras, tal que $`A = k \cdot A_0`$, donde $`k`$ es un
	coeficiente que indica que la amplitud de la onda es $`k`$ veces la amplitud de  referencia $`A_0`$ o el _cero_ del sismógrafo. 
	
	Utilizando la fórmula de la escala de Richter proporcionada, el 
	algoritmo deberá calcular y mostrar lo siguiente:

	- La magnitud en la escala de Richter, expresada con tres decimales.
	- La denominación correspondiente en la escala de Richter.
	- La denominación en la escala de Mercalli que se asocia a la magnitud calculada.
	
	_Ejemplo:_  Si se recibe como entrada una amplitud de onda 
	$`A = 3 \cdot A_0`$, el cálculo de la magnitud se llevaría a cabo de la siguiente manera:

	$$M_L = \log_{10}(3 \cdot A_0 / A_0) = \log_{10}(3) \approx 0.477$$

	La salida esperada debería ser:
	- Magnitud en la escala de Richter: $`0.477`$
	- Denominación en la escala de Richter: _Muy débil, apenas perceptible_.
	- Denominación en la escala de Mercalli: _II - Muy débil_.
	
 