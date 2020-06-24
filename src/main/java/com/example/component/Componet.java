package com.example.component;

import java.util.List;

/**
 * window组件
 *
 * @author jinlei
 * @date 2020-06-22
 */
public interface Componet {

    void setText(String text);

    String getText();

    void paint();

    void addChild(Componet child);

    List<Componet> getChildren();

}
