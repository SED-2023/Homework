import java.util.*;

public class PieChartObject implements ChartObject{

    @Override
    public ArrayList<String> display(LinkedHashMap<String, ApplicationDataObject> dataList) {
        ArrayList<String> outline = new ArrayList<>();
        double all = 0;
        for (Map.Entry<String, ApplicationDataObject> entry : dataList.entrySet()) {
            ApplicationDataObject object = entry.getValue();
            all += object.getValue();
        }

        for (Map.Entry<String, ApplicationDataObject> entry : dataList.entrySet()) {
            ApplicationDataObject object = entry.getValue();
            double percentage = 100 * object.getValue() / all;
            double roundOff = Double.valueOf(Math.round(percentage * 10)) / 10;
            outline.add(object.getItem() + " " + roundOff + "%");
        }

        return outline;
    }
}
