using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab1sharp
{
    public class BoardTaxi : BoardAnyCar
    {
        const int maxPassengers = 4;
        const double maxW = 200;
        double curW = 0;
        uint TaxiPassenger = 0;
        TaxiDriver instance;
        TaxiDriver instanceCheck;
        public TaxiDriver TaxiDriver
        {
            get
            {
                throw new System.NotImplementedException();
            }
            set
            {
            }
        }
        public Passenger Passenger
        {
            get
            {
                throw new System.NotImplementedException();
            }
            set
            {

            }
        }
    
        public override void BoardPassenger(uint PassengerCount)
        {
            Random rnd = new Random();
            List<Passenger> list = new List<Passenger>();
            for (int i = 0; i < PassengerCount; i++)
            {
               
                Passenger art = new Passenger(rnd.Next(100));
                if (curW + art.we < maxW)
                {
                    list.Add(art);
                    curW += art.we;
                    Console.WriteLine(art.we);
                }
                else
                {
                    Console.WriteLine("максимальынй вес превышен");
                    return;
                }
            }
          
            if (TaxiPassenger + PassengerCount > maxPassengers)
            {
                Console.WriteLine("В такси поместились " + (maxPassengers - TaxiPassenger) + " пассажиров из " + PassengerCount);
                TaxiPassenger = maxPassengers;
            }
            else
            {
                TaxiPassenger = TaxiPassenger + PassengerCount;
                Console.WriteLine("В такси сели " + PassengerCount + " пассажиров");
            }

        }

        public override void BoardDriver()
        {
            if (instanceCheck != instance)
            {
                Console.WriteLine("В такси уже есть водитель");
            }
            else
            {
                instance = TaxiDriver.Instance();
            }
        }
        public void Go()
        {
            if (instanceCheck == instance)
            {
                Console.WriteLine("В такси нет водителя");
            }
            else
            {
                if (TaxiPassenger > 0)
                {
                    Console.WriteLine("Такси может отправляться");
                }
                else
                {
                    Console.WriteLine("В такси нет пассажиров");
                }
            }
        }
    }
}
