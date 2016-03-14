using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Lab3PPS
{
    class PlaneClass : Component
    {
        private List<Component> components = new List<Component>();
        public int curlag = 0;

        public PlaneClass(String name, int weight)
            : base(name, weight)
        {
        }
        public override void addHuman(Component component)
        {
            Console.WriteLine("Passanger " + component.name+" with "+component.laggage+ " trying to board in " + this.name);
            if (this.curlag + component.laggage <= this.laggage) { components.Add(component); this.curlag += component.laggage; }
            else Console.WriteLine("Passanger "+component.name+ " takes too much laggage");  
        }
        public override void remove(Component component)
        {
            components.Remove(component);
        }
        public override void print()
        {
            Console.WriteLine("Class " + name + ". Max weigth " + laggage);
            Console.WriteLine("Passangers: ");
            for (int i =0; i<components.Count;i++)
            {
                components[i].print();
            }
        }

    }
}
