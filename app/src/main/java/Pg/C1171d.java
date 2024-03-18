package Pg;

import Df.H;
import Ng.C1072l;
import Ng.P0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: Pg.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171d implements P0 {

    /* renamed from: Y  reason: collision with root package name */
    public Object f14196Y = m.f14237p;

    /* renamed from: Z  reason: collision with root package name */
    public C1072l f14197Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f14198h0;

    public C1171d(k kVar) {
        this.f14198h0 = kVar;
    }

    public final Object a(AbstractC4825e abstractC4825e) {
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f14214n0;
        k kVar = this.f14198h0;
        t tVar = (t) atomicReferenceFieldUpdater.get(kVar);
        while (!kVar.B()) {
            long andIncrement = k.f14210j0.getAndIncrement(kVar);
            long j6 = m.f14223b;
            long j10 = andIncrement / j6;
            int i10 = (int) (andIncrement % j6);
            if (tVar.f16688h0 != j10) {
                t s10 = kVar.s(j10, tVar);
                if (s10 == null) {
                    continue;
                } else {
                    tVar = s10;
                }
            }
            Object L10 = kVar.L(tVar, i10, andIncrement, null);
            Q1.u uVar = m.f14234m;
            if (L10 != uVar) {
                Q1.u uVar2 = m.f14236o;
                if (L10 == uVar2) {
                    if (andIncrement < kVar.y()) {
                        tVar.a();
                    }
                } else if (L10 == m.f14235n) {
                    k kVar2 = this.f14198h0;
                    C1072l R10 = H.R(AbstractC5260f.z(abstractC4825e));
                    try {
                        this.f14197Z = R10;
                        Object L11 = kVar2.L(tVar, i10, andIncrement, this);
                        if (L11 == uVar) {
                            c(tVar, i10);
                        } else {
                            C6.a aVar = null;
                            AbstractC4831k abstractC4831k = R10.f12956j0;
                            wf.k kVar3 = kVar2.f14219Z;
                            if (L11 == uVar2) {
                                if (andIncrement < kVar2.y()) {
                                    tVar.a();
                                }
                                t tVar2 = (t) k.f14214n0.get(kVar2);
                                while (true) {
                                    if (kVar2.B()) {
                                        C1072l c1072l = this.f14197Z;
                                        AbstractC3557B.Z(c1072l);
                                        this.f14197Z = null;
                                        this.f14196Y = m.f14233l;
                                        Throwable v10 = kVar.v();
                                        if (v10 == null) {
                                            c1072l.resumeWith(Boolean.FALSE);
                                        } else {
                                            c1072l.resumeWith(N.w(v10));
                                        }
                                    } else {
                                        long andIncrement2 = k.f14210j0.getAndIncrement(kVar2);
                                        long j11 = m.f14223b;
                                        long j12 = andIncrement2 / j11;
                                        int i11 = (int) (andIncrement2 % j11);
                                        if (tVar2.f16688h0 != j12) {
                                            t s11 = kVar2.s(j12, tVar2);
                                            if (s11 != null) {
                                                tVar2 = s11;
                                            }
                                        }
                                        wf.k kVar4 = kVar3;
                                        Object L12 = kVar2.L(tVar2, i11, andIncrement2, this);
                                        if (L12 == m.f14234m) {
                                            c(tVar2, i11);
                                            break;
                                        } else if (L12 == m.f14236o) {
                                            if (andIncrement2 < kVar2.y()) {
                                                tVar2.a();
                                            }
                                            kVar3 = kVar4;
                                        } else if (L12 != m.f14235n) {
                                            tVar2.a();
                                            this.f14196Y = L12;
                                            this.f14197Z = null;
                                            bool = Boolean.TRUE;
                                            if (kVar4 != null) {
                                                aVar = Bi.c.U(kVar4, L12, abstractC4831k);
                                            }
                                        } else {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                    }
                                }
                            } else {
                                tVar.a();
                                this.f14196Y = L11;
                                this.f14197Z = null;
                                bool = Boolean.TRUE;
                                if (kVar3 != null) {
                                    aVar = Bi.c.U(kVar3, L11, abstractC4831k);
                                }
                            }
                            R10.A(bool, aVar);
                        }
                        Object t10 = R10.t();
                        if (t10 == EnumC5000a.f41328Y) {
                            N.k0(abstractC4825e);
                        }
                        return t10;
                    } catch (Throwable th2) {
                        R10.E();
                        throw th2;
                    }
                } else {
                    tVar.a();
                    this.f14196Y = L10;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable".toString());
            }
        }
        this.f14196Y = m.f14233l;
        Throwable v11 = kVar.v();
        if (v11 == null) {
            return Boolean.FALSE;
        }
        int i12 = Sg.A.f16630a;
        throw v11;
    }

    public final Object b() {
        Object obj = this.f14196Y;
        Q1.u uVar = m.f14237p;
        if (obj != uVar) {
            this.f14196Y = uVar;
            if (obj != m.f14233l) {
                return obj;
            }
            Throwable w10 = this.f14198h0.w();
            int i10 = Sg.A.f16630a;
            throw w10;
        }
        throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }

    @Override // Ng.P0
    public final void c(Sg.z zVar, int i10) {
        C1072l c1072l = this.f14197Z;
        if (c1072l != null) {
            c1072l.c(zVar, i10);
        }
    }
}
