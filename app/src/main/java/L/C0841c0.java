package L;

import B.W0;
import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.C0572a0;
import b0.C2104h;
import h0.C3289b;
import id.AbstractC3557B;
import j0.AbstractC3882G;
import l0.AbstractC4325q;
import l8.AbstractC4344b;
import q0.C5252d;
import w.C6072s;
import z.AbstractC6708l;

/* renamed from: L.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841c0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10104Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f10105Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f10106h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f10107i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f10108j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0841c0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(1);
        this.f10104Y = i11;
        this.f10105Z = obj;
        this.f10108j0 = obj2;
        this.f10106h0 = obj3;
        this.f10107i0 = i10;
    }

    public final void a(E0.c0 c0Var) {
        boolean z10;
        int i10 = this.f10104Y;
        int i11 = this.f10107i0;
        Object obj = this.f10106h0;
        N0.C c10 = null;
        Object obj2 = this.f10108j0;
        Object obj3 = this.f10105Z;
        switch (i10) {
            case 0:
                E0.P p10 = (E0.P) obj3;
                C0843d0 c0843d0 = (C0843d0) obj2;
                int i12 = c0843d0.f10115c;
                Q0 q02 = (Q0) c0843d0.f10117e.mo122invoke();
                if (q02 != null) {
                    c10 = q02.f10054a;
                }
                N0.C c11 = c10;
                if (p10.getLayoutDirection() == Z0.l.f22806Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                E0.d0 d0Var = (E0.d0) obj;
                C5252d A10 = R4.b.A(p10, i12, c0843d0.f10116d, c11, z10, d0Var.f4053Y);
                W0 w02 = W0.f1214Z;
                int i13 = d0Var.f4053Y;
                N0 n02 = c0843d0.f10114b;
                n02.a(w02, A10, i11, i13);
                E0.c0.g(c0Var, d0Var, AbstractC4344b.Y0(-n02.f10005a.h()), 0);
                return;
            default:
                E0.P p11 = (E0.P) obj3;
                S0 s02 = (S0) obj2;
                int i14 = s02.f10067c;
                Q0 q03 = (Q0) s02.f10069e.mo122invoke();
                if (q03 != null) {
                    c10 = q03.f10054a;
                }
                E0.d0 d0Var2 = (E0.d0) obj;
                C5252d A11 = R4.b.A(p11, i14, s02.f10068d, c10, false, d0Var2.f4053Y);
                W0 w03 = W0.f1213Y;
                int i15 = d0Var2.f4054Z;
                N0 n03 = s02.f10066b;
                n03.a(w03, A11, i11, i15);
                E0.c0.g(c0Var, d0Var2, 0, AbstractC4344b.Y0(-n03.f10005a.h()));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        boolean z10;
        AbstractC4325q abstractC4325q;
        C0572a0 c0572a0;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f10104Y;
        Object obj2 = this.f10106h0;
        int i12 = this.f10107i0;
        Object obj3 = this.f10108j0;
        Object obj4 = this.f10105Z;
        switch (i11) {
            case 0:
                a((E0.c0) obj);
                return yVar;
            case 1:
                a((E0.c0) obj);
                return yVar;
            case 2:
                if (obj != ((Z.I) obj4)) {
                    if (obj instanceof AbstractC3882G) {
                        C6072s c6072s = (C6072s) obj2;
                        int i13 = ((C3289b) obj3).f31682a - i12;
                        int d10 = c6072s.d(obj);
                        if (d10 >= 0) {
                            i10 = c6072s.f47627c[d10];
                        } else {
                            i10 = Integer.MAX_VALUE;
                        }
                        int min = Math.min(i13, i10);
                        int c10 = c6072s.c(obj);
                        if (c10 < 0) {
                            c10 = ~c10;
                        }
                        c6072s.f47626b[c10] = obj;
                        c6072s.f47627c[c10] = min;
                    }
                    return yVar;
                }
                throw new IllegalStateException("A derived state calculation cannot read itself".toString());
            default:
                p0.q qVar = (p0.q) obj;
                if (AbstractC3557B.K(qVar, (p0.q) obj4)) {
                    return Boolean.FALSE;
                }
                AbstractC4325q abstractC4325q2 = qVar.f37720Y;
                if (abstractC4325q2.f37732r0) {
                    AbstractC4325q abstractC4325q3 = abstractC4325q2.f37724j0;
                    androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar);
                    while (true) {
                        z10 = true;
                        abstractC4325q = null;
                        if (A10 != null) {
                            if ((A10.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                                while (abstractC4325q3 != null) {
                                    if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                                        AbstractC4325q abstractC4325q4 = abstractC4325q3;
                                        C2104h c2104h = null;
                                        while (abstractC4325q4 != null) {
                                            if (abstractC4325q4 instanceof p0.q) {
                                                abstractC4325q = abstractC4325q4;
                                            } else {
                                                if ((abstractC4325q4.f37722h0 & 1024) != 0 && (abstractC4325q4 instanceof AbstractC0587p)) {
                                                    int i14 = 0;
                                                    for (AbstractC4325q abstractC4325q5 = ((AbstractC0587p) abstractC4325q4).f5816t0; abstractC4325q5 != null; abstractC4325q5 = abstractC4325q5.f37725k0) {
                                                        if ((abstractC4325q5.f37722h0 & 1024) != 0) {
                                                            i14++;
                                                            if (i14 == 1) {
                                                                abstractC4325q4 = abstractC4325q5;
                                                            } else {
                                                                if (c2104h == null) {
                                                                    c2104h = new C2104h(new AbstractC4325q[16]);
                                                                }
                                                                if (abstractC4325q4 != null) {
                                                                    c2104h.b(abstractC4325q4);
                                                                    abstractC4325q4 = null;
                                                                }
                                                                c2104h.b(abstractC4325q5);
                                                            }
                                                        }
                                                    }
                                                    if (i14 == 1) {
                                                    }
                                                }
                                                abstractC4325q4 = AbstractC0579h.f(c2104h);
                                            }
                                        }
                                        continue;
                                    }
                                    abstractC4325q3 = abstractC4325q3.f37724j0;
                                }
                            }
                            A10 = A10.E();
                            if (A10 != null && (c0572a0 = A10.f24831B0) != null) {
                                abstractC4325q3 = c0572a0.f5703d;
                            } else {
                                abstractC4325q3 = null;
                            }
                        }
                    }
                    if (abstractC4325q != null) {
                        p0.r rVar = ((p0.g) obj3).f41683c;
                        kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) obj2;
                        try {
                            if (rVar.f41716c) {
                                p0.r.a(rVar);
                            }
                            rVar.f41716c = true;
                            int f6 = AbstractC6708l.f(androidx.compose.ui.focus.a.y(qVar, i12));
                            if (f6 != 0) {
                                if (f6 != 1) {
                                    if (f6 != 2) {
                                        if (f6 != 3) {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                xVar.f37645Y = true;
                            } else {
                                z10 = androidx.compose.ui.focus.a.z(qVar);
                            }
                            Boolean valueOf = Boolean.valueOf(z10);
                            p0.r.b(rVar);
                            return valueOf;
                        } catch (Throwable th2) {
                            p0.r.b(rVar);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Focus search landed at the root.".toString());
                }
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0841c0(p0.q qVar, p0.g gVar, int i10, kotlin.jvm.internal.x xVar) {
        super(1);
        this.f10104Y = 3;
        this.f10105Z = qVar;
        this.f10108j0 = gVar;
        this.f10107i0 = i10;
        this.f10106h0 = xVar;
    }
}
