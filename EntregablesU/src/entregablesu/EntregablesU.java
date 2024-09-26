/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablesu;

import java.text.MessageFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author hande
 */
public class EntregablesU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        1. Elabore un programa que calcule cuántos años tendrá el
//usuario en 5 años, al finalizar se imprime el siguiente mensaje
//“Dentro de 5 años, tendrá: “ y se muestre el valor de la edad
//proyectada. Debe solicitar como dato de entrada la edad actual
//String userAge;
//userAge = JOptionPane.showInputDialog("Que edad tienes");
//System.out.println(userAge);
//int age = Integer.parseInt(userAge);
//age= age + 5;
//System.out.println(age);
//DONE!

//2. Desarrolle un programa que calcule el porcentaje de gastos por
//concepto de alimentación y el porcentaje que queda disponible
//para otros gastos. Debe proporcionar como datos de entrada el
//monto de ingreso mensual y el gasto mensual por alimentación.
//String salario;
//String alimentacion;
//double salarioFinal;
//double gastoAlimentacion;
//
//salario = JOptionPane.showInputDialog("Cuanto ganas?");
//System.out.println(salario);
//alimentacion = JOptionPane.showInputDialog("Cuanto gastas en alimentacion?");
//salarioFinal = Double.parseDouble(salario);
//gastoAlimentacion = Double.parseDouble(alimentacion);
//gastoAlimentacion = salarioFinal/gastoAlimentacion; 
//System.out.println(gastoAlimentacion);
//Done!!
//age= age + 5;
//System.out.println(age);

//short if statement
//int time = 20;
//String result = (time > 18) ? "GoodDay": "GoodEvening" ;
//
//System.out.println(result);

//Extra
/*
Escriba un programa que lea el nombre del trabajador y su
salario semanal, con esta información calcule su salario
mensual sin deducciones (salario bruto), el monto de las
deducciones (que corresponden a un 9.34%) y el salario
después de aplicadas las deducciones (salario neto),
finalmente debe mostrar los datos al usuario de la siguiente
manera.
• Estimado <<nombre>>, el salario de este mes se desglosa
de la siguiente manera.
Salario bruto: #####.##
Deducciones: #####.##
Salario Neto: #####.##
*/
String trabajador;
String salarioSemanal;
String iMessage;
String strDeducciones;
double salarioFinal;
double deducciones;
double salarioNeto;

trabajador = JOptionPane.showInputDialog("Cual es su nombre?");
System.out.println(trabajador);
salarioSemanal = JOptionPane.showInputDialog("Cuanto gana semanalmente?");
salarioFinal = Double.parseDouble(salarioSemanal);
salarioFinal = salarioFinal * 4; 
strDeducciones = JOptionPane.showInputDialog("Cuanto deducciones recibir?");
deducciones = Double.parseDouble(strDeducciones);
salarioNeto = salarioFinal-deducciones;

iMessage = MessageFormat.format("Estimado {0}, el salario de este mes se desglosa", trabajador);
System.out.println(iMessage);
iMessage = MessageFormat.format("Salario bruto: {0}", salarioFinal);
System.out.println(iMessage);
iMessage = MessageFormat.format("Deducciones: {0}", deducciones);
System.out.println(iMessage);
iMessage = MessageFormat.format("Salario Neto: {0}", salarioNeto);
System.out.println(iMessage);


    
    }

}
