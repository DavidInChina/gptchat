package H0;

import java.util.Comparator;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class E implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final E f6719Y = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5252d f6 = ((L0.o) obj).f();
        C5252d f10 = ((L0.o) obj2).f();
        int compare = Float.compare(f6.f43625a, f10.f43625a);
        if (compare == 0) {
            int compare2 = Float.compare(f6.f43626b, f10.f43626b);
            if (compare2 == 0) {
                int compare3 = Float.compare(f6.f43628d, f10.f43628d);
                if (compare3 == 0) {
                    return Float.compare(f6.f43627c, f10.f43627c);
                }
                return compare3;
            }
            return compare2;
        }
        return compare;
    }
}
