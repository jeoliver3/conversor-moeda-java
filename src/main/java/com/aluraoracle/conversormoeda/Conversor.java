package com.aluraoracle.conversormoeda;

import javax.swing.JOptionPane;


/*
    Classe que possui o menu de seleção de moeda, com switch case tem a chamada
    dos métodos que implementam a lógica de conversão e após finalizar, chama
    o método continuar(), caso deseje converter mais alguma moeda.

 */
public class Conversor extends Funcoes {

    public static void convertendo() {

        String menu;

        menu = (JOptionPane.showInputDialog(null, "Escolha a moeda para converter : ",
                "Moedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                    "Reais para Euro",
                    "Reais para Dólar",
                    "Reais para Peso Argentino",
                    "Reais para Libras Esterlinas",
                    "Reais para Peso Chileno",
                    "Euro para Reais",
                    "Dólar para Reais",
                    "Peso Argentino para Reais",
                    "Libras Esterlinas para Reais",
                    "Peso Chileno para Reais"

                },
                "")).toString();

        switch (menu) {
            case "Reais para Euro": {
                ReaisparaEuro();

            }

            continuar();
            break;

            case "Reais para Dólar": {

                ReaisparaDólar();
            }
            continuar();
            break;

            case "Reais para Peso Argentino": {

                ReaisparaPesoArgentino();
            }

            continuar();
            break;

            case "Reais para Peso Chileno": {

                ReaisparaPesoChileno();
            }

            continuar();
            break;

            case "Reais para Libras Esterlinas": {

                ReaisparaLibrasEsterlinas();
            }

            continuar();
            break;

            case "Euro para Reais": {

                EuroparaReais();
            }

            continuar();
            break;

            case "Dólar para Reais": {

                DólarparaReais();
            }

            continuar();
            break;

            case "Peso Argentino para Reais": {

                PesoArgentinoparaReais();

            }

            continuar();
            break;

            case "Libras Esterlinas para Reais": {

                LibrasEsterlinasparaReais();
            }

            continuar();
            break;

            case "Peso Chileno para Reais": {

                PesoChilenoparaReais();
            }

            continuar();
        }

    }

    public static void continuar() {

        String alertContinuar = "Deseja continuar?";

        int valida = JOptionPane.showConfirmDialog(null, alertContinuar);

        if (valida == JOptionPane.YES_OPTION) {
            convertendo();
        } else if (valida == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
        } else if (valida == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa concluído");
        }
    }

}
