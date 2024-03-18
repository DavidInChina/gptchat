package W;

import d1.EnumC2588w;

/* loaded from: classes2.dex */
public final class P1 {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC2588w f19543a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19544b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19545c;

    public P1(EnumC2588w enumC2588w, boolean z10, boolean z11) {
        this.f19543a = enumC2588w;
        this.f19544b = z10;
        this.f19545c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P1)) {
            return false;
        }
        P1 p12 = (P1) obj;
        if (this.f19543a == p12.f19543a && this.f19544b == p12.f19544b && this.f19545c == p12.f19545c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f19543a.hashCode() * 31;
        int i11 = 1237;
        if (this.f19544b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f19545c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
