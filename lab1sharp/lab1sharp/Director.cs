using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab1sharp
{
    public class Director
    {
        public Passenger BoardPassanger(PassengerBuilder builder)
        {
            builder.BoardAdult();
            builder.BoardChild();
            builder.BoardLgot();
            throw new System.NotImplementedException();
        }
    }
}
