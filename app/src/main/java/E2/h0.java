package E2;

import y2.C6513P;
import y2.l0;

/* loaded from: classes2.dex */
public final class h0 implements AbstractC0490w, AbstractC0489v {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0490w f4353Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f4354Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC0489v f4355h0;

    public h0(AbstractC0490w abstractC0490w, long j6) {
        this.f4353Y = abstractC0490w;
        this.f4354Z = j6;
    }

    @Override // E2.Z
    public final void C(long j6) {
        this.f4353Y.C(j6 - this.f4354Z);
    }

    @Override // E2.AbstractC0489v
    public final void a(AbstractC0490w abstractC0490w) {
        AbstractC0489v abstractC0489v = this.f4355h0;
        abstractC0489v.getClass();
        abstractC0489v.a(this);
    }

    @Override // E2.AbstractC0489v
    public final void b(Z z10) {
        AbstractC0490w abstractC0490w = (AbstractC0490w) z10;
        AbstractC0489v abstractC0489v = this.f4355h0;
        abstractC0489v.getClass();
        abstractC0489v.b(this);
    }

    @Override // E2.Z
    public final long c() {
        long c10 = this.f4353Y.c();
        if (c10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f4354Z + c10;
    }

    @Override // E2.AbstractC0490w
    public final void e() {
        this.f4353Y.e();
    }

    @Override // E2.AbstractC0490w
    public final long j(long j6) {
        long j10 = this.f4354Z;
        return this.f4353Y.j(j6 - j10) + j10;
    }

    @Override // E2.AbstractC0490w
    public final void k(long j6) {
        this.f4353Y.k(j6 - this.f4354Z);
    }

    @Override // E2.Z
    public final boolean l() {
        return this.f4353Y.l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y2.O] */
    @Override // E2.Z
    public final boolean m(C6513P c6513p) {
        ?? obj = new Object();
        obj.f50452b = c6513p.f50455b;
        obj.f50453c = c6513p.f50456c;
        obj.f50451a = c6513p.f50454a - this.f4354Z;
        return this.f4353Y.m(new C6513P(obj));
    }

    @Override // E2.AbstractC0490w
    public final long p(long j6, l0 l0Var) {
        long j10 = this.f4354Z;
        return this.f4353Y.p(j6 - j10, l0Var) + j10;
    }

    @Override // E2.AbstractC0490w
    public final void q(AbstractC0489v abstractC0489v, long j6) {
        this.f4355h0 = abstractC0489v;
        this.f4353Y.q(this, j6 - this.f4354Z);
    }

    @Override // E2.AbstractC0490w
    public final long r() {
        long r10 = this.f4353Y.r();
        if (r10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f4354Z + r10;
    }

    @Override // E2.AbstractC0490w
    public final i0 u() {
        return this.f4353Y.u();
    }

    @Override // E2.AbstractC0490w
    public final long v(H2.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j6) {
        Y[] yArr2 = new Y[yArr.length];
        int i10 = 0;
        while (true) {
            Y y10 = null;
            if (i10 >= yArr.length) {
                break;
            }
            g0 g0Var = (g0) yArr[i10];
            if (g0Var != null) {
                y10 = g0Var.f4348Y;
            }
            yArr2[i10] = y10;
            i10++;
        }
        long j10 = this.f4354Z;
        long v10 = this.f4353Y.v(sVarArr, zArr, yArr2, zArr2, j6 - j10);
        for (int i11 = 0; i11 < yArr.length; i11++) {
            Y y11 = yArr2[i11];
            if (y11 == null) {
                yArr[i11] = null;
            } else {
                Y y12 = yArr[i11];
                if (y12 == null || ((g0) y12).f4348Y != y11) {
                    yArr[i11] = new g0(y11, j10);
                }
            }
        }
        return v10 + j10;
    }

    @Override // E2.Z
    public final long x() {
        long x10 = this.f4353Y.x();
        if (x10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f4354Z + x10;
    }
}
