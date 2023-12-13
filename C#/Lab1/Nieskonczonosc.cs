using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public class Nieskonczonosc
    {
        public static void RunNieskonczonosc()
        {
            while (true)
            {
                Console.WriteLine("Wprowadź liczbę całkowitą. W przypadku podania liczby ujemniej program kończy swe działanie");
                int liczba = int.Parse(Console.ReadLine());

                if (liczba < 0)
                {
                    break;
                }

                Console.WriteLine("Wprowadzona liczba to: " + liczba);
            }
            Console.WriteLine("Wprowadzono liczbę ujemną, koniec programu");
        }
    }

}
