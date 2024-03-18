package Z1;

import e2.C2769a;
import e2.C2770b;
import id.AbstractC3557B;

/* renamed from: Z1.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1782y {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f23126a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23127b;

    /* renamed from: c  reason: collision with root package name */
    public final C2769a f23128c;

    /* renamed from: d  reason: collision with root package name */
    public final C2770b f23129d;

    public /* synthetic */ C1782y(q0 q0Var, int i10, C2769a c2769a, C2770b c2770b, int i11) {
        this(q0Var, i10, (i11 & 4) != 0 ? null : c2769a, (i11 & 8) != 0 ? null : c2770b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782y)) {
            return false;
        }
        C1782y c1782y = (C1782y) obj;
        if (this.f23126a == c1782y.f23126a && this.f23127b == c1782y.f23127b && AbstractC3557B.K(this.f23128c, c1782y.f23128c) && AbstractC3557B.K(this.f23129d, c1782y.f23129d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.f23126a.hashCode() * 31) + this.f23127b) * 31;
        int i11 = 0;
        C2769a c2769a = this.f23128c;
        if (c2769a == null) {
            i10 = 0;
        } else {
            i10 = c2769a.f28743a;
        }
        int i12 = (hashCode + i10) * 31;
        C2770b c2770b = this.f23129d;
        if (c2770b != null) {
            i11 = c2770b.f28745a;
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f23126a + ", numChildren=" + this.f23127b + ", horizontalAlignment=" + this.f23128c + ", verticalAlignment=" + this.f23129d + ')';
    }

    public C1782y(q0 q0Var, int i10, C2769a c2769a, C2770b c2770b) {
        this.f23126a = q0Var;
        this.f23127b = i10;
        this.f23128c = c2769a;
        this.f23129d = c2770b;
    }
}
