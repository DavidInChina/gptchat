package xe;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;

/* renamed from: xe.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6427p {

    /* renamed from: a  reason: collision with root package name */
    public final String f49945a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49946b;

    /* renamed from: c  reason: collision with root package name */
    public final double f49947c;

    public C6427p(String str, List list) {
        Double d10;
        Object obj;
        String str2;
        Double V12;
        AbstractC3557B.c0("value", str);
        AbstractC3557B.c0("params", list);
        this.f49945a = str;
        this.f49946b = list;
        Iterator it = list.iterator();
        while (true) {
            d10 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3557B.K(((C6428q) obj).f49948a, "q")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6428q c6428q = (C6428q) obj;
        double d11 = 1.0d;
        if (c6428q != null && (str2 = c6428q.f49949b) != null && (V12 = Lg.m.V1(str2)) != null) {
            double doubleValue = V12.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d10 = V12;
            }
            if (d10 != null) {
                d11 = d10.doubleValue();
            }
        }
        this.f49947c = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6427p)) {
            return false;
        }
        C6427p c6427p = (C6427p) obj;
        if (AbstractC3557B.K(this.f49945a, c6427p.f49945a) && AbstractC3557B.K(this.f49946b, c6427p.f49946b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49946b.hashCode() + (this.f49945a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f49945a + ", params=" + this.f49946b + ')';
    }
}
