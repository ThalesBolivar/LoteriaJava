package lotofacilInterface;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LotofacilInterface extends JFrame {
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");

    // Construtor
    public LotofacilInterface() {
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));

        painel.add(jButtonAposta1);

        // Adicionando ActionListener ao jButtonAposta1
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });

        painel.add(jButtonAposta2);

        // Adicionando ActionListener ao jButtonAposta2
        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });
        painel.add(jButtonAposta3);

        // Adicionando ActionListener ao jButtonAposta3
        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }
    private void aposta1() {
        String aposta = JOptionPane.showInputDialog(null, "Digite um numero de 0 a 100");

        try {
            int numeroAposta = Integer.parseInt(aposta);
            if (numeroAposta == (int) (Math.random() * 101)) { // Suponha que este seja o critério de vitória
                JOptionPane.showMessageDialog(null, "Você venceu!");
            } else {
                JOptionPane.showMessageDialog(null, "Você não venceu. Tente novamente.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
        }
    }

    private void aposta2() {
        String aposta = JOptionPane.showInputDialog(null, "Apostar de A a Z");
        if (aposta == null || aposta.length() != 1 || !Character.isLetter(aposta.charAt(0))) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma única letra de A a Z.");
            return;
        }
        char letraAposta = Character.toUpperCase(aposta.charAt(0));
        char letraFixa = 'T'; // Aqui definimos a letra fixa
        if (letraAposta == letraFixa) {
            JOptionPane.showMessageDialog(null, "Você venceu!");
        } else {
            JOptionPane.showMessageDialog(null, "Você não venceu. A letra correta era " + letraFixa + ".");
        }
    }


    private void aposta3() {

        try {
            String input = JOptionPane.showInputDialog(null, "Digite um número:");

            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
                return;
            }

            int numero = Integer.parseInt(input);
            String resultado = (numero % 2 == 0) ? "par" : "ímpar";

            JOptionPane.showMessageDialog(null, "O número " + numero + " é " + resultado + ".");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
        }
    }

    public static void main(String[] args) {
        new LotofacilInterface();
    }

    public static class Main {

            }
}