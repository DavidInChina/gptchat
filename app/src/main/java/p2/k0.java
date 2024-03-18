package p2;

import android.os.Bundle;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class k0 implements AbstractC5057j {

    /* renamed from: i0  reason: collision with root package name */
    public static final k0 f42089i0 = new k0(new j0());

    /* renamed from: j0  reason: collision with root package name */
    public static final String f42090j0 = Integer.toString(1, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f42091k0 = Integer.toString(2, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final String f42092l0 = Integer.toString(3, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f42093Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f42094Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f42095h0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public k0(j0 j0Var) {
        this.f42093Y = j0Var.f42081a;
        this.f42094Z = j0Var.f42082b;
        this.f42095h0 = j0Var.f42083c;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f42090j0, this.f42093Y);
        bundle.putBoolean(f42091k0, this.f42094Z);
        bundle.putBoolean(f42092l0, this.f42095h0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f42093Y == k0Var.f42093Y && this.f42094Z == k0Var.f42094Z && this.f42095h0 == k0Var.f42095h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f42093Y + 31) * 31) + (this.f42094Z ? 1 : 0)) * 31) + (this.f42095h0 ? 1 : 0);
    }
}
