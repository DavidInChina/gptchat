package p9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import r0.C5347k;
import u0.AbstractC5824b;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5824b f42786a;

    /* renamed from: b  reason: collision with root package name */
    public final float f42787b;

    /* renamed from: c  reason: collision with root package name */
    public final C5347k f42788c;

    public j(AbstractC5824b abstractC5824b, float f6, C5347k c5347k) {
        AbstractC3557B.c0("painter", abstractC5824b);
        this.f42786a = abstractC5824b;
        this.f42787b = f6;
        this.f42788c = c5347k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3557B.K(this.f42786a, jVar.f42786a) && Float.compare(this.f42787b, jVar.f42787b) == 0 && AbstractC3557B.K(this.f42788c, jVar.f42788c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e10 = AbstractC6463a.e(this.f42787b, this.f42786a.hashCode() * 31, 31);
        C5347k c5347k = this.f42788c;
        if (c5347k == null) {
            i10 = 0;
        } else {
            i10 = c5347k.hashCode();
        }
        return e10 + i10;
    }

    public final String toString() {
        return "ForwardingDrawInfo(painter=" + this.f42786a + ", alpha=" + this.f42787b + ", colorFilter=" + this.f42788c + Separators.RPAREN;
    }
}
