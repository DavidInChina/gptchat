package x8;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class i0 extends j0 implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public static final i0 f49570Y = new j0();

    @Override // x8.j0
    public final j0 a() {
        return r0.f49607Y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
