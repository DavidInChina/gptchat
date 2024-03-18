package y2;

import s2.AbstractC5532b;

/* renamed from: y2.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6525l implements Q {

    /* renamed from: Y  reason: collision with root package name */
    public final m0 f50645Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6524k f50646Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC6519f f50647h0;

    /* renamed from: i0  reason: collision with root package name */
    public Q f50648i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f50649j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f50650k0;

    public C6525l(AbstractC6524k abstractC6524k, AbstractC5532b abstractC5532b) {
        this.f50646Z = abstractC6524k;
        this.f50645Y = new m0(abstractC5532b);
    }

    @Override // y2.Q
    public final long a() {
        if (this.f50649j0) {
            return this.f50645Y.a();
        }
        Q q10 = this.f50648i0;
        q10.getClass();
        return q10.a();
    }

    @Override // y2.Q
    public final p2.S c() {
        Q q10 = this.f50648i0;
        if (q10 != null) {
            return q10.c();
        }
        return this.f50645Y.f50660j0;
    }

    @Override // y2.Q
    public final void d(p2.S s10) {
        Q q10 = this.f50648i0;
        if (q10 != null) {
            q10.d(s10);
            s10 = this.f50648i0.c();
        }
        this.f50645Y.d(s10);
    }
}
