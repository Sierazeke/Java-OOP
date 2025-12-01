public class AutoClass
{
    int year;
    String name;
    int totalDistance;

    public AutoClass(int year, String name, int totalDistance)
    {
        this.year = year;
        this.name = name;
        this.totalDistance = totalDistance;
    }

    public void displayInfo()
    {
        System.out.println("Car: " + this.name + "  Year: " + this.year + "  Distance driven: " + this.totalDistance + "km");
    }

    public void drive(int k)
    {
        if (k > 0)
        {
            this.totalDistance += k;
        }

    }

    public void showTotalDistance()
    {
        System.out.println("Car: " + this.name + "  Total distance driven: " + this.totalDistance + "km");
    }

    @Override
    public String toString() {
        return "[Car Info] - " + "Car Model: " + this.name + " (" + this.year + ") " + "Car Distance Driven: " + this.totalDistance;
    }

    public static void main(String[] args)
    {
        AutoClass car1 = new AutoClass(2010, "BMW", 450);
        AutoClass car2 = new AutoClass(2022, "Tesla", 8500);

        car1.drive(200);
        car1.displayInfo();
        car2.showTotalDistance();
    }
}