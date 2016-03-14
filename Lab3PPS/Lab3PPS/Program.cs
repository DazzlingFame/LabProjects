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
            Component first = new PlaneClass("first",10);
            Component buis = new PlaneClass("buis",20);
            Component eco = new PlaneClass("eco",150);
            for (int i = 0; i < 10; i++)
            {
                String pasname = "P" + i;
                Component art = new Passanger(pasname, 10);
                eco.addHuman(art);
            }
            for (int i = 0; i < 10; i++)
            {
                String pasname = "P" + i;
                Component art = new Passanger(pasname, 10);
                buis.addHuman(art);
            }
                buis.print();
                eco.print();
        }
    }
}
