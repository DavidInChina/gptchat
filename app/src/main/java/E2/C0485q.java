package E2;

import s2.AbstractC5530A;
import y2.C6513P;
import y2.l0;

/* renamed from: E2.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485q implements AbstractC0490w, AbstractC0489v {

    /* renamed from: Y  reason: collision with root package name */
    public final C0492y f4394Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f4395Z;

    /* renamed from: h0  reason: collision with root package name */
    public final I2.d f4396h0;

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC0469a f4397i0;

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC0490w f4398j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC0489v f4399k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f4400l0 = -9223372036854775807L;

    public C0485q(C0492y c0492y, I2.d dVar, long j6) {
        this.f4394Y = c0492y;
        this.f4396h0 = dVar;
        this.f4395Z = j6;
    }

    @Override // E2.Z
    public final void C(long j6) {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        abstractC0490w.C(j6);
    }

    @Override // E2.AbstractC0489v
    public final void a(AbstractC0490w abstractC0490w) {
        AbstractC0489v abstractC0489v = this.f4399k0;
        int i10 = AbstractC5530A.f45131a;
        abstractC0489v.a(this);
    }

    @Override // E2.AbstractC0489v
    public final void b(Z z10) {
        AbstractC0490w abstractC0490w = (AbstractC0490w) z10;
        AbstractC0489v abstractC0489v = this.f4399k0;
        int i10 = AbstractC5530A.f45131a;
        abstractC0489v.b(this);
    }

    @Override // E2.Z
    public final long c() {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        return abstractC0490w.c();
    }

    public final void d(C0492y c0492y) {
        long j6 = this.f4400l0;
        if (j6 == -9223372036854775807L) {
            j6 = this.f4395Z;
        }
        AbstractC0469a abstractC0469a = this.f4397i0;
        abstractC0469a.getClass();
        AbstractC0490w a5 = abstractC0469a.a(c0492y, this.f4396h0, j6);
        this.f4398j0 = a5;
        if (this.f4399k0 != null) {
            a5.q(this, j6);
        }
    }

    @Override // E2.AbstractC0490w
    public final void e() {
        AbstractC0490w abstractC0490w = this.f4398j0;
        if (abstractC0490w != null) {
            abstractC0490w.e();
            return;
        }
        AbstractC0469a abstractC0469a = this.f4397i0;
        if (abstractC0469a != null) {
            abstractC0469a.i();
        }
    }

    public final void f() {
        if (this.f4398j0 != null) {
            AbstractC0469a abstractC0469a = this.f4397i0;
            abstractC0469a.getClass();
            abstractC0469a.m(this.f4398j0);
        }
    }

    @Override // E2.AbstractC0490w
    public final long j(long j6) {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        return abstractC0490w.j(j6);
    }

    @Override // E2.AbstractC0490w
    public final void k(long j6) {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        abstractC0490w.k(j6);
    }

    @Override // E2.Z
    public final boolean l() {
        AbstractC0490w abstractC0490w = this.f4398j0;
        if (abstractC0490w != null && abstractC0490w.l()) {
            return true;
        }
        return false;
    }

    @Override // E2.Z
    public final boolean m(C6513P c6513p) {
        AbstractC0490w abstractC0490w = this.f4398j0;
        if (abstractC0490w != null && abstractC0490w.m(c6513p)) {
            return true;
        }
        return false;
    }

    @Override // E2.AbstractC0490w
    public final long p(long j6, l0 l0Var) {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        return abstractC0490w.p(j6, l0Var);
    }

    @Override // E2.AbstractC0490w
    public final void q(AbstractC0489v abstractC0489v, long j6) {
        this.f4399k0 = abstractC0489v;
        AbstractC0490w abstractC0490w = this.f4398j0;
        if (abstractC0490w != null) {
            long j10 = this.f4400l0;
            if (j10 == -9223372036854775807L) {
                j10 = this.f4395Z;
            }
            abstractC0490w.q(this, j10);
        }
    }

    @Override // E2.AbstractC0490w
    public final long r() {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        return abstractC0490w.r();
    }

    @Override // E2.AbstractC0490w
    public final i0 u() {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        return abstractC0490w.u();
    }

    @Override // E2.AbstractC0490w
    public final long v(H2.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j6) {
        long j10;
        long j11 = this.f4400l0;
        if (j11 != -9223372036854775807L && j6 == this.f4395Z) {
            j10 = j11;
        } else {
            j10 = j6;
        }
        this.f4400l0 = -9223372036854775807L;
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        return abstractC0490w.v(sVarArr, zArr, yArr, zArr2, j10);
    }

    @Override // E2.Z
    public final long x() {
        AbstractC0490w abstractC0490w = this.f4398j0;
        int i10 = AbstractC5530A.f45131a;
        return abstractC0490w.x();
    }
}
