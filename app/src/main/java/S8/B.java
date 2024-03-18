package S8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: f  reason: collision with root package name */
    public static final B f16205f = new B(null, null, null, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Z0.n f16206a;

    /* renamed from: b  reason: collision with root package name */
    public final Z0.n f16207b;

    /* renamed from: c  reason: collision with root package name */
    public final Z0.n f16208c;

    /* renamed from: d  reason: collision with root package name */
    public final wf.k f16209d;

    /* renamed from: e  reason: collision with root package name */
    public final wf.k f16210e;

    public B(Z0.n nVar, Z0.n nVar2, Z0.n nVar3, wf.k kVar, wf.k kVar2) {
        this.f16206a = nVar;
        this.f16207b = nVar2;
        this.f16208c = nVar3;
        this.f16209d = kVar;
        this.f16210e = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        if (AbstractC3557B.K(this.f16206a, b10.f16206a) && AbstractC3557B.K(this.f16207b, b10.f16207b) && AbstractC3557B.K(this.f16208c, b10.f16208c) && AbstractC3557B.K(this.f16209d, b10.f16209d) && AbstractC3557B.K(this.f16210e, b10.f16210e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        Z0.n nVar = this.f16206a;
        if (nVar == null) {
            i10 = 0;
        } else {
            i10 = Z0.n.d(nVar.f22811a);
        }
        int i15 = i10 * 31;
        Z0.n nVar2 = this.f16207b;
        if (nVar2 == null) {
            i11 = 0;
        } else {
            i11 = Z0.n.d(nVar2.f22811a);
        }
        int i16 = (i15 + i11) * 31;
        Z0.n nVar3 = this.f16208c;
        if (nVar3 == null) {
            i12 = 0;
        } else {
            i12 = Z0.n.d(nVar3.f22811a);
        }
        int i17 = (i16 + i12) * 31;
        wf.k kVar = this.f16209d;
        if (kVar == null) {
            i13 = 0;
        } else {
            i13 = kVar.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        wf.k kVar2 = this.f16210e;
        if (kVar2 != null) {
            i14 = kVar2.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        return "ListStyle(markerIndent=" + this.f16206a + ", contentsIndent=" + this.f16207b + ", itemSpacing=" + this.f16208c + ", orderedMarkers=" + this.f16209d + ", unorderedMarkers=" + this.f16210e + Separators.RPAREN;
    }
}
