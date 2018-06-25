package com.utils;

import javax.swing.*;
import java.awt.*;

public class SetFont {

    public static void setFont(Font font,JComponent... jComponents){


        for ( JComponent s : jComponents ){
            s.setFont(font);
        }
    }

}
