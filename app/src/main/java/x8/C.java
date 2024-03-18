package x8;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class C extends E {
    public static E f(int i10) {
        if (i10 < 0) {
            return E.f49510b;
        }
        if (i10 > 0) {
            return E.f49511c;
        }
        return E.f49509a;
    }

    @Override // x8.E
    public final E a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else if (i10 > i11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return f(i12);
    }

    @Override // x8.E
    public final E b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // x8.E
    public final E c(boolean z10, boolean z11) {
        int i10;
        if (z10 == z11) {
            i10 = 0;
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override // x8.E
    public final E d(boolean z10, boolean z11) {
        int i10;
        if (z11 == z10) {
            i10 = 0;
        } else if (z11) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override // x8.E
    public final int e() {
        return 0;
    }
}
