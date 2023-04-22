import java.util.*;

public class BarChartObject implements ChartObject{
    @Override
    public ArrayList<String> display(LinkedHashMap<String, ApplicationDataObject> dataList) {
        ArrayList<String> outline = new ArrayList<>();
        for (Map.Entry<String, ApplicationDataObject> entry : dataList.entrySet()) {
            ApplicationDataObject object = entry.getValue();
            StringBuilder text = new StringBuilder();
            for( int i = 0; i < object.getValue() ; i++ ){
                text.append("=");
            }
            outline.add(text + " " + object.getItem());
        }

        return outline;
    }
}