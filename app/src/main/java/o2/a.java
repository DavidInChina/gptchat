package O2;

import I2.i;
import L2.D;
import L2.q;
import L2.r;
import L2.s;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13341a;

    /* renamed from: b  reason: collision with root package name */
    public final D f13342b;

    public a(int i10) {
        this.f13341a = i10;
        if (i10 != 1) {
            this.f13342b = new D(16973, 2, "image/bmp");
        } else {
            this.f13342b = new D(35152, 2, "image/png");
        }
    }

    @Override // L2.q
    public final int a(r rVar, i iVar) {
        int i10 = this.f13341a;
        D d10 = this.f13342b;
        switch (i10) {
            case 0:
                return d10.a(rVar, iVar);
            default:
                return d10.a(rVar, iVar);
        }
    }

    @Override // L2.q
    public final void d(s sVar) {
        int i10 = this.f13341a;
        D d10 = this.f13342b;
        switch (i10) {
            case 0:
                d10.d(sVar);
                return;
            default:
                d10.d(sVar);
                return;
        }
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        int i10 = this.f13341a;
        D d10 = this.f13342b;
        switch (i10) {
            case 0:
                return d10.g(rVar);
            default:
                return d10.g(rVar);
        }
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        int i10 = this.f13341a;
        D d10 = this.f13342b;
        switch (i10) {
            case 0:
                d10.h(j6, j10);
                return;
            default:
                d10.h(j6, j10);
                return;
        }
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
