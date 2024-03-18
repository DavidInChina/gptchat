package p9;

import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.r0;
import Qg.s0;
import Z.C1724m0;
import Z.o1;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q0.C5251c;

/* renamed from: p9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5100b implements D.m {

    /* renamed from: a  reason: collision with root package name */
    public final C1724m0 f42761a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f42762b;

    /* renamed from: c  reason: collision with root package name */
    public final r0 f42763c = s0.b(0, 16, EnumC1170c.f14193Z, 1);

    public C5100b() {
        C1724m0 Z10 = AbstractC4828h.Z(null, o1.f22665a);
        this.f42761a = Z10;
        this.f42762b = Z10;
    }

    @Override // D.l
    public final AbstractC1206i a() {
        return this.f42763c;
    }

    @Override // D.m
    public final Object b(D.k kVar, AbstractC4825e abstractC4825e) {
        d(kVar);
        Object c10 = this.f42763c.c(kVar, abstractC4825e);
        if (c10 == EnumC5000a.f41328Y) {
            return c10;
        }
        return y.f36177a;
    }

    @Override // D.m
    public final boolean c(D.k kVar) {
        d(kVar);
        return this.f42763c.g(kVar);
    }

    public final void d(D.k kVar) {
        if (kVar instanceof D.p) {
            long j6 = ((D.p) kVar).f3192a;
            this.f42761a.setValue(new Z0.i(kotlin.jvm.internal.m.c((int) C5251c.d(j6), (int) C5251c.e(j6))));
        }
    }
}
