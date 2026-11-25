package app;

import nezet.NewJFrame;
import vezerlo.Vezerlo;

public class Program {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame nezet = new NewJFrame();

                Vezerlo vezerlo = new Vezerlo(nezet);

                nezet.setVisible(true);
            }
        });
    }
}
