using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3PPS
{
    class Program
    {
        static void Main(string[] args)
        {
            Component first = new PlaneClass("first",100);
            Component buis = new PlaneClass("buis",150);
            Component eco = new PlaneClass("eco",50);
            Component ecopass = new Passanger("Ivanov",15);
            eco.addHuman(ecopass);
            for (int i = 0; i < 10; i++)
            {
                String pasname = "P" + i;
                Component art = new Passanger(pasname, 10);
                eco.addHuman(art);
            }
                eco.print();
        }
    }
}
