package com.example.factory;

import com.example.component.*;
import com.example.painter.CharacterPainter;
import com.example.painter.IPainter;

import java.lang.reflect.Constructor;

/**
 * 组件工厂
 *
 * @author jinlei
 * @date 2020-06-22
 */
public class ComponentFactory {

    private final IPainter painter;

    public ComponentFactory(IPainter painter) {
        this.painter = painter;
    }

    public  Button createButton(String text) {
        return createComponet(Button.class, text);
    }

    public CheckBox createCheckBox(String text) {
        return createComponet(CheckBox.class, text);

    }

    public Frame createFrame(String text) {
        return createComponet(Frame.class, text);

    }

    public Lable createLable(String text) {
        return createComponet(Lable.class, text);
    }

    public LinkLable createLinkLable(String text) {
        return createComponet(LinkLable.class, text);

    }

    public PasswordBox createPasswordBox(String text) {
        return createComponet(PasswordBox.class, text);
    }

    public Picture createPicture(String text) {
        return createComponet(Picture.class, text);
    }

    public TextBox createTextbox(String text) {
        return createComponet(TextBox.class, text);
    }

    public WinForm createWinForm(String text) {
        return createComponet(WinForm.class, text);
    }

    public <T extends Componet> T createComponet(Class<T> type, String text) {
        if (type == null) {
            throw new IllegalArgumentException("type不能为null");
        }
        Constructor<?> constructor;
        try {
            constructor = type.getConstructor(IPainter.class);
            T componet = (T) constructor.newInstance(painter);
            componet.setText(text);
            return componet;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
