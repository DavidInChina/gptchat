package E;

import D1.J0;
import Z.C1724m0;
import Z.o1;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import nf.AbstractC4828h;
import s1.C5523e;

/* renamed from: E.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419e implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3856a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3857b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f3858c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f3859d;

    public C0419e(int i10, String str) {
        this.f3856a = i10;
        this.f3857b = str;
        C5523e c5523e = C5523e.f45105e;
        o1 o1Var = o1.f22665a;
        this.f3858c = AbstractC4828h.Z(c5523e, o1Var);
        this.f3859d = AbstractC4828h.Z(Boolean.TRUE, o1Var);
    }

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        return e().f45106a;
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        return e().f45108c;
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        return e().f45107b;
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        return e().f45109d;
    }

    public final C5523e e() {
        return (C5523e) this.f3858c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0419e)) {
            return false;
        }
        if (this.f3856a == ((C0419e) obj).f3856a) {
            return true;
        }
        return false;
    }

    public final void f(J0 j02, int i10) {
        int i11 = this.f3856a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f3858c.setValue(j02.f3232a.f(i11));
            this.f3859d.setValue(Boolean.valueOf(j02.f3232a.p(i11)));
        }
    }

    public final int hashCode() {
        return this.f3856a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3857b);
        sb2.append('(');
        sb2.append(e().f45106a);
        sb2.append(", ");
        sb2.append(e().f45107b);
        sb2.append(", ");
        sb2.append(e().f45108c);
        sb2.append(", ");
        return AbstractC2469q0.j(sb2, e().f45109d, ')');
    }
}
