import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        /*
        * window [WindowSubtype] [ImplementType]
            drawBorder
            drawCloseBox
        * */
        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            String windowsubtype = "";
            String implementtype = "";
            WindowSubtype ws = null;

            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "window":
                        windowsubtype = tokens[1];
                        implementtype = tokens[2];
                        if (windowsubtype.equals("IconWindow")) {
                            ws = WindowSubtype(implementtype);
                            break;
                        }
                        if (implementtype.equals("TransientWindow")) {
                            ws = WindowSubtype(implementtype);
                            break;
                        }
                        break;
                    case "drawBorder":
                        if (ws == null) {
                            break;
                        }
                        if (windowsubtype.equals("IconWindow")) {
                            ws.drawBorder();
                            break;
                        }
                        break;
                    case "drawCloseBox":
                        if (ws == null) {
                            break;
                        }
                        if (windowsubtype.equals("TransientWindow")) {
                            ws.drawCloseBox();
                            break;
                        }
                        break;
                    default:
                        break;
                }
                line = fileReader.readLine();
            }
            fileReader.close();

        } catch (IOException ex) {
//            System.out.println("Input Error");
        }
    }
}
