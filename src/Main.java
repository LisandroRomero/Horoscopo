import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int day, year, month;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Coloca tu dia de nacimiento");
        day = keyboard.nextInt();
        System.out.println("coloca tu mes de nacimiento");
        month = keyboard.nextInt();
        System.out.println("Coloca tu año de nacimiento");
        year = keyboard.nextInt();
        System.out.println(day +"/"+ month +"/"+ year);
        System.out.print("\n Tu signo es ");
        switch (month){
            case 1: if (day <21){
                System.out.println("Capricornio");
            }else {
                System.out.println("Acuario");
            }
            break;
            case 2: if (day<20){
                System.out.println("Acuario");
            }else {
                System.out.println("Piscis");
            }
            break;
            case 3: if (day < 21){
                System.out.println("Piscis");
            }else {
                System.out.println("Aries");
            }break;
            case 4: if (day < 21){
                System.out.println("Aries");
            }else {
                System.out.println("Tauro");
            }break;
            case 5:if (day < 21){
                System.out.println("Tauro");
            }else {
                System.out.println("Geminis");
            }break;
            case 6 : if (day<22){
                System.out.println("Geminis");

            }else {
                System.out.println("Cancer");
            }break;
            case 7: if (day < 23){
                System.out.println("Cancer");
            }else{
                System.out.println("Leo");
            }break;
            case 8:if (day<23){
                System.out.println("Leo");
            }else {
                System.out.println("Virgo");
            }break;
            case 9: if (day<23){
                System.out.println("Virgo");
            }else {
                System.out.println("Libra");
            }break;
            case 10: if (day<23){
                System.out.println("Libra");
            }else {
                System.out.println("Escorpio");
            }break;
            case 11: if (day<22){
                System.out.println("Escorpio");
            }else{
                System.out.println("Sagitario");
            }
            case 12: if (day<22){
                System.out.println("Sagitario");
            }else {
                System.out.println("Capricornio");
            }
            default:
                System.out.println("Mes incorrecto");
        }
    }
}