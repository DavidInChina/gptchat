package p2;

import android.os.Bundle;
import s2.AbstractC5530A;

/* renamed from: p2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5061n implements AbstractC5057j {

    /* renamed from: j0  reason: collision with root package name */
    public static final String f42189j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final String f42190k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final String f42191l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final String f42192m0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f42193Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f42194Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f42195h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f42196i0;

    static {
        boolean z10;
        T0.m mVar = new T0.m(0);
        if (mVar.f16798c <= mVar.f16799d) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        new C5061n(mVar);
        int i10 = AbstractC5530A.f45131a;
        f42189j0 = Integer.toString(0, 36);
        f42190k0 = Integer.toString(1, 36);
        f42191l0 = Integer.toString(2, 36);
        f42192m0 = Integer.toString(3, 36);
    }

    public C5061n(T0.m mVar) {
        this.f42193Y = mVar.f16797b;
        this.f42194Z = mVar.f16798c;
        this.f42195h0 = mVar.f16799d;
        this.f42196i0 = (String) mVar.f16800e;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        int i10 = this.f42193Y;
        if (i10 != 0) {
            bundle.putInt(f42189j0, i10);
        }
        int i11 = this.f42194Z;
        if (i11 != 0) {
            bundle.putInt(f42190k0, i11);
        }
        int i12 = this.f42195h0;
        if (i12 != 0) {
            bundle.putInt(f42191l0, i12);
        }
        String str = this.f42196i0;
        if (str != null) {
            bundle.putString(f42192m0, str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5061n)) {
            return false;
        }
        C5061n c5061n = (C5061n) obj;
        if (this.f42193Y == c5061n.f42193Y && this.f42194Z == c5061n.f42194Z && this.f42195h0 == c5061n.f42195h0 && AbstractC5530A.a(this.f42196i0, c5061n.f42196i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((527 + this.f42193Y) * 31) + this.f42194Z) * 31) + this.f42195h0) * 31;
        String str = this.f42196i0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }
}
