using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{

    public class Wypisywanie
    {
        public static void RunWypisywanie()
        {
            double[] liczby = new double[10];
            Console.WriteLine("Wprowadź 10 liczb rzeczywistych:");


            for (int i = 0; i < liczby.Length; i++)
            {
                Console.Write($"Liczba {i + 1}: ");
                liczby[i] = Convert.ToDouble(Console.ReadLine());
            }

            Console.WriteLine("\nWyświetlanie tablicy od pierwszej do ostatniej liczby:");
            for (int i = 0; i < liczby.Length; i++)
            {
                Console.WriteLine(liczby[i]);
            }

            Console.WriteLine("\nWyświetlanie tablicy od ostatniej do pierwszej liczby");
            for (int i = liczby.Length - 1; i >= 0; i--)
            {
                Console.WriteLine(liczby[i]);
            }

            Console.WriteLine("\nWyświetlanie elementów tablicy o nieparzystych indeksach:");
            for (int i = 1; i < liczby.Length; i += 2)
            {
                Console.WriteLine(liczby[i]);
            }

            Console.WriteLine("\nWyświetlanie elementów tablicy o parzystych indeksach:");
            for (int i = 0; i < liczby.Length; i += 2)
            {
                Console.WriteLine(liczby[i]);
            }
        }
    }

}
