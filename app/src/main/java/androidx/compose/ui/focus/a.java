package androidx.compose.ui.focus;

import Cf.e;
import E0.AbstractC0447f;
import E0.AbstractC0449h;
import E9.f;
import F0.i;
import G.A;
import G.C0566v;
import G.C0567w;
import G.C0569y;
import G.C0570z;
import G0.AbstractC0579h;
import G0.AbstractC0586o;
import G0.AbstractC0587p;
import G0.C0572a0;
import G0.g0;
import H0.C0714y;
import L.C0841c0;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.Arrays;
import l0.AbstractC4325q;
import l0.AbstractC4326r;
import p0.c;
import p0.d;
import p0.g;
import p0.l;
import p0.p;
import p0.q;
import p0.r;
import p0.s;
import p0.t;
import q0.C5252d;
import wf.k;
import z.AbstractC6708l;
import z.C6672L;

/* loaded from: classes2.dex */
public abstract class a {
    public static final boolean A(q qVar, k kVar) {
        q[] qVarArr = new q[16];
        AbstractC4325q abstractC4325q = qVar.f37720Y;
        if (abstractC4325q.f37732r0) {
            C2104h c2104h = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
            if (abstractC4325q2 == null) {
                AbstractC0579h.b(c2104h, abstractC4325q);
            } else {
                c2104h.b(abstractC4325q2);
            }
            int i10 = 0;
            while (c2104h.l()) {
                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                if ((abstractC4325q3.f37723i0 & 1024) == 0) {
                    AbstractC0579h.b(c2104h, abstractC4325q3);
                } else {
                    while (true) {
                        if (abstractC4325q3 == null) {
                            break;
                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                            C2104h c2104h2 = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof q) {
                                    q qVar2 = (q) abstractC4325q3;
                                    int i11 = i10 + 1;
                                    if (qVarArr.length < i11) {
                                        qVarArr = Arrays.copyOf(qVarArr, Math.max(i11, qVarArr.length * 2));
                                        AbstractC3557B.b0("copyOf(this, newSize)", qVarArr);
                                    }
                                    qVarArr[i10] = qVar2;
                                    i10 = i11;
                                } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i12 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
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
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC4325q3 = AbstractC0579h.f(c2104h2);
                            }
                        } else {
                            abstractC4325q3 = abstractC4325q3.f37725k0;
                        }
                    }
                }
            }
            s sVar = s.f41717Y;
            AbstractC3557B.c0("<this>", qVarArr);
            Arrays.sort(qVarArr, 0, i10, sVar);
            if (i10 <= 0) {
                return false;
            }
            int i13 = i10 - 1;
            do {
                q qVar3 = qVarArr[i13];
                if (u(qVar3) && a(qVar3, kVar)) {
                    return true;
                }
                i13--;
            } while (i13 >= 0);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final boolean B(q qVar, k kVar) {
        q[] qVarArr = new q[16];
        AbstractC4325q abstractC4325q = qVar.f37720Y;
        if (abstractC4325q.f37732r0) {
            C2104h c2104h = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
            if (abstractC4325q2 == null) {
                AbstractC0579h.b(c2104h, abstractC4325q);
            } else {
                c2104h.b(abstractC4325q2);
            }
            int i10 = 0;
            while (c2104h.l()) {
                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                if ((abstractC4325q3.f37723i0 & 1024) == 0) {
                    AbstractC0579h.b(c2104h, abstractC4325q3);
                } else {
                    while (true) {
                        if (abstractC4325q3 == null) {
                            break;
                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                            C2104h c2104h2 = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof q) {
                                    q qVar2 = (q) abstractC4325q3;
                                    int i11 = i10 + 1;
                                    if (qVarArr.length < i11) {
                                        qVarArr = Arrays.copyOf(qVarArr, Math.max(i11, qVarArr.length * 2));
                                        AbstractC3557B.b0("copyOf(this, newSize)", qVarArr);
                                    }
                                    qVarArr[i10] = qVar2;
                                    i10 = i11;
                                } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i12 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
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
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC4325q3 = AbstractC0579h.f(c2104h2);
                            }
                        } else {
                            abstractC4325q3 = abstractC4325q3.f37725k0;
                        }
                    }
                }
            }
            s sVar = s.f41717Y;
            AbstractC3557B.c0("<this>", qVarArr);
            Arrays.sort(qVarArr, 0, i10, sVar);
            if (i10 <= 0) {
                return false;
            }
            int i13 = 0;
            do {
                q qVar3 = qVarArr[i13];
                if (u(qVar3) && k(qVar3, kVar)) {
                    return true;
                }
                i13++;
            } while (i13 < i10);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void C(q qVar) {
        C0572a0 c0572a0;
        AbstractC4325q abstractC4325q = qVar.f37720Y;
        if (abstractC4325q.f37732r0) {
            androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar);
            AbstractC4325q abstractC4325q2 = abstractC4325q;
            while (A10 != null) {
                if ((A10.f24831B0.f5704e.f37723i0 & 5120) != 0) {
                    while (abstractC4325q2 != null) {
                        int i10 = abstractC4325q2.f37722h0;
                        if ((i10 & 5120) != 0) {
                            if (abstractC4325q2 == abstractC4325q || (i10 & 1024) == 0) {
                                if ((i10 & 4096) != 0) {
                                    AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                    C2104h c2104h = null;
                                    while (abstractC4325q3 != null) {
                                        if (abstractC4325q3 instanceof d) {
                                            d dVar = (d) abstractC4325q3;
                                            dVar.U(p(dVar));
                                        } else if ((abstractC4325q3.f37722h0 & 4096) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                            int i11 = 0;
                                            for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                if ((abstractC4325q4.f37722h0 & 4096) != 0) {
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
                            } else {
                                return;
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean D(q qVar) {
        r F10 = F(qVar);
        try {
            if (F10.f41716c) {
                r.a(F10);
            }
            boolean z10 = true;
            F10.f41716c = true;
            int f6 = AbstractC6708l.f(y(qVar, 7));
            if (f6 != 0) {
                if (f6 != 1) {
                    if (f6 != 2) {
                        if (f6 != 3) {
                            throw new RuntimeException();
                        }
                    }
                }
                z10 = false;
            } else {
                z10 = z(qVar);
            }
            return z10;
        } finally {
            r.b(F10);
        }
    }

    public static final boolean E(q qVar, q qVar2) {
        q qVar3;
        AbstractC4325q abstractC4325q;
        androidx.compose.ui.node.a aVar;
        Owner owner;
        C0572a0 c0572a0;
        C0572a0 c0572a02;
        AbstractC4325q abstractC4325q2 = qVar2.f37720Y;
        if (abstractC4325q2.f37732r0) {
            AbstractC4325q abstractC4325q3 = abstractC4325q2.f37724j0;
            androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar2);
            loop0: while (true) {
                qVar3 = null;
                if (A10 != null) {
                    if ((A10.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                        while (abstractC4325q3 != null) {
                            if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                                abstractC4325q = abstractC4325q3;
                                C2104h c2104h = null;
                                while (abstractC4325q != null) {
                                    if (abstractC4325q instanceof q) {
                                        break loop0;
                                    }
                                    if ((abstractC4325q.f37722h0 & 1024) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                                        int i10 = 0;
                                        for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                            if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    abstractC4325q = abstractC4325q4;
                                                } else {
                                                    if (c2104h == null) {
                                                        c2104h = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (abstractC4325q != null) {
                                                        c2104h.b(abstractC4325q);
                                                        abstractC4325q = null;
                                                    }
                                                    c2104h.b(abstractC4325q4);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    abstractC4325q = AbstractC0579h.f(c2104h);
                                }
                                continue;
                            }
                            abstractC4325q3 = abstractC4325q3.f37724j0;
                        }
                    }
                    A10 = A10.E();
                    if (A10 != null && (c0572a02 = A10.f24831B0) != null) {
                        abstractC4325q3 = c0572a02.f5703d;
                    } else {
                        abstractC4325q3 = null;
                    }
                } else {
                    abstractC4325q = null;
                    break;
                }
            }
            if (AbstractC3557B.K(abstractC4325q, qVar)) {
                int ordinal = qVar.B0().ordinal();
                p pVar = p.f41708Z;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return false;
                        }
                        if (ordinal == 3) {
                            AbstractC4325q abstractC4325q5 = qVar.f37720Y;
                            if (abstractC4325q5.f37732r0) {
                                AbstractC4325q abstractC4325q6 = abstractC4325q5.f37724j0;
                                androidx.compose.ui.node.a A11 = AbstractC0579h.A(qVar);
                                loop4: while (true) {
                                    if (A11 == null) {
                                        break;
                                    }
                                    if ((A11.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                                        while (abstractC4325q6 != null) {
                                            if ((abstractC4325q6.f37722h0 & 1024) != 0) {
                                                AbstractC4325q abstractC4325q7 = abstractC4325q6;
                                                C2104h c2104h2 = null;
                                                while (abstractC4325q7 != null) {
                                                    if (abstractC4325q7 instanceof q) {
                                                        qVar3 = abstractC4325q7;
                                                        break loop4;
                                                    }
                                                    if ((abstractC4325q7.f37722h0 & 1024) != 0 && (abstractC4325q7 instanceof AbstractC0587p)) {
                                                        int i11 = 0;
                                                        for (AbstractC4325q abstractC4325q8 = ((AbstractC0587p) abstractC4325q7).f5816t0; abstractC4325q8 != null; abstractC4325q8 = abstractC4325q8.f37725k0) {
                                                            if ((abstractC4325q8.f37722h0 & 1024) != 0) {
                                                                i11++;
                                                                if (i11 == 1) {
                                                                    abstractC4325q7 = abstractC4325q8;
                                                                } else {
                                                                    if (c2104h2 == null) {
                                                                        c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                                    }
                                                                    if (abstractC4325q7 != null) {
                                                                        c2104h2.b(abstractC4325q7);
                                                                        abstractC4325q7 = null;
                                                                    }
                                                                    c2104h2.b(abstractC4325q8);
                                                                }
                                                            }
                                                        }
                                                        if (i11 == 1) {
                                                        }
                                                    }
                                                    abstractC4325q7 = AbstractC0579h.f(c2104h2);
                                                }
                                                continue;
                                            }
                                            abstractC4325q6 = abstractC4325q6.f37724j0;
                                        }
                                    }
                                    A11 = A11.E();
                                    if (A11 != null && (c0572a0 = A11.f24831B0) != null) {
                                        abstractC4325q6 = c0572a0.f5703d;
                                    } else {
                                        abstractC4325q6 = null;
                                    }
                                }
                                q qVar4 = qVar3;
                                if (qVar4 == null) {
                                    g0 g0Var = qVar.f37727m0;
                                    if (g0Var != null && (aVar = g0Var.f5770n0) != null && (owner = aVar.f24850n0) != null) {
                                        if (owner.requestFocus()) {
                                            qVar.E0(p.f41707Y);
                                            return E(qVar, qVar2);
                                        }
                                    } else {
                                        throw new IllegalStateException("Owner not initialized.".toString());
                                    }
                                }
                                if (qVar4 == null || !E(qVar4, qVar)) {
                                    return false;
                                }
                                boolean E10 = E(qVar, qVar2);
                                if (qVar.B0() == pVar) {
                                    if (E10) {
                                        C(qVar4);
                                        return E10;
                                    }
                                    return E10;
                                }
                                throw new IllegalStateException("Deactivated node is focused".toString());
                            }
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                        throw new RuntimeException();
                    } else if (o(qVar) != null) {
                        q o10 = o(qVar);
                        if (o10 != null && !d(o10, false, true)) {
                            return false;
                        }
                        q(qVar2);
                    } else {
                        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
                    }
                } else {
                    q(qVar2);
                    qVar.E0(pVar);
                }
                return true;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final r F(q qVar) {
        return ((g) ((C0714y) AbstractC0579h.B(qVar)).getFocusOwner()).f41683c;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public static final Object G(q qVar, int i10, t tVar) {
        int i11;
        Object obj;
        q qVar2;
        A a5;
        int i12;
        C0572a0 c0572a0;
        AbstractC4325q abstractC4325q = qVar.f37720Y;
        if (abstractC4325q.f37732r0) {
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
            androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar);
            loop0: while (true) {
                i11 = 1;
                obj = null;
                if (A10 != null) {
                    if ((A10.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                        while (abstractC4325q2 != null) {
                            if ((abstractC4325q2.f37722h0 & 1024) != 0) {
                                qVar2 = abstractC4325q2;
                                C2104h c2104h = null;
                                while (qVar2 != null) {
                                    if (qVar2 instanceof q) {
                                        break loop0;
                                    }
                                    if ((qVar2.f37722h0 & 1024) != 0 && (qVar2 instanceof AbstractC0587p)) {
                                        int i13 = 0;
                                        for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) qVar2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                            if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    qVar2 = abstractC4325q3;
                                                } else {
                                                    if (c2104h == null) {
                                                        c2104h = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (qVar2 != null) {
                                                        c2104h.b(qVar2);
                                                        qVar2 = null;
                                                    }
                                                    c2104h.b(abstractC4325q3);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    qVar2 = AbstractC0579h.f(c2104h);
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
                } else {
                    qVar2 = null;
                    break;
                }
            }
            q qVar3 = qVar2;
            if (qVar3 != null) {
                i iVar = AbstractC0449h.f4065a;
                if (AbstractC3557B.K((AbstractC0447f) f.a(qVar3, iVar), (AbstractC0447f) f.a(qVar, iVar))) {
                    return null;
                }
            }
            AbstractC0447f abstractC0447f = (AbstractC0447f) f.a(qVar, AbstractC0449h.f4065a);
            if (abstractC0447f == null) {
                return null;
            }
            int i14 = 5;
            if (!c.a(i10, 5)) {
                i14 = 6;
                if (!c.a(i10, 6)) {
                    i14 = 3;
                    if (!c.a(i10, 3)) {
                        i14 = 4;
                        if (!c.a(i10, 4)) {
                            if (c.a(i10, 1)) {
                                i11 = 2;
                            } else if (!c.a(i10, 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                            }
                            C0570z c0570z = (C0570z) abstractC0447f;
                            a5 = c0570z.f5577b;
                            if (a5.a() <= 0 && a5.d()) {
                                if (c0570z.m(i11)) {
                                    i12 = a5.b();
                                } else {
                                    i12 = a5.e();
                                }
                                ?? obj2 = new Object();
                                C0567w c0567w = c0570z.f5578c;
                                c0567w.getClass();
                                C0566v c0566v = new C0566v(i12, i12);
                                C2104h c2104h2 = c0567w.f5572a;
                                c2104h2.b(c0566v);
                                obj2.f37622Y = c0566v;
                                while (obj == null && c0570z.j((C0566v) obj2.f37622Y, i11)) {
                                    C0566v c0566v2 = (C0566v) obj2.f37622Y;
                                    int i15 = c0566v2.f5570a;
                                    boolean m10 = c0570z.m(i11);
                                    int i16 = c0566v2.f5571b;
                                    if (m10) {
                                        i16++;
                                    } else {
                                        i15--;
                                    }
                                    C0566v c0566v3 = new C0566v(i15, i16);
                                    c2104h2.b(c0566v3);
                                    c2104h2.m((C0566v) obj2.f37622Y);
                                    obj2.f37622Y = c0566v3;
                                    a5.c();
                                    obj = tVar.invoke(new C0569y(c0570z, obj2, i11));
                                }
                                c2104h2.m((C0566v) obj2.f37622Y);
                                a5.c();
                                return obj;
                            }
                            return tVar.invoke(C0570z.f5576g);
                        }
                    }
                }
            }
            i11 = i14;
            C0570z c0570z2 = (C0570z) abstractC0447f;
            a5 = c0570z2.f5577b;
            if (a5.a() <= 0) {
            }
            return tVar.invoke(C0570z.f5576g);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean H(q qVar, q qVar2, int i10, k kVar) {
        AbstractC4325q abstractC4325q;
        C0572a0 c0572a0;
        if (qVar.B0() == p.f41708Z) {
            q[] qVarArr = new q[16];
            AbstractC4325q abstractC4325q2 = qVar.f37720Y;
            if (abstractC4325q2.f37732r0) {
                C2104h c2104h = new C2104h(new AbstractC4325q[16]);
                AbstractC4325q abstractC4325q3 = abstractC4325q2.f37725k0;
                if (abstractC4325q3 == null) {
                    AbstractC0579h.b(c2104h, abstractC4325q2);
                } else {
                    c2104h.b(abstractC4325q3);
                }
                int i11 = 0;
                while (c2104h.l()) {
                    AbstractC4325q abstractC4325q4 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                    if ((abstractC4325q4.f37723i0 & 1024) == 0) {
                        AbstractC0579h.b(c2104h, abstractC4325q4);
                    } else {
                        while (true) {
                            if (abstractC4325q4 == null) {
                                break;
                            } else if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                C2104h c2104h2 = null;
                                while (abstractC4325q4 != null) {
                                    if (abstractC4325q4 instanceof q) {
                                        q qVar3 = (q) abstractC4325q4;
                                        int i12 = i11 + 1;
                                        if (qVarArr.length < i12) {
                                            qVarArr = Arrays.copyOf(qVarArr, Math.max(i12, qVarArr.length * 2));
                                            AbstractC3557B.b0("copyOf(this, newSize)", qVarArr);
                                        }
                                        qVarArr[i11] = qVar3;
                                        i11 = i12;
                                    } else if ((abstractC4325q4.f37722h0 & 1024) != 0 && (abstractC4325q4 instanceof AbstractC0587p)) {
                                        int i13 = 0;
                                        for (AbstractC4325q abstractC4325q5 = ((AbstractC0587p) abstractC4325q4).f5816t0; abstractC4325q5 != null; abstractC4325q5 = abstractC4325q5.f37725k0) {
                                            if ((abstractC4325q5.f37722h0 & 1024) != 0) {
                                                i13++;
                                                if (i13 == 1) {
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
                                        if (i13 == 1) {
                                        }
                                    }
                                    abstractC4325q4 = AbstractC0579h.f(c2104h2);
                                }
                            } else {
                                abstractC4325q4 = abstractC4325q4.f37725k0;
                            }
                        }
                    }
                }
                s sVar = s.f41717Y;
                AbstractC3557B.c0("<this>", qVarArr);
                Arrays.sort(qVarArr, 0, i11, sVar);
                if (c.a(i10, 1)) {
                    int i14 = new e(0, i11 - 1, 1).f3107Z;
                    if (i14 >= 0) {
                        boolean z10 = false;
                        int i15 = 0;
                        while (true) {
                            if (z10) {
                                q qVar4 = qVarArr[i15];
                                if (u(qVar4) && k(qVar4, kVar)) {
                                    return true;
                                }
                            }
                            if (AbstractC3557B.K(qVarArr[i15], qVar2)) {
                                z10 = true;
                            }
                            if (i15 == i14) {
                                break;
                            }
                            i15++;
                        }
                    }
                } else if (c.a(i10, 2)) {
                    int i16 = new e(0, i11 - 1, 1).f3107Z;
                    if (i16 >= 0) {
                        boolean z11 = false;
                        while (true) {
                            if (z11) {
                                q qVar5 = qVarArr[i16];
                                if (u(qVar5) && a(qVar5, kVar)) {
                                    return true;
                                }
                            }
                            if (AbstractC3557B.K(qVarArr[i16], qVar2)) {
                                z11 = true;
                            }
                            if (i16 == 0) {
                                break;
                            }
                            i16--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                if (!c.a(i10, 1) && qVar.A0().f41692a) {
                    AbstractC4325q abstractC4325q6 = qVar.f37720Y;
                    if (abstractC4325q6.f37732r0) {
                        AbstractC4325q abstractC4325q7 = abstractC4325q6.f37724j0;
                        androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar);
                        loop6: while (true) {
                            if (A10 != null) {
                                if ((A10.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                                    while (abstractC4325q7 != null) {
                                        if ((abstractC4325q7.f37722h0 & 1024) != 0) {
                                            AbstractC4325q abstractC4325q8 = abstractC4325q7;
                                            C2104h c2104h3 = null;
                                            while (abstractC4325q8 != null) {
                                                if (abstractC4325q8 instanceof q) {
                                                    abstractC4325q = abstractC4325q8;
                                                    break loop6;
                                                }
                                                if ((abstractC4325q8.f37722h0 & 1024) != 0 && (abstractC4325q8 instanceof AbstractC0587p)) {
                                                    int i17 = 0;
                                                    for (AbstractC4325q abstractC4325q9 = ((AbstractC0587p) abstractC4325q8).f5816t0; abstractC4325q9 != null; abstractC4325q9 = abstractC4325q9.f37725k0) {
                                                        if ((abstractC4325q9.f37722h0 & 1024) != 0) {
                                                            i17++;
                                                            if (i17 == 1) {
                                                                abstractC4325q8 = abstractC4325q9;
                                                            } else {
                                                                if (c2104h3 == null) {
                                                                    c2104h3 = new C2104h(new AbstractC4325q[16]);
                                                                }
                                                                if (abstractC4325q8 != null) {
                                                                    c2104h3.b(abstractC4325q8);
                                                                    abstractC4325q8 = null;
                                                                }
                                                                c2104h3.b(abstractC4325q9);
                                                            }
                                                        }
                                                    }
                                                    if (i17 == 1) {
                                                    }
                                                }
                                                abstractC4325q8 = AbstractC0579h.f(c2104h3);
                                            }
                                            continue;
                                        }
                                        abstractC4325q7 = abstractC4325q7.f37724j0;
                                    }
                                }
                                A10 = A10.E();
                                if (A10 != null && (c0572a0 = A10.f24831B0) != null) {
                                    abstractC4325q7 = c0572a0.f5703d;
                                } else {
                                    abstractC4325q7 = null;
                                }
                            } else {
                                abstractC4325q = null;
                                break;
                            }
                        }
                        if (abstractC4325q != null) {
                            return ((Boolean) kVar.invoke(qVar)).booleanValue();
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                }
                return false;
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }

    public static final boolean I(q qVar, q qVar2, int i10, k kVar) {
        q g10;
        C2104h c2104h = new C2104h(new q[16]);
        AbstractC4325q abstractC4325q = qVar.f37720Y;
        if (abstractC4325q.f37732r0) {
            C2104h c2104h2 = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
            if (abstractC4325q2 == null) {
                AbstractC0579h.b(c2104h2, abstractC4325q);
            } else {
                c2104h2.b(abstractC4325q2);
            }
            while (c2104h2.l()) {
                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h2.n(c2104h2.f25569h0 - 1);
                if ((abstractC4325q3.f37723i0 & 1024) == 0) {
                    AbstractC0579h.b(c2104h2, abstractC4325q3);
                } else {
                    while (true) {
                        if (abstractC4325q3 == null) {
                            break;
                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                            C2104h c2104h3 = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof q) {
                                    c2104h.b((q) abstractC4325q3);
                                } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i11 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC4325q3 = abstractC4325q4;
                                            } else {
                                                if (c2104h3 == null) {
                                                    c2104h3 = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q3 != null) {
                                                    c2104h3.b(abstractC4325q3);
                                                    abstractC4325q3 = null;
                                                }
                                                c2104h3.b(abstractC4325q4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC4325q3 = AbstractC0579h.f(c2104h3);
                            }
                        } else {
                            abstractC4325q3 = abstractC4325q3.f37725k0;
                        }
                    }
                }
            }
            while (c2104h.l() && (g10 = g(c2104h, i(qVar2), i10)) != null) {
                if (g10.A0().f41692a) {
                    return ((Boolean) kVar.invoke(g10)).booleanValue();
                }
                if (n(g10, qVar2, i10, kVar)) {
                    return true;
                }
                c2104h.m(g10);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final Boolean J(q qVar, int i10, C0841c0 c0841c0) {
        int ordinal = qVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (qVar.A0().f41692a) {
                            return (Boolean) c0841c0.invoke(qVar);
                        }
                        return Boolean.FALSE;
                    }
                    throw new RuntimeException();
                }
            } else {
                q o10 = o(qVar);
                if (o10 != null) {
                    int ordinal2 = o10.B0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new RuntimeException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                        } else {
                            Boolean J10 = J(o10, i10, c0841c0);
                            if (!AbstractC3557B.K(J10, Boolean.FALSE)) {
                                return J10;
                            }
                            if (o10.B0() == p.f41708Z) {
                                q f6 = f(o10);
                                if (f6 != null) {
                                    return Boolean.valueOf(n(qVar, f6, i10, c0841c0));
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                            throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
                        }
                    }
                    return Boolean.valueOf(n(qVar, o10, i10, c0841c0));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return Boolean.valueOf(h(qVar, i10, c0841c0));
    }

    public static final boolean a(q qVar, k kVar) {
        int ordinal = qVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!A(qVar, kVar) && (!qVar.A0().f41692a || !((Boolean) kVar.invoke(qVar)).booleanValue())) {
                            return false;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                q o10 = o(qVar);
                if (o10 != null) {
                    int ordinal2 = o10.B0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new RuntimeException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                        } else if (!a(o10, kVar) && !m(qVar, o10, 2, kVar) && (!o10.A0().f41692a || !((Boolean) kVar.invoke(o10)).booleanValue())) {
                            return false;
                        }
                    }
                    return m(qVar, o10, 2, kVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            return true;
        }
        return A(qVar, kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r7 <= r14) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r5 >= r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r15 <= r12) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (p0.c.a(r19, 3) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (p0.c.a(r19, 4) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (p0.c.a(r19, 3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        r1 = r0 - r17.f43627c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (p0.c.a(r19, 4) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        r1 = r17.f43625a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (p0.c.a(r19, 5) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
        r1 = r5 - r17.f43628d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (p0.c.a(r19, 6) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r1 = r17.f43626b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
        if (p0.c.a(r19, 3) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (p0.c.a(r19, 4) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
        if (p0.c.a(r19, 5) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
        if (p0.c.a(r19, 6) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r0 >= r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(C5252d c5252d, C5252d c5252d2, C5252d c5252d3, int i10) {
        if (!c(i10, c5252d3, c5252d) && c(i10, c5252d2, c5252d)) {
            boolean a5 = c.a(i10, 3);
            float f6 = c5252d3.f43626b;
            float f10 = c5252d3.f43628d;
            float f11 = c5252d3.f43625a;
            float f12 = c5252d3.f43627c;
            float f13 = c5252d.f43628d;
            float f14 = c5252d.f43626b;
            float f15 = c5252d.f43627c;
            float f16 = c5252d.f43625a;
            if (!a5) {
                if (!c.a(i10, 4)) {
                    if (!c.a(i10, 5)) {
                        if (!c.a(i10, 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(int i10, C5252d c5252d, C5252d c5252d2) {
        if (c.a(i10, 3) || c.a(i10, 4)) {
            if (c5252d.f43628d <= c5252d2.f43626b || c5252d.f43626b >= c5252d2.f43628d) {
                return false;
            }
        } else if (c.a(i10, 5) || c.a(i10, 6)) {
            if (c5252d.f43627c <= c5252d2.f43625a || c5252d.f43625a >= c5252d2.f43627c) {
                return false;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return true;
    }

    public static final boolean d(q qVar, boolean z10, boolean z11) {
        boolean z12;
        int ordinal = qVar.B0().ordinal();
        p pVar = p.f41709h0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new RuntimeException();
                    }
                } else if (z10) {
                    qVar.E0(pVar);
                    if (z11) {
                        C(qVar);
                        return z10;
                    }
                    return z10;
                } else {
                    return z10;
                }
            } else {
                q o10 = o(qVar);
                if (o10 != null) {
                    z12 = d(o10, z10, z11);
                } else {
                    z12 = true;
                }
                if (z12) {
                    qVar.E0(pVar);
                    if (z11) {
                        C(qVar);
                    }
                } else {
                    return false;
                }
            }
        } else {
            qVar.E0(pVar);
            if (z11) {
                C(qVar);
            }
        }
        return true;
    }

    public static final void e(AbstractC0586o abstractC0586o, C2104h c2104h) {
        AbstractC4325q abstractC4325q = ((AbstractC4325q) abstractC0586o).f37720Y;
        if (abstractC4325q.f37732r0) {
            C2104h c2104h2 = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
            if (abstractC4325q2 == null) {
                AbstractC0579h.b(c2104h2, abstractC4325q);
            } else {
                c2104h2.b(abstractC4325q2);
            }
            while (c2104h2.l()) {
                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h2.n(c2104h2.f25569h0 - 1);
                if ((abstractC4325q3.f37723i0 & 1024) == 0) {
                    AbstractC0579h.b(c2104h2, abstractC4325q3);
                } else {
                    while (true) {
                        if (abstractC4325q3 == null) {
                            break;
                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                            C2104h c2104h3 = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof q) {
                                    q qVar = (q) abstractC4325q3;
                                    if (qVar.f37732r0) {
                                        if (qVar.A0().f41692a) {
                                            c2104h.b(qVar);
                                        } else {
                                            e(qVar, c2104h);
                                        }
                                    }
                                } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC4325q3 = abstractC4325q4;
                                            } else {
                                                if (c2104h3 == null) {
                                                    c2104h3 = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q3 != null) {
                                                    c2104h3.b(abstractC4325q3);
                                                    abstractC4325q3 = null;
                                                }
                                                c2104h3.b(abstractC4325q4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q3 = AbstractC0579h.f(c2104h3);
                            }
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

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0035, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q f(q qVar) {
        int ordinal = qVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    throw new RuntimeException();
                }
            } else {
                AbstractC4325q abstractC4325q = qVar.f37720Y;
                if (abstractC4325q.f37732r0) {
                    C2104h c2104h = new C2104h(new AbstractC4325q[16]);
                    AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
                    if (abstractC4325q2 == null) {
                        AbstractC0579h.b(c2104h, abstractC4325q);
                    } else {
                        c2104h.b(abstractC4325q2);
                    }
                    while (c2104h.l()) {
                        AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                        if ((abstractC4325q3.f37723i0 & 1024) == 0) {
                            AbstractC0579h.b(c2104h, abstractC4325q3);
                        } else {
                            while (true) {
                                if (abstractC4325q3 == null) {
                                    break;
                                } else if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                                    C2104h c2104h2 = null;
                                    while (abstractC4325q3 != null) {
                                        if (abstractC4325q3 instanceof q) {
                                            q f6 = f((q) abstractC4325q3);
                                            if (f6 != null) {
                                                return f6;
                                            }
                                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                            int i10 = 0;
                                            for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                if ((abstractC4325q4.f37722h0 & 1024) != 0) {
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
                                        abstractC4325q3 = AbstractC0579h.f(c2104h2);
                                    }
                                    continue;
                                } else {
                                    abstractC4325q3 = abstractC4325q3.f37725k0;
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("visitChildren called on an unattached node".toString());
            }
        }
        return qVar;
    }

    public static final q g(C2104h c2104h, C5252d c5252d, int i10) {
        C5252d c5252d2;
        if (c.a(i10, 3)) {
            c5252d2 = c5252d.h(c5252d.f() + 1, 0.0f);
        } else if (c.a(i10, 4)) {
            c5252d2 = c5252d.h(-(c5252d.f() + 1), 0.0f);
        } else if (c.a(i10, 5)) {
            c5252d2 = c5252d.h(0.0f, c5252d.c() + 1);
        } else if (c.a(i10, 6)) {
            c5252d2 = c5252d.h(0.0f, -(c5252d.c() + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        int i11 = c2104h.f25569h0;
        q qVar = null;
        if (i11 > 0) {
            Object[] objArr = c2104h.f25567Y;
            int i12 = 0;
            do {
                q qVar2 = (q) objArr[i12];
                if (u(qVar2)) {
                    C5252d i13 = i(qVar2);
                    if (s(i10, i13, c5252d) && (!s(i10, c5252d2, c5252d) || b(c5252d, i13, c5252d2, i10) || (!b(c5252d, c5252d2, i13, i10) && t(i10, c5252d, i13) < t(i10, c5252d, c5252d2)))) {
                        qVar = qVar2;
                        c5252d2 = i13;
                    }
                }
                i12++;
            } while (i12 < i11);
            return qVar;
        }
        return qVar;
    }

    public static final boolean h(q qVar, int i10, k kVar) {
        C5252d c5252d;
        Object obj;
        C2104h c2104h = new C2104h(new q[16]);
        e(qVar, c2104h);
        if (c2104h.f25569h0 <= 1) {
            if (c2104h.k()) {
                obj = null;
            } else {
                obj = c2104h.f25567Y[0];
            }
            q qVar2 = (q) obj;
            if (qVar2 == null) {
                return false;
            }
            return ((Boolean) kVar.invoke(qVar2)).booleanValue();
        }
        if (c.a(i10, 7)) {
            i10 = 4;
        }
        if (c.a(i10, 4) || c.a(i10, 6)) {
            C5252d i11 = i(qVar);
            float f6 = i11.f43626b;
            float f10 = i11.f43625a;
            c5252d = new C5252d(f10, f6, f10, f6);
        } else if (c.a(i10, 3) || c.a(i10, 5)) {
            C5252d i12 = i(qVar);
            float f11 = i12.f43628d;
            float f12 = i12.f43627c;
            c5252d = new C5252d(f12, f11, f12, f11);
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        q g10 = g(c2104h, c5252d, i10);
        if (g10 == null) {
            return false;
        }
        return ((Boolean) kVar.invoke(g10)).booleanValue();
    }

    public static final C5252d i(q qVar) {
        g0 g0Var = qVar.f37727m0;
        if (g0Var != null) {
            return androidx.compose.ui.layout.a.d(g0Var).F(g0Var, false);
        }
        return C5252d.f43624e;
    }

    public static final AbstractC4326r j(AbstractC4326r abstractC4326r, l lVar) {
        return abstractC4326r.g(new FocusRequesterElement(lVar));
    }

    public static final boolean k(q qVar, k kVar) {
        int ordinal = qVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (qVar.A0().f41692a) {
                            return ((Boolean) kVar.invoke(qVar)).booleanValue();
                        }
                        return B(qVar, kVar);
                    }
                    throw new RuntimeException();
                }
            } else {
                q o10 = o(qVar);
                if (o10 != null) {
                    if (k(o10, kVar) || m(qVar, o10, 1, kVar)) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return B(qVar, kVar);
    }

    public static final boolean l(q qVar) {
        r F10 = F(qVar);
        try {
            if (F10.f41716c) {
                r.a(F10);
            }
            boolean z10 = true;
            F10.f41716c = true;
            int ordinal = qVar.B0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new RuntimeException();
                        }
                    } else {
                        qVar.E0(p.f41707Y);
                        C(qVar);
                    }
                }
                z10 = false;
            }
            r.b(F10);
            return z10;
        } catch (Throwable th2) {
            r.b(F10);
            throw th2;
        }
    }

    public static final boolean m(q qVar, q qVar2, int i10, k kVar) {
        if (H(qVar, qVar2, i10, kVar)) {
            return true;
        }
        Boolean bool = (Boolean) G(qVar, i10, new t(qVar, qVar2, i10, kVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean n(q qVar, q qVar2, int i10, k kVar) {
        if (I(qVar, qVar2, i10, kVar)) {
            return true;
        }
        Boolean bool = (Boolean) G(qVar, i10, new t(qVar, qVar2, i10, kVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x001e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q o(q qVar) {
        int ordinal;
        AbstractC4325q abstractC4325q = qVar.f37720Y;
        boolean z10 = abstractC4325q.f37732r0;
        if (!z10) {
            return null;
        }
        if (z10) {
            C2104h c2104h = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
            if (abstractC4325q2 == null) {
                AbstractC0579h.b(c2104h, abstractC4325q);
            } else {
                c2104h.b(abstractC4325q2);
            }
            while (c2104h.l()) {
                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                if ((abstractC4325q3.f37723i0 & 1024) == 0) {
                    AbstractC0579h.b(c2104h, abstractC4325q3);
                } else {
                    while (true) {
                        if (abstractC4325q3 == null) {
                            break;
                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                            C2104h c2104h2 = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof q) {
                                    q qVar2 = (q) abstractC4325q3;
                                    if (qVar2.f37720Y.f37732r0 && ((ordinal = qVar2.B0().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                        return qVar2;
                                    }
                                } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
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
                                abstractC4325q3 = AbstractC0579h.f(c2104h2);
                            }
                            continue;
                        } else {
                            abstractC4325q3 = abstractC4325q3.f37725k0;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0075, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p p(d dVar) {
        p B02;
        AbstractC4325q abstractC4325q = (AbstractC4325q) dVar;
        AbstractC4325q abstractC4325q2 = abstractC4325q.f37720Y;
        C2104h c2104h = null;
        while (true) {
            int i10 = 0;
            if (abstractC4325q2 != null) {
                if (abstractC4325q2 instanceof q) {
                    B02 = ((q) abstractC4325q2).B0();
                    int ordinal = B02.ordinal();
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                        break;
                    }
                } else if ((abstractC4325q2.f37722h0 & 1024) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                    for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                        if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                            i10++;
                            if (i10 == 1) {
                                abstractC4325q2 = abstractC4325q3;
                            } else {
                                if (c2104h == null) {
                                    c2104h = new C2104h(new AbstractC4325q[16]);
                                }
                                if (abstractC4325q2 != null) {
                                    c2104h.b(abstractC4325q2);
                                    abstractC4325q2 = null;
                                }
                                c2104h.b(abstractC4325q3);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                abstractC4325q2 = AbstractC0579h.f(c2104h);
            } else {
                AbstractC4325q abstractC4325q4 = abstractC4325q.f37720Y;
                if (abstractC4325q4.f37732r0) {
                    C2104h c2104h2 = new C2104h(new AbstractC4325q[16]);
                    AbstractC4325q abstractC4325q5 = abstractC4325q4.f37725k0;
                    if (abstractC4325q5 == null) {
                        AbstractC0579h.b(c2104h2, abstractC4325q4);
                    } else {
                        c2104h2.b(abstractC4325q5);
                    }
                    while (c2104h2.l()) {
                        AbstractC4325q abstractC4325q6 = (AbstractC4325q) c2104h2.n(c2104h2.f25569h0 - 1);
                        if ((abstractC4325q6.f37723i0 & 1024) == 0) {
                            AbstractC0579h.b(c2104h2, abstractC4325q6);
                        } else {
                            while (true) {
                                if (abstractC4325q6 == null) {
                                    break;
                                } else if ((abstractC4325q6.f37722h0 & 1024) != 0) {
                                    C2104h c2104h3 = null;
                                    while (abstractC4325q6 != null) {
                                        if (abstractC4325q6 instanceof q) {
                                            p B03 = ((q) abstractC4325q6).B0();
                                            int ordinal2 = B03.ordinal();
                                            if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                                                return B03;
                                            }
                                        } else if ((abstractC4325q6.f37722h0 & 1024) != 0 && (abstractC4325q6 instanceof AbstractC0587p)) {
                                            int i11 = 0;
                                            for (AbstractC4325q abstractC4325q7 = ((AbstractC0587p) abstractC4325q6).f5816t0; abstractC4325q7 != null; abstractC4325q7 = abstractC4325q7.f37725k0) {
                                                if ((abstractC4325q7.f37722h0 & 1024) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        abstractC4325q6 = abstractC4325q7;
                                                    } else {
                                                        if (c2104h3 == null) {
                                                            c2104h3 = new C2104h(new AbstractC4325q[16]);
                                                        }
                                                        if (abstractC4325q6 != null) {
                                                            c2104h3.b(abstractC4325q6);
                                                            abstractC4325q6 = null;
                                                        }
                                                        c2104h3.b(abstractC4325q7);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        abstractC4325q6 = AbstractC0579h.f(c2104h3);
                                    }
                                    continue;
                                } else {
                                    abstractC4325q6 = abstractC4325q6.f37725k0;
                                }
                            }
                        }
                    }
                    return p.f41709h0;
                }
                throw new IllegalStateException("visitChildren called on an unattached node".toString());
            }
        }
        return B02;
    }

    public static final void q(q qVar) {
        AbstractC0579h.y(qVar, new C6672L(15, qVar));
        int ordinal = qVar.B0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            qVar.E0(p.f41707Y);
        }
    }

    public static final void r(d dVar) {
        p0.e eVar = ((g) ((C0714y) AbstractC0579h.B(dVar)).getFocusOwner()).f41682b;
        eVar.a(eVar.f41678c, dVar);
    }

    public static final boolean s(int i10, C5252d c5252d, C5252d c5252d2) {
        boolean a5 = c.a(i10, 3);
        float f6 = c5252d.f43625a;
        float f10 = c5252d.f43627c;
        float f11 = c5252d2.f43625a;
        float f12 = c5252d2.f43627c;
        if (a5) {
            if ((f12 <= f10 && f11 < f10) || f11 <= f6) {
                return false;
            }
        } else if (c.a(i10, 4)) {
            if ((f11 >= f6 && f12 > f6) || f12 >= f10) {
                return false;
            }
        } else {
            boolean a10 = c.a(i10, 5);
            float f13 = c5252d.f43626b;
            float f14 = c5252d.f43628d;
            float f15 = c5252d2.f43626b;
            float f16 = c5252d2.f43628d;
            if (a10) {
                if ((f16 <= f14 && f15 < f14) || f15 <= f13) {
                    return false;
                }
            } else if (c.a(i10, 6)) {
                if ((f15 >= f13 && f16 > f13) || f16 >= f14) {
                    return false;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return true;
    }

    public static final long t(int i10, C5252d c5252d, C5252d c5252d2) {
        float f6;
        float f10;
        float f11;
        boolean a5 = c.a(i10, 3);
        float f12 = c5252d.f43626b;
        float f13 = c5252d.f43625a;
        float f14 = c5252d2.f43626b;
        float f15 = c5252d2.f43625a;
        if (a5) {
            f6 = f13 - c5252d2.f43627c;
        } else if (c.a(i10, 4)) {
            f6 = f15 - c5252d.f43627c;
        } else if (c.a(i10, 5)) {
            f6 = f12 - c5252d2.f43628d;
        } else if (c.a(i10, 6)) {
            f6 = f14 - c5252d.f43628d;
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        long abs = Math.abs(Math.max(0.0f, f6));
        if (c.a(i10, 3) || c.a(i10, 4)) {
            float c10 = c5252d.c();
            float f16 = 2;
            f11 = (c10 / f16) + f12;
            f10 = (c5252d2.c() / f16) + f14;
        } else if (c.a(i10, 5) || c.a(i10, 6)) {
            float f17 = c5252d.f();
            float f18 = 2;
            f11 = (f17 / f18) + f13;
            f10 = (c5252d2.f() / f18) + f15;
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        long abs2 = Math.abs(f11 - f10);
        return (abs2 * abs2) + (13 * abs * abs);
    }

    public static final boolean u(q qVar) {
        androidx.compose.ui.node.a aVar;
        g0 g0Var;
        androidx.compose.ui.node.a aVar2;
        g0 g0Var2 = qVar.f37727m0;
        if (g0Var2 != null && (aVar = g0Var2.f5770n0) != null && aVar.T() && (g0Var = qVar.f37727m0) != null && (aVar2 = g0Var.f5770n0) != null && aVar2.S()) {
            return true;
        }
        return false;
    }

    public static final AbstractC4326r v(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new FocusChangedElement(kVar));
    }

    public static final int w(q qVar, int i10) {
        int ordinal = qVar.B0().ordinal();
        int i11 = 1;
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 1;
                }
                throw new RuntimeException();
            }
        } else {
            q o10 = o(qVar);
            if (o10 != null) {
                int w10 = w(o10, i10);
                if (w10 == 1) {
                    w10 = 0;
                }
                if (w10 == 0) {
                    if (qVar.f41711s0) {
                        return 1;
                    }
                    qVar.f41711s0 = true;
                    try {
                        l lVar = (l) qVar.A0().f41702k.invoke(new c(i10));
                        if (lVar != l.f41703b) {
                            if (lVar != l.f41704c) {
                                if (lVar.a()) {
                                    i11 = 3;
                                } else {
                                    i11 = 4;
                                }
                            }
                        }
                        return i11;
                    } finally {
                        qVar.f41711s0 = false;
                    }
                }
                return w10;
            }
            throw new IllegalArgumentException("ActiveParent with no focused child".toString());
        }
        return 2;
    }

    public static final int x(q qVar, int i10) {
        int i11;
        if (!qVar.f41712t0) {
            qVar.f41712t0 = true;
            try {
                l lVar = (l) qVar.A0().f41701j.invoke(new c(i10));
                if (lVar != l.f41703b) {
                    if (lVar == l.f41704c) {
                        qVar.f41712t0 = false;
                        return 2;
                    }
                    if (lVar.a()) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                    return i11;
                }
            } finally {
                qVar.f41712t0 = false;
            }
        }
        return 1;
    }

    public static final int y(q qVar, int i10) {
        q qVar2;
        int i11;
        C0572a0 c0572a0;
        int ordinal = qVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        AbstractC4325q abstractC4325q = qVar.f37720Y;
                        if (abstractC4325q.f37732r0) {
                            AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
                            androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar);
                            loop0: while (true) {
                                qVar2 = null;
                                if (A10 == null) {
                                    break;
                                }
                                if ((A10.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                                    while (abstractC4325q2 != null) {
                                        if ((abstractC4325q2.f37722h0 & 1024) != 0) {
                                            AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                            C2104h c2104h = null;
                                            while (abstractC4325q3 != null) {
                                                if (abstractC4325q3 instanceof q) {
                                                    qVar2 = abstractC4325q3;
                                                    break loop0;
                                                }
                                                if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                                    int i12 = 0;
                                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                                            i12++;
                                                            if (i12 == 1) {
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
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                abstractC4325q3 = AbstractC0579h.f(c2104h);
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
                            q qVar3 = qVar2;
                            if (qVar3 == null) {
                                return 1;
                            }
                            int ordinal2 = qVar3.B0().ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 == 2) {
                                        return 2;
                                    }
                                    if (ordinal2 == 3) {
                                        int y10 = y(qVar3, i10);
                                        if (y10 == 1) {
                                            i11 = 0;
                                        } else {
                                            i11 = y10;
                                        }
                                        if (i11 == 0) {
                                            return x(qVar3, i10);
                                        }
                                        return i11;
                                    }
                                    throw new RuntimeException();
                                }
                                return y(qVar3, i10);
                            }
                            return x(qVar3, i10);
                        }
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                    throw new RuntimeException();
                }
            } else {
                q o10 = o(qVar);
                if (o10 != null) {
                    return w(o10, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
        }
        return 1;
    }

    public static final boolean z(q qVar) {
        boolean z10;
        q qVar2;
        androidx.compose.ui.node.a aVar;
        Owner owner;
        C0572a0 c0572a0;
        int ordinal = qVar.B0().ordinal();
        boolean z11 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        AbstractC4325q abstractC4325q = qVar.f37720Y;
                        if (abstractC4325q.f37732r0) {
                            AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
                            androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar);
                            loop0: while (true) {
                                qVar2 = null;
                                if (A10 == null) {
                                    break;
                                }
                                if ((A10.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                                    while (abstractC4325q2 != null) {
                                        if ((abstractC4325q2.f37722h0 & 1024) != 0) {
                                            AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                            C2104h c2104h = null;
                                            while (abstractC4325q3 != null) {
                                                if (abstractC4325q3 instanceof q) {
                                                    qVar2 = abstractC4325q3;
                                                    break loop0;
                                                }
                                                if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                                    int i10 = 0;
                                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
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
                                                abstractC4325q3 = AbstractC0579h.f(c2104h);
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
                            q qVar3 = qVar2;
                            if (qVar3 != null) {
                                p B02 = qVar3.B0();
                                z11 = E(qVar3, qVar);
                                if (z11 && B02 != qVar3.B0()) {
                                    C(qVar3);
                                }
                            } else {
                                g0 g0Var = qVar.f37727m0;
                                if (g0Var != null && (aVar = g0Var.f5770n0) != null && (owner = aVar.f24850n0) != null) {
                                    if (owner.requestFocus()) {
                                        q(qVar);
                                    }
                                    z11 = false;
                                } else {
                                    throw new IllegalStateException("Owner not initialized.".toString());
                                }
                            }
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                q o10 = o(qVar);
                if (o10 != null) {
                    z10 = d(o10, false, true);
                } else {
                    z10 = true;
                }
                if (z10) {
                    q(qVar);
                }
                z11 = false;
            }
        }
        if (z11) {
            C(qVar);
        }
        return z11;
    }
}
