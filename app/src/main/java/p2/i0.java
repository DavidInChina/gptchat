package p2;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class i0 implements AbstractC5057j {

    /* renamed from: h0  reason: collision with root package name */
    public static final String f42077h0 = Integer.toString(0, 36);

    /* renamed from: i0  reason: collision with root package name */
    public static final String f42078i0 = Integer.toString(1, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final h0 f42079Y;

    /* renamed from: Z  reason: collision with root package name */
    public final x8.N f42080Z;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public i0(h0 h0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= h0Var.f42072Y)) {
            throw new IndexOutOfBoundsException();
        }
        this.f42079Y = h0Var;
        this.f42080Z = x8.N.V(list);
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f42077h0, this.f42079Y.a());
        bundle.putIntArray(f42078i0, M3.H.y0(this.f42080Z));
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f42079Y.equals(i0Var.f42079Y) && this.f42080Z.equals(i0Var.f42080Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f42080Z.hashCode() * 31) + this.f42079Y.hashCode();
    }
}
