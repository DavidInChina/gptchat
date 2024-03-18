package android.gov.nist.javax.sip.header;

import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes.dex */
public class SIPDate implements Cloneable, Serializable {
    public static final String APR = "Apr";
    public static final String AUG = "Aug";
    public static final String DEC = "Dec";
    public static final String FEB = "Feb";
    public static final String FRI = "Fri";
    public static final String GMT = "GMT";
    public static final String JAN = "Jan";
    public static final String JUL = "Jul";
    public static final String JUN = "Jun";
    public static final String MAR = "Mar";
    public static final String MAY = "May";
    public static final String MON = "Mon";
    public static final String NOV = "Nov";
    public static final String OCT = "Oct";
    public static final String SAT = "Sat";
    public static final String SEP = "Sep";
    public static final String SUN = "Sun";
    public static final String THU = "Thu";
    public static final String TUE = "Tue";
    public static final String WED = "Wed";
    private static final long serialVersionUID = 8544101899928346909L;
    protected int day;
    protected int hour;
    private Calendar javaCal;
    protected int minute;
    protected int month;
    protected int second;
    protected String sipMonth;
    protected String sipWkDay;
    protected int wkday;
    protected int year;

    public SIPDate() {
        this.wkday = -1;
        this.day = -1;
        this.month = -1;
        this.year = -1;
        this.hour = -1;
        this.minute = -1;
        this.second = -1;
        this.javaCal = null;
    }

    private void setJavaCal() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT:0"), Locale.getDefault());
        this.javaCal = gregorianCalendar;
        int i10 = this.year;
        if (i10 != -1) {
            gregorianCalendar.set(1, i10);
        }
        int i11 = this.day;
        if (i11 != -1) {
            this.javaCal.set(5, i11);
        }
        int i12 = this.month;
        if (i12 != -1) {
            this.javaCal.set(2, i12);
        }
        int i13 = this.wkday;
        if (i13 != -1) {
            this.javaCal.set(7, i13);
        }
        int i14 = this.hour;
        if (i14 != -1) {
            this.javaCal.set(10, i14);
        }
        int i15 = this.minute;
        if (i15 != -1) {
            this.javaCal.set(12, i15);
        }
        int i16 = this.second;
        if (i16 != -1) {
            this.javaCal.set(13, i16);
        }
    }

    public Object clone() {
        try {
            SIPDate sIPDate = (SIPDate) super.clone();
            Calendar calendar = this.javaCal;
            if (calendar != null) {
                sIPDate.javaCal = (Calendar) calendar.clone();
            }
            return sIPDate;
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("Internal error");
        }
    }

    public StringBuilder encode(StringBuilder sb2) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.day < 10) {
            str = WebrtcBuildVersion.maint_version + this.day;
        } else {
            str = "" + this.day;
        }
        if (this.hour < 10) {
            str2 = WebrtcBuildVersion.maint_version + this.hour;
        } else {
            str2 = "" + this.hour;
        }
        if (this.minute < 10) {
            str3 = WebrtcBuildVersion.maint_version + this.minute;
        } else {
            str3 = "" + this.minute;
        }
        if (this.second < 10) {
            str4 = WebrtcBuildVersion.maint_version + this.second;
        } else {
            str4 = "" + this.second;
        }
        String str5 = this.sipWkDay;
        if (str5 != null) {
            sb2.append(str5);
            sb2.append(Separators.COMMA);
            sb2.append(Separators.SP);
        }
        sb2.append(str);
        sb2.append(Separators.SP);
        String str6 = this.sipMonth;
        if (str6 != null) {
            sb2.append(str6);
            sb2.append(Separators.SP);
        }
        a.x(sb2, this.year, Separators.SP, str2, ":");
        a.y(sb2, str3, ":", str4, Separators.SP);
        sb2.append("GMT");
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() != getClass()) {
            return false;
        }
        SIPDate sIPDate = (SIPDate) obj;
        if (this.wkday != sIPDate.wkday || this.day != sIPDate.day || this.month != sIPDate.month || this.year != sIPDate.year || this.hour != sIPDate.hour || this.minute != sIPDate.minute || this.second != sIPDate.second) {
            return false;
        }
        return true;
    }

    public int getDeltaSeconds() {
        return ((int) (getJavaCal().getTime().getTime() - System.currentTimeMillis())) / 1000;
    }

    public int getHour() {
        return this.hour;
    }

    public Calendar getJavaCal() {
        if (this.javaCal == null) {
            setJavaCal();
        }
        return this.javaCal;
    }

    public int getMinute() {
        return this.minute;
    }

    public String getMonth() {
        return this.sipMonth;
    }

    public int getSecond() {
        return this.second;
    }

    public String getWkday() {
        return this.sipWkDay;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int i10) {
        if (i10 >= 1 && i10 <= 31) {
            this.day = i10;
            return;
        }
        throw new IllegalArgumentException("Illegal Day of the month " + Integer.toString(i10));
    }

    public void setHour(int i10) {
        if (i10 >= 0 && i10 <= 24) {
            this.javaCal = null;
            this.hour = i10;
            return;
        }
        throw new IllegalArgumentException(a.e("Illegal hour : ", i10));
    }

    public void setMinute(int i10) {
        if (i10 >= 0 && i10 < 60) {
            this.javaCal = null;
            this.minute = i10;
            return;
        }
        throw new IllegalArgumentException("Illegal minute : " + Integer.toString(i10));
    }

    public void setMonth(String str) {
        this.sipMonth = str;
        if (str.compareToIgnoreCase("Jan") == 0) {
            this.month = 0;
        } else if (this.sipMonth.compareToIgnoreCase("Feb") == 0) {
            this.month = 1;
        } else if (this.sipMonth.compareToIgnoreCase("Mar") == 0) {
            this.month = 2;
        } else if (this.sipMonth.compareToIgnoreCase("Apr") == 0) {
            this.month = 3;
        } else if (this.sipMonth.compareToIgnoreCase("May") == 0) {
            this.month = 4;
        } else if (this.sipMonth.compareToIgnoreCase("Jun") == 0) {
            this.month = 5;
        } else if (this.sipMonth.compareToIgnoreCase("Jul") == 0) {
            this.month = 6;
        } else if (this.sipMonth.compareToIgnoreCase("Aug") == 0) {
            this.month = 7;
        } else if (this.sipMonth.compareToIgnoreCase("Sep") == 0) {
            this.month = 8;
        } else if (this.sipMonth.compareToIgnoreCase("Oct") == 0) {
            this.month = 9;
        } else if (this.sipMonth.compareToIgnoreCase("Nov") == 0) {
            this.month = 10;
        } else if (this.sipMonth.compareToIgnoreCase("Dec") == 0) {
            this.month = 11;
        } else {
            throw new IllegalArgumentException(R.a.r("Illegal Month :", str));
        }
    }

    public void setSecond(int i10) {
        if (i10 >= 0 && i10 < 60) {
            this.javaCal = null;
            this.second = i10;
            return;
        }
        throw new IllegalArgumentException("Illegal second : " + Integer.toString(i10));
    }

    public void setWkday(String str) {
        this.sipWkDay = str;
        if (str.compareToIgnoreCase("Mon") == 0) {
            this.wkday = 2;
        } else if (this.sipWkDay.compareToIgnoreCase("Tue") == 0) {
            this.wkday = 3;
        } else if (this.sipWkDay.compareToIgnoreCase("Wed") == 0) {
            this.wkday = 4;
        } else if (this.sipWkDay.compareToIgnoreCase("Thu") == 0) {
            this.wkday = 5;
        } else if (this.sipWkDay.compareToIgnoreCase("Fri") == 0) {
            this.wkday = 6;
        } else if (this.sipWkDay.compareToIgnoreCase("Sat") == 0) {
            this.wkday = 7;
        } else if (this.sipWkDay.compareToIgnoreCase("Sun") == 0) {
            this.wkday = 1;
        } else {
            throw new IllegalArgumentException(R.a.r("Illegal Week day :", str));
        }
    }

    public void setYear(int i10) {
        if (i10 >= 0) {
            this.javaCal = null;
            this.year = i10;
            return;
        }
        throw new IllegalArgumentException(a.e("Illegal year : ", i10));
    }

    public SIPDate(long j6) {
        this.javaCal = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT:0"), Locale.getDefault());
        this.javaCal.setTime(new Date(j6));
        int i10 = this.javaCal.get(7);
        this.wkday = i10;
        switch (i10) {
            case 1:
                this.sipWkDay = "Sun";
                break;
            case 2:
                this.sipWkDay = "Mon";
                break;
            case 3:
                this.sipWkDay = "Tue";
                break;
            case 4:
                this.sipWkDay = "Wed";
                break;
            case 5:
                this.sipWkDay = "Thu";
                break;
            case 6:
                this.sipWkDay = "Fri";
                break;
            case 7:
                this.sipWkDay = "Sat";
                break;
            default:
                InternalErrorHandler.handleException("No date map for wkday " + this.wkday);
                break;
        }
        this.day = this.javaCal.get(5);
        int i11 = this.javaCal.get(2);
        this.month = i11;
        switch (i11) {
            case 0:
                this.sipMonth = "Jan";
                break;
            case 1:
                this.sipMonth = "Feb";
                break;
            case 2:
                this.sipMonth = "Mar";
                break;
            case 3:
                this.sipMonth = "Apr";
                break;
            case 4:
                this.sipMonth = "May";
                break;
            case 5:
                this.sipMonth = "Jun";
                break;
            case 6:
                this.sipMonth = "Jul";
                break;
            case 7:
                this.sipMonth = "Aug";
                break;
            case 8:
                this.sipMonth = "Sep";
                break;
            case 9:
                this.sipMonth = "Oct";
                break;
            case 10:
                this.sipMonth = "Nov";
                break;
            case 11:
                this.sipMonth = "Dec";
                break;
            default:
                InternalErrorHandler.handleException("No date map for month " + this.month);
                break;
        }
        this.year = this.javaCal.get(1);
        this.hour = this.javaCal.get(11);
        this.minute = this.javaCal.get(12);
        this.second = this.javaCal.get(13);
    }
}
