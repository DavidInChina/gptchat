package L1;

import E1.p;
import a1.C1915c;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class c implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final Rect f10490Y = new Rect();

    /* renamed from: Z  reason: collision with root package name */
    public final Rect f10491Z = new Rect();

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f10492h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C1915c f10493i0;

    public c(boolean z10, C1915c c1915c) {
        this.f10492h0 = z10;
        this.f10493i0 = c1915c;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f10493i0.getClass();
        Rect rect = this.f10490Y;
        ((p) obj).f(rect);
        Rect rect2 = this.f10491Z;
        ((p) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z10 = this.f10492h0;
        if (i12 < i13) {
            if (!z10) {
                return -1;
            }
            return 1;
        } else if (i12 > i13) {
            if (z10) {
                return -1;
            }
            return 1;
        } else {
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                if (!z10) {
                    return -1;
                }
                return 1;
            } else if (i16 > i17) {
                if (z10) {
                    return -1;
                }
                return 1;
            } else {
                return 0;
            }
        }
    }
}
