package conversordemoneda.oraclealura;

import javax.swing.JOptionPane;

public class ConversorDeMoneda {

    private double monedaConvertida;
    private final String[] monedaInternacional = {"Peso Colombiano - Dolar", "Dolar - Peso Colombiano", "Peso Colombiano - YEN", "YEN - Peso Colombiano", "Peso Colombiano - Euros", "Euros - Peso Colombiano", "Peso Colombiano - Rupia India", "Rupia India - Peso Colombiano", "Peso Colombiano - Libra Esterlina", "Libra Esterlina - Peso Colombiano"};
    private double resultado;
    private final double dolarHoy = 4849.99;
    private final double yenHoy = 35.79;
    private final double euroHoy = 5112.57;
    private final double rupiaIndiaHoy = 58.70;
    private final double libraEsterlinaHoy = 5875.74;

/// METODOS ///    
    public void convertirDePesoAOtrasMonedas() {

            try {
               monedaConvertida = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa la cantidad de dinero que deseas convertir"));
                String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona lo Que Quieres Convertir", "Menú", JOptionPane.QUESTION_MESSAGE, null, monedaInternacional, monedaInternacional[0]);

                switch (opcion) {
                    case "Peso Colombiano - Dolar":
                        resultado = monedaConvertida / dolarHoy;
                        JOptionPane.showMessageDialog(null, "de $" + monedaConvertida + " pesos \n" + "tienes $ " + String.format("%.2f", resultado) + " dolares");
                        
                        break;

                    case "Dolar - Peso Colombiano":
                        resultado = monedaConvertida * dolarHoy;
                        JOptionPane.showMessageDialog(null, "de $" + monedaConvertida + " dolares \n" + "tienes $ " + String.format("%.2f", resultado) + " Pesos Colombianos");
                       
                        break;
                    case "Peso Colombiano - YEN":
                        resultado = monedaConvertida / yenHoy;
                        JOptionPane.showMessageDialog(null, "de $" + monedaConvertida + " pesos \n" + "tienes 圓 " + String.format("%.2f", resultado) + " Yens Chino");

                        
                        break;

                    case "YEN - Peso Colombiano":
                        resultado = monedaConvertida * yenHoy;
                        JOptionPane.showMessageDialog(null, "de 圓" + monedaConvertida + " Yens Chinos \n" + "tienes $ " + String.format("%.2f", resultado) + " Pesos Colombianos");

                        break;

                    case "Peso Colombiano - Euros":
                        resultado = monedaConvertida / euroHoy;
                        JOptionPane.showMessageDialog(null, "de $" + monedaConvertida + " pesos \n" + "tienes € " + String.format("%.2f", resultado) + " Euros");

                        break;

                    case "Euros - Peso Colombiano":
                        resultado = monedaConvertida * euroHoy;
                        JOptionPane.showMessageDialog(null, "de €" + monedaConvertida + " Euros \n" + "tienes $ " + String.format("%.2f", resultado) + " Pesos Colombianos");

                        break;
                    case "Peso Colombiano - Rupia India":
                        resultado = monedaConvertida / rupiaIndiaHoy;
                        JOptionPane.showMessageDialog(null, "de $" + monedaConvertida + " Pesos \n" + "tienes ₹ " + String.format("%.2f", resultado) + " Rupias");

                        break;
                    case "Rupia India - Peso Colombiano":
                        resultado = monedaConvertida * rupiaIndiaHoy;
                        JOptionPane.showMessageDialog(null, "de ₹" + monedaConvertida + " Rupias \n" + "tienes $ " + String.format("%.2f", resultado) + " Pesos Colombianos");

                        break;
                    case "Peso Colombiano - Libra Esterlina":
                        resultado = monedaConvertida / libraEsterlinaHoy;
                        JOptionPane.showMessageDialog(null, "de $" + monedaConvertida + " Pesos \n" + "tienes £ " + String.format("%.2f", resultado) + " Libras");

                        break;
                    case "Libra Esterlina - Peso Colombiano":
                        resultado = monedaConvertida * libraEsterlinaHoy;
                        JOptionPane.showMessageDialog(null, "de £" + monedaConvertida + " Libras \n" + "tienes $ " + String.format("%.2f", resultado) + " Pesos Colombianos");

                        break;

                    default:
                        throw new AssertionError();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa Una Opción Válida");
            }
        }
    

    // GETTER Y SETTERS ///
    public double getPesos() {
        return monedaConvertida;
    }

    public void setPesos(double pesos) {
        this.monedaConvertida = pesos;
    }

}
