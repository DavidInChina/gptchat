package Bh;

/* loaded from: classes.dex */
public final class P0 extends Nh.l {

    /* renamed from: h0  reason: collision with root package name */
    public final String f2238h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Q0 f2239i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(Q0 q02, Nh.l lVar, String str) {
        super(Sh.I.f16703b, lVar);
        this.f2239i0 = q02;
        this.f2238h0 = str;
    }

    @Override // Nh.l
    public final io.sentry.vendor.b e(String str, boolean z10) {
        this.f2239i0.f2246d.i();
        return super.e(str, z10);
    }

    @Override // Nh.l
    public final io.sentry.vendor.b f() {
        this.f2239i0.f2246d.l(this.f2238h0);
        return super.f();
    }

    @Override // Nh.l
    public final void q(String str, String str2, Nh.j jVar, Object... objArr) {
        Q0 q02 = this.f2239i0;
        q02.f2246d.h();
        for (Object obj : objArr) {
            if (obj instanceof Nh.e) {
                q02.f2246d.e();
            }
        }
        super.q(str, str2, jVar, objArr);
    }

    @Override // Nh.l
    public final void r(int i10, Nh.k kVar) {
        if (i10 == 168) {
            this.f2239i0.f2246d.a();
        }
        super.r(i10, kVar);
    }

    @Override // Nh.l
    public final void t(Object obj) {
        boolean z10 = obj instanceof Nh.r;
        Q0 q02 = this.f2239i0;
        if (z10) {
            switch (((Nh.r) obj).s()) {
                case 9:
                case 10:
                    q02.f2246d.j();
                    break;
                case 11:
                    q02.f2246d.d();
                    break;
            }
        } else if (obj instanceof Nh.j) {
            q02.f2246d.m();
        } else if (obj instanceof Nh.e) {
            q02.f2246d.e();
        }
        super.t(obj);
    }

    @Override // Nh.l
    public final void z(int i10, String str, String str2, String str3, boolean z10) {
        if (z10 && i10 == 183) {
            this.f2239i0.f2246d.f();
        }
        super.z(i10, str, str2, str3, z10);
    }
}
