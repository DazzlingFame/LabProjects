using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab1sharp
{
    public class BusDriver:Driver
    {
        private static BusDriver _instance;
        private Guid _instanceId;
        public Guid InstanceId
        {
            get { return _instanceId; }
        }
        public string StringProperty { get; set; }
        public int IntProperty { get; set; }
        private BusDriver()
        {
            _instanceId = Guid.NewGuid();
        }
        public static BusDriver Instance()
        {
            if (_instance == null)
            { _instance = new BusDriver(); }
            return _instance;
        }

    }

}
