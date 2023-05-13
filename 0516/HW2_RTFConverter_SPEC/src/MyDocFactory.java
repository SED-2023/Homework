public class MyDocFactory implements DocFactory{
    @Override
    public Document createDocument(String type) {
        if ( "Draw".equals(type) ){
            return new DrawDocument();
        } else if ( "Text".equals(type) ) {
            return new TextDocument();
        } else {
            throw new IllegalArgumentException("Invalid document type: " + type);
        }
    }
}
