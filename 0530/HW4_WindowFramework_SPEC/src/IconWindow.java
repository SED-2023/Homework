public class IconWindow extends WindowSubtype {
    public IconWindow(String impType) {
        super(impType);
//        this.wf = wf;
    }

    public void drawBorder() {
        wf.drawText();
        wf.drawRectangle();
    }
}
