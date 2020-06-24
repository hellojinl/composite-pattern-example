package com.example.component;

import com.example.painter.IPainter;

/**
 * FRAME1
 *
 * @author jinlei
 * @date 2020-06-22
 */
public class Frame extends AbstractComponet {

    public Frame(IPainter painter) {
        super(painter);
    }

    @Override
    public void addChild(Componet child) {
        this.children.add(child);
    }
}
