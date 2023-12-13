import javax.swing.JOptionPane;

public class Ejercicio20 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*Declaración de variables */
        float sn, sh , ret , se , shen, shed , shedo ;
        int ho,hed , hen ,hedo;
        String nombre;
        /*Entrada de datos */
        nombre =JOptionPane.showInputDialog("Digite su nombre: ");
        sh= float.parseFloat(JOptionPane.showInputDialog("Digite salario por hora");
        ho= Integer.parseInt(JOptionPane.showInputDialog("Digite horas ordinarias" );
        hed= Integer.parseInt(JOptionPane.showInputDialog("Digite horas ordinarias" );
        hen= Integer.parseInt(JOptionPane.showInputDialog("Digite horas ordinarias");
        hedo= Integer.parseInt(JOptionPane.showInputDialog("Digite horas ordinarias");

        /*Calculo del valor de la hora extra diurna, nocturna y dominical */

        shed= (float)  (sh*1.25);
        /*Calculo del salario extra, en el cual multiplico las horas */
        se= hed*shed +hed*shen +hedo*shedo;

        /*Calculo de la retención sobre el salario extra */
        ret= (float) (se*0.1);

        /*Calculo del salario neto, en el cual el salario ordinario , le sumo las extras y le resto la retención */
        sn= sh*ho +se -ret ;

        /*Salida de información */
        JOptionPane.showMessageDialog(null,nombre + "tiene un salario neto de " +sn + ", el cual incluye una retención de "+ ret);
    }
    
}
