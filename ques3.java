import java.util.Scanner;

class fan
{
    Scanner obj = new Scanner(System.in);
    private int speed;
    private boolean state;
    private double radius;
    private String color;

   
    public void getSpeed(int speed)
    {
        this.speed = speed;
    }

    public int setSpeed()
    {
        return  speed;
    }

    public void getstate(boolean state)
    {
        this.state = state;
    }

    public boolean setstate()
    {
        return  state;
    }

    public void getradius(double radius)
    {
        this.radius = radius;
    }

    public double setradius()
    {
        return  radius;
    }

    public void getcolor(String color)
    {
        this.color = color;
    }

    public String setcolor()
    {
        return  color;
    }


    fan(int speed, boolean state,double radius,String color)
    {
        this.speed = speed;
        this.state = state;
        this.radius = radius;
        this.color = color;

        System.out.println("Fan speed : "+this.speed);
        System.out.println("Fan state : "+this.state);
        System.out.println("Fan radius : "+this.radius);
        System.out.println("Fan color : "+this.color);
    }

    public void displayDetails()
    {
        boolean a = state;

        if(a == true)
        {
            System.out.println("Fan is on");
            System.out.println("Fan speed : "+this.speed);  
            System.out.println("Fan radius : "+this.radius);
            System.out.println("Fan color : "+this.color);
        }
        else{
            System.out.println("Fan is off");
            System.out.println("Fan radius : "+this.radius);
            System.out.println("Fan color : "+this.color);   
        }
    }
}


class ques3
{
    public static void main(String[] args) {
        System.out.println("Constent value: where 1 = slow ,2 = medium , 3 =fast");  
        fan obj = new fan(1,false,5f,"blue");
        obj.displayDetails();
        System.out.println("OBJECT 1 : ");  
        fan obj2 = new fan(3,true,10f,"Yellow");
        obj2.displayDetails();
        System.out.println("OBJECT 2 : ");  
        fan obj3 = new fan(2,true,5f,"yellow");
        obj3.displayDetails();
    }
}