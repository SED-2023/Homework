import java.util.*;

public class BarChartObject implements ChartObject{
    @Override
    public ArrayList<String> display(LinkedHashMap<String, ApplicationDataObject> dataList) {
        ArrayList<String> outline = new ArrayList<>();
        for (Map.Entry<String, ApplicationDataObject> entry : dataList.entrySet()) {
            ApplicationDataObject object = entry.getValue();
            for(int i = 0; i < object.getValue() ; i++ ){
                outline.add("=");
            }
            outline.add(" " + object.getItem());
        }

        return outline;
    }
}