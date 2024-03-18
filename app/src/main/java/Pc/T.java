package pc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import wd.B0;
import wd.C6189g;
import wd.n0;
import wd.o0;

/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final C6189g f42944a;

    /* renamed from: b  reason: collision with root package name */
    public final B0 f42945b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42946c;

    /* renamed from: d  reason: collision with root package name */
    public final o0 f42947d;

    static {
        new T(true, new n0(AbstractC4344b.F0(C5129h.f42991d)), 3);
    }

    public T(C6189g c6189g, B0 b02, boolean z10, o0 o0Var) {
        AbstractC3557B.c0("availablePackages", o0Var);
        this.f42944a = c6189g;
        this.f42945b = b02;
        this.f42946c = z10;
        this.f42947d = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (AbstractC3557B.K(this.f42944a, t10.f42944a) && AbstractC3557B.K(this.f42945b, t10.f42945b) && this.f42946c == t10.f42946c && AbstractC3557B.K(this.f42947d, t10.f42947d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        C6189g c6189g = this.f42944a;
        if (c6189g == null) {
            i10 = 0;
        } else {
            i10 = c6189g.hashCode();
        }
        int i13 = i10 * 31;
        B0 b02 = this.f42945b;
        if (b02 != null) {
            i12 = b02.hashCode();
        }
        int i14 = (i13 + i12) * 31;
        if (this.f42946c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return this.f42947d.hashCode() + ((i14 + i11) * 31);
    }

    public final String toString() {
        return "SubscriptionState(activeAccount=" + this.f42944a + ", activeSubscription=" + this.f42945b + ", canMakePurchases=" + this.f42946c + ", availablePackages=" + this.f42947d + Separators.RPAREN;
    }

    public /* synthetic */ T(boolean z10, n0 n0Var, int i10) {
        this(null, null, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? wd.m0.f48443a : n0Var);
    }
}
