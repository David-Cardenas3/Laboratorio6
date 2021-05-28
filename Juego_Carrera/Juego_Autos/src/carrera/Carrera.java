package carrera;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread {

    private JLabel etiqueta;
    private Interfaz auto;

    public Carrera(JLabel etiqueta, Interfaz auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    long TTotal1 = 1;
    long TTotal2 = 1;
    long TTotal3 = 1;
    long TTotal4 = 1;
    long TTotal5 = 1;
    long TTotal6 = 1;
    long TTotal7 = 1;
    long TTotal8 = 1;
    long TTotal9 = 1;
    long TTotal10 = 1;
    

    @Override
    public void run() {

        int auto1 = 0;
        int auto2 = 0;
        int auto3 = 0;
        int auto4 = 0;
        int auto5 = 0;
        int auto6 = 0;
        int auto7 = 0;
        int auto8 = 0;
        int auto9 = 0;
        int auto10 = 0;

        long TInicio = System.currentTimeMillis();
        

        while (true) {
            try {

                sleep((int) (Math.random() * 1000));
                auto1 = auto.getAuto_1().getLocation().x;
                auto2 = auto.getAuto_2().getLocation().x;
                auto3 = auto.getAuto_3().getLocation().x;
                auto4 = auto.getAuto_4().getLocation().x;
                auto5 = auto.getAuto_5().getLocation().x;
                auto6 = auto.getAuto_6().getLocation().x;
                auto7 = auto.getAuto_7().getLocation().x;
                auto8 = auto.getAuto_8().getLocation().x;
                auto9 = auto.getAuto_9().getLocation().x;
                auto10 = auto.getAuto_10().getLocation().x;

                if (auto1 < auto.getBarrera().getLocation().x - 125 || auto2 < auto.getBarrera().getLocation().x - 125 || auto3 < auto.getBarrera().getLocation().x - 125
                        || auto4 < auto.getBarrera().getLocation().x - 125 || auto5 < auto.getBarrera().getLocation().x - 125 || auto6 < auto.getBarrera().getLocation().x - 125
                        || auto7 < auto.getBarrera().getLocation().x - 125 || auto8 < auto.getBarrera().getLocation().x - 125 || auto9 < auto.getBarrera().getLocation().x - 125
                        || auto10 < auto.getBarrera().getLocation().x - 125) {

                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    auto.repaint();

                } else {
                    break;
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
            /*if (auto1 > auto.getBarrera().getLocation().x - 125) {
                
                long TFinal1 = 0;
                
                TFinal1 = System.currentTimeMillis();
                TTotal1 = TFinal1 - TInicio;
            }
            if (auto2 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal2 = 0;
                
                TFinal2 = System.currentTimeMillis();
                TTotal2 = TFinal2 - TInicio;
            }
            if (auto3 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal3 = 0;
                
                TFinal3 = System.currentTimeMillis();
                TTotal3 = TFinal3 - TInicio;
            }
            if (auto4 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal4 = 0;
                
                TFinal4 = System.currentTimeMillis();
                TTotal4 = TFinal4 - TInicio;
            }
            if (auto5 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal5 = 0;
                
                TFinal5 = System.currentTimeMillis();
                TTotal5 = TFinal5 - TInicio;
            }
            if (auto6 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal6 = 0;
                
                TFinal6 = System.currentTimeMillis();
                TTotal6 = TFinal6 - TInicio;
            }
            if (auto7 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal7 = 0;
                
                TFinal7 = System.currentTimeMillis();
                TTotal7 = TFinal7 - TInicio;
            }
            if (auto8 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal8 = 0;
                
                TFinal8 = System.currentTimeMillis();
                TTotal8 = TFinal8 - TInicio;
            }
            if (auto9 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal9 = 0;
                
                TFinal9 = System.currentTimeMillis();
                TTotal9 = TFinal9 - TInicio;
            }
            if (auto10 == auto.getBarrera().getLocation().x - 125) {
                
                long TFinal10 = 0;
                
                TFinal10 = System.currentTimeMillis();
                TTotal10 = TFinal10 - TInicio;
            }*/

                if (etiqueta.getLocation().x >= auto.getBarrera().getLocation().x - 125) {

                if (auto1 > auto2 && auto1 > auto3 && auto1 > auto4 && auto1 > auto5 && auto1 > auto6 && auto1 > auto7
                        && auto1 > auto8 && auto1 > auto9 && auto1 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el primer auto");
                    
                } else if (auto2 > auto1 && auto2 > auto3 && auto2 > auto4 && auto2 > auto5 && auto2 > auto6 && auto2 > auto7
                        && auto2 > auto8 && auto2 > auto9 && auto2 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el segundo auto");
                    
                } else if (auto3 > auto1 && auto3 > auto2 && auto3 > auto4 && auto3 > auto5 && auto3 > auto6 && auto3 > auto7
                        && auto3 > auto8 && auto3 > auto9 && auto3 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Tercer auto");
                    
                } else if (auto4 > auto1 && auto4 > auto2 && auto4 > auto3 && auto4 > auto5 && auto4 > auto6 && auto4 > auto7
                        && auto4 > auto8 && auto4 > auto9 && auto4 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Cuarto auto");
                    
                } else if (auto5 > auto1 && auto5 > auto2 && auto5 > auto3 && auto5 > auto4 && auto5 > auto6 && auto5 > auto7
                        && auto5 > auto8 && auto5 > auto9 && auto5 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Quinto auto");
                    
                } else if (auto6 > auto1 && auto6 > auto2 && auto6 > auto3 && auto6 > auto4 && auto6 > auto5 && auto6 > auto7
                        && auto6 > auto8 && auto6 > auto9 && auto6 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Sexto auto");
                    
                } else if (auto7 > auto1 && auto7 > auto2 && auto7 > auto3 && auto7 > auto4 && auto7 > auto5 && auto7 > auto6
                        && auto7 > auto8 && auto7 > auto9 && auto7 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Septimo auto");
                    
                } else if (auto8 > auto1 && auto8 > auto2 && auto8 > auto3 && auto8 > auto4 && auto8 > auto5 && auto8 > auto6
                        && auto8 > auto7 && auto8 > auto9 && auto8 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Octavo auto");
                    
                } else if (auto9 > auto1 && auto9 > auto2 && auto9 > auto3 && auto9 > auto4 && auto9 > auto5 && auto9 > auto6
                        && auto9 > auto7 && auto9 > auto8 && auto9 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Noveno auto");
                    
                } else if (auto10 > auto1 && auto10 > auto2 && auto10 > auto3 && auto10 > auto4 && auto10 > auto5 && auto10 > auto6
                        && auto10 > auto7 && auto10 > auto8 && auto10 > auto9) {
                    JOptionPane.showMessageDialog(null, "Gano el Decimo auto");
                    
                } else {
                    JOptionPane.showMessageDialog(null, " Perdedores ");
                }
                
            }
        }

    }
}
