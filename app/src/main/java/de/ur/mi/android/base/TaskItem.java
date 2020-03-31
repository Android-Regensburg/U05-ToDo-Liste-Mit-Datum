package de.ur.mi.android.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TaskItem {

    public TaskItem(String task, String date) {

    }

    private GregorianCalendar getDateFromString(String date) {
        GregorianCalendar cal = new GregorianCalendar();

        try {
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMANY);
            cal.setTime(df.parse(date));
        } catch (ParseException e) {
            //Wenn parsing fehlschlägt benutzt der erstellte GregCalender automatisch das aktuelle Datum
            e.printStackTrace();
        }

        return cal;
    }

    public String getFormattedDate(GregorianCalendar date) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,
                Locale.GERMANY);

        return df.format(date.getTime());
    }

}
