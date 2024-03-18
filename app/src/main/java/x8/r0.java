package x8;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class r0 extends j0 implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public static final r0 f49607Y = new j0();

    @Override // x8.j0
    public final j0 a() {
        return i0.f49570Y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
