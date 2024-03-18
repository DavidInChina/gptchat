package com.revenuecat.purchases.utils;

import android.gov.nist.core.Separators;
import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = DesugarTimeZone.getTimeZone("GMT");

    private static boolean checkOffset(String str, int i10, char c10) {
        if (i10 < str.length() && str.charAt(i10) == c10) {
            return true;
        }
        return false;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        padInt(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                i10++;
            } else {
                return i10;
            }
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i10, int i11) {
        String num = Integer.toString(i10);
        for (int length = i11 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:70:0x0160, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:70:0x0160, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date parse(String str) {
        Throwable e10;
        int i10;
        int i11;
        int i12;
        int i13;
        TimeZone timeZone;
        char charAt;
        int i14 = 4;
        try {
            int parseInt = parseInt(str, 0, 4);
            if (checkOffset(str, 4, '-')) {
                i14 = 5;
            }
            int i15 = i14 + 2;
            int parseInt2 = parseInt(str, i14, i15);
            if (checkOffset(str, i15, '-')) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int parseInt3 = parseInt(str, i15, i16);
            boolean checkOffset = checkOffset(str, i16, 'T');
            if (!checkOffset && str.length() <= i16) {
                return new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3).getTime();
            }
            if (checkOffset) {
                int i17 = i15 + 5;
                int parseInt4 = parseInt(str, i15 + 3, i17);
                if (checkOffset(str, i17, ':')) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int parseInt5 = parseInt(str, i17, i18);
                if (checkOffset(str, i18, ':')) {
                    i18 = i17 + 3;
                }
                if (str.length() > i18 && (charAt = str.charAt(i18)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i19 = i18 + 2;
                    i10 = parseInt(str, i18, i19);
                    if (i10 > 59 && i10 < 63) {
                        i10 = 59;
                    }
                    if (checkOffset(str, i19, '.')) {
                        int i20 = i18 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i18 + 4);
                        int min = Math.min(indexOfNonDigit, i18 + 6);
                        i12 = (int) (Math.pow(10.0d, 3 - (min - i20)) * parseInt(str, i20, min));
                        i11 = parseInt5;
                        i13 = parseInt4;
                        i16 = indexOfNonDigit;
                    } else {
                        i13 = parseInt4;
                        i16 = i19;
                        i11 = parseInt5;
                        i12 = 0;
                    }
                    if (str.length() <= i16) {
                        char charAt2 = str.charAt(i16);
                        if (charAt2 == 'Z') {
                            timeZone = TIMEZONE_Z;
                        } else {
                            if (charAt2 != '+' && charAt2 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + Separators.QUOTE);
                            }
                            String substring = str.substring(i16);
                            if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                String str2 = "GMT" + substring;
                                TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str2);
                                String id2 = timeZone2.getID();
                                if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                                }
                                timeZone = timeZone2;
                            }
                            timeZone = TIMEZONE_Z;
                        }
                        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                        gregorianCalendar.setLenient(false);
                        gregorianCalendar.set(1, parseInt);
                        gregorianCalendar.set(2, parseInt2 - 1);
                        gregorianCalendar.set(5, parseInt3);
                        gregorianCalendar.set(11, i13);
                        gregorianCalendar.set(12, i11);
                        gregorianCalendar.set(13, i10);
                        gregorianCalendar.set(14, i12);
                        return gregorianCalendar.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i13 = parseInt4;
                i16 = i18;
                i11 = parseInt5;
                i12 = 0;
            } else {
                i13 = 0;
                i12 = 0;
                i11 = 0;
            }
            i10 = 0;
            if (str.length() <= i16) {
            }
        } catch (IllegalArgumentException e11) {
            e10 = e11;
            throw new SerializationException(R.a.r("Not an RFC 3339 date: ", str), e10);
        } catch (IndexOutOfBoundsException e12) {
            e10 = e12;
            throw new SerializationException(R.a.r("Not an RFC 3339 date: ", str), e10);
        }
    }

    private static int parseInt(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= 0 && i11 <= str.length() && i10 <= i11) {
            if (i10 < i11) {
                i13 = i10 + 1;
                int digit = Character.digit(str.charAt(i10), 10);
                if (digit >= 0) {
                    i12 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
                }
            } else {
                i12 = 0;
                i13 = i10;
            }
            while (i13 < i11) {
                int i14 = i13 + 1;
                int digit2 = Character.digit(str.charAt(i13), 10);
                if (digit2 >= 0) {
                    i12 = (i12 * 10) - digit2;
                    i13 = i14;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
                }
            }
            return -i12;
        }
        throw new NumberFormatException(str);
    }
}
