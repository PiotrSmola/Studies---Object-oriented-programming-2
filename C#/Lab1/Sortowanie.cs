﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public class Sortowanie
    {
        public static void RunSortowanie()
        {
            Console.Write("Podaj ilość liczb do wprowadzenia: ");
            int n = int.Parse(Console.ReadLine());
            int[] liczby = new int[n];

            for (int i = 0; i < n; i++)
            {
                Console.Write($"Wprowadź liczbę {i + 1}: ");
                liczby[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < liczby.Length - 1; i++)
            {
                for (int j = 0; j < liczby.Length - i - 1; j++)
                {
                    if (liczby[j] > liczby[j + 1])
                    {
                        int temp = liczby[j];
                        liczby[j] = liczby[j + 1];
                        liczby[j + 1] = temp;
                    }
                }
            }

            Console.WriteLine("Posortowane liczby w tablicy:");
            foreach (int liczba in liczby)
            {
                Console.WriteLine(liczba);
            }
        }
    }

}
