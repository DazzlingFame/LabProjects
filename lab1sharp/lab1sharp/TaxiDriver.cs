using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab1sharp
{
    public class TaxiDriver:Driver
    {
        private static TaxiDriver _instance;
        private Guid _instanceId;
        public Guid InstanceId
        {
            get { return _instanceId; }
        }
        public string StringProperty { get; set; }
        public int IntProperty { get; set; }
        private TaxiDriver()
        {
            _instanceId = Guid.NewGuid();
        }
        public static TaxiDriver Instance()
        {
            if (_instance == null)
            { _instance = new TaxiDriver(); }
            else { Console.WriteLine("В такси уже есть водитель!"); }
            return _instance;
        }

    }

}
