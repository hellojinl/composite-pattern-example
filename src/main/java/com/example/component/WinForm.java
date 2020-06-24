package com.example.component;

import com.example.painter.IPainter;

/**
 * WINDOW窗口
 *
 * @author jinlei
 * @date 2020-06-22
 */
public class WinForm extends AbstractComponet {

    public WinForm(IPainter painter) {
        super(painter);
    }

    @Override
    public void addChild(Componet child) {
        this.children.add(child);
    }
}
