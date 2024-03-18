package U8;

import N0.y;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class j extends o {

    /* renamed from: f  reason: collision with root package name */
    public static final y f17532f = new y(r0.r.f44261i, 0, null, null, null, null, null, 0, null, null, null, 0, Y0.j.f22032c, null, 61438);

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC6216a f17533e;

    public j(Q8.o oVar) {
        super(null);
        this.f17533e = oVar;
    }

    @Override // U8.o
    public final y a(q qVar) {
        return qVar.f17557h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && AbstractC3557B.K(this.f17533e, ((j) obj).f17533e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17533e.hashCode();
    }

    public final String toString() {
        return "Link(onClick=" + this.f17533e + Separators.RPAREN;
    }
}
