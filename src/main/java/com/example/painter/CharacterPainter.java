package com.example.painter;

import com.example.component.Componet;

/**
 * 字符画手
 *
 * @author jinlei
 * @date 2020-06-22
 */
public class CharacterPainter implements IPainter {

    @Override
    public void paint(Componet componet) {
        if (componet == null) {
            return;
        }

        String name = componet.getClass().getSimpleName();
        String text = componet.getText();
        System.out.println("print " + name + "(" + text + ")");

    }
}
