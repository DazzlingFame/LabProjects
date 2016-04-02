using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab1sharp
{
    abstract public class PassengerBuilder
    {
        protected Passenger Board;
    
        virtual public void BoardAdult()
        {
            throw new System.NotImplementedException();
        }

        virtual public void BoardChild()
        {
            throw new System.NotImplementedException();
        }

        virtual public void BoardLgot()
        {
            throw new System.NotImplementedException();
        }
        
        virtual public void BoardTransport()
        {
            throw new System.NotImplementedException();
        }
    }
}
