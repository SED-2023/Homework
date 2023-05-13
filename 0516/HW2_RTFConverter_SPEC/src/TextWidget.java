public class TextWidget implements Format{

    @Override
    public String convert(String context) {
        String output = "";
        String[] substring = context.split("");
        for(String s: substring){
            switch(s){
                case "C":
                    output += "<Char>";
                    break;
                case "F":
                    output += "<Font>";
                    break;
                case "P":
                    output += "<Paragraph>";
                    break;
            }
        }
        return output;
    }
}
