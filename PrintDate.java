
public class PrintDate {
    public static void main(String[] args) {
        printAmerican("Tuesday", 16, "September", 2025);
        printEuropean("Tuesday", 16, "September", 2025);
        
    }
    
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.print(day + " " + date + " " + month + " " + year);
    }
}
