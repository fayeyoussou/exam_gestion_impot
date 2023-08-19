package sn.youdev.dto.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
@Component
public class CalendarConverter implements Converter<LocalDate, Calendar> {
    @Override
    public Calendar convert(LocalDate source) {
        LocalDateTime localDateTime = source.atStartOfDay();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
}
