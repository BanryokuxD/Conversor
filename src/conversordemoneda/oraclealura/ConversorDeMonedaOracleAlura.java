package conversordemoneda.oraclealura;

import javax.swing.JOptionPane;

public class ConversorDeMonedaOracleAlura {

    public static void main(String[] args) {
        int a = 0;
        while (a <= 0) {
            try {
                String[] eleccion = {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Velocidad"};
                String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona lo Que Quieres Convertir", "Menú", JOptionPane.QUESTION_MESSAGE, null, eleccion, eleccion[0]);
                switch (opcion) {
                    case "Conversor de Monedas":
                        ConversorDeMoneda convertir = new ConversorDeMoneda();
                        convertir.convertirDePesoAOtrasMonedas();
                        a = JOptionPane.showConfirmDialog(null, "Desea Continuar?", "Menú", JOptionPane.YES_NO_OPTION);

                        break;
                    case "Conversor de Temperatura":
                        ConversorDeTemperatura temperatura = new ConversorDeTemperatura();
                        temperatura.convertirTemperaturas();
                        a = JOptionPane.showConfirmDialog(null, "Desea Continuar?", "Menú", JOptionPane.YES_NO_OPTION);

                        break;
                    case "Conversor de Velocidad":
                        ConversorDeVelocidad longitud = new ConversorDeVelocidad();
                        longitud.ConvertirVelocidades();
                        a = JOptionPane.showConfirmDialog(null, "Desea Continuar?", "Menú", JOptionPane.YES_NO_OPTION);

                        break;

                    default:
                        throw new AssertionError();
                }
            } catch (NullPointerException e) {

                JOptionPane.showMessageDialog(null, "No Puedes Finalizar Sesión Hasta Terminar");
            }
        }
        JOptionPane.showMessageDialog(null, "Finalizando Sesión");
    }
}
