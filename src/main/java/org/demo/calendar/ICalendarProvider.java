package org.demo.calendar;

import java.util.List;

public interface ICalendarProvider {

    List<Month> getMonthes(int fiscalDateFrom, int fiscalDateTo) throws InvalidFiscalDateFormatException;

    Month getDayInfo(int year, int dayInYear) throws InvalidDayInYearException;

    List<String> getMonthesFormatted(int fiscalDateFrom, int fiscalDateTo) throws InvalidFiscalDateFormatException;



}
