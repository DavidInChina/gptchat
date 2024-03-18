package Wh;

import H0.C0672c0;
import android.gov.nist.core.Separators;
import bi.AbstractC2228c;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import jf.C3959i;
import xf.AbstractC6438a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class q implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final String[] f21240Y;

    public q(String[] strArr) {
        this.f21240Y = strArr;
    }

    public final p I() {
        p pVar = new p();
        kf.s.O1(pVar.f21239a, this.f21240Y);
        return pVar;
    }

    public final TreeMap M() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC3557B.b0("CASE_INSENSITIVE_ORDER", comparator);
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String y10 = y(i10);
            Locale locale = Locale.US;
            String j6 = AbstractC6463a.j("US", locale, y10, locale, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(j6);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(j6, list);
            }
            list.add(T(i10));
        }
        return treeMap;
    }

    public final String T(int i10) {
        return this.f21240Y[(i10 * 2) + 1];
    }

    public final List U(String str) {
        AbstractC3557B.c0("name", str);
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (Lg.n.f2(str, y(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(T(i10));
            }
        }
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC3557B.b0("{\n      Collections.unmodifiableList(result)\n    }", unmodifiableList);
            return unmodifiableList;
        }
        return kf.v.f37483Y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Arrays.equals(this.f21240Y, ((q) obj).f21240Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21240Y);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C3959i[] c3959iArr = new C3959i[size];
        for (int i10 = 0; i10 < size; i10++) {
            c3959iArr[i10] = new C3959i(y(i10), T(i10));
        }
        return N.f0(c3959iArr);
    }

    public final String r(String str) {
        AbstractC3557B.c0("name", str);
        String[] strArr = this.f21240Y;
        int length = strArr.length - 2;
        int J10 = r.f.J(length, 0, -2);
        if (J10 <= length) {
            while (!Lg.n.f2(str, strArr[length])) {
                if (length != J10) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final Date s(String str) {
        String r10 = r(str);
        if (r10 == null) {
            return null;
        }
        C0672c0 c0672c0 = AbstractC2228c.f26021a;
        if (r10.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) AbstractC2228c.f26021a.get()).parse(r10, parsePosition);
        if (parsePosition.getIndex() == r10.length()) {
            return parse;
        }
        String[] strArr = AbstractC2228c.f26022b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    DateFormat[] dateFormatArr = AbstractC2228c.f26023c;
                    DateFormat dateFormat = dateFormatArr[i10];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(AbstractC2228c.f26022b[i10], Locale.US);
                        dateFormat.setTimeZone(Xh.b.f22000e);
                        dateFormatArr[i10] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(r10, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int size() {
        return this.f21240Y.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String y10 = y(i10);
            String T = T(i10);
            sb2.append(y10);
            sb2.append(": ");
            if (Xh.b.q(y10)) {
                T = "\u2588\u2588";
            }
            sb2.append(T);
            sb2.append(Separators.RETURN);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }

    public final String y(int i10) {
        return this.f21240Y[i10 * 2];
    }
}
