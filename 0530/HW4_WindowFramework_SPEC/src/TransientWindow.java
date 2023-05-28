public class TransientWindow extends WindowSubtype {
    public TransientWindow(String impType) {
        super(impType);
//        this.wf = wf;
    }

    public void drawCloseBox() {
        wf.drawRectangle();
    }
}
