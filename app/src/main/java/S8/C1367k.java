package S8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* renamed from: S8.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367k {

    /* renamed from: e  reason: collision with root package name */
    public static final C1367k f16334e = new C1367k(null, null, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final N0.E f16335a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4326r f16336b;

    /* renamed from: c  reason: collision with root package name */
    public final Z0.n f16337c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f16338d;

    public C1367k(N0.E e10, AbstractC4326r abstractC4326r, Z0.n nVar, Boolean bool) {
        this.f16335a = e10;
        this.f16336b = abstractC4326r;
        this.f16337c = nVar;
        this.f16338d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1367k)) {
            return false;
        }
        C1367k c1367k = (C1367k) obj;
        if (AbstractC3557B.K(this.f16335a, c1367k.f16335a) && AbstractC3557B.K(this.f16336b, c1367k.f16336b) && AbstractC3557B.K(this.f16337c, c1367k.f16337c) && AbstractC3557B.K(this.f16338d, c1367k.f16338d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        N0.E e10 = this.f16335a;
        if (e10 == null) {
            i10 = 0;
        } else {
            i10 = e10.hashCode();
        }
        int i14 = i10 * 31;
        AbstractC4326r abstractC4326r = this.f16336b;
        if (abstractC4326r == null) {
            i11 = 0;
        } else {
            i11 = abstractC4326r.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        Z0.n nVar = this.f16337c;
        if (nVar == null) {
            i12 = 0;
        } else {
            i12 = Z0.n.d(nVar.f22811a);
        }
        int i16 = (i15 + i12) * 31;
        Boolean bool = this.f16338d;
        if (bool != null) {
            i13 = bool.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "CodeBlockStyle(textStyle=" + this.f16335a + ", modifier=" + this.f16336b + ", padding=" + this.f16337c + ", wordWrap=" + this.f16338d + Separators.RPAREN;
    }
}
