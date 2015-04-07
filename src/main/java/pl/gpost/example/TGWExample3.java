package pl.gpost.example;

import pl.gpost.TurtleGraphicsWindow;

class TGWExample3 extends TurtleGraphicsWindow {

    private void drawScene() {
        boolean status = loadpicture("Clouds.jpg");
        if (!status) {
            System.out.println("loadpicture() failed");
            return;
        }
        status = loadshape("Parrot.png", FIRST_USER_SUPPLIED_SHAPE);
        if (!status) {
            System.out.println("loadshape() failed");
            return;
        }
        status = setshape(FIRST_USER_SUPPLIED_SHAPE);
        if (!status)
            System.out.println("setshape() failed");
    }


    public static void main(String[] args) {
        TGWExample3 me = new TGWExample3();
        me.drawScene();
    }

} // end class pl.gpost.example.TGWexample3
