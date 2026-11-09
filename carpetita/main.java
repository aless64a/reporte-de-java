//Reporte en codigo : Java Home hasta Java Strings
//Joan Enríquez

public class main {
    public static void main(String[] args) {
       //1. Salida de Datos
             System.out.println("Hola Mundo");
             System.out.println("Mi nombre es Joan Enriquez");

      //2. Comentarios
      /* Los comentarios en un código son notas de texto que el programador escribe para explicar el funcionamiento del programa, 
      pero que el ordenador ignora por completo cuando lo ejecuta.
       */

      //3. Variables
      //Una variable es un espacio de memoria con nombre por ejemplo : tipo nombre = valor;
      String nombre = "Joan";
      int edad = 19;
      double altura = 1.73;
      char letra = 'A';
      Boolean aprobado = true;
      final int ano = 2026;

      //4. Tipos de datos
      /*Son los tipos primitivos para numeros. La diferencia es el tamaño y el rango:
      byte = enteros pequeños
      int = entero mas usado
      long = enteros grandes
      float = decimal
      double = decimales grandes
      */
        byte tipoByte = 100;
        short tipoShort = 5000;
        int tipoInt = 100000;
        long tipoLong = 15000000000L;
        float tipoFloat = 5.75f;

     // 5. Casting (Conversion de tipos)
     /* Automático (widening): de tipo pequeño a grande, sin perder datos.
        double decimal = entero; → 9 pasa a 9.0
        Manual (narrowing): de tipo grande a pequeño. Se escribe el tipo entre paréntesis y se pierde el decimal.
        int cortado = (int) numero; → 9.78 pasa a 9
     */
        int entero = 9;
        double decimal = entero;          // automatico: 9.0
        double numero = 9.78;
        int cortado = (int) numero;       // manual: 9
        System.out.println("int a double: " + decimal);
        System.out.println("double a int: " + cortado);

    // 6. Operadores con a = 10 y b = 3
     int a = 10;
        int b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
    //7. Strings
      String texto = "Hola Mundo";
        System.out.println("Texto: " + texto);
        System.out.println("Longitud: " + texto.length());
        System.out.println("Mayusculas: " + texto.toUpperCase());
        System.out.println("Minusculas: " + texto.toLowerCase());
        System.out.println("Posicion de Mundo: " + texto.indexOf("Mundo"));
        System.out.println("Union: " + "Hola " + nombre);









       
         
       


    }


}
       
    
