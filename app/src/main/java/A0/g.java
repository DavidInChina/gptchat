package A0;

import F0.j;
import Ng.F;
import Z0.p;
import com.google.android.gms.internal.play_billing.N;
import l0.AbstractC4325q;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5251c;
import z.C6672L;

/* loaded from: classes2.dex */
public final class g extends AbstractC4325q implements F0.f, a {

    /* renamed from: s0  reason: collision with root package name */
    public a f372s0;

    /* renamed from: t0  reason: collision with root package name */
    public d f373t0;

    /* renamed from: u0  reason: collision with root package name */
    public final j f374u0;

    public g(a aVar, d dVar) {
        this.f372s0 = aVar;
        this.f373t0 = dVar == null ? new d() : dVar;
        j jVar = new j(i.f376a);
        jVar.f5030i.setValue(this);
        this.f374u0 = jVar;
    }

    public final F A0() {
        g gVar;
        if (this.f37732r0) {
            gVar = (g) E9.f.a(this, i.f376a);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            return gVar.A0();
        }
        F f6 = this.f373t0.f360c;
        if (f6 != null) {
            return f6;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final a B0() {
        if (this.f37732r0) {
            return (a) E9.f.a(this, i.f376a);
        }
        return null;
    }

    @Override // A0.a
    public final long F(int i10, long j6) {
        long j10;
        a B02 = B0();
        if (B02 != null) {
            j10 = B02.F(i10, j6);
        } else {
            int i11 = C5251c.f43622e;
            j10 = C5251c.f43619b;
        }
        return C5251c.h(j10, this.f372s0.F(i10, C5251c.g(j6, j10)));
    }

    @Override // F0.f
    public final Bi.c M() {
        return this.f374u0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[RETURN] */
    @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(long j6, AbstractC4825e abstractC4825e) {
        f fVar;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        long j10;
        long j11;
        g gVar;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f371j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f371j0 = i11 - Integer.MIN_VALUE;
                obj = fVar.f369h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f371j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j10 = fVar.f368Z;
                            N.B0(obj);
                            return new p(p.e(j10, ((p) obj).f22815a));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = fVar.f368Z;
                    gVar = fVar.f367Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    a B02 = B0();
                    if (B02 != null) {
                        fVar.f367Y = this;
                        fVar.f368Z = j6;
                        fVar.f371j0 = 1;
                        obj = B02.T(j6, fVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        gVar = this;
                    } else {
                        j11 = p.f22813b;
                        gVar = this;
                        long j12 = j6;
                        j10 = j11;
                        a aVar = gVar.f372s0;
                        long d10 = p.d(j12, j10);
                        fVar.f367Y = null;
                        fVar.f368Z = j10;
                        fVar.f371j0 = 2;
                        obj = aVar.T(d10, fVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return new p(p.e(j10, ((p) obj).f22815a));
                    }
                }
                j11 = ((p) obj).f22815a;
                long j122 = j6;
                j10 = j11;
                a aVar2 = gVar.f372s0;
                long d102 = p.d(j122, j10);
                fVar.f367Y = null;
                fVar.f368Z = j10;
                fVar.f371j0 = 2;
                obj = aVar2.T(d102, fVar);
                if (obj == enumC5000a) {
                }
                return new p(p.e(j10, ((p) obj).f22815a));
            }
        }
        fVar = new f(this, abstractC4825e);
        obj = fVar.f369h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = fVar.f371j0;
        if (i10 == 0) {
        }
        j11 = ((p) obj).f22815a;
        long j1222 = j6;
        j10 = j11;
        a aVar22 = gVar.f372s0;
        long d1022 = p.d(j1222, j10);
        fVar.f367Y = null;
        fVar.f368Z = j10;
        fVar.f371j0 = 2;
        obj = aVar22.T(d1022, fVar);
        if (obj == enumC5000a) {
        }
        return new p(p.e(j10, ((p) obj).f22815a));
    }

    @Override // F0.f, F0.h
    public final /* synthetic */ Object a(F0.i iVar) {
        return E9.f.a(this, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j6, long j10, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        g gVar;
        a B02;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f366k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f366k0 = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f364i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f366k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j13 = eVar.f362Z;
                            N.B0(obj);
                            j12 = ((p) obj).f22815a;
                            j11 = j13;
                            return new p(p.e(j11, j12));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j16 = eVar.f363h0;
                    long j17 = eVar.f362Z;
                    gVar = eVar.f361Y;
                    N.B0(obj);
                    j14 = j16;
                    j15 = j17;
                } else {
                    N.B0(obj);
                    a aVar = this.f372s0;
                    eVar.f361Y = this;
                    j15 = j6;
                    eVar.f362Z = j15;
                    j14 = j10;
                    eVar.f363h0 = j14;
                    eVar.f366k0 = 1;
                    obj = aVar.l(j6, j10, eVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    gVar = this;
                }
                long j18 = ((p) obj).f22815a;
                B02 = gVar.B0();
                if (B02 == null) {
                    long e10 = p.e(j15, j18);
                    long d10 = p.d(j14, j18);
                    eVar.f361Y = null;
                    eVar.f362Z = j18;
                    eVar.f366k0 = 2;
                    obj = B02.l(e10, d10, eVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    j13 = j18;
                    j12 = ((p) obj).f22815a;
                    j11 = j13;
                    return new p(p.e(j11, j12));
                }
                j11 = j18;
                j12 = p.f22813b;
                return new p(p.e(j11, j12));
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj2 = eVar.f364i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f366k0;
        if (i10 == 0) {
        }
        long j182 = ((p) obj2).f22815a;
        B02 = gVar.B0();
        if (B02 == null) {
        }
    }

    @Override // l0.AbstractC4325q
    public final void t0() {
        d dVar = this.f373t0;
        dVar.f358a = this;
        dVar.f359b = new C6672L(18, this);
        dVar.f360c = p0();
    }

    @Override // A0.a
    public final long u(long j6, int i10, long j10) {
        long j11;
        long u10 = this.f372s0.u(j6, i10, j10);
        a B02 = B0();
        if (B02 != null) {
            j11 = B02.u(C5251c.h(j6, u10), i10, C5251c.g(j10, u10));
        } else {
            int i11 = C5251c.f43622e;
            j11 = C5251c.f43619b;
        }
        return C5251c.h(u10, j11);
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        d dVar = this.f373t0;
        if (dVar.f358a == this) {
            dVar.f358a = null;
        }
    }
}
