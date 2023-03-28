package br.newtonpaiva.dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    public JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDiv, bMult, bSub, bAd, bIgual, bLimpar;
    public JFrame janela;
    public JPanel painel;
    public JTextField visor;
    public double leitura, memoria;
    public String operador;

    public void calculadora() {
        janela = new JFrame("Calculadora");
        janela.setSize(400, 400);

        visor = new JTextField(16);
        visor.setEditable(false);

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bDiv = new JButton("/");
        JButton bMult = new JButton("*");
        JButton bSub = new JButton("-");
        JButton bAd = new JButton("+");
        JButton bIgual = new JButton("=");
        JButton bLimpar = new JButton("C");

        painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4));
        painel.add(b7);
        painel.add(b8);
        painel.add(b9);
        painel.add(bDiv);
        painel.add(b4);
        painel.add(b5);
        painel.add(b6);
        painel.add(bMult);
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(bSub);
        painel.add(b0);
        painel.add(bLimpar);
        painel.add(bIgual);
        painel.add(bAd);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(visor, BorderLayout.NORTH);
        container.add(painel, BorderLayout.CENTER);

        janela.add(container);
        janela.setVisible(true);

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (leitura > 0)
                    leitura *= 10;
                leitura += 0;
                visor.setText(visor.getText() + b0.getText());
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                leitura *= 10;
                leitura += 1;
                visor.setText(visor.getText() + b1.getText());
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 2;
                visor.setText(visor.getText() + b2.getText());
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 3;
                visor.setText(visor.getText() + b3.getText());
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 4;
                visor.setText(visor.getText() + b4.getText());
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 5;
                visor.setText(visor.getText() + b5.getText());
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 6;
                visor.setText(visor.getText() + b6.getText());
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 7;
                visor.setText(visor.getText() + b7.getText());
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 8;
                visor.setText(visor.getText() + b8.getText());
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 9;
                visor.setText(visor.getText() + b9.getText());
            }
        });

        bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "/";
                memoria += leitura;
                leitura = 0;
                visor.setText("");
            }
        });

        bMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "*";
                memoria += leitura;
                leitura = 0;
                visor.setText("");
            }
        });

        bSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "-";
                memoria += leitura;
                leitura = 0;
                visor.setText("");
            }
        });

        bAd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "+";
                memoria += leitura;
                leitura = 0;
                visor.setText("");
            }
        });

        bIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operador == "+")
                    memoria += leitura;
                if (operador == "-")
                    memoria -= leitura;
                if (operador == "*")
                    memoria *= leitura;
                if (operador == "/")
                    memoria /= leitura;
                leitura = 0;
                visor.setText(""+ memoria);
            }
        });

        bLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura = 0;
                memoria = 0;
                visor.setText("");
            }
        });

    }
}
