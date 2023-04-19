class Program
{
    static void Main(string[] args)
    {
        int input = 0;
        input = inputInt();
        System.Console.WriteLine("Результат деления: {0:0.##}", divineByZero(20, input));
        
    }
    static double divineByZero(double a1, double a2){
        double answer = a1/a2;
        return answer;
    }

    static int inputInt(){
        int input = 0;
        while (input == 0)
        {
            string inputString = Console.ReadLine()!; 
            try 
            {
                input = Int32.Parse(inputString);
            }
            catch (FormatException) 
            {
                input = 0;
                Console.WriteLine("Введено не числовое значение.");
            }
            
            
        }
        return input;
    }
}