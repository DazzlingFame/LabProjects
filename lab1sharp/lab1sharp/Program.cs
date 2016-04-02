using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab1sharp
{
    class Program
    {
        static void Main(string[] args)
        {
            BoardTaxi Taxi = new BoardTaxi();
            BoardBus Bus = new BoardBus();
            //Taxi.BoardPassenger(1);
            Taxi.BoardPassenger(4);
            Taxi.BoardDriver();
            Bus.BoardPassenger(10);
            Bus.BoardPassenger(50);
            Bus.BoardDriver();
            Bus.Go();
            Taxi.Go();
        }
    }
}
