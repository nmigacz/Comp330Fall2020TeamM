package SwingUI;

import JavaClasses.Person;
import JavaClasses.Relationship;
import JavaClasses.TreeGenealogy;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Locale;
import java.util.Map;

import static SwingUI.TreeFuncs.setTreeFuncs;

public class EntryPage {
    private static JFrame entryPage;
    private JPanel EntryScreen;
    private JButton importFileButton;
    private JButton viewExistingButton;
    private JTextPane welcomeText;

    private String userFile;
    private static TreeGenealogy tg;
    private static Map<String, Person> people;
    private static Map<String, Relationship> relations;

    public EntryPage() {

        /* Adds a listener for button push "import file" */
        importFileButton.addActionListener(new ActionListener() {
            @Override
            // Allows a user to select a file from their system
            public void actionPerformed(ActionEvent e) {
                try {
                    readFile();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        /* Adds a listener for button "View Existing Trees" */
        viewExistingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame treeFuncs = new JFrame("View Existing Trees");
                treeFuncs.setContentPane(new TreeFuncs().$$$getRootComponent$$$());
                treeFuncs.pack();
                setTreeFuncs(treeFuncs);
                getEntryPage().setVisible(false);
                treeFuncs.setVisible(true);
            }
        });
    }

    public void readFile() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int result = fileChooser.showOpenDialog(EntryScreen);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            userFile = selectedFile.getAbsolutePath();
            System.out.println("Selected file: " + userFile);
        }
        String treeFile = (userFile);
        TreeGenealogy t = new TreeGenealogy(treeFile); //method calls: TG: loadData(String dataFileName)
        Map<String, Person> pm = t.getPeople(); //TG: getPeople()
        Map<String, Relationship> rm = t.getRelations(); //TG: getRelations()
        tg = t;
        people = pm;
        relations = rm;
        System.out.print("Successfully created family tree" + "\n");
    }

    public static TreeGenealogy getTree() {
        return tg;
    }

    public static Map<String, Person> getPeople() {
        return people;
    }

    public static void updatePeople(Map<String, Person> mp) {
        people = mp;
    }

    public static Map<String, Relationship> getRelations() {
        return relations;
    }

    public static void updateRelations(Map<String, Relationship> mr) {
        relations = mr;
    }

    public static void setEntryPage(JFrame frame) {
        entryPage = frame;
    }

    public static JFrame getEntryPage() {
        return entryPage;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree Genealogy App");
        frame.setContentPane(new EntryPage().EntryScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        setEntryPage(frame);
    }


    /////////////////////////////
    /* INTELLIJ GENERATED CODE */

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        EntryScreen = new JPanel();
        EntryScreen.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        EntryScreen.setBackground(new Color(-11688872));
        EntryScreen.setForeground(new Color(-16777216));
        EntryScreen.setMinimumSize(new Dimension(300, 200));
        EntryScreen.setPreferredSize(new Dimension(600, 400));
        EntryScreen.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), "Welcome to the Tree Genealogy App!", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.BELOW_TOP, this.$$$getFont$$$("Consolas", Font.BOLD, 20, EntryScreen.getFont()), new Color(-16777216)));
        importFileButton = new JButton();
        importFileButton.setBackground(new Color(-855310));
        importFileButton.setEnabled(true);
        Font importFileButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 16, importFileButton.getFont());
        if (importFileButtonFont != null) importFileButton.setFont(importFileButtonFont);
        importFileButton.setForeground(new Color(-16777216));
        importFileButton.setText("Create Tree from File");
        importFileButton.setToolTipText("Select a file to create a new tree");
        EntryScreen.add(importFileButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        viewExistingButton = new JButton();
        viewExistingButton.setBackground(new Color(-855310));
        viewExistingButton.setEnabled(true);
        Font viewExistingButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 16, viewExistingButton.getFont());
        if (viewExistingButtonFont != null) viewExistingButton.setFont(viewExistingButtonFont);
        viewExistingButton.setText("View Existing Tree");
        viewExistingButton.setToolTipText("Visualize, Edit, or Search your tree");
        EntryScreen.add(viewExistingButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        EntryScreen.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        welcomeText = new JTextPane();
        welcomeText.setBackground(new Color(-11688872));
        welcomeText.setEditable(false);
        Font welcomeTextFont = this.$$$getFont$$$("Consolas", Font.BOLD, 18, welcomeText.getFont());
        if (welcomeTextFont != null) welcomeText.setFont(welcomeTextFont);
        welcomeText.setText("What would you like to do?");
        EntryScreen.add(welcomeText, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        EntryScreen.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return EntryScreen;
    }

}