package R2;

import I2.i;
import L2.D;
import L2.q;
import L2.r;
import L2.s;
import s2.u;

/* loaded from: classes2.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15024a;

    /* renamed from: b  reason: collision with root package name */
    public final u f15025b;

    /* renamed from: c  reason: collision with root package name */
    public final D f15026c;

    public a(int i10) {
        this.f15024a = i10;
        if (i10 != 1) {
            this.f15025b = new u(4);
            this.f15026c = new D(-1, -1, "image/heif");
            return;
        }
        this.f15025b = new u(4);
        this.f15026c = new D(-1, -1, "image/webp");
    }

    @Override // L2.q
    public final int a(r rVar, i iVar) {
        int i10 = this.f15024a;
        D d10 = this.f15026c;
        switch (i10) {
            case 0:
                return d10.a(rVar, iVar);
            default:
                return d10.a(rVar, iVar);
        }
    }

    @Override // L2.q
    public final void d(s sVar) {
        int i10 = this.f15024a;
        D d10 = this.f15026c;
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
        u uVar = this.f15025b;
        boolean z10 = true;
        switch (this.f15024a) {
            case 0:
                rVar.e(4);
                uVar.C(4);
                rVar.n(uVar.f45193a, 0, 4);
                if (uVar.v() == 1718909296) {
                    uVar.C(4);
                    rVar.n(uVar.f45193a, 0, 4);
                    if (uVar.v() == 1751476579) {
                        return true;
                    }
                }
                return false;
            default:
                uVar.C(4);
                rVar.n(uVar.f45193a, 0, 4);
                if (uVar.v() != 1380533830) {
                    return false;
                }
                rVar.e(4);
                uVar.C(4);
                rVar.n(uVar.f45193a, 0, 4);
                if (uVar.v() != 1464156752) {
                    z10 = false;
                }
                return z10;
        }
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        int i10 = this.f15024a;
        D d10 = this.f15026c;
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
