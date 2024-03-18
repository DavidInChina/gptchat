package l0;

import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: l0.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4320l implements AbstractC4326r {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4326r f37715b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4326r f37716c;

    public C4320l(AbstractC4326r abstractC4326r, AbstractC4326r abstractC4326r2) {
        this.f37715b = abstractC4326r;
        this.f37716c = abstractC4326r2;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return this.f37716c.a(this.f37715b.a(obj, nVar), nVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4320l) {
            C4320l c4320l = (C4320l) obj;
            if (AbstractC3557B.K(this.f37715b, c4320l.f37715b) && AbstractC3557B.K(this.f37716c, c4320l.f37716c)) {
                return true;
            }
        }
        return false;
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    public final int hashCode() {
        return (this.f37716c.hashCode() * 31) + this.f37715b.hashCode();
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        if (this.f37715b.l(kVar) && this.f37716c.l(kVar)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("["), (String) a("", C4319k.f37714Y), ']');
    }
}
