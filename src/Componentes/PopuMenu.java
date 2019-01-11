package Componentes;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.UIManager;

public class PopuMenu {

    public static void setCustomize(Color Background, Color Foreground, Color SelectionBackground, Color SelectionForeground) {
        UIManager.put("MenuItem.background", Background);
        UIManager.put("MenuItem.border", BorderFactory.createEmptyBorder(10, 10, 10, 10));
        UIManager.put("MenuItem.disabledForeground", new Color(0, 0, 0, 100));
        UIManager.put("MenuItem.selectionBackground", SelectionBackground);
        UIManager.put("MenuItem.selectionForeground", SelectionForeground);
        UIManager.put("MenuItem.foreground", Foreground);

        UIManager.put("CheckBoxMenuItem.background", Background);
        UIManager.put("CheckBoxMenuItem.border", BorderFactory.createEmptyBorder(10, 10, 10, 10));
        UIManager.put("CheckBoxMenuItem.disabledForeground", new Color(0, 0, 0, 100));
        UIManager.put("CheckBoxMenuItem.selectionBackground", SelectionBackground);
        UIManager.put("CheckBoxMenuItem.selectionForeground", SelectionForeground);
        UIManager.put("CheckBoxMenuItem.foreground", Foreground);

        UIManager.put("RadioButtonMenuItem.background", Background);
        UIManager.put("RadioButtonMenuItem.border", BorderFactory.createEmptyBorder(10, 10, 10, 10));
        UIManager.put("RadioButtonMenuItem.disabledForeground", new Color(0, 0, 0, 100));
        UIManager.put("RadioButtonMenuItem.selectionBackground", SelectionBackground);
        UIManager.put("RadioButtonMenuItem.selectionForeground", SelectionForeground);
        UIManager.put("RadioButtonMenuItem.foreground", Foreground);

        UIManager.put("PopupMenu.border", BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        UIManager.put("PopupMenu.background", Background);
        UIManager.put("Menu.border", BorderFactory.createEmptyBorder(10, 10, 10, 10));
        UIManager.put("Menu.selectionBackground", SelectionBackground);
        UIManager.put("Menu.selectionForeground", SelectionForeground);
        UIManager.put("Menu.disabledForeground", new Color(0, 0, 0, 100));
        UIManager.put("Menu.background", Background);
        UIManager.put("Menu.foreground", Foreground);
        UIManager.put("Menu.opaque", Boolean.valueOf(true));
        UIManager.put("Menu.menuPopupOffsetY", Integer.valueOf(10));
    }
}
