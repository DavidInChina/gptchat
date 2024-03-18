package G0;

import B0.C0197n;
import E0.AbstractC0442a;
import E0.AbstractC0459s;
import E0.AbstractC0466z;
import E0.C0458q;
import H0.C0714y;
import Z.AbstractC1735s0;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import h0.C3291d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4324p;
import l0.AbstractC4325q;
import o0.AbstractC4871f;
import wf.AbstractC6216a;
import z.AbstractC6708l;
import z0.AbstractC6740c;

/* renamed from: G0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0579h {

    /* renamed from: a  reason: collision with root package name */
    public static final C0577f f5783a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Z0.c f5784b = new Z0.c(1.0f, 1.0f);

    public static final androidx.compose.ui.node.a A(AbstractC0586o abstractC0586o) {
        g0 g0Var = ((AbstractC4325q) abstractC0586o).f37720Y.f37727m0;
        if (g0Var != null) {
            return g0Var.f5770n0;
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    public static final Owner B(AbstractC0586o abstractC0586o) {
        Owner owner = A(abstractC0586o).f24850n0;
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("This node does not have an owner.".toString());
    }

    public static final Owner C(androidx.compose.ui.node.a aVar) {
        Owner owner = aVar.f24850n0;
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static final void D(y0 y0Var, C0197n c0197n) {
        C0572a0 c0572a0;
        AbstractC4325q abstractC4325q = ((AbstractC4325q) y0Var).f37720Y;
        if (abstractC4325q.f37732r0) {
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
            androidx.compose.ui.node.a A10 = A(y0Var);
            while (A10 != null) {
                if ((A10.f24831B0.f5704e.f37723i0 & 262144) != 0) {
                    while (abstractC4325q2 != null) {
                        if ((abstractC4325q2.f37722h0 & 262144) != 0) {
                            AbstractC4325q abstractC4325q3 = abstractC4325q2;
                            C2104h c2104h = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof y0) {
                                    y0 y0Var2 = (y0) abstractC4325q3;
                                    if (AbstractC3557B.K(y0Var.m(), y0Var2.m()) && M3.H.B(y0Var, y0Var2) && !((Boolean) c0197n.invoke(y0Var2)).booleanValue()) {
                                        return;
                                    }
                                } else if ((abstractC4325q3.f37722h0 & 262144) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q3 = f(c2104h);
                            }
                            continue;
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x001d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void E(y0 y0Var, wf.k kVar) {
        AbstractC4325q abstractC4325q = ((AbstractC4325q) y0Var).f37720Y;
        if (abstractC4325q.f37732r0) {
            C2104h c2104h = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
            if (abstractC4325q2 == null) {
                b(c2104h, abstractC4325q);
            } else {
                c2104h.b(abstractC4325q2);
            }
            while (c2104h.l()) {
                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                if ((abstractC4325q3.f37723i0 & 262144) == 0) {
                    b(c2104h, abstractC4325q3);
                } else {
                    while (true) {
                        if (abstractC4325q3 == null) {
                            break;
                        } else if ((abstractC4325q3.f37722h0 & 262144) != 0) {
                            C2104h c2104h2 = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof y0) {
                                    y0 y0Var2 = (y0) abstractC4325q3;
                                    if (AbstractC3557B.K(y0Var.m(), y0Var2.m()) && M3.H.B(y0Var, y0Var2) && !((Boolean) kVar.invoke(y0Var2)).booleanValue()) {
                                        return;
                                    }
                                } else if ((abstractC4325q3.f37722h0 & 262144) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC4325q3 = abstractC4325q4;
                                            } else {
                                                if (c2104h2 == null) {
                                                    c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q3 != null) {
                                                    c2104h2.b(abstractC4325q3);
                                                    abstractC4325q3 = null;
                                                }
                                                c2104h2.b(abstractC4325q4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q3 = f(c2104h2);
                            }
                            continue;
                        } else {
                            abstractC4325q3 = abstractC4325q3.f37725k0;
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void F(y0 y0Var, wf.k kVar) {
        x0 x0Var;
        AbstractC4325q abstractC4325q = ((AbstractC4325q) y0Var).f37720Y;
        if (abstractC4325q.f37732r0) {
            C2104h c2104h = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
            if (abstractC4325q2 == null) {
                b(c2104h, abstractC4325q);
            } else {
                c2104h.b(abstractC4325q2);
            }
            while (c2104h.l()) {
                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                if ((abstractC4325q3.f37723i0 & 262144) != 0) {
                    for (AbstractC4325q abstractC4325q4 = abstractC4325q3; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                        if ((abstractC4325q4.f37722h0 & 262144) != 0) {
                            AbstractC4325q abstractC4325q5 = abstractC4325q4;
                            C2104h c2104h2 = null;
                            while (abstractC4325q5 != null) {
                                if (abstractC4325q5 instanceof y0) {
                                    y0 y0Var2 = (y0) abstractC4325q5;
                                    if (AbstractC3557B.K(y0Var.m(), y0Var2.m()) && M3.H.B(y0Var, y0Var2)) {
                                        x0Var = (x0) kVar.invoke(y0Var2);
                                    } else {
                                        x0Var = x0.f5841Y;
                                    }
                                    if (x0Var == x0.f5843h0) {
                                        return;
                                    }
                                    if (x0Var == x0.f5842Z) {
                                        break;
                                    }
                                } else if ((abstractC4325q5.f37722h0 & 262144) != 0 && (abstractC4325q5 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q6 = ((AbstractC0587p) abstractC4325q5).f5816t0; abstractC4325q6 != null; abstractC4325q6 = abstractC4325q6.f37725k0) {
                                        if ((abstractC4325q6.f37722h0 & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q5 = f(c2104h2);
                            }
                            continue;
                        }
                    }
                }
                b(c2104h, abstractC4325q3);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    public static final long a(float f6, boolean z10) {
        long j6;
        long floatToIntBits = Float.floatToIntBits(f6);
        if (z10) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        return (j6 & 4294967295L) | (floatToIntBits << 32);
    }

    public static final void b(C2104h c2104h, AbstractC4325q abstractC4325q) {
        C2104h J10 = A(abstractC4325q).J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = J10.f25567Y;
            do {
                c2104h.b(((androidx.compose.ui.node.a) objArr[i11]).f24831B0.f5704e);
                i11--;
            } while (i11 >= 0);
        }
    }

    public static final int c(S s10, AbstractC0442a abstractC0442a) {
        long j6;
        S l02 = s10.l0();
        if (l02 != null) {
            if (s10.p0().a().containsKey(abstractC0442a)) {
                Integer num = (Integer) s10.p0().a().get(abstractC0442a);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int G10 = l02.G(abstractC0442a);
            if (G10 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            l02.f5670k0 = true;
            s10.f5671l0 = true;
            s10.s0();
            l02.f5670k0 = false;
            s10.f5671l0 = false;
            if (abstractC0442a instanceof C0458q) {
                long q02 = l02.q0();
                int i10 = Z0.i.f22798c;
                j6 = q02 & 4294967295L;
            } else {
                long q03 = l02.q0();
                int i11 = Z0.i.f22798c;
                j6 = q03 >> 32;
            }
            return G10 + ((int) j6);
        }
        throw new IllegalStateException(("Child of " + s10 + " cannot be null when calculating alignment line").toString());
    }

    public static final boolean d(C0576e c0576e) {
        w0 w0Var = A(c0576e).f24831B0.f5703d;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode", w0Var);
        return w0Var.f5838s0;
    }

    public static final AbstractC4325q e(AbstractC0586o abstractC0586o, int i10) {
        AbstractC4325q abstractC4325q = ((AbstractC4325q) abstractC0586o).f37720Y.f37725k0;
        if (abstractC4325q == null || (abstractC4325q.f37723i0 & i10) == 0) {
            return null;
        }
        while (abstractC4325q != null) {
            int i11 = abstractC4325q.f37722h0;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return abstractC4325q;
            }
            abstractC4325q = abstractC4325q.f37725k0;
        }
        return null;
    }

    public static final AbstractC4325q f(C2104h c2104h) {
        if (c2104h != null && !c2104h.k()) {
            return (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
        }
        return null;
    }

    public static final C g(AbstractC4325q abstractC4325q) {
        if ((abstractC4325q.f37722h0 & 2) != 0) {
            if (abstractC4325q instanceof C) {
                return (C) abstractC4325q;
            }
            if (abstractC4325q instanceof AbstractC0587p) {
                AbstractC4325q abstractC4325q2 = ((AbstractC0587p) abstractC4325q).f5816t0;
                while (abstractC4325q2 != null) {
                    if (abstractC4325q2 instanceof C) {
                        return (C) abstractC4325q2;
                    }
                    if ((abstractC4325q2 instanceof AbstractC0587p) && (abstractC4325q2.f37722h0 & 2) != 0) {
                        abstractC4325q2 = ((AbstractC0587p) abstractC4325q2).f5816t0;
                    } else {
                        abstractC4325q2 = abstractC4325q2.f37725k0;
                    }
                }
            }
        }
        return null;
    }

    public static final void h(AbstractC4325q abstractC4325q) {
        if (abstractC4325q.f37732r0) {
            i(abstractC4325q, -1, 1);
            return;
        }
        throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
    }

    public static final void i(AbstractC4325q abstractC4325q, int i10, int i11) {
        if (abstractC4325q instanceof AbstractC0587p) {
            AbstractC0587p abstractC0587p = (AbstractC0587p) abstractC4325q;
            j(abstractC4325q, abstractC0587p.f5815s0 & i10, i11);
            int i12 = (~abstractC0587p.f5815s0) & i10;
            for (AbstractC4325q abstractC4325q2 = abstractC0587p.f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                i(abstractC4325q2, i12, i11);
            }
            return;
        }
        j(abstractC4325q, i10 & abstractC4325q.f37722h0, i11);
    }

    public static final void j(AbstractC4325q abstractC4325q, int i10, int i11) {
        if (i11 == 0 && !abstractC4325q.q0()) {
            return;
        }
        if ((i10 & 2) != 0 && (abstractC4325q instanceof C)) {
            u((C) abstractC4325q);
            if (i11 == 2) {
                g0 z10 = z(abstractC4325q, 2);
                z10.f5773q0 = true;
                z10.f5767D0.mo122invoke();
                if (z10.f5769F0 != null) {
                    z10.Y0(null, false);
                }
            }
        }
        if ((i10 & 256) != 0 && (abstractC4325q instanceof AbstractC0591u)) {
            A(abstractC4325q).O();
        }
        if ((i10 & 4) != 0 && (abstractC4325q instanceof AbstractC0590t)) {
            t((AbstractC0590t) abstractC4325q);
        }
        if ((i10 & 8) != 0 && (abstractC4325q instanceof v0)) {
            v((v0) abstractC4325q);
        }
        if ((i10 & 64) != 0 && (abstractC4325q instanceof s0)) {
            A((s0) abstractC4325q).P();
        }
        if ((i10 & 1024) != 0 && (abstractC4325q instanceof p0.q)) {
            if (i11 == 2) {
                abstractC4325q.v0();
            } else {
                p0.e eVar = ((p0.g) ((C0714y) B(abstractC4325q)).getFocusOwner()).f41682b;
                eVar.a(eVar.f41677b, (p0.q) abstractC4325q);
            }
        }
        if ((i10 & 2048) != 0 && (abstractC4325q instanceof p0.k)) {
            p0.k kVar = (p0.k) abstractC4325q;
            C0580i.f5789b = null;
            kVar.S(C0580i.f5788a);
            if (C0580i.f5789b != null) {
                if (i11 == 2) {
                    AbstractC4325q abstractC4325q2 = ((AbstractC4325q) kVar).f37720Y;
                    if (abstractC4325q2.f37732r0) {
                        C2104h c2104h = new C2104h(new AbstractC4325q[16]);
                        AbstractC4325q abstractC4325q3 = abstractC4325q2.f37725k0;
                        if (abstractC4325q3 == null) {
                            b(c2104h, abstractC4325q2);
                        } else {
                            c2104h.b(abstractC4325q3);
                        }
                        while (c2104h.l()) {
                            AbstractC4325q abstractC4325q4 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                            if ((abstractC4325q4.f37723i0 & 1024) == 0) {
                                b(c2104h, abstractC4325q4);
                            } else {
                                while (true) {
                                    if (abstractC4325q4 == null) {
                                        break;
                                    } else if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                        C2104h c2104h2 = null;
                                        while (abstractC4325q4 != null) {
                                            if (abstractC4325q4 instanceof p0.q) {
                                                p0.q qVar = (p0.q) abstractC4325q4;
                                                p0.e eVar2 = ((p0.g) ((C0714y) B(qVar)).getFocusOwner()).f41682b;
                                                eVar2.a(eVar2.f41677b, qVar);
                                            } else if ((abstractC4325q4.f37722h0 & 1024) != 0 && (abstractC4325q4 instanceof AbstractC0587p)) {
                                                int i12 = 0;
                                                for (AbstractC4325q abstractC4325q5 = ((AbstractC0587p) abstractC4325q4).f5816t0; abstractC4325q5 != null; abstractC4325q5 = abstractC4325q5.f37725k0) {
                                                    if ((abstractC4325q5.f37722h0 & 1024) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            abstractC4325q4 = abstractC4325q5;
                                                        } else {
                                                            if (c2104h2 == null) {
                                                                c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                            }
                                                            if (abstractC4325q4 != null) {
                                                                c2104h2.b(abstractC4325q4);
                                                                abstractC4325q4 = null;
                                                            }
                                                            c2104h2.b(abstractC4325q5);
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            abstractC4325q4 = f(c2104h2);
                                        }
                                    } else {
                                        abstractC4325q4 = abstractC4325q4.f37725k0;
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                } else {
                    p0.e eVar3 = ((p0.g) ((C0714y) B(kVar)).getFocusOwner()).f41682b;
                    eVar3.a(eVar3.f41679d, kVar);
                }
            }
        }
        if ((i10 & 4096) != 0 && (abstractC4325q instanceof p0.d)) {
            androidx.compose.ui.focus.a.r((p0.d) abstractC4325q);
        }
    }

    public static final void k(AbstractC4325q abstractC4325q) {
        if (abstractC4325q.f37732r0) {
            i(abstractC4325q, -1, 0);
            return;
        }
        throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
    }

    public static final int l(AbstractC4324p abstractC4324p) {
        int i10;
        if (abstractC4324p instanceof AbstractC0466z) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        if (abstractC4324p instanceof AbstractC4871f) {
            i10 |= 4;
        }
        if (abstractC4324p instanceof L0.k) {
            i10 |= 8;
        }
        if (abstractC4324p instanceof B0.z) {
            i10 |= 16;
        }
        if ((abstractC4324p instanceof F0.d) || (abstractC4324p instanceof F0.g)) {
            i10 |= 32;
        }
        if (abstractC4324p instanceof E0.W) {
            i10 |= 256;
        }
        if (abstractC4324p instanceof E0.a0) {
            i10 |= 64;
        }
        if (abstractC4324p instanceof E0.Y) {
            return i10 | 128;
        }
        return i10;
    }

    public static final int m(AbstractC4325q abstractC4325q) {
        int i10;
        int i11 = abstractC4325q.f37722h0;
        if (i11 != 0) {
            return i11;
        }
        if (abstractC4325q instanceof C) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        if (abstractC4325q instanceof AbstractC0590t) {
            i10 |= 4;
        }
        if (abstractC4325q instanceof v0) {
            i10 |= 8;
        }
        if (abstractC4325q instanceof t0) {
            i10 |= 16;
        }
        if (abstractC4325q instanceof F0.f) {
            i10 |= 32;
        }
        if (abstractC4325q instanceof s0) {
            i10 |= 64;
        }
        if (abstractC4325q instanceof B) {
            i10 |= 128;
        }
        if (abstractC4325q instanceof AbstractC0591u) {
            i10 |= 256;
        }
        if (abstractC4325q instanceof p0.q) {
            i10 |= 1024;
        }
        if (abstractC4325q instanceof p0.k) {
            i10 |= 2048;
        }
        if (abstractC4325q instanceof p0.d) {
            i10 |= 4096;
        }
        if (abstractC4325q instanceof AbstractC6740c) {
            i10 |= 8192;
        }
        if (abstractC4325q instanceof D0.a) {
            i10 |= 16384;
        }
        if (abstractC4325q instanceof AbstractC0585n) {
            i10 |= 32768;
        }
        if (abstractC4325q instanceof y0) {
            return i10 | 262144;
        }
        return i10;
    }

    public static final int n(AbstractC4325q abstractC4325q) {
        if (abstractC4325q instanceof AbstractC0587p) {
            AbstractC0587p abstractC0587p = (AbstractC0587p) abstractC4325q;
            int i10 = abstractC0587p.f5815s0;
            for (AbstractC4325q abstractC4325q2 = abstractC0587p.f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                i10 |= n(abstractC4325q2);
            }
            return i10;
        }
        return m(abstractC4325q);
    }

    public static final int o(long j6, long j10) {
        boolean z10;
        boolean z11 = false;
        if (((int) (j6 & 4294967295L)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((int) (4294967295L & j10)) != 0) {
            z11 = true;
        }
        if (z10 != z11) {
            if (!z10) {
                return 1;
            }
            return -1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final Object p(AbstractC0585n abstractC0585n, AbstractC1735s0 abstractC1735s0) {
        if (((AbstractC4325q) abstractC0585n).f37720Y.f37732r0) {
            C3291d c3291d = (C3291d) A(abstractC0585n).f24862z0;
            c3291d.getClass();
            return r9.y.T0(c3291d, abstractC1735s0);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.".toString());
    }

    public static final ArrayList q(AbstractC0459s abstractC0459s) {
        List list;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode", abstractC0459s);
        androidx.compose.ui.node.a e02 = ((W) abstractC0459s).e0();
        boolean w10 = w(e02);
        List r10 = e02.r();
        ArrayList arrayList = new ArrayList(r10.size());
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) r10.get(i10);
            if (w10) {
                list = aVar.m();
            } else {
                list = aVar.n();
            }
            arrayList.add(list);
        }
        return arrayList;
    }

    public static final int r(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final boolean s(int i10) {
        if ((i10 & 128) != 0) {
            return true;
        }
        return false;
    }

    public static final void t(AbstractC0590t abstractC0590t) {
        if (((AbstractC4325q) abstractC0590t).f37720Y.f37732r0) {
            z(abstractC0590t, 1).L0();
        }
    }

    public static final void u(C c10) {
        A(c10).O();
    }

    public static final void v(v0 v0Var) {
        A(v0Var).Q();
    }

    public static final boolean w(androidx.compose.ui.node.a aVar) {
        int f6 = AbstractC6708l.f(aVar.v());
        if (f6 != 0) {
            if (f6 == 1) {
                return true;
            }
            if (f6 != 2) {
                if (f6 == 3) {
                    return true;
                }
                if (f6 == 4) {
                    androidx.compose.ui.node.a E10 = aVar.E();
                    if (E10 != null) {
                        return w(E10);
                    }
                    throw new IllegalArgumentException("no parent for idle node".toString());
                }
                throw new RuntimeException();
            }
        }
        return false;
    }

    public static final boolean x(androidx.compose.ui.node.a aVar) {
        androidx.compose.ui.node.a aVar2;
        if (aVar.f24844h0 != null) {
            androidx.compose.ui.node.a E10 = aVar.E();
            if (E10 != null) {
                aVar2 = E10.f24844h0;
            } else {
                aVar2 = null;
            }
            if (aVar2 == null || aVar.t().f5648b) {
                return true;
            }
        }
        return false;
    }

    public static final void y(AbstractC4325q abstractC4325q, AbstractC6216a abstractC6216a) {
        k0 k0Var = abstractC4325q.f37726l0;
        if (k0Var == null) {
            k0Var = new k0((j0) abstractC4325q);
            abstractC4325q.f37726l0 = k0Var;
        }
        ((C0714y) B(abstractC4325q)).getSnapshotObserver().a(k0Var, C0578g.f5749p0, abstractC6216a);
    }

    public static final g0 z(AbstractC0586o abstractC0586o, int i10) {
        g0 g0Var = ((AbstractC4325q) abstractC0586o).f37720Y.f37727m0;
        AbstractC3557B.Z(g0Var);
        if (g0Var.G0() == abstractC0586o && s(i10)) {
            g0 g0Var2 = g0Var.f5771o0;
            AbstractC3557B.Z(g0Var2);
            return g0Var2;
        }
        return g0Var;
    }
}
