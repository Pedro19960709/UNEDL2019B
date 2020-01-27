using System;

namespace _3ParcialExamen
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] Array= { 6, 4, 1 };
            int aux=0;
            int n=0;
            for(int j=0; j <= Array.Length - 2; j++)
            {
                for(int i=0; i <= Array.Length - 2; i++)
                {
                    if (Array[i] > Array[i + 1])
                    {
                        n++;
                        aux = Array[i + 1];
                        Array[i + 1] = Array[i];
                        Array[i] = aux;
                    }
                }
            }
            Console.WriteLine("permutas " + n);
            Console.WriteLine("primer elemento " + Array[0]);
            Console.WriteLine("primer elemento " + Array[2]);

        }
    }
}
