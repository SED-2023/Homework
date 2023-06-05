public abstract class WindowSubtype {
    WindowFramework wf;
    WindowSubtype(String impType) {
        if (impType.equals("XWindow")) {
            wf = new XWindow();
        } else if (impType.equals("PMWindow")) {
            wf = new PMWindow();
        }
    }
}
