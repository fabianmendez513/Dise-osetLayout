package  vistas ;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel {

    private JPanel panelLogin;

    public LoginPanel(){
        panelLogin = new JPanel();
        panelLogin.setSize(500 , 800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground (Color.PINK);

        JLabel titulo = new JLabel("Login");
        panelLogin.add(titulo);

        JTextField entradacorreo = new JTextField("");
        panelLogin.add(entradacorreo);

        JPasswordField entradaContraseña = new JPasswordField();
        entradaContraseña.setSize(new Dimension(100,50));
        panelLogin.add(entradaContraseña);


    }

    public JPanel getPanel(){
        return panelLogin;
    }

}