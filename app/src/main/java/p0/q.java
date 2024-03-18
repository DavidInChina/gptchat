package p0;

import A.C0007a0;
import G0.AbstractC0579h;
import G0.AbstractC0585n;
import G0.AbstractC0587p;
import G0.C0572a0;
import G0.g0;
import G0.j0;
import H0.C0714y;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import id.AbstractC3557B;
import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class q extends AbstractC4325q implements AbstractC0585n, j0, F0.f {

    /* renamed from: s0  reason: collision with root package name */
    public boolean f41711s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f41712t0;

    /* renamed from: u0  reason: collision with root package name */
    public p f41713u0 = p.f41709h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p0.i, java.lang.Object, p0.j] */
    public final j A0() {
        C0572a0 c0572a0;
        ?? obj = new Object();
        obj.f41692a = true;
        l lVar = l.f41703b;
        obj.f41693b = lVar;
        obj.f41694c = lVar;
        obj.f41695d = lVar;
        obj.f41696e = lVar;
        obj.f41697f = lVar;
        obj.f41698g = lVar;
        obj.f41699h = lVar;
        obj.f41700i = lVar;
        obj.f41701j = h.f41687Z;
        obj.f41702k = h.f41688h0;
        AbstractC4325q abstractC4325q = this.f37720Y;
        if (abstractC4325q.f37732r0) {
            androidx.compose.ui.node.a A10 = AbstractC0579h.A(this);
            AbstractC4325q abstractC4325q2 = abstractC4325q;
            loop0: while (A10 != null) {
                if ((A10.f24831B0.f5704e.f37723i0 & 3072) != 0) {
                    while (abstractC4325q2 != null) {
                        int i10 = abstractC4325q2.f37722h0;
                        if ((i10 & 3072) != 0) {
                            if (abstractC4325q2 != abstractC4325q && (i10 & 1024) != 0) {
                                break loop0;
                            } else if ((i10 & 2048) != 0) {
                                AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                C2104h c2104h = null;
                                while (abstractC4325q3 != null) {
                                    if (abstractC4325q3 instanceof k) {
                                        ((k) abstractC4325q3).S(obj);
                                    } else if ((abstractC4325q3.f37722h0 & 2048) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                        int i11 = 0;
                                        for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                            if ((abstractC4325q4.f37722h0 & 2048) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    abstractC4325q3 = abstractC4325q4;
                                                } else {
                                                    if (c2104h == null) {
                                                        c2104h = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (abstractC4325q3 != null) {
                                                        c2104h.b(abstractC4325q3);
                                                        abstractC4325q3 = null;
                                                    }
                                                    c2104h.b(abstractC4325q4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    abstractC4325q3 = AbstractC0579h.f(c2104h);
                                }
                            }
                        }
                        abstractC4325q2 = abstractC4325q2.f37724j0;
                    }
                }
                A10 = A10.E();
                if (A10 != null && (c0572a0 = A10.f24831B0) != null) {
                    abstractC4325q2 = c0572a0.f5703d;
                } else {
                    abstractC4325q2 = null;
                }
            }
            return obj;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final p B0() {
        r rVar;
        p pVar;
        androidx.compose.ui.node.a aVar;
        Owner owner;
        f focusOwner;
        g0 g0Var = this.f37720Y.f37727m0;
        if (g0Var != null && (aVar = g0Var.f5770n0) != null && (owner = aVar.f24850n0) != null && (focusOwner = ((C0714y) owner).getFocusOwner()) != null) {
            rVar = ((g) focusOwner).f41683c;
        } else {
            rVar = null;
        }
        if (rVar == null || (pVar = (p) rVar.f41714a.get(this)) == null) {
            return this.f41713u0;
        }
        return pVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final void C0() {
        int ordinal = B0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            ?? obj = new Object();
            AbstractC0579h.y(this, new C0007a0(obj, 10, this));
            Object obj2 = obj.f37622Y;
            if (obj2 != null) {
                if (!((i) obj2).a()) {
                    ((g) ((C0714y) AbstractC0579h.B(this)).getFocusOwner()).a(true, true);
                    return;
                }
                return;
            }
            AbstractC3557B.C2("focusProperties");
            throw null;
        }
    }

    public final void D0() {
        C0572a0 c0572a0;
        AbstractC4325q abstractC4325q = this.f37720Y;
        C2104h c2104h = null;
        while (true) {
            int i10 = 0;
            if (abstractC4325q == null) {
                break;
            }
            if (abstractC4325q instanceof d) {
                androidx.compose.ui.focus.a.r((d) abstractC4325q);
            } else if ((abstractC4325q.f37722h0 & 4096) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                for (AbstractC4325q abstractC4325q2 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                    if ((abstractC4325q2.f37722h0 & 4096) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC4325q = abstractC4325q2;
                        } else {
                            if (c2104h == null) {
                                c2104h = new C2104h(new AbstractC4325q[16]);
                            }
                            if (abstractC4325q != null) {
                                c2104h.b(abstractC4325q);
                                abstractC4325q = null;
                            }
                            c2104h.b(abstractC4325q2);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            abstractC4325q = AbstractC0579h.f(c2104h);
        }
        AbstractC4325q abstractC4325q3 = this.f37720Y;
        if (abstractC4325q3.f37732r0) {
            AbstractC4325q abstractC4325q4 = abstractC4325q3.f37724j0;
            androidx.compose.ui.node.a A10 = AbstractC0579h.A(this);
            while (A10 != null) {
                if ((A10.f24831B0.f5704e.f37723i0 & 5120) != 0) {
                    while (abstractC4325q4 != null) {
                        int i11 = abstractC4325q4.f37722h0;
                        if ((i11 & 5120) != 0 && (i11 & 1024) == 0 && abstractC4325q4.f37732r0) {
                            AbstractC4325q abstractC4325q5 = abstractC4325q4;
                            C2104h c2104h2 = null;
                            while (abstractC4325q5 != null) {
                                if (abstractC4325q5 instanceof d) {
                                    androidx.compose.ui.focus.a.r((d) abstractC4325q5);
                                } else if ((abstractC4325q5.f37722h0 & 4096) != 0 && (abstractC4325q5 instanceof AbstractC0587p)) {
                                    int i12 = 0;
                                    for (AbstractC4325q abstractC4325q6 = ((AbstractC0587p) abstractC4325q5).f5816t0; abstractC4325q6 != null; abstractC4325q6 = abstractC4325q6.f37725k0) {
                                        if ((abstractC4325q6.f37722h0 & 4096) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                abstractC4325q5 = abstractC4325q6;
                                            } else {
                                                if (c2104h2 == null) {
                                                    c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q5 != null) {
                                                    c2104h2.b(abstractC4325q5);
                                                    abstractC4325q5 = null;
                                                }
                                                c2104h2.b(abstractC4325q6);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC4325q5 = AbstractC0579h.f(c2104h2);
                            }
                        }
                        abstractC4325q4 = abstractC4325q4.f37724j0;
                    }
                }
                A10 = A10.E();
                if (A10 != null && (c0572a0 = A10.f24831B0) != null) {
                    abstractC4325q4 = c0572a0.f5703d;
                } else {
                    abstractC4325q4 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final void E0(p pVar) {
        androidx.compose.ui.focus.a.F(this).f41714a.put(this, pVar);
    }

    @Override // F0.f
    public final /* synthetic */ Bi.c M() {
        return F0.b.f5021h;
    }

    @Override // G0.j0
    public final void X() {
        p B02 = B0();
        C0();
        if (B02 != B0()) {
            androidx.compose.ui.focus.a.C(this);
        }
    }

    @Override // F0.f, F0.h
    public final /* synthetic */ Object a(F0.i iVar) {
        return E9.f.a(this, iVar);
    }

    @Override // l0.AbstractC4325q
    public final void v0() {
        int ordinal = B0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        D0();
                        return;
                    }
                    return;
                }
            } else {
                D0();
                r F10 = androidx.compose.ui.focus.a.F(this);
                try {
                    if (F10.f41716c) {
                        r.a(F10);
                    }
                    F10.f41716c = true;
                    E0(p.f41709h0);
                    r.b(F10);
                    return;
                } catch (Throwable th2) {
                    r.b(F10);
                    throw th2;
                }
            }
        }
        ((g) ((C0714y) AbstractC0579h.B(this)).getFocusOwner()).a(true, true);
    }
}
