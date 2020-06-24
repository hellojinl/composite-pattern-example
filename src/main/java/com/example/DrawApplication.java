package com.example;

import com.example.component.Componet;
import com.example.factory.ComponentFactory;
import com.example.painter.CharacterPainter;
import com.example.painter.IPainter;

/**
 * 主程序
 *
 * @author jinlei
 * @date 2020-06-22
 */
public class DrawApplication {

    public static void main(String[] args) {
        ComponentFactory factory = createCharacterPainterComponentFactory();
        Componet winForm = buildWinForm(factory);
        winForm.paint();
    }

    private static ComponentFactory createCharacterPainterComponentFactory() {
        IPainter painter = new CharacterPainter();
        return new ComponentFactory(painter);
    }

    private static Componet buildWinForm(ComponentFactory factory) {
        Componet winForm = factory.createWinForm("WINDOW窗口");

        Componet picture = factory.createPicture("LOGO图片");
        winForm.addChild(picture);

        Componet loginBtn = factory.createButton("登录");
        winForm.addChild(loginBtn);

        Componet registerBtn = factory.createButton("注册");
        winForm.addChild(registerBtn);

        Componet frame = buildFrame(factory);
        winForm.addChild(frame);

        return winForm;
    }

    private static Componet buildFrame(ComponentFactory factory) {
        Componet frame = factory.createFrame("FRAME1");

        Componet usernameLable = factory.createLable("用户名");
        frame.addChild(usernameLable);

        Componet textbox = factory.createTextbox("文本框");
        frame.addChild(textbox);

        Componet passwordLable = factory.createLable("密码");
        frame.addChild(passwordLable);

        Componet passwordBox = factory.createPasswordBox("密码框");
        frame.addChild(passwordBox);

        Componet checkBox = factory.createCheckBox("复选框");
        frame.addChild(checkBox);

        Componet rememberUsernameTextbox = factory.createTextbox("记住用户名");
        frame.addChild(rememberUsernameTextbox);

        Componet forgetPasswordLable = factory.createLinkLable("忘记密码");
        frame.addChild(forgetPasswordLable);

        return frame;
    }
}
