import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.sql.*;

public class MyFirstForm extends JFrame {

    // Colors
    Color backgroundColor = new Color(245, 247, 255);
    Color cardColor = Color.WHITE;
    Color primaryColor = new Color(92, 84, 184);
    Color darkColor = new Color(70, 63, 150);
    Color textColor = new Color(45, 45, 65);
    Color subTextColor = new Color(110, 110, 130);
    Color borderColor = new Color(220, 222, 240);

    // Text fields
    JTextField nameField;
    JTextField regField;

    // ComboBox
    JComboBox<String> branchBox;

    // Blood group
    JRadioButton oPositive;
    JRadioButton oNegative;
    JRadioButton aPositive;
    JRadioButton aNegative;
    JRadioButton bPositive;
    JRadioButton bNegative;
    JRadioButton abPositive;
    JRadioButton abNegative;

    // Hobbies
    JCheckBox reading;
    JCheckBox singing;
    JCheckBox dancing;
    JCheckBox gaming;

    // Button
    JButton submitButton;


    // ================= CONSTRUCTOR =================

    public MyFirstForm() {

        setTitle("Student Registration");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        // ================= MAIN BACKGROUND =================

        JPanel background = new JPanel(new BorderLayout());

        background.setBackground(backgroundColor);

        background.setBorder(
            BorderFactory.createEmptyBorder(
                30, 60, 30, 60
            )
        );


        // ================= HEADER =================

        JPanel header = new JPanel();

        header.setLayout(
            new BoxLayout(header, BoxLayout.Y_AXIS)
        );

        header.setOpaque(false);


        JLabel title = new JLabel("STUDENT FORM");

        title.setFont(
            new Font("Segoe UI", Font.BOLD, 28)
        );

        title.setForeground(primaryColor);

        title.setAlignmentX(
            Component.CENTER_ALIGNMENT
        );


        JLabel subtitle =
            new JLabel("Enter your details below");

        subtitle.setFont(
            new Font("Segoe UI", Font.PLAIN, 14)
        );

        subtitle.setForeground(subTextColor);

        subtitle.setAlignmentX(
            Component.CENTER_ALIGNMENT
        );


        header.add(title);

        header.add(
            Box.createVerticalStrut(5)
        );

        header.add(subtitle);


        background.add(
            header,
            BorderLayout.NORTH
        );


        // ================= FORM CARD =================

        JPanel card = new JPanel(
            new GridBagLayout()
        );

        card.setBackground(cardColor);

        card.setBorder(
            new CompoundBorder(
                new LineBorder(
                    borderColor,
                    1,
                    true
                ),
                new EmptyBorder(
                    25, 30, 25, 30
                )
            )
        );


        GridBagConstraints gbc =
            new GridBagConstraints();

        gbc.insets =
            new Insets(10, 10, 10, 10);

        gbc.fill =
            GridBagConstraints.HORIZONTAL;

        gbc.anchor =
            GridBagConstraints.WEST;


        // ================= NAME =================

        JLabel nameLabel =
            createLabel("Name:");

        nameField =
            new JTextField();

        styleTextField(nameField);

        addRow(
            card,
            gbc,
            0,
            nameLabel,
            nameField
        );


        // ================= REG NO =================

        JLabel regLabel =
            createLabel("Reg No:");

        regField =
            new JTextField();

        styleTextField(regField);

        addRow(
            card,
            gbc,
            1,
            regLabel,
            regField
        );


        // ================= BRANCH =================

        JLabel branchLabel =
            createLabel("Branch:");


        String[] branches = {
            "CSE",
            "CSE-DS",
            "ECE",
            "EEE",
            "ME",
            "CE"
        };


        branchBox =
            new JComboBox<>(branches);

        branchBox.setFont(
            new Font(
                "Segoe UI",
                Font.PLAIN,
                14
            )
        );

        branchBox.setPreferredSize(
            new Dimension(400, 38)
        );


        addRow(
            card,
            gbc,
            2,
            branchLabel,
            branchBox
        );


        // ================= BLOOD GROUP =================

        JLabel bloodLabel =
            createLabel("Blood Group:");


        oPositive =
            new JRadioButton("O+");

        oNegative =
            new JRadioButton("O-");

        aPositive =
            new JRadioButton("A+");

        aNegative =
            new JRadioButton("A-");

        bPositive =
            new JRadioButton("B+");

        bNegative =
            new JRadioButton("B-");

        abPositive =
            new JRadioButton("AB+");

        abNegative =
            new JRadioButton("AB-");


        // Group radio buttons

        ButtonGroup bloodGroup =
            new ButtonGroup();

        bloodGroup.add(oPositive);
        bloodGroup.add(oNegative);

        bloodGroup.add(aPositive);
        bloodGroup.add(aNegative);

        bloodGroup.add(bPositive);
        bloodGroup.add(bNegative);

        bloodGroup.add(abPositive);
        bloodGroup.add(abNegative);


        JPanel bloodPanel =
            new JPanel(
                new FlowLayout(
                    FlowLayout.LEFT,
                    5,
                    0
                )
            );

        bloodPanel.setOpaque(false);


        JRadioButton[] bloodButtons = {
            oPositive,
            oNegative,
            aPositive,
            aNegative,
            bPositive,
            bNegative,
            abPositive,
            abNegative
        };


        for (JRadioButton button :
             bloodButtons) {

            button.setFont(
                new Font(
                    "Segoe UI",
                    Font.PLAIN,
                    13
                )
            );

            button.setForeground(
                textColor
            );

            button.setOpaque(false);

            bloodPanel.add(button);
        }


        addRow(
            card,
            gbc,
            3,
            bloodLabel,
            bloodPanel
        );


        // ================= HOBBIES =================

        JLabel hobbyLabel =
            createLabel("Hobbies:");


        reading =
            createCheckBox("Reading");

        singing =
            createCheckBox("Singing");

        dancing =
            createCheckBox("Dancing");

        gaming =
            createCheckBox("Gaming");


        JPanel hobbyPanel =
            new JPanel(
                new FlowLayout(
                    FlowLayout.LEFT,
                    5,
                    0
                )
            );

        hobbyPanel.setOpaque(false);


        hobbyPanel.add(reading);
        hobbyPanel.add(singing);
        hobbyPanel.add(dancing);
        hobbyPanel.add(gaming);


        addRow(
            card,
            gbc,
            4,
            hobbyLabel,
            hobbyPanel
        );


        // ================= SUBMIT =================

        submitButton =
            new JButton("SUBMIT");


        submitButton.setFont(
            new Font(
                "Segoe UI",
                Font.BOLD,
                15
            )
        );


        submitButton.setForeground(
            Color.WHITE
        );


        submitButton.setBackground(
            primaryColor
        );


        submitButton.setFocusPainted(false);


        submitButton.setBorder(
            new EmptyBorder(
                10, 50, 10, 50
            )
        );


        submitButton.setCursor(
            new Cursor(
                Cursor.HAND_CURSOR
            )
        );


        JPanel buttonPanel =
            new JPanel(
                new FlowLayout(
                    FlowLayout.CENTER
                )
            );

        buttonPanel.setOpaque(false);


        buttonPanel.setBorder(
            new EmptyBorder(
                15, 0, 0, 0
            )
        );


        buttonPanel.add(
            submitButton
        );


        // ================= CENTER PANEL =================

        JPanel centerPanel =
            new JPanel(
                new BorderLayout()
            );

        centerPanel.setOpaque(false);


        centerPanel.add(
            card,
            BorderLayout.CENTER
        );


        centerPanel.add(
            buttonPanel,
            BorderLayout.SOUTH
        );


        background.add(
            centerPanel,
            BorderLayout.CENTER
        );


        // ================= BUTTON EVENT =================

        submitButton.addActionListener(
            e -> insertData()
        );


        // ================= HOVER EFFECT =================

        submitButton.addMouseListener(
            new java.awt.event.MouseAdapter() {

                @Override
                public void mouseEntered(
                    java.awt.event.MouseEvent e) {

                    submitButton.setBackground(
                        darkColor
                    );
                }


                @Override
                public void mouseExited(
                    java.awt.event.MouseEvent e) {

                    submitButton.setBackground(
                        primaryColor
                    );
                }
            }
        );


        add(background);

        setVisible(true);
    }


    // =================================================
    // CREATE LABEL
    // =================================================

    JLabel createLabel(String text) {

        JLabel label =
            new JLabel(text);

        label.setFont(
            new Font(
                "Segoe UI",
                Font.BOLD,
                14
            )
        );

        label.setForeground(
            textColor
        );

        return label;
    }


    // =================================================
    // TEXT FIELD STYLE
    // =================================================

    void styleTextField(
        JTextField field) {

        field.setFont(
            new Font(
                "Segoe UI",
                Font.PLAIN,
                14
            )
        );


        field.setPreferredSize(
            new Dimension(
                400,
                38
            )
        );


        field.setBorder(
            new CompoundBorder(
                new LineBorder(
                    borderColor,
                    1,
                    true
                ),
                new EmptyBorder(
                    5, 10, 5, 10
                )
            )
        );
    }


    // =================================================
    // CREATE CHECKBOX
    // =================================================

    JCheckBox createCheckBox(
        String text) {

        JCheckBox box =
            new JCheckBox(text);

        box.setFont(
            new Font(
                "Segoe UI",
                Font.PLAIN,
                13
            )
        );

        box.setForeground(
            textColor
        );

        box.setOpaque(false);

        return box;
    }


    // =================================================
    // ADD ROW
    // =================================================

    void addRow(
        JPanel panel,
        GridBagConstraints gbc,
        int row,
        Component label,
        Component field) {


        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.weightx = 0;


        panel.add(
            label,
            gbc
        );


        gbc.gridx = 1;
        gbc.weightx = 1;


        panel.add(
            field,
            gbc
        );
    }


    // =================================================
    // INSERT DATA INTO MYSQL
    // =================================================

    void insertData() {

        String name =
            nameField.getText().trim();


        String regNo =
            regField.getText().trim();


        String branch =
            (String)
            branchBox.getSelectedItem();


        // ================= VALIDATION =================

        if (name.isEmpty() ||
            regNo.isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Please enter Name and Registration Number.",
                "Missing Information",
                JOptionPane.WARNING_MESSAGE
            );

            return;
        }


        // ================= BLOOD GROUP =================

        String blood = "";


        if (oPositive.isSelected())
            blood = "O+";

        else if (oNegative.isSelected())
            blood = "O-";

        else if (aPositive.isSelected())
            blood = "A+";

        else if (aNegative.isSelected())
            blood = "A-";

        else if (bPositive.isSelected())
            blood = "B+";

        else if (bNegative.isSelected())
            blood = "B-";

        else if (abPositive.isSelected())
            blood = "AB+";

        else if (abNegative.isSelected())
            blood = "AB-";


        // ================= HOBBIES =================

        String hobbies = "";


        if (reading.isSelected())
            hobbies += "Reading ";

        if (singing.isSelected())
            hobbies += "Singing ";

        if (dancing.isSelected())
            hobbies += "Dancing ";

        if (gaming.isSelected())
            hobbies += "Gaming";


        // ================= JDBC =================

        try {

            // Step 1: Load Driver

            Class.forName(
                "com.mysql.cj.jdbc.Driver"
            );


            // Step 2: Establish Connection

            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "Vani@9510"
                );


            System.out.println(
                "Connection Successful"
            );


            // Step 3: SQL Query

            String sql =
                "INSERT INTO student " +
                "(name, reg_no, branch, blood_group, hobbies) " +
                "VALUES (?, ?, ?, ?, ?)";


            // Step 4: PreparedStatement

            PreparedStatement pst =
                con.prepareStatement(sql);


            // Step 5: Set values

            pst.setString(
                1,
                name
            );

            pst.setString(
                2,
                regNo
            );

            pst.setString(
                3,
                branch
            );

            pst.setString(
                4,
                blood
            );

            pst.setString(
                5,
                hobbies
            );


            // Step 6: Execute

            int rows =
                pst.executeUpdate();


            // Step 7: Check result

            if (rows > 0) {

                JOptionPane.showMessageDialog(
                    this,
                    "Student data inserted successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }


            // Step 8: Close

            pst.close();
            con.close();


            // Clear form

            clearForm();


        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                this,
                "Database Error:\n" +
                e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );

            e.printStackTrace();
        }
    }


    // =================================================
    // CLEAR FORM
    // =================================================

    void clearForm() {

        nameField.setText("");

        regField.setText("");

        branchBox.setSelectedIndex(0);


        oPositive.setSelected(false);
        oNegative.setSelected(false);

        aPositive.setSelected(false);
        aNegative.setSelected(false);

        bPositive.setSelected(false);
        bNegative.setSelected(false);

        abPositive.setSelected(false);
        abNegative.setSelected(false);


        reading.setSelected(false);
        singing.setSelected(false);
        dancing.setSelected(false);
        gaming.setSelected(false);
    }


    // =================================================
    // MAIN METHOD
    // =================================================

    public static void main(
        String[] args) {

        SwingUtilities.invokeLater(
            () -> new MyFirstForm()
        );
    }
}