package com.aluraoracle.conversormoeda;

import javax.swing.JOptionPane;

/*
    Classe onde tem os métodos com a lógica para conversão de cada moeda 
    selecionada e validação para verificar se o input  tem apenas numeros.
*/

public class Funcoes {

    static String valor = "";
    static String alert;
    static double valorReal;
    static double reais;
    static double result;
    static boolean soNumeros = true;
    static String aux = null;

    public static void ReaisparaEuro() {

        valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Euros:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");

        } else if (valor.matches("\\d+")) {

            valorReal = Double.parseDouble(valor);

            double euro = valorReal / 5.0643;

            result = Math.round(euro * 100d) / 100;

            alert = "O valor em Euro é: " + result;

            JOptionPane.showMessageDialog(null, alert);

        }
    }

    public static void ReaisparaDólar() {

        valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Dólar");
        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");

        } else if (valor.matches("\\d+")) {

            valorReal = Double.parseDouble(valor);

            double dolar = valorReal / 5.0544;

            valorReal = Double.parseDouble(valor);

            result = Math.round(dolar * 100d) / 100;

            alert = "O valor em Dólar é: " + result;

            JOptionPane.showMessageDialog(null, alert);
        }

    }

    public static void ReaisparaPesoArgentino() {

        valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Peso Argentino:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {

            valorReal = Double.parseDouble(valor);

            double argentino = valorReal / 0.0380;

            result = Math.round(argentino * 100d) / 100;

            alert = "O valor em Peso Argentino é: " + result;

            JOptionPane.showMessageDialog(null, alert);

        }
    }

    public static void ReaisparaPesoChileno() {

        valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Peso Chileno:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {

            valorReal = Double.parseDouble(valor);

            double chileno = valorReal / 0.004518;

            result = Math.round(chileno * 100d) / 100;

            alert = "O valor em Peso Chileno é: " + result;

            JOptionPane.showMessageDialog(null, alert);
        }
    }

    public static void ReaisparaLibrasEsterlinas() {

        valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Libras Esterlinas:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {
            valorReal = Double.parseDouble(valor);

            double libra = valorReal / 0.0255;

            result = Math.round(libra * 100d) / 100;

            alert = "O valor em Libras Esterlinas  é: " + result;

            JOptionPane.showMessageDialog(null, alert);
        }
    }

    public static void EuroparaReais() {

        valor = JOptionPane.showInputDialog("Digite o valor em Euro que deseja converter para Reais:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {

            double valorEuro = Double.parseDouble(valor);

            reais = valorEuro * 5.25;

            result = Math.round(reais * 100d) / 100;

            alert = "O valor em Reais é: " + result;

            JOptionPane.showMessageDialog(null, alert);
        }
    }

    public static void DólarparaReais() {

        valor = JOptionPane.showInputDialog("Digite o valor em Dólares que deseja converter para Reais:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {

            double valorDolar = Double.parseDouble(valor);

            reais = valorDolar * 5.15;

            result = Math.round(reais * 100d) / 100;

            alert = "O valor em Reais é: " + result;

            JOptionPane.showMessageDialog(null, alert);

        }
    }

    public static void PesoArgentinoparaReais() {

        valor = JOptionPane.showInputDialog("Digite o valor em Peso Argentino que deseja converter para Reais:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {

            double valorArgentino = Double.parseDouble(valor);

            reais = 0.032;

            result = valorArgentino * reais;

            alert = "O valor em Reais é: " + result;

            JOptionPane.showMessageDialog(null, alert);

        }
    }

    public static void LibrasEsterlinasparaReais() {

        valor = JOptionPane.showInputDialog("Digite o valor em Libras Esterlinas que deseja converter para Reais:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {

            double valorLibra = Double.parseDouble(valor);

            reais = valorLibra * 0.033;

            result = Math.round(reais * 100d) / 100;

            alert = "O valor em Reais é: " + result;

            JOptionPane.showMessageDialog(null, alert);

        }
    }

    public static void PesoChilenoparaReais() {
        valor = JOptionPane.showInputDialog("Digite o valor em Peso Chileno que deseja converter para Reais:");

        if (!valor.matches("\\d+")) {

            soNumeros = false;
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        } else if (valor.matches("\\d+")) {

            double valorChileno = Double.parseDouble(valor);

            reais = 0.0052;

            result = Math.round(valorChileno * reais);

            alert = "O valor em Reais é: " + result;

            JOptionPane.showMessageDialog(null, alert);

        }
    }

}
