package Z1;

import a1.C1915c;
import e2.C2769a;
import e2.C2770b;

/* renamed from: Z1.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1778u {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f23112a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23113b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23114c;

    public C1778u(q0 q0Var, int i10, int i11) {
        this.f23112a = q0Var;
        this.f23113b = i10;
        this.f23114c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778u)) {
            return false;
        }
        C1778u c1778u = (C1778u) obj;
        if (this.f23112a == c1778u.f23112a && C2769a.b(this.f23113b, c1778u.f23113b) && C2770b.b(this.f23114c, c1778u.f23114c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        P5.c cVar = C2769a.f28742b;
        C1915c c1915c = C2770b.f28744b;
        return (((this.f23112a.hashCode() * 31) + this.f23113b) * 31) + this.f23114c;
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f23112a + ", horizontalAlignment=" + ((Object) C2769a.c(this.f23113b)) + ", verticalAlignment=" + ((Object) C2770b.c(this.f23114c)) + ')';
    }
}
