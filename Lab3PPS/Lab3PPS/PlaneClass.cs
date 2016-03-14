using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace Lab3PPS
{
    
    class PlaneClass : Component
    {
        static int lagplace = 200;
        int pilotsonboard=0;
        int stuardsonboard = 0;
        private List<Component> components = new List<Component>();

        public PlaneClass(String name, int weight)
            : base(name, weight)
        {
        }
        public override void addHuman(Component component)
        {
            if ((component.GetType().ToString() == "Lab3PPS.Pilot")&&(pilotsonboard<2)) //Сажаем пилотов
            {
                Console.WriteLine("Pilot is onboard");
                components.Add(component);
                pilotsonboard++;
                return;
            }
            else if ((component.GetType().ToString() == "Lab3PPS.Pilot") && (pilotsonboard > 2))
            {
                Console.WriteLine("No need more pilots");
                return;
            }


            if ((component.GetType().ToString() == "Lab3PPS.Stuardess") && (pilotsonboard < 6)) //Сажаем стюардесс
            {
                Console.WriteLine("Stuardess is onboard");
                components.Add(component);
                stuardsonboard++;
                return;
            }
            else if ((component.GetType().ToString() == "Lab3PPS.Stuardess") && (stuardsonboard > 6))
            {
                Console.WriteLine("No need more Stuards");
                return;
            }

            Console.WriteLine("Passanger " + component.name+" with "+component.laggage+ " trying to board in " + this.name);
            if (laggage > 0) laggage--; //Проверка, влезает ли пассажир
            else
            {
                Console.WriteLine("No space left");
                return;
            }
            if (lagplace - component.laggage >=0) //Багаж влезает
            { 
                if (((this.name == "eco")&&(component.laggage>20))||((this.name == "buis")&&(component.laggage>35))) Console.WriteLine(" He will pay for luggage ");
                components.Add(component);
                lagplace -= component.laggage;
            }
            else                                    //багаж не влезает
            {
                Console.WriteLine("Passanger "+component.name+ " takes too much laggage");  
            }
                
        }
        public override void remove(Component component)
        {
            components.Remove(component);
        }
        public override void print()
        {
            Console.WriteLine("Class " + name + ". Max passangers " + laggage);
            Console.WriteLine("Passangers: ");
            for (int i =0; i<components.Count;i++)
            {
                components[i].print();
            }
        }
        public Component getIntoThePlane()
        {
            Component eco = new PlaneClass("eco", 150);
            for (int i = 0; i < laggage; i++) eco.addHuman(new Passanger("P" + i, i+10));
            return eco;
        }
    }
}
