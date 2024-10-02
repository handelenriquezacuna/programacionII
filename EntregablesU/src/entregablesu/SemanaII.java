/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregablesu;

<<<<<<< HEAD
import javax.swing.JOptionPane;

=======
>>>>>>> 6fd76be64f3f8b94f810c8e645f9d53d4491324c
/**
 *
 * @author hande
 */
<<<<<<< HEAD
public class SemanaII {

    public static void main(String[] args) {
        // Conditionals

        if (true) {
            JOptionPane.showMessageDialog(null, "Siempre imprimir");
        }

//        int edad = 18;
//        String resultado = (edad >= 18) ? "PuedeVotar": "Puede ser presidente" ;
//        System.out.println(resultado);
//        
//        if (edad>= 18) {
//            System.out.println("Puede Votar");
//            if (edad>=31) {
//                System.out.println("Puede ser presidente");
//                
//            }
//            
//        }
        /*
        Escriba un programa queLOle solicite SIGUIENTE: al usuario el número de día y le indique el
        nombre del día.
        • Por ejemplo 1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 =
        Viernes, 7 =
        • Sábado.
         */
 /*
           Modifique el programa para que muestre cuáles días son laborales y cuales son libres.
            • A pesar de que esto está en función de horarios muy variados, considere que de
            Lunes a
            • Viernes es laborable y los sábados y domingos son libres.
         */
//        String strDia = "";
//        int diaInt = 0;
//
//        strDia = JOptionPane.showInputDialog("Que # de dia es hoy?");
//        diaInt = Integer.parseInt(strDia);
//
//        switch (diaInt) {
//            case 1:
//                System.out.println("Domingo es libre");
//                break;
//            case 2:
//                System.out.println("Lunes"); 
//                break;
//            case 3:
//                System.out.println("Martes");
//                break;
//            case 4:
//                System.out.println("Miercoles");
//                break;
//            case 5:
//                System.out.println("Jueves");
//                break;
//            case 6:
//                System.out.println("Viernes");
//                break;
//            case 7:
//                System.out.println("Sabado es libre");
//                break;
//            default:
//                System.out.println("Value Not Found ");
//        }
        /*Escriba un programa que le solicite al usuario 4 números y le muestre cuál es el mayor.*/
//        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er #"));
//        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do #"));
//        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 3er #"));
//        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 4to #"));
//
//        if (num4 > num3 || num4 > num2 || num4 > num2 || num4 > num1) {
//            System.out.println("El numero mas grande es el 4to y su valor es:" + num4);
//        } else if (num3 > num4 || num3 > num2 || num3 > num1) {
//            System.out.println("El numero mas grande es el 3ero y su valor es:" + num3);
//        } else if (num2 > num4 || num2 > num3 || num2 > num1) {
//            System.out.println("El numero mas grande es el 2do y su valor es:" + num2);
//        } else if (num1 > num4 || num1 > num3 || num1 > num2) {
//            System.out.println("El numero mas grande es el 1ero y su valor es:" + num1);
//        }
        /*
    ******EXTRA*******
    Desarrolle un ejercicio que le solicite al usuario los
    años de antigüedad, la cantidad de horas
    laboradas por semana y el precio que se le paga por
    hora, con estos datos debe calcular el salario bruto.
    • Si el usuario tiene más de 12 años de trabajar para la
    empresa, se le dará un bono del 5.5% de su salario
    bruto, si este nuevo salario bruto es superior a
    $2500 debe hacerse una deducción del 2.7%, pero si
    el salario supera los $3500, esta deducción será del
    3.8%. Muestre al usuario el salario neto final.    
         */
        int years = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su antiguedad"));
        int hours = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas laboradas por semana"));
        int priceHour = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de horas"));

        int salary = hours * priceHour;
        System.out.println(salary);
//    System.out.println("El numero mas grande es el 1ero y su valor es:" + num1);
        if (years >= 12) {
            double bono = (salary * 0.55) / 100;
//            System.out.println(bono);
            double finalSalary = bono + Double.valueOf(salary);
            if (finalSalary > 3500) {
                double deduction = (salary * 0.27) / 100;
                finalSalary = finalSalary - deduction;
            } else if (finalSalary >= 2500) {
                double deduction = (salary * 0.38) / 100;
                finalSalary = finalSalary - deduction;

            } else if (finalSalary < 2500) {
                finalSalary = finalSalary;
            }
            System.out.println(finalSalary);
        }

    }

=======
public class EngrablesII {
    
>>>>>>> 6fd76be64f3f8b94f810c8e645f9d53d4491324c
}
