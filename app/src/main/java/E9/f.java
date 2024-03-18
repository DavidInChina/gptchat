package E9;

import B.AbstractC0168u1;
import E0.AbstractC0459s;
import E0.C0460t;
import E0.S;
import F.B;
import F.C0530d;
import F.C0533g;
import F.C0534h;
import F.C0535i;
import F.J;
import F.y;
import G.V;
import G.d0;
import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.C;
import G0.C0572a0;
import G0.h0;
import G0.i0;
import H.F;
import M1.v;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Z.AbstractC1710f0;
import b0.C2104h;
import h0.C3288a;
import kotlin.jvm.internal.D;
import l0.AbstractC4325q;
import nf.AbstractC4825e;
import rb.C5424n;
import sh.AbstractC5634f;
import te.C5760d;
import wd.q0;
import wh.AbstractC6242g;
import wh.AbstractC6250o;
import x9.C6383b;
import y.C6472j;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class f {
    public static StringBuilder A(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static C5760d B(String str) {
        C5760d c5760d = new C5760d();
        P4.a.Q0(c5760d, str);
        return c5760d;
    }

    public static void C(Wh.p pVar, float f6, float f10, float f11, float f12) {
        pVar.n(f6, f10);
        pVar.n(f11, f12);
        pVar.f();
    }

    public static Object D(AbstractC1207j abstractC1207j, int i10, AbstractC1206i abstractC1206i, AbstractC4825e abstractC4825e) {
        return abstractC1206i.b(new C5424n(abstractC1207j, i10), abstractC4825e);
    }

    public static /* synthetic */ String E(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "HOT";
                }
                throw null;
            }
            return "WARM";
        }
        return "COLD";
    }

    public static /* synthetic */ String F(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "META";
            }
            throw null;
        }
        return "EVENT";
    }

    public static /* synthetic */ String G(int i10) {
        switch (i10) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String H(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "SYNTHESIZED";
                    }
                    throw null;
                }
                return "DELEGATION";
            }
            return "FAKE_OVERRIDE";
        }
        return "DECLARATION";
    }

    public static /* synthetic */ String I(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "null";
                        }
                        return "Idle";
                    }
                    return "LookaheadLayingOut";
                }
                return "LayingOut";
            }
            return "LookaheadMeasuring";
        }
        return "Measuring";
    }

    public static /* synthetic */ String J(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String K(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "Right";
            }
            return "Middle";
        }
        return "Left";
    }

    public static /* synthetic */ String L(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String M(int i10) {
        switch (i10) {
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 7:
                return "SUNDAY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String N(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "HOT";
            }
            return "WARM";
        }
        return "COLD";
    }

    public static /* synthetic */ String O(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "META";
        }
        return "EVENT";
    }

    public static /* synthetic */ String P(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "LINEAR";
        }
        return "EXPONENTIAL";
    }

    public static /* synthetic */ String Q(int i10) {
        switch (i10) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String R(int i10) {
        switch (i10) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String S(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "SYNTHESIZED";
                }
                return "DELEGATION";
            }
            return "FAKE_OVERRIDE";
        }
        return "DECLARATION";
    }

    public static /* synthetic */ String T(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "COLLAPSED";
            }
            return "NOT_CROSSED";
        }
        return "CROSSED";
    }

    public static Object a(F0.f fVar, F0.i iVar) {
        C0572a0 c0572a0;
        AbstractC4325q abstractC4325q = ((AbstractC4325q) fVar).f37720Y;
        boolean z10 = abstractC4325q.f37732r0;
        if (z10) {
            if (z10) {
                AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
                androidx.compose.ui.node.a A10 = AbstractC0579h.A(fVar);
                while (A10 != null) {
                    if ((A10.f24831B0.f5704e.f37723i0 & 32) != 0) {
                        while (abstractC4325q2 != null) {
                            if ((abstractC4325q2.f37722h0 & 32) != 0) {
                                AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                C2104h c2104h = null;
                                while (abstractC4325q3 != null) {
                                    if (abstractC4325q3 instanceof F0.f) {
                                        F0.f fVar2 = (F0.f) abstractC4325q3;
                                        if (fVar2.M().G0(iVar)) {
                                            return fVar2.M().N0(iVar);
                                        }
                                    } else if ((abstractC4325q3.f37722h0 & 32) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                        int i10 = 0;
                                        for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                            if ((abstractC4325q4.f37722h0 & 32) != 0) {
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
                return iVar.f5022a.mo122invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        throw new IllegalArgumentException("ModifierLocal accessed from an unattached node".toString());
    }

    public static int b(C c10, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return c10.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new S(rVar, h0.f5786Z, i0.f5791Z, 1), A7.b.n(0, i10, 0, 0, 13)).getHeight();
    }

    public static int c(C c10, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return c10.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new S(rVar, h0.f5786Z, i0.f5790Y, 1), A7.b.n(0, 0, 0, i10, 7)).getWidth();
    }

    public static int d(C c10, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return c10.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new S(rVar, h0.f5785Y, i0.f5791Z, 1), A7.b.n(0, i10, 0, 0, 13)).getHeight();
    }

    public static int e(C c10, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return c10.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new S(rVar, h0.f5785Y, i0.f5790Y, 1), A7.b.n(0, 0, 0, i10, 7)).getWidth();
    }

    public static float f(C0530d c0530d) {
        boolean z10;
        int i10 = c0530d.f4918a;
        AbstractC0168u1 abstractC0168u1 = c0530d.f4920c;
        switch (i10) {
            case 0:
                z10 = ((J) abstractC0168u1).d();
                break;
            default:
                z10 = ((F) abstractC0168u1).d();
                break;
        }
        if (z10) {
            switch (i10) {
                case 0:
                default:
                    return g(c0530d) + 100;
            }
        }
        switch (i10) {
            case 0:
            default:
                return g(c0530d);
        }
    }

    public static float g(V v10) {
        int i10;
        int i11;
        C0530d c0530d = (C0530d) v10;
        int i12 = c0530d.f4918a;
        AbstractC0168u1 abstractC0168u1 = c0530d.f4920c;
        switch (i12) {
            case 0:
                i10 = ((J) abstractC0168u1).f4873c.f4850b.h();
                break;
            default:
                i10 = ((F) abstractC0168u1).f6551f;
                break;
        }
        int i13 = c0530d.f4918a;
        AbstractC0168u1 abstractC0168u12 = c0530d.f4920c;
        switch (i13) {
            case 0:
                i11 = ((J) abstractC0168u12).g();
                break;
            default:
                i11 = ((F) abstractC0168u12).f6550e;
                break;
        }
        return (i11 * 500) + i10;
    }

    public static Mh.h h(AbstractC6242g abstractC6242g) {
        int i10;
        if (abstractC6242g.U()) {
            return Mh.e.f12151Y;
        }
        AbstractC5634f abstractC5634f = (AbstractC5634f) abstractC6242g;
        if (abstractC5634f.h1(8)) {
            return new Mh.f(3, abstractC6242g, abstractC6242g.mo118a());
        }
        if (abstractC6242g.W0()) {
            return new Mh.f(5, abstractC6242g, abstractC6242g.mo118a());
        }
        if (abstractC5634f.h1(2)) {
            if (abstractC6242g.mo118a().E0()) {
                i10 = 7;
            } else {
                i10 = 6;
            }
            return new Mh.f(i10, abstractC6242g, abstractC6242g.mo118a());
        } else if (abstractC6242g.mo118a().E0()) {
            return new Mh.f(2, abstractC6242g, abstractC6242g.mo118a());
        } else {
            return new Mh.f(1, abstractC6242g, abstractC6242g.mo118a());
        }
    }

    public static Mh.h i(AbstractC6250o abstractC6250o) {
        AbstractC6242g abstractC6242g = (AbstractC6242g) abstractC6250o.y();
        if (abstractC6242g.getReturnType().l0().equals(abstractC6250o.getReturnType().l0())) {
            return h(abstractC6242g);
        }
        return new Mh.g(abstractC6250o.getReturnType().l0(), h(abstractC6242g));
    }

    public static final boolean j(int i10) {
        if (i10 != 3 && i10 != 4 && i10 != 6) {
            return false;
        }
        return true;
    }

    public static void k(d0 d0Var, wf.k kVar) {
        d0Var.c(0, d0Var.f5494b - 1, kVar);
    }

    public static /* synthetic */ boolean l(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return true;
            }
            throw null;
        }
        return false;
    }

    public static /* synthetic */ boolean m(int i10) {
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ short n(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return (short) 1;
            }
            throw null;
        }
        return (short) 0;
    }

    public static /* synthetic */ int o(int i10) {
        switch (i10) {
            case 1:
                return 182;
            case 2:
                return 185;
            case 3:
                return 184;
            case 4:
            case 5:
            case 6:
            case 7:
                return 183;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int p(int i10) {
        switch (i10) {
            case 1:
                return 182;
            case 2:
                return 185;
            case 3:
                return 184;
            case 4:
            case 5:
                return 183;
            case 6:
                return 182;
            case 7:
                return 185;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i10) {
        switch (i10) {
            case 1:
                return "segment.userId";
            case 2:
                return "segment.traits";
            case 3:
                return "segment.anonymousId";
            case 4:
                return "segment.settings";
            case 5:
                return "segment.events";
            case 6:
                return "segment.app.version";
            case 7:
                return "segment.app.build";
            case 8:
                return "build";
            case 9:
                return "segment.device.id";
            default:
                throw null;
        }
    }

    public static /* synthetic */ long r(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return 1000L;
                }
                throw null;
            }
            return 2000L;
        }
        return 5000L;
    }

    public static /* synthetic */ String s(int i10) {
        switch (i10) {
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wed";
            case 4:
                return "Thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 7:
                return "Sun";
            default:
                throw null;
        }
    }

    public static void t(B b10, String str, C3288a c3288a, int i10) {
        C6472j c6472j;
        if ((i10 & 1) != 0) {
            str = null;
        }
        C0535i c0535i = (C0535i) b10;
        c0535i.getClass();
        if (str != null) {
            c6472j = new C6472j(1, str);
        } else {
            c6472j = null;
        }
        c0535i.f4929n0.a(1, new C0533g(c6472j, new C6472j(2, null), new C3288a(new C0534h(0, c3288a), true, -1010194746)));
    }

    public static /* synthetic */ void u(B b10, int i10, C6383b c6383b, C3288a c3288a, int i11) {
        if ((i11 & 2) != 0) {
            c6383b = null;
        }
        ((C0535i) b10).l0(i10, c6383b, y.f5003h0, c3288a);
    }

    public static int v(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static Df.l w(Class cls, String str, String str2, int i10, D d10) {
        return d10.e(new kotlin.jvm.internal.q(cls, str, str2, i10));
    }

    public static Kb.a x(AbstractC1710f0 abstractC1710f0, int i10, Z.r rVar) {
        Kb.a aVar = new Kb.a(abstractC1710f0, i10);
        rVar.h0(aVar);
        return aVar;
    }

    public static Object y(AbstractC1207j abstractC1207j, int i10, AbstractC1206i abstractC1206i, AbstractC4825e abstractC4825e) {
        return abstractC1206i.b(new v(abstractC1207j, i10), abstractC4825e);
    }

    public static String z(StringBuilder sb2, q0 q0Var, String str) {
        sb2.append(q0Var);
        sb2.append(str);
        return sb2.toString();
    }
}
