/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaessential;

/**
 *
 * @author USER
 */
public class JavaEssential {
/*main metodo principal*/
    public static void main(String[] args) {
        /*1. Sintaxis de Java*/
        System.out.println("1. Sintaxis de Java");
        System.out.println("Sintaxis de Java");
        System.out.println("==================================");
        
        /*2. Salida de Datos*/
        System.out.println("2. Salida de Datos");
        System.out.println(5+5);
       // System.out.print(5+5);
        System.out.println("==================================");
       
        //3. Comentarios
        //Comentarios de una sola linea
        /*Comebtarios de 
        varias lineas*/
        
        /*4. Tipos de Datos y variables
        String: Almacena texto como "HOLA"
        int: Almacena números enteros, sin decimal (20)
        float: Almacena números de coma flotante (19.99)
        char: Almacena caracteres individuales como 'a','b',etc;
        boolean: Almacena valores con dos estados : verdadero o falso (True, False)
        */
        System.out.println("4. Tipos de Datos y variables");
        String miNombre = "Vinicio";
        System.out.println(miNombre);
        System.out.println("==================================");
        
        int miNumero = 777;
        System.out.println(miNumero);
        System.out.println("==================================");
        
        float miNumeroFloat = 77.7f;
        System.out.println(miNumeroFloat);
        System.out.println("==================================");
        
        char miCaracter = 'V';
        System.out.println(miCaracter);
        System.out.println("==================================");
        
        boolean miBooleanoVerdadero = true;
        boolean miBooleanoFalso = false;
        System.out.println(miBooleanoVerdadero);
        System.out.println(miBooleanoFalso);
        System.out.println("==================================");
        
        final int miNumeroFinal = 555;
        //miNumeroFinal2=444;
        System.out.println(miNumeroFinal);
        System.out.println("==================================");
        
        // Se puede asignar el valor de la variable luego de la creacion.
        String nombre4;
        nombre4="Vinicio Zurita";
        
        //4.1 impresión de variables
        //Combinar un txto con variable
        
        String miNombre41="Vinicio";
        System.out.println("Hola: "+miNombre41);
        
        String miNombre42="Vinicio";
        String miApellido42="Zurita";
        System.out.println("Hola: "+miNombre42+" "+miApellido42);
        
        //Combinar un texto con dos variables
        String miNombre43="César Vinicio";
        String miApellido43="Zurita Toro";
        String miNombreCompleto=miNombre43+" "+miApellido43;
        System.out.println(miNombreCompleto);
        
        //Realizar una operacion matematica al momento de mostrar
        int miNumero1=8;
        int miNumero2=14;
        System.out.println(miNumero1+miNumero2);
        
        //Asignar las variables en una sola linea
        int miNumero3=10,miNumero4=14;
        System.out.println(miNumero3+miNumero4);
        
        //Asignar el mismo valor a varias variables
        int numeroMismoX,numeroMismoY,numeroMismoZ;
        numeroMismoX=numeroMismoY=numeroMismoZ=50;
        System.out.println(numeroMismoX+numeroMismoY+numeroMismoZ);
        
        //4.3 Identificadores
        //Las variables deben identificarse con nombres correctos
        /* Forma no recomendada
        String x="Vinicio"
        */
        // Forma recomendada, utiliza nombres de variables que describan su contenido
        String nombreAlumno="Vinicio";
        System.out.println(nombreAlumno);
        
        //Tipos de datos numéricos
        //Almacena numeros entre -128 a 127
        byte miByte=100;
        System.out.println(miByte);     
        
        //Almacena numeros entre -32768 a 32767
        short miShort=1500;
        System.out.println(miShort);  
        
        //Almacena numeros enteros
        int miEntero=-25;
        System.out.println(miEntero);
        
        //Almacena numeros decimales fraccionario desde 3.4e-038 hasta 3.4e-038
        float miFlotante=15.8f;
        System.out.println(miFlotante);
        
        //Almacena numeros decimales fraccionario desde -1.7e-308 hasta 1.7e308
        double miDouble=15.74d;
        System.out.println(miDouble);
        
        //valores cientificos
        float miFlotanteCientifico=12e2f;
        double miDoubleCientifico=7e4d;
        System.out.println(miFlotanteCientifico);
        System.out.println(miDoubleCientifico);
        
        //Tipos de Datos Booleanos
        boolean meGustaJava=true;
        boolean estoyCansado=false;
        System.out.println(meGustaJava);
        System.out.println(estoyCansado);
        
        //Operadores
        int operador1=10;
        int operador2=2;
        
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int modulo;
        int incremento;
        int decremento;
        
        suma=operador1+operador2;
        resta=operador1-operador2;
        multiplicacion=operador1*operador2;
        division=operador1/operador2;
        modulo=operador1%operador2;
        incremento=operador1+1;
        decremento=operador1-1;
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);
        System.out.println(incremento);
        System.out.println(decremento);
        
        //Principales métodos de cadenas de texto
        //mayuscula
        String mayuscula="mayuscula";
        System.out.println(mayuscula.toUpperCase());
        
        //minuscula
        String minuscula="minuscula";
        System.out.println(minuscula.toLowerCase());
        
        //Encontrar un caracter o varios en una cadena de texto
        String cadenaCompleto="Buscame si quieres tu";
        System.out.println(cadenaCompleto.indexOf("quieres"));
        
        //Concatenacion con metodo
        String NombreConcat="Vinicio";
        String espacio=" "; 
        String apellidoConcat="Zurita";
        System.out.println(NombreConcat.concat(espacio).concat(apellidoConcat));
        System.out.println(NombreConcat+espacio+apellidoConcat);
        
        //Caracteres especiales
        
        //Mostrar comillas dobles
        String cadenaComilas="Aqui mostraemos las  \"comillas dobles\" sin problemas";
        System.out.println(cadenaComilas);
        
        //Mostrar comillas simples
        String cadenaSimples="Aqui mostraemos las  \'comillas simples\' sin problemas";
        System.out.println(cadenaSimples);
        
        //Secuencias extras
        //Salto de linea
        String cadenaExtra1="Hola";
        String cadenaExtra2="java";
        System.out.println(cadenaExtra1+"\n"+cadenaExtra2);
        
        //Regreso al inicio
        String cadenaExtra3="Hola\rJava";
        System.out.println(cadenaExtra3);
        
        //Espaciado Tab
        String cadenaExtra4="Hola\tJava";
        System.out.println(cadenaExtra4);
        
        //Instruccion regreso de un espacio
        String cadenaExtra5="HolaJava\b";
        System.out.println(cadenaExtra5);
        
        //Instruccion siguiente espacio
        String cadenaExtra6="Hola\fJava";
        System.out.println(cadenaExtra6);
        
        //Principales funciones matematicas
        //Valor máximo
        System.out.println(Math.max(5, 10));
       
        //Valor mínimo
        System.out.println(Math.min(5, 10));
        
        //Valor raiz cuadrada
         System.out.println(Math.sqrt(36));
         
        //Valor absoluto
        System.out.println(Math.abs(-25.6));
        
        //Números aleatorios
        System.out.println(Math.random());
        
        //Números aleatorios entre intervalos
        int numeroAleatorio=(int)(Math.random()*1001);
        System.out.println(numeroAleatorio);
        
        //Expresiones Booleanas
        //Verdadero
        
        int valorComparacion1=20,valorComparacion2=19;
        System.out.println(valorComparacion1>valorComparacion2);
        System.out.println(valorComparacion1<valorComparacion2);
        System.out.println(valorComparacion1==valorComparacion2);
    }
}
