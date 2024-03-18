package M8;

import android.gov.nist.core.Separators;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f11723a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        if (i10 < str.length() && str.charAt(i10) == c10) {
            return true;
        }
        return false;
    }

    public static void b(StringBuilder sb2, int i10, int i11) {
        String num = Integer.toString(i10);
        for (int length = i11 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date c(String str, ParsePosition parsePosition) {
        Throwable e10;
        String str2;
        String message;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt;
        int length;
        try {
            int index = parsePosition.getIndex();
            int i15 = index + 4;
            int d10 = d(str, index, i15);
            if (a(str, i15, '-')) {
                i15 = index + 5;
            }
            int i16 = i15 + 2;
            int d11 = d(str, i15, i16);
            if (a(str, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int d12 = d(str, i16, i17);
            boolean a5 = a(str, i17, 'T');
            if (!a5 && str.length() <= i17) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(d10, d11 - 1, d12);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i17);
                return gregorianCalendar.getTime();
            }
            if (a5) {
                int i18 = i16 + 5;
                int d13 = d(str, i16 + 3, i18);
                if (a(str, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                int d14 = d(str, i18, i19);
                if (a(str, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() > i19 && (charAt = str.charAt(i19)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i20 = i19 + 2;
                    i10 = d(str, i19, i20);
                    if (i10 > 59 && i10 < 63) {
                        i10 = 59;
                    }
                    if (a(str, i20, '.')) {
                        int i21 = i19 + 3;
                        for (int i22 = i19 + 4; i22 < str.length(); i22++) {
                            char charAt2 = str.charAt(i22);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length = i22;
                        }
                        length = str.length();
                        int min = Math.min(length, i19 + 6);
                        i11 = d(str, i21, min);
                        int i23 = min - i21;
                        if (i23 != 1) {
                            if (i23 == 2) {
                                i11 *= 10;
                            }
                        } else {
                            i11 *= 100;
                        }
                        i13 = d13;
                        i17 = length;
                        i12 = d14;
                    } else {
                        i13 = d13;
                        i17 = i20;
                        i12 = d14;
                        i11 = 0;
                    }
                } else {
                    i12 = d14;
                    i11 = 0;
                    i10 = 0;
                    i17 = i19;
                    i13 = d13;
                }
            } else {
                i13 = 0;
                i12 = 0;
                i11 = 0;
                i10 = 0;
            }
            if (str.length() > i17) {
                char charAt3 = str.charAt(i17);
                TimeZone timeZone = f11723a;
                if (charAt3 == 'Z') {
                    i14 = i17 + 1;
                } else if (charAt3 != '+' && charAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + Separators.QUOTE);
                } else {
                    String substring = str.substring(i17);
                    if (substring.length() < 5) {
                        substring = substring + "00";
                    }
                    i14 = i17 + substring.length();
                    if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                        String str3 = "GMT" + substring;
                        timeZone = DesugarTimeZone.getTimeZone(str3);
                        String id2 = timeZone.getID();
                        if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, d10);
                gregorianCalendar2.set(2, d11 - 1);
                gregorianCalendar2.set(5, d12);
                gregorianCalendar2.set(11, i13);
                gregorianCalendar2.set(12, i12);
                gregorianCalendar2.set(13, i10);
                gregorianCalendar2.set(14, i11);
                parsePosition.setIndex(i14);
                return gregorianCalendar2.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IllegalArgumentException e11) {
            e10 = e11;
            if (str == null) {
                str2 = null;
            } else {
                str2 = android.gov.nist.core.a.h(Separators.DOUBLE_QUOTE, str, '\"');
            }
            message = e10.getMessage();
            if (message != null || message.isEmpty()) {
                message = Separators.LPAREN + e10.getClass().getName() + Separators.RPAREN;
            }
            ParseException parseException = new ParseException(android.gov.nist.core.a.k("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e10);
            throw parseException;
        } catch (IndexOutOfBoundsException e12) {
            e10 = e12;
            if (str == null) {
            }
            message = e10.getMessage();
            if (message != null) {
            }
            message = Separators.LPAREN + e10.getClass().getName() + Separators.RPAREN;
            ParseException parseException2 = new ParseException(android.gov.nist.core.a.k("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e10);
            throw parseException2;
        } catch (NumberFormatException e13) {
            e10 = e13;
            if (str == null) {
            }
            message = e10.getMessage();
            if (message != null) {
            }
            message = Separators.LPAREN + e10.getClass().getName() + Separators.RPAREN;
            ParseException parseException22 = new ParseException(android.gov.nist.core.a.k("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException22.initCause(e10);
            throw parseException22;
        }
    }

    public static int d(String str, int i10, int i11) {
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
