
import java.util.Scanner;


class Main{

   Scanner obj = new Scanner(System.in); 

   private String IMEI_code;
   private String SIM_card;
   private String Processor;
   private int Internal_Memory;
   private String Mode_Sime;


   //getetr setter method method which contain here 

   void getIMEI_code(String IMEI_code)//imei number
   {
        this.IMEI_code = IMEI_code;
   }

   String setIMEI_code()
   {
       return IMEI_code;
   }


   void getSIM_card(String SIM_card)//Sim card
   {
        this.SIM_card = SIM_card;
   }

   String setSIM_card()
   {
       return SIM_card;
   }


   void getProcessor(String Processor)//imei number
   {
        this.Processor = Processor;
   }

   String setProcessor()
   {
       return Processor;
   }

   void getInternal_Memory(int Internal_Memory)//imei number
   {
        this.Internal_Memory = Internal_Memory;
   }

   int setInternal_Memory()
   {
       return Internal_Memory;
   }


   void getMode_Sime(String Mode_Sime)//imei number
   {
        this.Mode_Sime = Mode_Sime;
   }

   String setMode_Sime()
   {
       return Mode_Sime;
   }


   Main(String IMEI_code, String SIM_card ,String Processor, int Internal_Memory, String Mode_Sime)
   {
        this.IMEI_code = IMEI_code;
        this.SIM_card = SIM_card;
        this.Processor = Processor;
        this.Internal_Memory = Internal_Memory;
        this.Mode_Sime =Mode_Sime;

        System.out.println("Your IMEI NUMBER IS :"+this.IMEI_code);
        System.out.println("Your SIM CARD IS :"+this.SIM_card);
        System.out.println("Your PROCESSOR IS :"+this.Processor);
        System.out.println("Your INTERNAL MEMORY IS :"+this.Internal_Memory+" GB");
        System.out.println("Your SIM SLOT IS : "+this.Mode_Sime);
   }


   public void DIAL_Number()
   {
        System.out.println("Dial number : ");
        long a = obj.nextLong();

        if(a <= 12)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println("Your number is Incorrect!!!!");
        }
   }
   public void Reseive_Call()
   {
       System.out.println("CALL IS COMING : (PRESS C TO ATTEND AND X FOR CUT)");

       char a = obj.next().charAt(0);

       if(a =='C')
       {
           String m = "03013345679";
           System.out.println("number is : "+m);
       }
       else if(a =='X')
       {
        System.out.println("thanku!!");
       }
   }
   public void SEND_SMS()
   {
    System.out.println("MESSAGES PRESS C FOR SEND MESSAGE");

    char a = obj.next().charAt(0);

    String sms;
    if(a =='C')
    {
        sms = obj.nextLine();
        System.out.println(sms);
    }
    else
    {
     System.out.println("thanku!!");
    }
   }
   public void Reseive_SMS()
   {
    System.out.println("TO RECEVE PRESS(P FOR RESEVE AND X FOR OUT) ");

    char a = obj.next().charAt(0);

    if(a =='P')
    {
        System.out.println("There are two messages in inbox : press 1 for 1 ,and 2 for 2");
    int num = obj.nextInt();
        if(num == 1)
        {
            System.out.println("HEllo world");
        }
        else if(num == 2)
        {
            System.out.println("HEllo Samin");
        }
    }
    else if(a =='X')
    {
     System.out.println("thanku!!");
    }
   }


public void show_method()
{
    System.out.println("\t\t\tHERE IS THE MENUE FOR MOBILE\n\nEnter 1 for DIAL NUMBER \n\nEnter 2 for RECEVE NUMBER\n\nEnter 3 for TYPE MESSAGES\n\nEnter 4 for INBOX\n\n");

    int a = obj.nextInt();

    switch (a) {
            case 1:
            DIAL_Number();
            break;
            case 2:
            Reseive_Call();
            break;
            case 3:
            SEND_SMS();
            break;
            case 4:
            Reseive_SMS();
            break;

    
        default:
        System.out.println("Error");
            break;
    }


}
}

class ques2
{
    public static void main(String[] args) {
        Main obj = new Main("IEDF34343435235","nano","SnapDragon",8,"Single SIM");

        obj.show_method();
    }
}