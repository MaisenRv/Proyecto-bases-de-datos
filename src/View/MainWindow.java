package View;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame{
    // Constantes globales
    final private int MAIN_WINDOW_WIDTH = 500;
    final private int MAIN_WINDOW_HEIGHT = 500;
    final private String MAIN_WINDOW_TITLE = "Inventario de automoviles (por ahora 😀)";


    public MainWindow(){
        this.initSettings();
        this.initComponents();
        this.setVisible(true);
    }

    // Configuracion
    private void initSettings(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle(this.MAIN_WINDOW_TITLE);
        this.setSize(this.MAIN_WINDOW_WIDTH, this.MAIN_WINDOW_HEIGHT);
    }

    // Componentes que tiene la ventana (Botones, inpunts, etc)
    private void initComponents(){

    }
}
