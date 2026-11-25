package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import nezet.NewJFrame;

public class Vezerlo {

    private NewJFrame nezet;

    public Vezerlo(NewJFrame nezet) {
        this.nezet = nezet;

        JButton btn1 = nezet.getBtnOszlop1();
        JButton btn2 = nezet.getBtnOszlop2();
        JButton btn3 = nezet.getBtnOszlop3();

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1. oszlop");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("2. oszlop");
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("3. oszlop");
            }
        });
    }
}
