# UD6 - Pràctica 2 - Documentem el codi amb JavaDoc

* [1. Modifica la classe `Calculadora.java`](#1-modifica-la-classe-calculadorajava)
* [2. **Documenta** el codi de la classe `Calculadora` usant comentaris `JavaDoc`:](#2-documenta-el-codi-de-la-classe-calculadora-usant-comentaris-javadoc)
* [3. **Genera** des d'**eclipse** la documentació **JavaDoc** del projecte.](#3-genera-des-declipse-la-documentació-javadoc-del-projecte)
* [4. Fes una captura del **codi font** documentat resultant de la classe `Calculadora`](#4-fes-una-captura-del-codi-font-documentat-resultant-de-la-classe-calculadora)
* [5. Mostra el **resultat** de la documentació:](#5-mostra-el-resultat-de-la-documentació)
* [6. Afegeix 3 **nous mètodes** a la classe calculadora](#6-afegeix-3-nous-mètodes-a-la-classe-calculadora)

Realitza un *fork* del projecte que es troba a: <https://github.com/arturocandela/2122ed-u6p2>. Una vegada realitzat, crea una nova branca que s'anomene **teunomcognom**  i comprova que pots executar-lo a **eclipse**. Una vegada ho tingues, realitza les tasques següents.

> Cada tasca ha d'estar com a mínim en un commit diferent i la branca **teunomcognom** ha de pujar-se al teu repositori nou creat.
> La entrega es farà adjuntant l'enllaç al repostori a l'activitat i adjuntant el pdf amb les captures demandes / text a l'activitat.

Realitza totes les captures necessàries per a indicar que has realitzat la tasca

## 1. Modifica la classe `Calculadora.java`

* Reanomena el paquet `ed.arturo` a `ed.<elteunom>`

Refactorizamos el paquete:

![Renombramos el paquete](/resources/images/2-1a.png)

Resultado tras refactorizar el paquete:

![Resultado de la refactorizacion](/resources/images/2-1b.png)

## 2. **Documenta** el codi de la classe `Calculadora` usant comentaris `JavaDoc`:

* Per a la **classe**:
  * Ha de tenir: una descripció curta que explique **clarament** per a què serveix esta classe. Afegeix en un altre paràgraf una descripció *més llarga*.
  * Afegeix els **tags** *JavaDoc* necessaris per a documentar:
    * L'**autor** ( posa el teu nom complet )
    * La **versió** actual de la classe ( 2.5 )
    * Que está **disponible des de** la versió 1.9, juny de 2019.
* Per a cadascun dels **mètodes** documenta:
  * **Descripció** explicant que fa el mètode.
  * **Paràmetres/s** amb la descripció més indicada.
  * Valor que **retorna** amb una descripció més indicada.
  * Si el métode llança una **exepció** ( error en execució), posa el tipus d'*exepció* i la descripció de la mateixa ( per exemple, el cas de la divisió per zero)

## 3. **Genera** des d'**eclipse** la documentació **JavaDoc** del projecte.

* Arregla els possibles **errors/warnings** que isquen. Fixa't en la descripció de l'error i torna a generar la documentació fins que vaja bé.
* Fes una captura de la **Consola**: ha de veure's tot el procés de generació complet.
 ![Proceso generacion documento javadoc](/resources/images/2-3c.png)
* Fes una captura en la vista **Package Explorer** del directori **doc** resultant
![Directorio doc resultante](/resources/images/2-3d.png)

> Revisa si la documentació s'ha afegit correctament a git, en cas contrari, revisa el fixter .gitignore. 

## 4. Fes una captura del **codi font** documentat resultant de la classe `Calculadora`

( En aquest cas, es possible que no siga necessari un commit)

Clase Calculadora:
![Documentacion escrita como comentario para Clase Calculadora](/resources/images/2-2a.png)

  Método suma:
  ![Documentacion escrita como comentario para el metodo suma](/resources/images/2-2b.png)

  Método resta:
  ![Documentacion escrita como comentario para el metodo resta](/resources/images/2-2c.png)

  Método multiplicacion:
  ![Documentacion escrita como comentario para el metodo multiplicacion](/resources/images/2-2d.png)

  Método division:
  ![Documentacion escrita como comentario para el metodo division](/resources/images/2-2e.png)

## 5. Mostra el **resultat** de la documentació: 

* Mostra el fitxer ***index.html*** en el **Navegador** integrat a **Eclipse** i mostra captures de **TOT** el seu contingut. Fixa't en la correspondència entre les descripcions i tags de les pàgines web ( *html*) generades.

### Documentación javadoc:

Indice
![Indice javadoc](/resources/images/2-4_Index.png)

Descripción de la clase Calculadora
![Calculadora descripcion](/resources/images/2-4_CalculadoraResumen.png)


Resumen del constructor
![Calculadora contructor](/resources/images/2-4_CalculadoraConstructor.png)

Resumen de los métodos propios
![Calculadora metodos](/resources/images/2-4_CalculadoraMetodos.png)

Resumen de los métodos heredados
![Calculadora metodos heredados](/resources/images/2-4_CalculadoraMetodosHeredados.png)

Descripción del constructor
![Calculadora contructor descripcion](/resources/images/2-4_CalculadoraConstructorDetalles.png)


#### Descripción de los métodos propios

Suma
![Calculadora metodo suma](/resources/images/2-4_CalculadoraMetodoSuma.png)

Resta
![Calculadora metodo resta](/resources/images/2-4_CalculadoraMetodoResta.png)

Multiplicación
![Calculadora metodo multiplicacion](/resources/images/2-4_CalculadoraMetodoMultiplicacion.png)

División
![Calculadora metodo divison](/resources/images/2-4_CalculadoraMetodoDivision.png)


Arbol de clases
![Arbol de clases](/resources/images/2-4_ArbolClases.png)

## 6. Afegeix 3 **nous mètodes** a la classe calculadora

```java

public int oper1 ( int a , int n ){

    int t = 1;

    for ( int i = 0; i < n ; i++ ){
        t = t * a;
    }

    return t; 

}

public boolean oper2 ( int a ){

    boolean r;

    if ( a % 2 == 0) {
        r = true;
    } else {
        r = false;
    }

    return r;

}

public String oper3(int a){

    String r = "";
    int v = a;
    int v1;

    while ( v > 0) {

        v1 = v % 2;

        r = v1 + r;

        v = v / 2;


    }

}

```

* **Investiga** quin càlcul realitza cadascun ( ajuda't del debugger).
* **Canvia** el nom dels mètodes i les seues variables per un nom més representatiu d'acord amb el seu funcionament (**Usa Refactoring -> Rename**)
* **Documenta** els nous mètodes adecuadament amb comentaris *JavaDoc*.
* **Genera** la documentació en *JavaDoc*
![GeneracionJavadoc](/resources/images/2-6_GeneradoJavadoc.png)
* Mostra **captures** de:
  * **codi documentat** ( fomateja el codi si hi cal)

  ```java
	/**
	 * Realiza la operación matemática de elevar base a exponente.
	 * @param base de la operación base ^ exponente
	 * @param exponente de la operación base ^ exponente
	 * @return el resultado de la operación base ^ exponente
	 */
	public int elevar ( int base , int exponente ){

	    int resultado = 1;

	    for ( int i = 0; i < exponente ; i++ ){
	        resultado = resultado * base;
	    }

	    return resultado; 

	}

	/**
	 * Devuelve como resultado un booleano indicando si el numero introducido es par
	 * @param numero que se quiere saber si es par
	 * @return true si numero es par, false si numero es impar
	 */
	public boolean esPar ( int numero ){

	    boolean esPar;

	    if ( numero % 2 == 0) {
	        esPar = true;
	    } else {
	        esPar = false;
	    }

	    return esPar;

	}

	/**
	 * Pasa a binario un numero en base decimal pasado como argumento
	 * @param numero en base decimal
	 * @return Cadena con el número pasado como argumento convertido en binario
	 */
	public String pasarABinario(int numero){

	    String resultadoCadena = "";
	    int divisor = numero;
	    int restoDivision;

	    while ( divisor > 0) {

	        restoDivision = divisor % 2;

	        resultadoCadena = restoDivision + resultadoCadena;

	        divisor = divisor / 2;


	    }
	    return resultadoCadena;

	}
  ```
  * directori doc i

  ![Directorio Javadoc](/resources/images/2-6_DirectorioJavadoc.png)

  * la documentació resultant en el navegador
  
  Resumen de los métodos
  ![Resumen metodos](/resources/images/2-6-ResumenMetodos.png)
  
  Descripción detallada de los métodos
  ![Descripcion elevar](/resources/images/2-6-1.png)
  ![Descripcion esPar](/resources/images/2-6-2.png)
  ![Descripcion pasarABinario](/resources/images/2-6-3.png)

> Per a fer els commits a git, pot ser una bona estratègia realitzar-los per parts, es a dir, primer el codi, després el codi formatejat, després el codi documentat, etc.
