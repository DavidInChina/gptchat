package e2;

import id.AbstractC3557B;

/* renamed from: e2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2784p implements X1.l {

    /* renamed from: b  reason: collision with root package name */
    public final C2783o f28784b;

    /* renamed from: c  reason: collision with root package name */
    public final C2783o f28785c;

    /* renamed from: d  reason: collision with root package name */
    public final C2783o f28786d;

    /* renamed from: e  reason: collision with root package name */
    public final C2783o f28787e;

    /* renamed from: f  reason: collision with root package name */
    public final C2783o f28788f;

    /* renamed from: g  reason: collision with root package name */
    public final C2783o f28789g;

    public C2784p(C2783o c2783o, C2783o c2783o2, C2783o c2783o3, C2783o c2783o4, C2783o c2783o5, C2783o c2783o6) {
        this.f28784b = c2783o;
        this.f28785c = c2783o2;
        this.f28786d = c2783o3;
        this.f28787e = c2783o4;
        this.f28788f = c2783o5;
        this.f28789g = c2783o6;
    }

    @Override // X1.m
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // X1.m
    public final boolean b(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final boolean c() {
        return ((Boolean) Z1.r.f23086Z.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final /* synthetic */ X1.m d(X1.m mVar) {
        return R.a.c(this, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2784p)) {
            return false;
        }
        C2784p c2784p = (C2784p) obj;
        if (AbstractC3557B.K(this.f28784b, c2784p.f28784b) && AbstractC3557B.K(this.f28785c, c2784p.f28785c) && AbstractC3557B.K(this.f28786d, c2784p.f28786d) && AbstractC3557B.K(this.f28787e, c2784p.f28787e) && AbstractC3557B.K(this.f28788f, c2784p.f28788f) && AbstractC3557B.K(this.f28789g, c2784p.f28789g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f28785c.hashCode();
        int hashCode2 = this.f28786d.hashCode();
        int hashCode3 = this.f28787e.hashCode();
        int hashCode4 = this.f28788f.hashCode();
        return this.f28789g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f28784b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f28784b + ", start=" + this.f28785c + ", top=" + this.f28786d + ", right=" + this.f28787e + ", end=" + this.f28788f + ", bottom=" + this.f28789g + ')';
    }

    public /* synthetic */ C2784p(C2783o c2783o, C2783o c2783o2, C2783o c2783o3, C2783o c2783o4) {
        this(new C2783o(0.0f, 3), c2783o, c2783o2, new C2783o(0.0f, 3), c2783o3, c2783o4);
    }
}
