package pl.gpost.example;

import pl.gpost.TurtleGraphicsWindow;

class TGWexample2 extends TurtleGraphicsWindow {

    public void tgKeyReleased(int keyNum) {
        switch (keyNum) {
            case DOWN_ARROW:
                back(5);
                break;
            case LEFT_ARROW:
                left(5);
                break;
            case RIGHT_ARROW:
                right(5);
                break;
            case UP_ARROW:
                forward(5);
                break;
        }
    }


    public void tgKeyTyped(char keyChar) {
        switch (keyChar) {
            case 'd':
                setpencolor(BLACK);
                pendown();
                break;
            case 'u':
                setpencolor(WHITE);
                penup();
                break;
        }
    }


    public void tgMouseClicked(int x, int y) {
        System.out.println("tgMouseClicked( " + x + ", " + y + ")");
        setxy(x, y);
    }


    public static void main(String[] args) {
        TGWexample2 me = new TGWexample2();
        me.setpensize(8);
        me.setshape(ARROW);
    }

} // end class pl.gpost.example.TGWexample2
