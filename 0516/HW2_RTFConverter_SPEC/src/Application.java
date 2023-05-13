import java.util.ArrayList;

public class Application {
    private Format format;
    public Application() {
        this.format = new Format();
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String convert(String rtfToken) {
        String result = new String();
        result =  format.convert(rtfToken);
        return result;
    }

}
