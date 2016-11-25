public class Task5;
public static double CalculateA(double x, double y, double z){
        return (2 * Math.sin(x - Math.PI/6)*CalculateB(z))/(1/2.+ (Math.pow(Math.sin(y, 2))));

        private static double CalculateB(double z){
        return 1 + (Math.pow(z, 2))/(3 + ((Math.pow(z, 2))/5));
        }
}