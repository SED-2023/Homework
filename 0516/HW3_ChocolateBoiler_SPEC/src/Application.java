import java.util.ArrayList;

public class Application {

    private ArrayList<Document> docs;
    private DocFactory factory;
    public Application() {
        this.docs = new ArrayList<Document>();
        this.factory = new MyDocFactory();
    }

    public void createDocument(String type) {
        docs.add(factory.createDocument(type));
    }

    public ArrayList<String> present() {
        ArrayList<String> result = new ArrayList<>();

        for (Document d: docs) {
            result.add(d.getType());
        }
        return result;
    }
}
