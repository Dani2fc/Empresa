package modelo;

import javax.swing.JOptionPane;

public class Modelo{
    public static void main(String[] args) {
        
        final int SALARIO_MINIMO = 1000000;
        final int ANIO_ACTUAL = 2022;
        final int AUXILIO_TRANSPORTE = 117172;
        final int CANTIDAD_SALARIO = 8250;

        // Declaración de variables
        int numEmpleados;
        int empleadosBenificiados = 0;
        int[] empleadosFechaNacimiento;
        int[] empleadosFechaAntiguedad;
        int[] empleados;
        int[] edad;
        int[] antiguedad;
        double totalaPagarSinBeneficio = 0;
        double totalaPagar;

        // Input
        numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero total de los empleados de la empresa" ));
        empleados = new int[numEmpleados];
        empleadosFechaNacimiento = new int[numEmpleados];
        empleadosFechaAntiguedad = new int[numEmpleados];
        edad = new int[numEmpleados];
        antiguedad = new int[numEmpleados];

        // Processing
        for(int i = 0; i<empleados.length; i++){
            empleados[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas cumplidas por el empleado en el mes: "+ (i+1)));
        }

        for(int i = 0; i<empleados.length; i++){
            empleadosFechaNacimiento[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de nacimiento del empleado: "+ (i+1)));
            edad[i] = (ANIO_ACTUAL - empleadosFechaNacimiento[i]);
        }

        for(int i = 0; i<empleados.length; i++){
            empleadosFechaAntiguedad[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de ingreso a la empresa del empleado: "+ (i+1)));
            antiguedad[i] = (ANIO_ACTUAL - empleadosFechaAntiguedad[i]);
        }

        for(int i = 0; i<empleados.length; i++){
            if((empleados[i] * CANTIDAD_SALARIO) < (SALARIO_MINIMO * 2)){
                empleadosBenificiados = empleadosBenificiados + (empleados[i] + AUXILIO_TRANSPORTE);
            }
        }

        for(int i = 0; i < empleados.length; i++){
            totalaPagarSinBeneficio = totalaPagarSinBeneficio + (empleados[i] * CANTIDAD_SALARIO);
           }

        totalaPagar = (totalaPagarSinBeneficio + empleadosBenificiados);

        // Output
        String salidaEdad = "Edad [";
        for(int i = 0; i<edad.length; i++){
            if(i!=(numEmpleados-1)){
                salidaEdad = salidaEdad + edad[i]+ " , ";
            }else{
                salidaEdad = salidaEdad + edad[i];
            }
        }

        String salidaAntiguedad = "Antiguedad [";
        for(int i = 0; i<edad.length; i++){
            if(i!=(numEmpleados-1)){
                salidaAntiguedad = salidaAntiguedad + antiguedad[i]+ " , ";
            }else{
                salidaAntiguedad = salidaAntiguedad + antiguedad[i];
            }
        }

        salidaEdad = salidaEdad + "]";
        salidaAntiguedad = salidaAntiguedad + "]";
        JOptionPane.showMessageDialog(null, "El total a pagar de la empresa para sus empleados es: "+ totalaPagar+ "\n La edad de los empleados respectivamente es: "+ salidaEdad+ "\n La anitguedad de los empleados respectivamente es: "+ salidaAntiguedad);
    }
}