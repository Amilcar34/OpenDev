# OpenDev Challenges

## Armado de ambiente

- JDK 11
- Maven 3.6.3 o superior

## Doc

 - Esta disponible en ```/doc/index.html``` lo que se espera de cada método y se tomó como [criterio de aceptacion](https://www.cybermedian.com/es/definition-of-done-vs-acceptance-criteria-in-scrum/) para el desarrollo de las [pruebas de validación](https://es.wikipedia.org/wiki/Pruebas_de_validaci%C3%B3n)
 - En este proyecto se puede evaluar el [coverage](https://es.wikipedia.org/wiki/Cobertura_de_c%C3%B3digo) de los test ejecutando en la raiz del proyecto ```mvn verify``` y entrando a ```/target/site/jacoco/index.html```

## Criterios generales

- Para resolver los ejercicios en general alcanza con implementar un método. De todas maneras, está permitido agregar
  métodos, clases, interfaces o lo que consideres necesario.
- Para verificar la implementación se pueden ejecutar los test correspondientes a cada ejercicio. Los tests se
  encuentran en el package correspondiente al ejercicio dentro de ```src/test/```
- Se espera ver implementaciones de hasta JAVA 11 inclusive.

## <a href="https://www.mytra.es/blog-post/test-de-mutacion-la-calidad-es-prioritaria">¿Qué es Mutation Testing?</a>
En este ar
Mutation testing es una tecnica de prueba usado en este proyecto para la robustez del código. 
- Si los test unitarios fallan entonces el mutante fue asesinado.
-	Si al comprobar el código no se genera un error, significa que el mutante sobrevivió.

### Cómo usar PITest 
<<<<<<< HEAD
PITest es un framework que se utiliza en el proyecto para la mutación de test.
- Desde una terminal o en la terminal de eclipse, ejecute:
<b>mvn test-compile org.pitest:pitest-maven:mutationCoverage<b>
- Se puede consultar los informes en formato HTML en el directorio <b>target/pit-test/YYYYMMDDHHMI<b>
=======
- Aplicar sus dependencias y plugins en el ```pom.xml```
<dependency>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-parent</artifactId>
    <version>1.1.10</version>
    <type>pom</type>
</dependency>

<plugin>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-maven</artifactId>
    <version>1.1.10</version>
    <configuration>
        <targetClasses>
            <param>com.baeldung.testing.mutation.*</param>
        </targetClasses>
        <targetTests>
            <param>com.baeldung.mutation.test.*</param>
	</targetTests>
     </configuration>
</plugin>

- Desde una terminal, ejecute:
<b>mvn test-compile org.pitest:pitest-maven:mutationCoverage</b>
- Se puede consultar los informes en formato HTML en el directorio <b>target/pit-test/YYYYMMDDHHMI</b>
>>>>>>> fac9a833a6fcd12ca52118fcb5fe4434303e50d7


## Ejercicio 1: Sorting

Para realizar este ejercicio se debe modificar el archivo Sorting.java.

a. Implementar el método `ordenarPorPuntuacionYNombre`, para ordenar los jugadores en una lista. Se debe ordenar primero
por puntuación de manera descendente, luego por nombre de manera ascendente.  
b. Implementar el método `ordenarPorPuntuacionPerdidasYNombre`, similar al del punto a) pero que tenga en cuenta las
pérdidas de un jugador. Cuando 2 jugadores tienen igual cantidad de puntos, el que tiene menos perdidas se lo
considerara el mayor. Luego a igual puntos y perdidas se seguirá usando el nombre de manera ascendente.

## Ejercicio 2: Caracteres repetidos

Para realizar este ejercicio se debe modificar el archivo RepeatedCharacters.java.

El metodo debe retornar un booleano indicando si el parametro `cadena` cumple con alguna de las siguientes propiedades:

1- Todos los caracteres aparecen la misma cantidad de veces.<br>

    Ejemplos: "aabbcc", "abcdef", "aaaaaa"

2- Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece un vez mas o una vez menos.

    Ejemplos: "aabbccc", "aabbc", "aaaaccccc"

## Ejercicio 3: Alphabet Soup

Para realizar este ejercicio se debe modificar el archivo WordSearcher.java.

### Objetivo

El objetivo de este ejercicio es implementar una función que determine si una palabra está en una sopa de letras.

### Reglas

- Las palabras pueden estar dispuestas direcciones horizontal o vertical, _no_ en diagonal.
- Las palabras pueden estar orientadas en cualquier sentido, esto es, de derecha a izquierda o viceversa, y de arriba
  para abajo o viceversa.
- El cambio de dirección puede estar a media palabra, de modo que, por ejemplo, parte de la palabra esté horizontal y de
  izquierda a derecha, parte esté vertical y de arriba hacia abajo, y otra parte horizontal de derecha a la izquierda.

A continuación se muestran un par de ejemplos:

**Horizontal**

X X X X X X X  
P A L A B R A  
X X X X X X X   
X X X X X X X   
X X X X X X X

**Vertical**

A X X X X X X  
R X X X X X X   
B X X X X X X  
A X X X X X X   
L X X X X X X  
A X X X X X X  
P X X X X X X

**Horizontal y Vertical**

X X P X X X X X    
X X A X X X X X    
X X L X X X X X   
X X A B R A X X    
X X X X X X X X

X X X X X X X X  
X A R B X X X X  
X X X A X X X X   
X X X L A P X X  
X X X X X X X X   
