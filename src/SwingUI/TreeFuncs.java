package SwingUI;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import static SwingUI.TreeEdit.setTreeEdit;
import static SwingUI.TreeSearch.setTreeSearch;
import static SwingUI.TreeVisuals.setTreeVisuals;

public class TreeFuncs extends EntryPage {
    private static JFrame treeFuncs;
    private JPanel TreeFuncs;
    private JButton visualizeTree;
    private JButton editTree;
    private JButton searchTree;
    private JButton backButton;

    public TreeFuncs() {

        /* Action Listener for button Visualize Tree */
        visualizeTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame treeVisuals = new JFrame("Visualize Tree");
                treeVisuals.setContentPane(new TreeVisuals().$$$getRootComponent$$$());
                treeVisuals.pack();
                setTreeVisuals(treeVisuals);
                getTreeFuncs().setVisible(false);
                treeVisuals.setVisible(true);
            }
        });

        /* Action Listener for button Edit Tree */
        editTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame treeEdit = new JFrame("Edit Tree");
                treeEdit.setContentPane(new TreeEdit().$$$getRootComponent$$$());
                treeEdit.pack();
                setTreeEdit(treeEdit);
                getTreeFuncs().setVisible(false);
                treeEdit.setVisible(true);
            }
        });

        /* Action Listener for button Search Tree */
        searchTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame treeSearch = new JFrame("Search Tree");
                treeSearch.setContentPane(new TreeSearch().$$$getRootComponent$$$());
                treeSearch.pack();
                setTreeSearch(treeSearch);
                getTreeFuncs().setVisible(false);
                treeSearch.setVisible(true);
            }
        });

        /* Action Listener for button Cancel */
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame entryPage = getEntryPage();
                getTreeFuncs().setVisible(false);
                entryPage.setVisible(true);
            }
        });
    }

    public static void setTreeFuncs(JFrame frame) {
        treeFuncs = frame;
    }

    public static JFrame getTreeFuncs() {
        return treeFuncs;
    }


    /////////////////////////
    /* INTELLIJ ADDED CODE */

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
        TreeFuncs = new JPanel();
        TreeFuncs.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
        TreeFuncs.setBackground(new Color(-3040113));
        Font TreeFuncsFont = this.$$$getFont$$$(null, -1, -1, TreeFuncs.getFont());
        if (TreeFuncsFont != null) TreeFuncs.setFont(TreeFuncsFont);
        TreeFuncs.setPreferredSize(new Dimension(600, 400));
        TreeFuncs.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), "View Existing Tree", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.BELOW_TOP, this.$$$getFont$$$("Consolas", Font.BOLD, 20, TreeFuncs.getFont()), new Color(-16777216)));
        visualizeTree = new JButton();
        visualizeTree.setBackground(new Color(-855310));
        Font visualizeTreeFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 16, visualizeTree.getFont());
        if (visualizeTreeFont != null) visualizeTree.setFont(visualizeTreeFont);
        visualizeTree.setText("Visualize Tree");
        visualizeTree.setToolTipText("Present a visual of your tree");
        TreeFuncs.add(visualizeTree, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        editTree = new JButton();
        editTree.setBackground(new Color(-855310));
        Font editTreeFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 16, editTree.getFont());
        if (editTreeFont != null) editTree.setFont(editTreeFont);
        editTree.setText("Edit Tree");
        editTree.setToolTipText("Add new people, add new relationships, and edit existing relationships");
        TreeFuncs.add(editTree, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        searchTree = new JButton();
        searchTree.setBackground(new Color(-855310));
        Font searchTreeFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 16, searchTree.getFont());
        if (searchTreeFont != null) searchTree.setFont(searchTreeFont);
        searchTree.setText("Search Tree");
        searchTree.setToolTipText("Search for people and relationships");
        TreeFuncs.add(searchTree, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        TreeFuncs.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        TreeFuncs.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        backButton = new JButton();
        backButton.setBackground(new Color(-855310));
        Font backButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 14, backButton.getFont());
        if (backButtonFont != null) backButton.setFont(backButtonFont);
        backButton.setText("Back");
        backButton.setToolTipText("Return to previous window");
        TreeFuncs.add(backButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        TreeFuncs.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        TreeFuncs.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
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
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return TreeFuncs;
    }

}
