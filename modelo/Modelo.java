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

        // Processing
        for(int i = 0; i<empleados.length; i++){
            empleados[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas cumplidas por el empleado en el mes: "+ (i+1)));
        }

        for(int i = 0; i<empleados.length; i++){
            if((empleados[i] * CANTIDAD_SALARIO) < (SALARIO_MINIMO * 2)){
                empleadosBenificiados = empleadosBenificiados + (empleados[i] + AUXILIO_TRANSPORTE);
            }else{
                empleadosBenificiados = empleadosBenificiados + 0;
            }
        }

        for(int i = 0; i < empleados.length; i++){
            totalaPagarSinBeneficio = totalaPagarSinBeneficio + (empleados[i] * CANTIDAD_SALARIO);
           }

        totalaPagar = (totalaPagarSinBeneficio + empleadosBenificiados);

        // Output
        JOptionPane.showMessageDialog(null, "El total a pagar de la empresa para sus empleados es: "+ totalaPagar);
    }
}