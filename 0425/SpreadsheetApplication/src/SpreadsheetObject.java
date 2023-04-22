import java.util.*;

public class SpreadsheetObject implements ChartObject{
    @Override
    public ArrayList<String> display(LinkedHashMap<String, ApplicationDataObject> dataList) {
        ArrayList<String> outline = new ArrayList<>();

        for (Map.Entry<String, ApplicationDataObject> entry : dataList.entrySet()) {
            ApplicationDataObject object = entry.getValue();
            outline.add(object.getItem() + " " + object.getValue().toString());
        }

        return outline;
    }
}
