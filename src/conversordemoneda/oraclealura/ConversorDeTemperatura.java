
package conversordemoneda.oraclealura;

import javax.swing.JOptionPane;

class ConversorDeTemperatura {

    private double temperatura;
    private final String[] conversorTemp = {"Celcius - Fahrenheit", "Celcius - Kelvin", "Fahrenheit - Celcius", "Fahrenheit - Kelvin", "Kelvin - Celcius", "Kelvin - Fahrenheit"};
    private double resultado;

    public void convertirTemperaturas() {
        
            try {
                temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa la temperatura que deseas convertir"));
                String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona lo Que Quieres Convertir", "Menú", JOptionPane.QUESTION_MESSAGE, null, conversorTemp, conversorTemp[0]);
                switch (opcion) {
                    case "Celcius - Fahrenheit":
                        resultado = (temperatura * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null, "Convirtiendo " + temperatura + "°C a " + String.format("%.2f", resultado) + " °F");
                       
                        break;
                    case "Celcius - Kelvin":
                        resultado = temperatura + 273.15;
                        JOptionPane.showMessageDialog(null, "Convirtiendo " + temperatura + "°C a " + String.format("%.2f", resultado) + " K");
                     
                        break;
                    case "Fahrenheit - Celcius":
                        resultado = (temperatura - 32) * 5 / 9;
                        JOptionPane.showMessageDialog(null, "Convirtiendo " + temperatura + "°F a " + String.format("%.2f", resultado) + " °C");
                      
                        break;
                    case "Fahrenheit - Kelvin":
                        resultado = ((temperatura - 32) * 5 / 9) + 273.15;
                        JOptionPane.showMessageDialog(null, "Convirtiendo " + temperatura + "°F a " + String.format("%.2f", resultado) + " K");

                        break;
                    case "Kelvin - Celcius":
                        resultado = (temperatura - 273.15);
                        JOptionPane.showMessageDialog(null, "Convirtiendo " + temperatura + "K a " + String.format("%.2f", resultado) + " °C");

                        break;

                    case "Kelvin - Fahrenheit":
                        resultado = ((temperatura - 273.15) * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null, "Convirtiendo " + temperatura + "K a " + String.format("%.2f", resultado) + " °F");

                        break;

                    default:
                        throw new AssertionError();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa Una Opción Válida");
            }
        }
      
}
