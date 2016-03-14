using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Lab3PPS
{
    abstract class Component
    {
        public int laggage;
        public String name;

         public Component(String name, int laggage)
        {
            this.laggage = laggage;
            this.name = name;
        }
        public virtual void addHuman(Component component) { }
        public virtual void remove(Component component) { }
        public virtual void print()
        {
            Console.WriteLine("Passanger " + name + ". Laggage weigth " + laggage);
        }
    }
}
