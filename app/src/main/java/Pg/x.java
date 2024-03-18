package Pg;

import Ng.P0;
import k6.AbstractC4194d;
import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class x extends k {

    /* renamed from: r0  reason: collision with root package name */
    public final EnumC1170c f14254r0;

    public x(int i10, EnumC1170c enumC1170c, wf.k kVar) {
        super(i10, kVar);
        this.f14254r0 = enumC1170c;
        if (enumC1170c != EnumC1170c.f14192Y) {
            if (i10 >= 1) {
                return;
            }
            throw new IllegalArgumentException(AbstractC4194d.v("Buffered channel capacity must be at least 1, but ", i10, " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.C.f37623a.b(k.class).o() + " instead").toString());
    }

    @Override // Pg.k
    public final boolean C() {
        if (this.f14254r0 == EnumC1170c.f14193Z) {
            return true;
        }
        return false;
    }

    public final Object O(Object obj, boolean z10) {
        t tVar;
        P0 p02;
        wf.k kVar;
        K0.e X10;
        EnumC1170c enumC1170c = EnumC1170c.f14194h0;
        jf.y yVar = jf.y.f36177a;
        if (this.f14254r0 == enumC1170c) {
            Object t10 = super.t(obj);
            if (!(!(t10 instanceof r)) && !(t10 instanceof q)) {
                if (z10 && (kVar = this.f14219Z) != null && (X10 = Bi.c.X(kVar, obj, null)) != null) {
                    throw X10;
                }
                return yVar;
            }
            return t10;
        }
        Q1.u uVar = m.f14225d;
        t tVar2 = (t) k.f14213m0.get(this);
        while (true) {
            long andIncrement = k.f14209i0.getAndIncrement(this);
            long j6 = andIncrement & 1152921504606846975L;
            boolean A10 = A(andIncrement, false);
            int i10 = m.f14223b;
            long j10 = i10;
            long j11 = j6 / j10;
            int i11 = (int) (j6 % j10);
            if (tVar2.f16688h0 != j11) {
                t a5 = k.a(this, j11, tVar2);
                if (a5 == null) {
                    if (A10) {
                        return new q(x());
                    }
                } else {
                    tVar = a5;
                }
            } else {
                tVar = tVar2;
            }
            int j12 = k.j(this, tVar, i11, obj, j6, uVar, A10);
            if (j12 != 0) {
                if (j12 != 1) {
                    if (j12 != 2) {
                        if (j12 != 3) {
                            if (j12 != 4) {
                                if (j12 == 5) {
                                    tVar.a();
                                }
                                tVar2 = tVar;
                            } else {
                                if (j6 < k.f14210j0.get(this)) {
                                    tVar.a();
                                }
                                return new q(x());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else if (A10) {
                        tVar.h();
                        return new q(x());
                    } else {
                        if (uVar instanceof P0) {
                            p02 = (P0) uVar;
                        } else {
                            p02 = null;
                        }
                        if (p02 != null) {
                            p02.c(tVar, i11 + i10);
                        }
                        q((tVar.f16688h0 * j10) + i11);
                        return yVar;
                    }
                } else {
                    return yVar;
                }
            } else {
                tVar.a();
                return yVar;
            }
        }
    }

    @Override // Pg.k, Pg.D
    public final Object n(Object obj, AbstractC4825e abstractC4825e) {
        K0.e X10;
        Object O10 = O(obj, true);
        if (O10 instanceof q) {
            s.a(O10);
            wf.k kVar = this.f14219Z;
            if (kVar != null && (X10 = Bi.c.X(kVar, obj, null)) != null) {
                P4.a.m(X10, x());
                throw X10;
            }
            throw x();
        }
        return jf.y.f36177a;
    }

    @Override // Pg.k, Pg.D
    public final Object t(Object obj) {
        return O(obj, false);
    }
}
