package conversordemoneda.oraclealura;

import javax.swing.JOptionPane;

public class ConversorDeVelocidad {

    public double resultado;
    private double velocidad;
    private final String[] conversorVelocidad = {"metro x segundo - milla x hora", "metro x segundo - pie x segundo", "metro x segundo - kilometro x hora", "milla x hora - metro x segundo", "milla x hora - pie x segundo", "milla x hora - kilometro x hora", "pie x segundo - milla x hora", "pie x segundo - metro x segundo", "pie x segundo - kilometro x hora"};

    public void ConvertirVelocidades() {

        try {
            velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la velocidad que deseas convertir"));
            String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona lo Que Quieres Convertir", "Menú", JOptionPane.QUESTION_MESSAGE, null, conversorVelocidad, conversorVelocidad[0]);
            switch (opcion) {
                case "metro x segundo - milla x hora":
                    resultado = velocidad * 2.237;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "m/s a " + String.format("%.2f", resultado) + " mi/h");

                    break;
                case "metro x segundo - pie x segundo":
                    resultado = velocidad * 3.281;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "m/s a " + String.format("%.2f", resultado) + " ft/s");

                    break;
                case "metro x segundo - kilometro x hora":
                    resultado = velocidad * 3.6;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "m/s a " + String.format("%.2f", resultado) + " km/h");

                    break;

                case "milla x hora - metro x segundo":
                    resultado = velocidad / 2.237;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "mi/h a " + String.format("%.2f", resultado) + " m/s");

                    break;
                case "milla x hora - pie x segundo":
                    resultado = velocidad * 1.467;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "mi/h a " + String.format("%.2f", resultado) + " ft/s");

                    break;
                case "milla x hora - kilometro x hora":
                    resultado = velocidad * 1.609;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "mi/h a " + String.format("%.2f", resultado) + " km/h");

                    break;

                case "pie x segundo - milla x hora":
                    resultado = velocidad / 1.467;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "ft/s a " + String.format("%.2f", resultado) + " mi/h");

                    break;

                case "pie x segundo - metro x segundo":
                    resultado = velocidad / 3.281;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "ft/s a " + String.format("%.2f", resultado) + " m/s");

                    break;

                case "pie x segundo - kilometro x hora":
                    resultado = velocidad * 1.097;
                    JOptionPane.showMessageDialog(null, "Convirtiendo " + velocidad + "ft/s a " + String.format("%.2f", resultado) + " km/h");

                    break;

                default:
                    throw new AssertionError();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa Una Opción Válida");
        }
    }

}
