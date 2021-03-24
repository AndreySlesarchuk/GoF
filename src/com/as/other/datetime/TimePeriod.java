package com.as.other.datetime;

import com.as.other.utils.MyDateFormat;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

/**
 * Created by Andrey Slesarchuk on 12/14/2020.
 */
public class TimePeriod {
  private Date startTime;

  private Date endTime;

  public TimePeriod() {
  }

  public TimePeriod(String startTime, String endTime) {
    this.startTime = new Date(startTime);
    this.endTime = new Date(endTime);
  }

  public static void main(String[] args) {
    Set<TimePeriod> timePeriods = new HashSet<>();
    // timePeriods.add(new TimePeriod(1606802400000, 1606804200000))); //
    // 2020/12/01 09:00:00", "2020/12/01 09:30:00"));
    timePeriods.add(new TimePeriod("2020/12/01 08:00:00", "2020/12/01 08:30:00"));
    timePeriods.add(new TimePeriod("2020/12/01 10:00:00", "2020/12/01 10:30:00"));
    timePeriods.add(new TimePeriod("2020/12/02 09:00:00", "2020/12/02 09:30:00"));
    timePeriods.add(new TimePeriod("2020/12/03 09:00:00", "2020/12/03 09:30:00"));
    timePeriods.add(new TimePeriod("2020/12/04 09:00:00", "2020/12/04 09:30:00"));

    timePeriods.stream().forEach(tp -> System.out.println("-> : " + tp.toString()));
    Map<LocalDate, Integer> m1 = new HashMap<>();
    for (TimePeriod tp : timePeriods) {
      m1.put(tp.startTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 1);
    }
    System.out.println("Количество дней: " + m1.size());


    String a1 = "01/10/2021";
    String a2 = "13.10.2021";
    MyDateFormat myDateFormat = new MyDateFormat();
    String dateString = myDateFormat.getDateString(a1);
    System.out.println("Нормализованная дата 1: " + dateString);
    dateString = myDateFormat.getDateString(a2);
    System.out.println("Нормализованная дата 2: " + dateString);

  }

  @Override
  public String toString() {
    return "TimePeriod{" + "startTime=" + startTime + ", endTime=" + endTime + '}';
  }
}
