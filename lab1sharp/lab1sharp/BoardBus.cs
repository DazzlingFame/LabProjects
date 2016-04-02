using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab1sharp
{
    public class BoardBus : BoardAnyCar
    {
        const int maxPassengers = 30;
        const int maxW = 3000;
        uint BusPassenger = 0;
        BusDriver instance;
        BusDriver instanceCheck;
        public BusDriver BusDriver
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

        public override void BoardDriver()
        {
            if (instanceCheck != instance)
            {
                Console.WriteLine("В автобусе уже есть водитель");
            }
            else
            {
                instance = BusDriver.Instance();
            }
        }
        public void Go()
        {
            if (instanceCheck == instance)
            {
                Console.WriteLine("В автобусе нет водителя");
            }
            else
            {
                if (BusPassenger > 0)
                {
                    Console.WriteLine("Автобус может отправляться");
                }
                else
                {
                    Console.WriteLine("В автобусе нет пассажиров");
                }
            }
        }

        public override void BoardPassenger(uint PassengerCount)
        {
            if (BusPassenger + PassengerCount > maxPassengers)
            {
                Console.WriteLine("В автобус поместились " + (maxPassengers - BusPassenger) + " пассажиров из " + PassengerCount);
                BusPassenger = maxPassengers;           
            }
            else
            {
                BusPassenger = BusPassenger + PassengerCount;
                Console.WriteLine("В автобус сели " + PassengerCount + " пассажиров!");
            }

        }
        }
    }

