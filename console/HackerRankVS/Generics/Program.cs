using System;
using System.Collections.Generic;

namespace Generics
{
    public class Student
    {
        int noLista;
        String nombre;
        String apellido;

        // Constructores
        public Student()
        {

        }
        public Student(String nombre, String apellido)
        {
            this.noLista = 0;
            this.nombre = nombre;
            this.apellido = apellido;

        }

        public Student(int noLista, String nombre, String apellido)
        {
            this.noLista = noLista;
            this.nombre = nombre;
            this.apellido = apellido;

        }
        public int getNoLista()
        {
            return noLista;
        }
        public String getNombre()
        {
            return nombre;
        }
        public String getApellido()
        {
            return apellido;
        }
        public void setNoLista(int noLista)
        {
            this.noLista = noLista;
        }
        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }
        public void setApellido(String apellido)
        {
            this.apellido = apellido;
        }

    }
    class Program
    {
        static void Main(string[] args)
        {
            IList<Student> studentlista = new List<Student>();

            Student unedl = new Student(2, "Pedro", "Montoya");
            //Console.WriteLine("No lista: " + unedl.getNoLista());

            Student unedl2 = new Student();
            unedl2.setNoLista(1);
            unedl2.setNombre("Juan");
            unedl2.setApellido("Perez");
            //Console.WriteLine("No lista: " + unedl2.getNoLista());

            Student unedl3 = new Student("Juan Pablo", "Garcia");
            
            studentlista.Add(new Student(3, "David", "Nudo"));
            studentlista.Add(unedl);
            studentlista.Add(unedl2);
            studentlista.Add(unedl3);

            foreach (var elemento in studentlista)
            {
                Console.WriteLine(elemento.getNoLista());
                Console.WriteLine(elemento.getNombre());
                Console.WriteLine(elemento.getApellido());
            }




        }
    }
}
