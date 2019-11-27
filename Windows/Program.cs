/*
 1.Describa en sus propias palabras el concepto de colecciones (collections) y cuales tipos existen.
 R= Lo que comprendi que hace un coleccion es que puede ser utilisado con varios valores
 y que existen varios tipos de coleccion.

2.Defina a que se refiere el concepto de código no seguro y que se necesita para implementarlo.
R=Se refiere a la forma de la ejecucion de un programa ya sea que se ejecute 
dentro del contexto seguro o en el contexto inseguro.
se puede invocar de dos maneras ya sea utilizando "unsafe" que es un modificador 
con el metodo de propiedad o usando el mismo compilador de "unsafe" para definir un grupo de codigo.

3.Mencione al menos tres clases que se utilizan en l/o y proporcione brevemente la idea central de las mismas.
R= 1-BufferedStream == Lee y escribe bytes desde y hacia otro Streams para mejorar
el rendimiento de las operaciones de la entrada y salida.
2-CrypoStream == Metodo para relacionar los Streams y tranformarlos en criptografia
3-MemoryStream == Lee y ecribe Bytes desde y hacia la memoria.

4. Explique la diferencia entre los siguientes códigos en csharp
a. Console. Writeline ("resultado: (*ptr) ").

b. Console.WriteLine("resultado: ((int)ptr)")

5.Mencione al menos tres caracteristicas de las excepciones (Exceptions).
R= la primera es que puedes utilisar metodos que encuentran esas exepciones en tu programa.
la segunda es que al utilizar esos metodos com o por ejempro el "try y Catch" todo lo que entre mal en el try el catch atrapara todas esas excepsiones.
la tercera es que con los metodos "finally y throw" se utilizan para al momento de la ejecucion del programa si logra haber alguna excepcion o no 
el throw se encargara de m andar esas excepciones.

6.En Java, mencione y describa los tres tipos de excepciones.

7. Explique brevemente a que se refiere con directivas para preprocesador y que se necesita para usarlas.
R= Es el que le da las instrucciones al compilador para poder procesar la informacion antes de compilar el programa
se inicia con un "#" y no terminan con ";"

8. Explique las diferencias entre ArrayList, Sorted List Hash Table.
R= ArrayList = se accede usando un indice. 
   Hashtable = se accende usando una clave.

9. Describa las para que sirven StreamReader y StreamWriter
R= son clases que sirven de apoyo que permiten la lectura y escritura 
convirtiendo los bytes en caracteres y viceversa.

10. Explique el funcionamiento del algoritmo Quick Sort
R= Inicia partiendo de un pivote particionando la lista de elementos en dos 
Los pivotes mayores van a la derecha y los mas pequeños a la izquierda.

11. En Java, explique cuál es la diferencia entre System.out, System.in y System.err
R=  System.out significa fuera del sistema
    System.in Significa dentro del sisterma
    System.err Significa error del sistema 
    cada uno cuenta con una accion  diferente

12. Explique cuáles son las ventajas de utilizar "generic collections"
R= su ventaja es que puede almacenar cualquier tipo de elemento 
el unico incoveniente es que deves de utilisar "casting"

13 Desarrolle en C#, un programa en Windows Forms llamado TPV2doParcial que permita crear un
archivo, lo lea y permita escribir en el. El programa debe permitir la captura de una lista de palabras
y al finalizar la captura, debe reportar la cantidad total de palabras, las palabras repetidas y la
cantidad de ocurrencias. Capture las excepciones necesarias. Al terminar, suba su codigo a su
repositorio y escriba el SHA correspondiente en el examen
 */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TPVIIIExamen2parcial
{
    static class Program
    {
        /// <summary>
        /// Punto de entrada principal para la aplicación.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());
        }
    }
}
