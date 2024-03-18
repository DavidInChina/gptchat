package lh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import q0.C5252d;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final r0.z f38508a;

    /* renamed from: b  reason: collision with root package name */
    public final r f38509b;

    /* renamed from: c  reason: collision with root package name */
    public final Z0.j f38510c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f38511d;

    /* renamed from: e  reason: collision with root package name */
    public final w f38512e;

    public u(r0.z zVar, r rVar, C5252d c5252d, boolean z10, w wVar) {
        AbstractC3557B.c0("orientation", wVar);
        Z0.j jVar = new Z0.j((int) c5252d.f43625a, (int) c5252d.f43626b, (int) c5252d.f43627c, (int) c5252d.f43628d);
        this.f38508a = zVar;
        this.f38509b = rVar;
        this.f38510c = jVar;
        this.f38511d = z10;
        this.f38512e = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f38508a, uVar.f38508a) && AbstractC3557B.K(this.f38509b, uVar.f38509b) && AbstractC3557B.K(this.f38510c, uVar.f38510c) && this.f38511d == uVar.f38511d && this.f38512e == uVar.f38512e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        r0.z zVar = this.f38508a;
        if (zVar == null) {
            i10 = 0;
        } else {
            i10 = zVar.hashCode();
        }
        int hashCode = this.f38509b.hashCode();
        int hashCode2 = (this.f38510c.hashCode() + ((hashCode + (i10 * 31)) * 31)) * 31;
        if (this.f38511d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return this.f38512e.hashCode() + ((hashCode2 + i11) * 31);
    }

    public final String toString() {
        return "CanvasRegionTile(bitmap=" + this.f38508a + ", bitmapRegion=" + this.f38509b + ", bounds=" + this.f38510c + ", isBaseTile=" + this.f38511d + ", orientation=" + this.f38512e + Separators.RPAREN;
    }
}
