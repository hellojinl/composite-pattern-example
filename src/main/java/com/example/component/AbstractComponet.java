package com.example.component;

import com.example.painter.IPainter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 抽象window组件
 *
 * @author jinlei
 * @date 2020-06-22
 */
public abstract class AbstractComponet implements Componet {

    protected final List<Componet> children = new LinkedList<>();
    protected final IPainter painter;
    protected String text;

    public AbstractComponet(IPainter painter) {
        this.painter = painter;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void paint() {
        painter.paint(this);
        this.getChildren().forEach(c -> c.paint());
    }

    @Override
    public void addChild(Componet child) {
    }

    @Override
    public List<Componet> getChildren() {
        return Collections.unmodifiableList(children);
    }
}
