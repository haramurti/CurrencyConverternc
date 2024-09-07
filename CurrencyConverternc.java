import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyConverternc{
    public static void main (String[]args){
    opening();
    method();

   
    //currency converrt every number 
 


    }
    public static void opening() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Welcome, this is CurrencyConverternc by Neval haramurti ");
        System.out.println("made in 7 september 2024  ");
        System.out.println("ようこそ、これが比企谷さんのプログラムです、よろしくお願いします。  ");
        System.out.println(" ");
        System.out.println(" ");

    }
    public static void method(){

        System.out.println(
            "list  \n" + 
            "(1) INDONESIA (ID) - RUPIAH (Rp)\n" +
            "(2) UNITED STATES (US) - DOLLAR ($)\n" +
            "(3) UNITED KINGDOM (UK) - POUND (£)\n" +
            "(4) JAPAN (JP) - YEN (¥)\n" +
            "(5) EUROZONE (EU) - EURO (€)\n" +
            "(6) PHILIPPINES (PH) - PESO (₱)\n" +
            "(7) CANADA (CA) - DOLLAR (C$)\n" +
            "(8) AUSTRALIA (AU) - DOLLAR (A$)\n" +
            "(9) SWITZERLAND (CH) - FRANC (CHF)\n" +
            "(10) CHINA (CN) - YUAN (¥)");
            System.out.println("which currency you are currently holding ?");

        //from
        Scanner sca = new Scanner(System.in);
        int from = sca.nextInt();
        switch (from) {
            case (1):
                System.out.println("from =INDONESIA (ID) - RUPIAH (Rp)");
                System.out.println("To What currnecy you want to convet ?");

                Scanner scb = new Scanner(System.in);
                int to = scb.nextInt();
                if (to == 1) {
                    System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                    System.out.println("input amount of money=");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1;
                    String indonesia = NumberFormat.getCurrencyInstance (new Locale("id", "ID")).format(Converted);
                    System.out.println(indonesia);

                } else if (to == 2) {
                    System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                    System.out.println("input amount of money=");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.000065 ;
                    String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                    System.out.println(us);

                } else if (to == 3) {
                    System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                        System.out.println("input amount of money=");
                        Scanner scc = new Scanner(System.in);
                        double amount = scc.nextDouble();
                        double Converted = amount * 0.000049;
                        String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                        System.out.println(uk);
                } else if (to == 4) {
                    System.out.println("to = JAPAN (JP) - YEN (¥)");
System.out.println("input amount of money=");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.0071;
String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
System.out.println(jp);

                } else if (to == 5) {
                    System.out.println("to = EUROZONE (EU) - EURO (€)");
System.out.println("input amount of money=");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.000061;
String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
System.out.println(eu);


                } else if (to == 6) {
                    System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
System.out.println("input amount of money=");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.0037;
String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
System.out.println(ph);

                } else if (to == 7) {
                    System.out.println("to = CANADA (CA) - DOLLAR (C$)");
System.out.println("input amount of money=");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.000083;
String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
System.out.println(ca);

                } else if (to == 8) {
                    System.out.println("to = AUSTRALIA (AU) - DOLLAR (A$)");
System.out.println("input amount of money=");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.000086;
String au = NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(Converted);
System.out.println(au);

                } else if (to == 9) {
                    System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
System.out.println("input amount of money=");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.000059;
String ch = NumberFormat.getCurrencyInstance(new Locale("fr", "CH")).format(Converted);
System.out.println(ch);

                } else if (to == 10) {
                    System.out.println("to = CHINA (CN) - YUAN (¥)");
System.out.println("input amount of money=");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.00045;
String cn = NumberFormat.getCurrencyInstance(Locale.CHINA).format(Converted);
System.out.println(cn);

                } else {
                    System.out.println("Invalid selection");
                }
                
                break;
            
                case (2):
                System.out.println("from =UNITED STATES (US) - DOLLAR ($)");
                System.out.println("To What currnecy you want to convert ?");
                Scanner scb1 = new Scanner(System.in);
                int to1 = scb1.nextInt();

                if (to1 == 1) {
                    System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 15400; // Example conversion rate from USD to IDR
String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
System.out.println(id);




                } else if (to1 == 2) {
                    System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 1; // No conversion needed for USD
String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
System.out.println(us);

               


                } else if (to1 == 3) {
                    System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.81; // Example conversion rate from USD to GBP
String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
System.out.println(uk);

                  
;
                } else if (to1 == 4) {
                    System.out.println("to = JAPAN (JP) - YEN (¥)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 145.60; // Example conversion rate from USD to JPY
String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
System.out.println(jp);

                   
                    
                } else if (to1 == 5) {
                    System.out.println("to = EUROZONE (EU) - EURO (€)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.93; // Example conversion rate from USD to EUR
                    String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                    System.out.println(eu);
                    
                    


                } else if (to1 == 6) {
                    System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 56.15; // Example conversion rate from USD to PHP
String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
System.out.println(ph);

                   
                

                } else if (to1 == 7) {
                    System.out.println("to = CANADA (CA) - DOLLAR (C$)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 1.35; // Example conversion rate from USD to CAD
String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
System.out.println(ca);

    

                } else if (to1 == 8) {
                    System.out.println("to = CANADA (CA) - DOLLAR (C$)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 1.35; // Example conversion rate from USD to CAD
String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
System.out.println(ca);

   

                } else if (to1 == 9) {
                    System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 0.90; // Example conversion rate from USD to CHF
String ch = NumberFormat.getCurrencyInstance(new Locale("fr", "CH")).format(Converted);
System.out.println(ch);

           ;

                } else if (to1 == 10) {
                    System.out.println("to = CHINA (CN) - YUAN (¥)");
Scanner scc = new Scanner(System.in);
double amount = scc.nextDouble();
double Converted = amount * 7.29; // Example conversion rate from USD to CNY
String cn = NumberFormat.getCurrencyInstance(Locale.CHINA).format(Converted);
System.out.println(cn);

                  

                } else {
                    System.out.println("Invalid selection");
                }
                break;
            case (3):
                System.out.println("from =UNITED KINGDOM (UK) - POUND (£)");     
                System.out.println("To What currnecy you want to convert ?");
                Scanner scb2 = new Scanner(System.in);
                int to2 = scb2.nextInt();

                if (to2 == 1) {
                    System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 19000; // Example conversion rate from GBP to IDR
                    String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                    System.out.println(id);
                    




                } else if (to2 == 2) {
                    System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1.24; // Example conversion rate from GBP to USD
                    String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                    System.out.println(us);
                    


                } else if (to2 == 3) {
                    System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1; // No conversion needed for GBP
                    String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                    System.out.println(uk);
                    
                  
;
                } else if (to2 == 4) {
                    System.out.println("to = JAPAN (JP) - YEN (¥)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 180.00; // Example conversion rate from GBP to JPY
                    String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                    System.out.println(jp);
                    
                   
                    
                } else if (to2 == 5) {
                    System.out.println("to = EUROZONE (EU) - EURO (€)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1.15; // Example conversion rate from GBP to EUR
                    String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                    System.out.println(eu);

                    


                } else if (to2 == 6) {
                    System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 69.50; // Example conversion rate from GBP to PHP
                    String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
                    System.out.println(ph);
                    
                   
                

                } else if (to2 == 7) {
                    System.out.println("to = CANADA (CA) - DOLLAR (C$)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1.67; // Example conversion rate from GBP to CAD
                    String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
                    System.out.println(ca);

    

                } else if (to2 == 8) {
                    System.out.println("to = AUSTRALIA (AU) - DOLLAR (A$)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1.83; // Example conversion rate from GBP to AUD
                    String au = NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(Converted);
                    System.out.println(au);
                    

   

                } else if (to2 == 9) {
                    System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1.10; // Example conversion rate from GBP to CHF
                    String ch = NumberFormat.getCurrencyInstance(new Locale("fr", "CH")).format(Converted);
                    System.out.println(ch);
                    

           ;

                } else if (to2 == 10) {
                    System.out.println("to = CHINA (CN) - YUAN (¥)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 9.00; // Example conversion rate from GBP to CNY
                    String cn = NumberFormat.getCurrencyInstance(Locale.CHINA).format(Converted);
                    System.out.println(cn);
                    

                  

                } else {
                    System.out.println("Invalid selection");
                }


                break;
                case (4):
                System.out.println("from = JAPAN (JP) - YEN (¥)");
                System.out.println("To What currency you want to convert?");
                Scanner scb3 = new Scanner(System.in);
                int to3 = scb3.nextInt();
            
                if (to3 == 1) {
                    System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 141.00; // Example conversion rate from JPY to IDR
                    String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                    System.out.println(id);
                } else if (to3 == 2) {
                    System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.0069; // Example conversion rate from JPY to USD
                    String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                    System.out.println(us);
                } else if (to3 == 3) {
                    System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.0055; // Example conversion rate from JPY to GBP
                    String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                    System.out.println(uk);
                } else if (to3 == 4) {
                    System.out.println("to = JAPAN (JP) - YEN (¥)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1; // No conversion needed for JPY
                    String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                    System.out.println(jp);
                } else if (to3 == 5) {
                    System.out.println("to = EUROZONE (EU) - EURO (€)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.0064; // Example conversion rate from JPY to EUR
                    String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                    System.out.println(eu);
                } else {
                    System.out.println("Invalid selection");
                }
                break;
            
            case (5):
                System.out.println("from = EUROZONE (EU) - EURO (€)");
                System.out.println("To What currency you want to convert?");
                Scanner scb4 = new Scanner(System.in);
                int to4 = scb4.nextInt();
            
                if (to4 == 1) {
                    System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 16800; // Example conversion rate from EUR to IDR
                    String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                    System.out.println(id);
                } else if (to4 == 2) {
                    System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1.07; // Example conversion rate from EUR to USD
                    String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                    System.out.println(us);
                } else if (to4 == 3) {
                    System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.87; // Example conversion rate from EUR to GBP
                    String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                    System.out.println(uk);
                } else if (to4 == 4) {
                    System.out.println("to = JAPAN (JP) - YEN (¥)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 157.25; // Example conversion rate from EUR to JPY
                    String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                    System.out.println(jp);
                } else if (to4 == 5) {
                    System.out.println("to = EUROZONE (EU) - EURO (€)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1; // No conversion needed for EUR
                    String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                    System.out.println(eu);
                } else {
                    System.out.println("Invalid selection");
                }
                break;
            
            case (6):
            System.out.println("from = PHILIPPINES (PH) - PESO (₱)");
            System.out.println("To what currency you want to convert?");
            Scanner scb5 = new Scanner(System.in);
            int to5 = scb5.nextInt();

            if (to5 == 1) { // Indonesia Rupiah
                System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 270; // Example conversion rate from PHP to IDR
                String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                System.out.println(id);
            } else if (to5 == 2) { // United States Dollar
                System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.018; // Example conversion rate from PHP to USD
                String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                System.out.println(us);
            } else if (to5 == 3) { // United Kingdom Pound
                System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.014; // Example conversion rate from PHP to GBP
                String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                System.out.println(uk);
            } else if (to5 == 4) { // Japan Yen
                System.out.println("to = JAPAN (JP) - YEN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1.95; // Example conversion rate from PHP to JPY
                String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                System.out.println(jp);
            } else if (to5 == 5) { // Euro
                System.out.println("to = EUROZONE (EU) - EURO (€)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.016; // Example conversion rate from PHP to EUR
                String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                System.out.println(eu);
            } else if (to5 == 6) { // Philippines Peso
                System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1; // No conversion needed for PHP
                String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
                System.out.println(ph);
            } else if (to5 == 7) { // Canada Dollar
                System.out.println("to = CANADA (CA) - DOLLAR (C$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.025; // Example conversion rate from PHP to CAD
                String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
                System.out.println(ca);
            } else if (to5 == 8) { // Australia Dollar
                System.out.println("to = AUSTRALIA (AU) - DOLLAR (A$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.028; // Example conversion rate from PHP to AUD
                String au = NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(Converted);
                System.out.println(au);
            } else if (to5 == 9) { // Switzerland Franc
                System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.016; // Example conversion rate from PHP to CHF
                String ch = NumberFormat.getCurrencyInstance(new Locale("de", "CH")).format(Converted);
                System.out.println(ch);
            } else if (to5 == 10) { // China Yuan
                System.out.println("to = CHINA (CN) - YUAN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.13; // Example conversion rate from PHP to CNY
                String cn = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(Converted);
                System.out.println(cn);
            } else {
                System.out.println("Invalid selection");
            }
            break;

            
                // Case (7): Canada (CAD)
            case (7):
            System.out.println("from = CANADA (CA) - DOLLAR (C$)");
            System.out.println("To what currency you want to convert?");
            Scanner scb6 = new Scanner(System.in);
            int to6 = scb6.nextInt();

                if (to6 == 1) { // Indonesia Rupiah
                    System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 11500; // Example conversion rate from CAD to IDR
                    String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                    System.out.println(id);
                } else if (to6 == 2) { // United States Dollar
                    System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.74; // Example conversion rate from CAD to USD
                    String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                    System.out.println(us);
                } else if (to6 == 3) { // United Kingdom Pound
                    System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.58; // Example conversion rate from CAD to GBP
                    String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                    System.out.println(uk);
                } else if (to6 == 4) { // Japan Yen
                    System.out.println("to = JAPAN (JP) - YEN (¥)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 108.5; // Example conversion rate from CAD to JPY
                    String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                    System.out.println(jp);
                } else if (to6 == 5) { // Euro
                    System.out.println("to = EUROZONE (EU) - EURO (€)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.69; // Example conversion rate from CAD to EUR
                    String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                    System.out.println(eu);
                } else if (to6 == 6) { // Philippines Peso
                    System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 40; // Example conversion rate from CAD to PHP
                    String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
                    System.out.println(ph);
                } else if (to6 == 7) { // Canada Dollar
                    System.out.println("to = CANADA (CA) - DOLLAR (C$)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1; // No conversion needed for CAD
                    String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
                    System.out.println(ca);
                } else if (to6 == 8) { // Australia Dollar
                    System.out.println("to = AUSTRALIA (AU) - DOLLAR (A$)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 1.06; // Example conversion rate from CAD to AUD
                    String au = NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(Converted);
                    System.out.println(au);
                } else if (to6 == 9) { // Switzerland Franc
                    System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 0.68; // Example conversion rate from CAD to CHF
                    String ch = NumberFormat.getCurrencyInstance(new Locale("de", "CH")).format(Converted);
                    System.out.println(ch);
                } else if (to6 == 10) { // China Yuan
                    System.out.println("to = CHINA (CN) - YUAN (¥)");
                    Scanner scc = new Scanner(System.in);
                    double amount = scc.nextDouble();
                    double Converted = amount * 5.35; // Example conversion rate from CAD to CNY
                    String cn = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(Converted);
                    System.out.println(cn);
                } else {
                    System.out.println("Invalid selection");
                }
                break;

            
          // Case (8): Australia (AUD)
            case (8):
            System.out.println("from = AUSTRALIA (AU) - DOLLAR (A$)");
            System.out.println("To what currency you want to convert?");
            Scanner scb7 = new Scanner(System.in);
            int to7 = scb7.nextInt();

            if (to7 == 1) { // Indonesia Rupiah
                System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 10700; // Example conversion rate from AUD to IDR
                String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                System.out.println(id);
            } else if (to7 == 2) { // United States Dollar
                System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.69; // Example conversion rate from AUD to USD
                String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                System.out.println(us);
            } else if (to7 == 3) { // United Kingdom Pound
                System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.53; // Example conversion rate from AUD to GBP
                String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                System.out.println(uk);
            } else if (to7 == 4) { // Japan Yen
                System.out.println("to = JAPAN (JP) - YEN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 103; // Example conversion rate from AUD to JPY
                String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                System.out.println(jp);
            } else if (to7 == 5) { // Euro
                System.out.println("to = EUROZONE (EU) - EURO (€)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.64; // Example conversion rate from AUD to EUR
                String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                System.out.println(eu);
            } else if (to7 == 6) { // Philippines Peso
                System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 39; // Example conversion rate from AUD to PHP
                String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
                System.out.println(ph);
            } else if (to7 == 7) { // Canada Dollar
                System.out.println("to = CANADA (CA) - DOLLAR (C$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.94; // Example conversion rate from AUD to CAD
                String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
                System.out.println(ca);
            } else if (to7 == 8) { // Australia Dollar
                System.out.println("to = AUSTRALIA (AU) - DOLLAR (A$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1; // No conversion needed for AUD
                String au = NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(Converted);
                System.out.println(au);
            } else if (to7 == 9) { // Switzerland Franc
                System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.65; // Example conversion rate from AUD to CHF
                String ch = NumberFormat.getCurrencyInstance(new Locale("de", "CH")).format(Converted);
                System.out.println(ch);
            } else if (to7 == 10) { // China Yuan
                System.out.println("to = CHINA (CN) - YUAN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 4.95; // Example conversion rate from AUD to CNY
                String cn = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(Converted);
                System.out.println(cn);
            } else {
                System.out.println("Invalid selection");
            }
            break;
            case (9):
            System.out.println("from = SWITZERLAND (CH) - FRANC (CHF)");
            System.out.println("To what currency you want to convert?");
            Scanner scb8 = new Scanner(System.in);
            int to8 = scb8.nextInt();

            if (to8 == 1) { // Indonesia Rupiah
                System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 17350; // Example conversion rate from CHF to IDR
                String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                System.out.println(id);
            } else if (to8 == 2) { // United States Dollar
                System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1.10; // Example conversion rate from CHF to USD
                String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                System.out.println(us);
            } else if (to8 == 3) { // United Kingdom Pound
                System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.87; // Example conversion rate from CHF to GBP
                String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                System.out.println(uk);
            } else if (to8 == 4) { // Japan Yen
                System.out.println("to = JAPAN (JP) - YEN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 154; // Example conversion rate from CHF to JPY
                String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                System.out.println(jp);
            } else if (to8 == 5) { // Euro
                System.out.println("to = EUROZONE (EU) - EURO (€)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.95; // Example conversion rate from CHF to EUR
                String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                System.out.println(eu);
            } else if (to8 == 6) { // Philippines Peso
                System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 62; // Example conversion rate from CHF to PHP
                String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
                System.out.println(ph);
            } else if (to8 == 7) { // Canada Dollar
                System.out.println("to = CANADA (CA) - DOLLAR (C$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1.50; // Example conversion rate from CHF to CAD
                String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
                System.out.println(ca);
            } else if (to8 == 8) { // Australia Dollar
                System.out.println("to = AUSTRALIA (AU) - DOLLAR (A$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1.70; // Example conversion rate from CHF to AUD
                String au = NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(Converted);
                System.out.println(au);
            } else if (to8 == 9) { // Switzerland Franc
                System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1; // No conversion needed for CHF
                String ch = NumberFormat.getCurrencyInstance(new Locale("de", "CH")).format(Converted);
                System.out.println(ch);
            } else if (to8 == 10) { // China Yuan
                System.out.println("to = CHINA (CN) - YUAN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 8.0; // Example conversion rate from CHF to CNY
                String cn = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(Converted);
                System.out.println(cn);
            } else {
                System.out.println("Invalid selection");
            }
            break;

          // Case (10): China (CNY)
            case (10):
            System.out.println("from = CHINA (CN) - YUAN (¥)");
            System.out.println("To what currency you want to convert?");
            Scanner scb9 = new Scanner(System.in);
            int to9 = scb9.nextInt();

            if (to9 == 1) { // Indonesia Rupiah
                System.out.println("to = INDONESIA (ID) - RUPIAH (Rp)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 2200; // Example conversion rate from CNY to IDR
                String id = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(Converted);
                System.out.println(id);
            } else if (to9 == 2) { // United States Dollar
                System.out.println("to = UNITED STATES (US) - DOLLAR ($)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.14; // Example conversion rate from CNY to USD
                String us = NumberFormat.getCurrencyInstance(Locale.US).format(Converted);
                System.out.println(us);
            } else if (to9 == 3) { // United Kingdom Pound
                System.out.println("to = UNITED KINGDOM (UK) - POUND (£)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.11; // Example conversion rate from CNY to GBP
                String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(Converted);
                System.out.println(uk);
            } else if (to9 == 4) { // Japan Yen
                System.out.println("to = JAPAN (JP) - YEN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 19.5; // Example conversion rate from CNY to JPY
                String jp = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(Converted);
                System.out.println(jp);
            } else if (to9 == 5) { // Euro
                System.out.println("to = EUROZONE (EU) - EURO (€)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.13; // Example conversion rate from CNY to EUR
                String eu = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(Converted);
                System.out.println(eu);
            } else if (to9 == 6) { // Philippines Peso
                System.out.println("to = PHILIPPINES (PH) - PESO (₱)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 7.7; // Example conversion rate from CNY to PHP
                String ph = NumberFormat.getCurrencyInstance(new Locale("en", "PH")).format(Converted);
                System.out.println(ph);
            } else if (to9 == 7) { // Canada Dollar
                System.out.println("to = CANADA (CA) - DOLLAR (C$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.19; // Example conversion rate from CNY to CAD
                String ca = NumberFormat.getCurrencyInstance(Locale.CANADA).format(Converted);
                System.out.println(ca);
            } else if (to9 == 8) { // Australia Dollar
                System.out.println("to = AUSTRALIA (AU) - DOLLAR (A$)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.21; // Example conversion rate from CNY to AUD
                String au = NumberFormat.getCurrencyInstance(new Locale("en", "AU")).format(Converted);
                System.out.println(au);
            } else if (to9 == 9) { // Switzerland Franc
                System.out.println("to = SWITZERLAND (CH) - FRANC (CHF)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 0.13; // Example conversion rate from CNY to CHF
                String ch = NumberFormat.getCurrencyInstance(new Locale("de", "CH")).format(Converted);
                System.out.println(ch);
            } else if (to9 == 10) { // China Yuan
                System.out.println("to = CHINA (CN) - YUAN (¥)");
                Scanner scc = new Scanner(System.in);
                double amount = scc.nextDouble();
                double Converted = amount * 1; // No conversion needed for CNY
                String cn = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(Converted);
                System.out.println(cn);
            } else {
                System.out.println("Invalid selection");
            }
            break;

            default:
                break;
        }
        //to
        
       
    
        
       
        }


       
}
        

