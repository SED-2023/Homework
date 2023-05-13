public class Tex implements Format{

    @Override
    public String convert(String context) {
        String output = "";
        String[] substring = context.split("");
        for(String s: substring){
            switch(s){
                case "C":
                    output += "c";
                    break;
                case "F":
                    output += "_";
                    break;
                case "P":
                    output += "|";
                    break;
            }
        }
        return output;
    }
}
