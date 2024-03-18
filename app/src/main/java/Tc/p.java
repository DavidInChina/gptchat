package Tc;

import W.B3;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class p implements B3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f17114a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.n f17115b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17116c = "";

    public p(int i10, wf.n nVar) {
        AbstractC2469q0.q("duration", i10);
        AbstractC3557B.c0("body", nVar);
        this.f17114a = i10;
        this.f17115b = nVar;
    }

    @Override // W.B3
    public final String a() {
        return this.f17116c;
    }

    @Override // W.B3
    public final String b() {
        return null;
    }

    @Override // W.B3
    public final int c() {
        return this.f17114a;
    }

    @Override // W.B3
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f17114a == pVar.f17114a && AbstractC3557B.K(this.f17115b, pVar.f17115b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17115b.hashCode() + (AbstractC6708l.f(this.f17114a) * 31);
    }

    public final String toString() {
        return "CustomComposableSnackbar(duration=" + R.a.H(this.f17114a) + ", body=" + this.f17115b + Separators.RPAREN;
    }
}
