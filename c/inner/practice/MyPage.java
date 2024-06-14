package c.inner.practice;

import java.awt.event.KeyAdapter;

public class MyPage {
    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUi();
        myPage.pressKey();
    }

    InputBox inputBox;

    public void setUi() {
        inputBox = new InputBox();

        inputBox.setKeyListener(new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        });
    }

    public void pressKey() {
        inputBox.listenerCalled(2);
        inputBox.listenerCalled(4);
    }
}
