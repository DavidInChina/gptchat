package N;

import A.AbstractC0044t0;
import jf.C3970t;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f12455a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12456b;

    public y0(long j6, long j10) {
        this.f12455a = j6;
        this.f12456b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (r0.r.c(this.f12455a, y0Var.f12455a) && r0.r.c(this.f12456b, y0Var.f12456b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f12456b) + (C3970t.a(this.f12455a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0044t0.B(this.f12455a, sb2, ", selectionBackgroundColor=");
        sb2.append((Object) r0.r.i(this.f12456b));
        sb2.append(')');
        return sb2.toString();
    }
}
