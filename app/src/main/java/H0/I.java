package H0;

import java.util.Comparator;
import jf.C3959i;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class I implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final I f6741Y = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C3959i c3959i = (C3959i) obj;
        C3959i c3959i2 = (C3959i) obj2;
        int compare = Float.compare(((C5252d) c3959i.f36155Y).f43626b, ((C5252d) c3959i2.f36155Y).f43626b);
        if (compare == 0) {
            return Float.compare(((C5252d) c3959i.f36155Y).f43628d, ((C5252d) c3959i2.f36155Y).f43628d);
        }
        return compare;
    }
}
