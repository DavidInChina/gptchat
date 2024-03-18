package X1;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f21734b;

    /* renamed from: c  reason: collision with root package name */
    public final m f21735c;

    public e(m mVar, m mVar2) {
        this.f21734b = mVar;
        this.f21735c = mVar2;
    }

    @Override // X1.m
    public final Object a(Object obj, wf.n nVar) {
        return this.f21735c.a(this.f21734b.a(obj, nVar), nVar);
    }

    @Override // X1.m
    public final boolean b(wf.k kVar) {
        if (!this.f21734b.b(kVar) && !this.f21735c.b(kVar)) {
            return false;
        }
        return true;
    }

    @Override // X1.m
    public final boolean c() {
        if (this.f21734b.c() && this.f21735c.c()) {
            return true;
        }
        return false;
    }

    @Override // X1.m
    public final /* synthetic */ m d(m mVar) {
        return R.a.c(this, mVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (AbstractC3557B.K(this.f21734b, eVar.f21734b) && AbstractC3557B.K(this.f21735c, eVar.f21735c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21735c.hashCode() * 31) + this.f21734b.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("["), (String) a("", d.f21727Z), ']');
    }
}
