import java.util.ArrayList;

public class Application {
    private Format format;
    public Application() {
        this.format = null;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(String f) {
        if ( f.equals("TeX") ){
            format = new Tex();
        } else if ( f.equals("TextWidget")) {
            format = new TextWidget();
        }
    }

    public String convert(String rtfToken) {
        String result = new String();
        result =  format.convert(rtfToken);
        return result;
    }

}
