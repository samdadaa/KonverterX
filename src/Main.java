import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {

    static JLabel textFeldIn = new JLabel("Zu transformierenden Text einfügen:");
    static JLabel textFeldOut = new JLabel("Konvertiereter Text:");
    static JTextField eingabeFeld = new JTextField();
    static JTextField ausgabeFeld = new JTextField();
    static JComboBox<String> dropDownOption = new JComboBox<>();

    public static void main(String[] args) {OpenGUI();}

    public static void OpenGUI()
    {
        Umwandeln umwandeln = new Umwandeln();
        JFrame frame = new JFrame("KonverterX");
        frame.setSize(400,500);
        frame.setLocation(100,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setBackground(Color.DARK_GRAY);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        eingabeFeld.setBounds(50,100,300,50);
        eingabeFeld.setFont(new Font("Roboto",Font.BOLD,14));
        eingabeFeld.setBackground(Color.GRAY);
        eingabeFeld.setForeground(Color.BLACK);

        ausgabeFeld.setBounds(50,270,300,50);
        ausgabeFeld.setFont(new Font("Roboto",Font.BOLD,14));
        ausgabeFeld.setEditable(false);
        ausgabeFeld.setBackground(Color.GRAY);
        ausgabeFeld.setForeground(Color.BLACK);

        textFeldOut.setBounds(55,250,300,30);
        textFeldOut.setForeground(Color.WHITE);

        textFeldIn.setBounds(55,80,300,30);
        textFeldIn.setForeground(Color.WHITE);

        Button button = new Button("konvertieren");
        button.setBounds(50,210,300,30);

        ImageIcon logo = new ImageIcon("Textumwandelns/icon/textfeld.png");



        dropDownOption.setBounds(50,20,300,50);
        dropDownOption.setBackground(Color.gray);
        dropDownOption.addItem("CamelCase");
        dropDownOption.addItem("GROSSBUCHSTABEN");
        dropDownOption.addItem("kleinbuchstaben");
        dropDownOption.addItem("RaNdOmCaSe");
        dropDownOption.addItem("KebabCase");
        dropDownOption.addItem("SnakeCase");
        dropDownOption.addItem("LeerZeichenEntfernen");
        dropDownOption.addItem("GrossSchreibung");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String dropdown = (String)dropDownOption.getSelectedItem();
                String methodeAusgabe = "";
                switch (dropdown)
                {
                    case "CamelCase": methodeAusgabe=  umwandeln.camelCase(eingabeFeld.getText());
                    break;
                    case "GROSSBUCHSTABEN" : methodeAusgabe= umwandeln.grossBuchstaben(eingabeFeld.getText());
                    break;
                    case "kleinbuchstaben": methodeAusgabe= umwandeln.kleinBuchstaben(eingabeFeld.getText());
                        break;
                    case "RaNdOmCaSe" :methodeAusgabe=  umwandeln.randomCase(eingabeFeld.getText());
                        break;
                    case "KebabCase": methodeAusgabe= umwandeln.kebabCase(eingabeFeld.getText());
                        break;
                    case "SnakeCase":methodeAusgabe=  umwandeln.snakeCase(eingabeFeld.getText());
                        break;
                    case "LeerZeichenEntfernen":methodeAusgabe=  umwandeln.leerZeilenEntfernen(eingabeFeld.getText());
                        break;
                    case "GrossSchreibung":methodeAusgabe=  umwandeln.grossSchreibung(eingabeFeld.getText());

                }
                ausgabeFeld.setText(methodeAusgabe);
            }
        });

        frame.add(dropDownOption);
        frame.add(button);
        frame.add(textFeldIn);
        frame.add(textFeldOut);
        frame.add(eingabeFeld);
        frame.add(ausgabeFeld);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setIconImage(logo.getImage());
    }


    }
