package mg;

import Bg.AbstractC0227u;
import Bg.B;
import Bg.C0208a;
import Bg.C0224q;
import Bg.C0232z;
import Bg.D;
import Bg.Y;
import Bg.d0;
import Bg.m0;
import Bg.o0;
import Df.H;
import Gf.C0631e;
import K4.J;
import Mf.AbstractC0993b;
import Mf.AbstractC0994c;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1001j;
import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import Mf.AbstractC1007p;
import Mf.AbstractC1016z;
import Mf.E;
import Mf.EnumC0998g;
import Mf.G;
import Mf.M;
import Mf.P;
import Mf.S;
import Mf.a0;
import Mf.b0;
import Mf.h0;
import Mf.i0;
import Pf.AbstractC1146d;
import Pf.AbstractC1158p;
import Pf.AbstractC1165x;
import Pf.C1154l;
import Pf.C1163v;
import Pf.Q;
import Pf.c0;
import android.gov.nist.core.Separators;
import hg.C3422a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3963m;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import l8.AbstractC4344b;
import ng.AbstractC4838e;
import pg.AbstractC5170g;
import pg.AbstractC5181r;
import pg.C5164a;
import pg.C5165b;
import pg.C5179p;
import pg.C5180q;
import pg.C5182s;
import rg.AbstractC5493d;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class m implements o {

    /* renamed from: c  reason: collision with root package name */
    public static final m f39296c = C3422a.k(f.f39289Y);

    /* renamed from: d  reason: collision with root package name */
    public static final m f39297d;

    /* renamed from: e  reason: collision with root package name */
    public static final m f39298e;

    /* renamed from: a  reason: collision with root package name */
    public final s f39299a;

    /* renamed from: b  reason: collision with root package name */
    public final C3963m f39300b = R4.b.D1(new Uf.A(4, this));

    static {
        s sVar = new s();
        sVar.j();
        sVar.f39342a = true;
        new m(sVar);
        s sVar2 = new s();
        sVar2.j();
        kf.x xVar = kf.x.f37485Y;
        sVar2.d(xVar);
        sVar2.f39342a = true;
        new m(sVar2);
        s sVar3 = new s();
        sVar3.j();
        sVar3.d(xVar);
        sVar3.m();
        sVar3.f39342a = true;
        new m(sVar3);
        s sVar4 = new s();
        sVar4.d(xVar);
        C4653c c4653c = C4653c.f39287a;
        sVar4.g(c4653c);
        sVar4.h(w.f39374Z);
        sVar4.f39342a = true;
        new m(sVar4);
        s sVar5 = new s();
        sVar5.j();
        sVar5.d(xVar);
        sVar5.g(c4653c);
        sVar5.f();
        sVar5.h(w.f39375h0);
        sVar5.a();
        sVar5.c();
        sVar5.m();
        sVar5.i();
        sVar5.f39342a = true;
        new m(sVar5);
        C3422a.k(g.f39290Y);
        s sVar6 = new s();
        sVar6.g(c4653c);
        sVar6.h(w.f39374Z);
        sVar6.f39342a = true;
        f39297d = new m(sVar6);
        s sVar7 = new s();
        sVar7.b();
        sVar7.g(C4652b.f39286a);
        sVar7.d(n.f39302h0);
        sVar7.f39342a = true;
        f39298e = new m(sVar7);
        s sVar8 = new s();
        z zVar = EnumC4650A.f39279Y;
        sVar8.l();
        sVar8.d(n.f39302h0);
        sVar8.f39342a = true;
        new m(sVar8);
    }

    public m(s sVar) {
        this.f39299a = sVar;
    }

    public static void X(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public static boolean j0(Bg.A a5) {
        if (Ad.l.H0(a5)) {
            List<d0> w02 = a5.w0();
            if (!(w02 instanceof Collection) || !w02.isEmpty()) {
                for (d0 d0Var : w02) {
                    if (d0Var.c()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void n(m mVar, P p10, StringBuilder sb2) {
        boolean z10;
        boolean z11;
        if (!mVar.q()) {
            s sVar = mVar.f39299a;
            q qVar = sVar.f39348g;
            Df.v[] vVarArr = s.f39322X;
            if (!((Boolean) qVar.a(sVar, vVarArr[5])).booleanValue()) {
                if (mVar.p().contains(n.f39306l0)) {
                    mVar.y(sb2, p10, null);
                    C1163v c02 = p10.c0();
                    if (c02 != null) {
                        mVar.y(sb2, c02, Nf.e.f12806Z);
                    }
                    C1163v a02 = p10.a0();
                    if (a02 != null) {
                        mVar.y(sb2, a02, Nf.e.f12814o0);
                    }
                    if (((x) sVar.f39330H.a(sVar, vVarArr[32])) == x.f39378Z) {
                        Pf.P d10 = p10.d();
                        if (d10 != null) {
                            mVar.y(sb2, d10, Nf.e.f12809j0);
                        }
                        S b10 = p10.b();
                        if (b10 != null) {
                            mVar.y(sb2, b10, Nf.e.f12810k0);
                            List S = ((Q) b10).S();
                            AbstractC3557B.b0("getValueParameters(...)", S);
                            h0 h0Var = (h0) kf.t.B2(S);
                            AbstractC3557B.Z(h0Var);
                            mVar.y(sb2, h0Var, Nf.e.f12813n0);
                        }
                    }
                }
                List d02 = p10.d0();
                AbstractC3557B.b0("getContextReceiverParameters(...)", d02);
                mVar.B(sb2, d02);
                AbstractC1007p visibility = p10.getVisibility();
                AbstractC3557B.b0("getVisibility(...)", visibility);
                mVar.h0(visibility, sb2);
                if (mVar.p().contains(n.f39313s0) && p10.t()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mVar.N(sb2, z10, "const");
                mVar.K(p10, sb2);
                mVar.M(p10, sb2);
                mVar.S(p10, sb2);
                if (mVar.p().contains(n.f39314t0) && p10.e0()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mVar.N(sb2, z11, "lateinit");
                mVar.J(p10, sb2);
            }
            mVar.e0(p10, sb2, false);
            List typeParameters = p10.getTypeParameters();
            AbstractC3557B.b0("getTypeParameters(...)", typeParameters);
            mVar.d0(typeParameters, sb2, true);
            mVar.V(sb2, p10);
        }
        mVar.P(p10, sb2, true);
        sb2.append(": ");
        Bg.A type = p10.getType();
        AbstractC3557B.b0("getType(...)", type);
        sb2.append(mVar.Y(type));
        mVar.W(sb2, p10);
        mVar.H(p10, sb2);
        List typeParameters2 = p10.getTypeParameters();
        AbstractC3557B.b0("getTypeParameters(...)", typeParameters2);
        mVar.i0(sb2, typeParameters2);
    }

    public static Mf.A u(AbstractC1016z abstractC1016z) {
        AbstractC0997f abstractC0997f;
        if (abstractC1016z instanceof AbstractC0997f) {
            if (((AbstractC0997f) abstractC1016z).e() == EnumC0998g.f12085Z) {
                return Mf.A.f12054j0;
            }
            return Mf.A.f12051Z;
        }
        AbstractC1003l mo20k = abstractC1016z.mo20k();
        if (mo20k instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) mo20k;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f == null) {
            return Mf.A.f12051Z;
        }
        if (!(abstractC1016z instanceof AbstractC0994c)) {
            return Mf.A.f12051Z;
        }
        AbstractC0994c abstractC0994c = (AbstractC0994c) abstractC1016z;
        Collection m10 = abstractC0994c.m();
        AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
        if ((!m10.isEmpty()) && abstractC0997f.h() != Mf.A.f12051Z) {
            return Mf.A.f12053i0;
        }
        if (abstractC0997f.e() == EnumC0998g.f12085Z && !AbstractC3557B.K(abstractC0994c.getVisibility(), Mf.r.f12101a)) {
            Mf.A h10 = abstractC0994c.h();
            Mf.A a5 = Mf.A.f12054j0;
            if (h10 != a5) {
                return Mf.A.f12053i0;
            }
            return a5;
        }
        return Mf.A.f12051Z;
    }

    public final String A(AbstractC5170g abstractC5170g) {
        s sVar = this.f39299a;
        wf.k kVar = (wf.k) sVar.f39363v.a(sVar, s.f39322X[20]);
        if (kVar != null) {
            return (String) kVar.invoke(abstractC5170g);
        }
        if (abstractC5170g instanceof C5165b) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC5170g abstractC5170g2 : (Iterable) ((C5165b) abstractC5170g).f43144a) {
                String A10 = A(abstractC5170g2);
                if (A10 != null) {
                    arrayList.add(A10);
                }
            }
            return kf.t.m2(arrayList, ", ", "{", "}", null, 56);
        } else if (abstractC5170g instanceof C5164a) {
            return Lg.n.v2(Separators.AT, w((Nf.c) ((C5164a) abstractC5170g).f43144a, null));
        } else {
            if (abstractC5170g instanceof C5182s) {
                AbstractC5181r abstractC5181r = (AbstractC5181r) ((C5182s) abstractC5170g).f43144a;
                if (abstractC5181r instanceof C5179p) {
                    return ((C5179p) abstractC5181r).f43156a + "::class";
                } else if (abstractC5181r instanceof C5180q) {
                    C5180q c5180q = (C5180q) abstractC5181r;
                    String b10 = c5180q.f43157a.f43142a.b().b();
                    int i10 = c5180q.f43157a.f43143b;
                    for (int i11 = 0; i11 < i10; i11++) {
                        b10 = android.gov.nist.core.a.h("kotlin.Array<", b10, '>');
                    }
                    return android.gov.nist.core.a.g(b10, "::class");
                } else {
                    throw new RuntimeException();
                }
            }
            return abstractC5170g.toString();
        }
    }

    public final void B(StringBuilder sb2, List list) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                AbstractC1146d abstractC1146d = (AbstractC1146d) it.next();
                y(sb2, abstractC1146d, Nf.e.f12811l0);
                Bg.A type = abstractC1146d.getType();
                AbstractC3557B.b0("getType(...)", type);
                sb2.append(F(type));
                if (i10 == AbstractC4344b.u0(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i10 = i11;
            }
        }
    }

    public final void C(StringBuilder sb2, D d10) {
        boolean z10;
        AbstractC1001j abstractC1001j = null;
        y(sb2, d10, null);
        if (d10 instanceof C0224q) {
            C0224q c0224q = (C0224q) d10;
        }
        if (Bi.c.g1(d10)) {
            boolean z11 = d10 instanceof Dg.j;
            if (z11 && ((Dg.j) d10).f3669i0.f3708Z) {
                z10 = true;
            } else {
                z10 = false;
            }
            s sVar = this.f39299a;
            if (z10 && ((Boolean) sVar.f39339U.a(sVar, s.f39322X[46])).booleanValue()) {
                Dg.m mVar = Dg.m.f3709a;
                if (z11) {
                    boolean z12 = ((Dg.j) d10).f3669i0.f3708Z;
                }
                Y y02 = d10.y0();
                AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor", y02);
                sb2.append(D(((Dg.k) y02).f3675b[0]));
            } else {
                if (z11 && !((Boolean) sVar.f39341W.a(sVar, s.f39322X[48])).booleanValue()) {
                    sb2.append(((Dg.j) d10).f3673m0);
                } else {
                    sb2.append(d10.y0().toString());
                }
                sb2.append(Z(d10.w0()));
            }
        } else {
            Y y03 = d10.y0();
            AbstractC1000i k10 = d10.y0().k();
            if (k10 instanceof AbstractC1001j) {
                abstractC1001j = (AbstractC1001j) k10;
            }
            io.sentry.android.core.z V10 = AbstractC3557B.V(d10, abstractC1001j, 0);
            if (V10 == null) {
                sb2.append(a0(y03));
                sb2.append(Z(d10.w0()));
            } else {
                U(sb2, V10);
            }
        }
        if (d10.z0()) {
            sb2.append(Separators.QUESTION);
        }
        if (d10 instanceof C0224q) {
            sb2.append(" & Any");
        }
    }

    public final String D(String str) {
        int ordinal = r().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return android.gov.nist.core.a.A("<font color=red><b>", str, "</b></font>");
            }
            throw new RuntimeException();
        }
        return str;
    }

    public final String E(String str, String str2, Jf.l lVar) {
        AbstractC3557B.c0("lowerRendered", str);
        AbstractC3557B.c0("upperRendered", str2);
        if (Bi.c.O1(str, str2)) {
            if (Lg.n.I2(str2, Separators.LPAREN, false)) {
                return android.gov.nist.core.a.A(Separators.LPAREN, str, ")!");
            }
            return str.concat("!");
        }
        s sVar = this.f39299a;
        q qVar = sVar.f39343b;
        Df.v[] vVarArr = s.f39322X;
        String a5 = ((AbstractC4655e) qVar.a(sVar, vVarArr[0])).a(lVar.i(Jf.p.f9144B), this);
        String Q22 = Lg.n.Q2(a5, "Collection", a5);
        String A12 = Bi.c.A1(str, Q22.concat("Mutable"), str2, Q22, Q22.concat("(Mutable)"));
        if (A12 != null) {
            return A12;
        }
        String A13 = Bi.c.A1(str, Q22.concat("MutableMap.MutableEntry"), str2, Q22.concat("Map.Entry"), Q22.concat("(Mutable)Map.(Mutable)Entry"));
        if (A13 != null) {
            return A13;
        }
        String a10 = ((AbstractC4655e) sVar.f39343b.a(sVar, vVarArr[0])).a(lVar.j("Array"), this);
        String Q23 = Lg.n.Q2(a10, "Array", a10);
        String A14 = Bi.c.A1(str, Q23.concat(o("Array<")), str2, Q23.concat(o("Array<out ")), Q23.concat(o("Array<(out) ")));
        if (A14 != null) {
            return A14;
        }
        return Separators.LPAREN + str + ".." + str2 + ')';
    }

    public final String F(Bg.A a5) {
        String Y7 = Y(a5);
        if ((j0(a5) && !m0.f(a5)) || (a5 instanceof C0224q)) {
            return android.gov.nist.core.a.h(Separators.LPAREN, Y7, ')');
        }
        return Y7;
    }

    public final String G(C4293e c4293e) {
        return o(Bi.c.x1(c4293e.e()));
    }

    public final void H(i0 i0Var, StringBuilder sb2) {
        AbstractC5170g Q;
        String A10;
        s sVar = this.f39299a;
        if (((Boolean) sVar.f39362u.a(sVar, s.f39322X[19])).booleanValue() && (Q = i0Var.Q()) != null && (A10 = A(Q)) != null) {
            sb2.append(" = ");
            sb2.append(o(A10));
        }
    }

    public final String I(String str) {
        int ordinal = r().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s sVar = this.f39299a;
                if (!((Boolean) sVar.f39340V.a(sVar, s.f39322X[47])).booleanValue()) {
                    return android.gov.nist.core.a.A("<b>", str, "</b>");
                }
                return str;
            }
            throw new RuntimeException();
        }
        return str;
    }

    public final void J(AbstractC0994c abstractC0994c, StringBuilder sb2) {
        if (p().contains(n.f39308n0) && t() && abstractC0994c.e() != 1) {
            sb2.append("/*");
            sb2.append(H.z0(E9.f.H(abstractC0994c.e())));
            sb2.append("*/ ");
        }
    }

    public final void K(AbstractC1016z abstractC1016z, StringBuilder sb2) {
        boolean z10;
        N(sb2, abstractC1016z.isExternal(), "external");
        boolean z11 = false;
        if (p().contains(n.f39311q0) && abstractC1016z.H()) {
            z10 = true;
        } else {
            z10 = false;
        }
        N(sb2, z10, "expect");
        if (p().contains(n.f39312r0) && abstractC1016z.o0()) {
            z11 = true;
        }
        N(sb2, z11, "actual");
    }

    public final void L(Mf.A a5, StringBuilder sb2, Mf.A a10) {
        s sVar = this.f39299a;
        if (!((Boolean) sVar.f39357p.a(sVar, s.f39322X[14])).booleanValue() && a5 == a10) {
            return;
        }
        N(sb2, p().contains(n.f39304j0), H.z0(a5.name()));
    }

    public final void M(AbstractC0994c abstractC0994c, StringBuilder sb2) {
        if (!AbstractC4838e.s(abstractC0994c) || abstractC0994c.h() != Mf.A.f12051Z) {
            s sVar = this.f39299a;
            if (((v) sVar.f39324B.a(sVar, s.f39322X[26])) == v.f39370Y && abstractC0994c.h() == Mf.A.f12053i0 && (!abstractC0994c.m().isEmpty())) {
                return;
            }
            Mf.A h10 = abstractC0994c.h();
            AbstractC3557B.b0("getModality(...)", h10);
            L(h10, sb2, u(abstractC0994c));
        }
    }

    public final void N(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(I(str));
            sb2.append(Separators.SP);
        }
    }

    public final String O(C4294f c4294f, boolean z10) {
        String o10 = o(Bi.c.w1(c4294f));
        s sVar = this.f39299a;
        if (((Boolean) sVar.f39340V.a(sVar, s.f39322X[47])).booleanValue() && r() == EnumC4650A.f39280Z && z10) {
            return android.gov.nist.core.a.A("<b>", o10, "</b>");
        }
        return o10;
    }

    public final void P(AbstractC1003l abstractC1003l, StringBuilder sb2, boolean z10) {
        C4294f name = abstractC1003l.getName();
        AbstractC3557B.b0("getName(...)", name);
        sb2.append(O(name, z10));
    }

    public final void Q(StringBuilder sb2, Bg.A a5) {
        C0208a c0208a;
        o0 B02 = a5.B0();
        if (B02 instanceof C0208a) {
            c0208a = (C0208a) B02;
        } else {
            c0208a = null;
        }
        if (c0208a != null) {
            s sVar = this.f39299a;
            q qVar = sVar.f39338R;
            Df.v[] vVarArr = s.f39322X;
            boolean booleanValue = ((Boolean) qVar.a(sVar, vVarArr[42])).booleanValue();
            D d10 = c0208a.f2101Z;
            if (booleanValue) {
                R(sb2, d10);
                return;
            }
            R(sb2, c0208a.f2102h0);
            if (((Boolean) sVar.Q.a(sVar, vVarArr[41])).booleanValue()) {
                EnumC4650A r10 = r();
                y yVar = EnumC4650A.f39280Z;
                if (r10 == yVar) {
                    sb2.append("<font color=\"808080\"><i>");
                }
                sb2.append(" /* = ");
                R(sb2, d10);
                sb2.append(" */");
                if (r() == yVar) {
                    sb2.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        R(sb2, a5);
    }

    public final void R(StringBuilder sb2, Bg.A a5) {
        boolean z10;
        boolean z11;
        String str;
        C4294f c4294f;
        boolean z12;
        boolean z13 = a5 instanceof B;
        s sVar = this.f39299a;
        if (z13 && sVar.k()) {
            Ag.l lVar = ((B) a5).f2061i0;
            if (lVar.f858h0 == Ag.o.f863Y || lVar.f858h0 == Ag.o.f864Z) {
                sb2.append("<Not computed yet>");
                return;
            }
        }
        o0 B02 = a5.B0();
        if (B02 instanceof AbstractC0227u) {
            sb2.append(((AbstractC0227u) B02).G0(this, this));
        } else if (B02 instanceof D) {
            D d10 = (D) B02;
            if (!AbstractC3557B.K(d10, m0.f2139b) && d10.y0() != m0.f2138a.f3667Z) {
                Y y02 = d10.y0();
                if ((y02 instanceof Dg.k) && ((Dg.k) y02).f3674a == Dg.l.f3695o0) {
                    if (((Boolean) sVar.f39361t.a(sVar, s.f39322X[18])).booleanValue()) {
                        Y y03 = d10.y0();
                        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor", y03);
                        sb2.append(D(((Dg.k) y03).f3675b[0]));
                        return;
                    }
                    sb2.append("???");
                    return;
                } else if (Bi.c.g1(d10)) {
                    C(sb2, d10);
                    return;
                } else if (j0(d10)) {
                    int length = sb2.length();
                    ((m) this.f39300b.getValue()).y(sb2, d10, null);
                    if (sb2.length() != length) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Bg.A z02 = Ad.l.z0(d10);
                    List q02 = Ad.l.q0(d10);
                    if (!q02.isEmpty()) {
                        sb2.append("context(");
                        for (Bg.A a10 : q02.subList(0, AbstractC4344b.u0(q02))) {
                            Q(sb2, a10);
                            sb2.append(", ");
                        }
                        Q(sb2, (Bg.A) kf.t.o2(q02));
                        sb2.append(") ");
                    }
                    boolean L02 = Ad.l.L0(d10);
                    boolean z03 = d10.z0();
                    if (!z03 && (!z10 || z02 == null)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        if (L02) {
                            sb2.insert(length, '(');
                        } else {
                            if (z10) {
                                J.I(Lg.o.Y2(sb2));
                                if (sb2.charAt(Lg.n.g2(sb2) - 1) != ')') {
                                    sb2.insert(Lg.n.g2(sb2), "()");
                                }
                            }
                            sb2.append(Separators.LPAREN);
                        }
                    }
                    N(sb2, L02, "suspend");
                    if (z02 != null) {
                        if ((!j0(z02) || z02.z0()) && !Ad.l.L0(z02) && z02.getAnnotations().isEmpty() && !(z02 instanceof C0224q)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            sb2.append(Separators.LPAREN);
                        }
                        Q(sb2, z02);
                        if (z12) {
                            sb2.append(Separators.RPAREN);
                        }
                        sb2.append(Separators.DOT);
                    }
                    sb2.append(Separators.LPAREN);
                    if (Ad.l.H0(d10) && d10.getAnnotations().l(Jf.p.f9183p) != null && d10.w0().size() <= 1) {
                        sb2.append("???");
                    } else {
                        int i10 = 0;
                        for (d0 d0Var : Ad.l.B0(d10)) {
                            int i11 = i10 + 1;
                            if (i10 > 0) {
                                sb2.append(", ");
                            }
                            if (((Boolean) sVar.T.a(sVar, s.f39322X[44])).booleanValue()) {
                                Bg.A type = d0Var.getType();
                                AbstractC3557B.b0("getType(...)", type);
                                c4294f = Ad.l.l0(type);
                            } else {
                                c4294f = null;
                            }
                            if (c4294f != null) {
                                sb2.append(O(c4294f, false));
                                sb2.append(": ");
                            }
                            AbstractC3557B.c0("typeProjection", d0Var);
                            StringBuilder sb3 = new StringBuilder();
                            kf.t.l2(AbstractC4344b.F0(d0Var), sb3, ", ", null, null, new j(this, 0), 60);
                            String sb4 = sb3.toString();
                            AbstractC3557B.b0("toString(...)", sb4);
                            sb2.append(sb4);
                            i10 = i11;
                        }
                    }
                    sb2.append(") ");
                    int ordinal = r().ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            str = "&rarr;";
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        str = o("->");
                    }
                    sb2.append(str);
                    sb2.append(Separators.SP);
                    Ad.l.H0(d10);
                    Bg.A type2 = ((d0) kf.t.o2(d10.w0())).getType();
                    AbstractC3557B.b0("getType(...)", type2);
                    Q(sb2, type2);
                    if (z11) {
                        sb2.append(Separators.RPAREN);
                    }
                    if (z03) {
                        sb2.append(Separators.QUESTION);
                        return;
                    }
                    return;
                } else {
                    C(sb2, d10);
                    return;
                }
            }
            sb2.append("???");
        }
    }

    public final void S(AbstractC0994c abstractC0994c, StringBuilder sb2) {
        if (p().contains(n.f39305k0) && (!abstractC0994c.m().isEmpty())) {
            s sVar = this.f39299a;
            if (((v) sVar.f39324B.a(sVar, s.f39322X[26])) != v.f39371Z) {
                N(sb2, true, "override");
                if (t()) {
                    sb2.append("/*");
                    sb2.append(abstractC0994c.m().size());
                    sb2.append("*/ ");
                }
            }
        }
    }

    public final void T(C4291c c4291c, String str, StringBuilder sb2) {
        sb2.append(I(str));
        C4293e i10 = c4291c.i();
        AbstractC3557B.b0("toUnsafe(...)", i10);
        String G10 = G(i10);
        if (G10.length() > 0) {
            sb2.append(Separators.SP);
            sb2.append(G10);
        }
    }

    public final void U(StringBuilder sb2, io.sentry.android.core.z zVar) {
        io.sentry.android.core.z zVar2 = (io.sentry.android.core.z) zVar.f34264Z;
        Object obj = zVar.f34263Y;
        if (zVar2 != null) {
            U(sb2, zVar2);
            sb2.append('.');
            C4294f name = ((AbstractC1001j) obj).getName();
            AbstractC3557B.b0("getName(...)", name);
            sb2.append(O(name, false));
        } else {
            Y f6 = ((AbstractC1001j) obj).f();
            AbstractC3557B.b0("getTypeConstructor(...)", f6);
            sb2.append(a0(f6));
        }
        sb2.append(Z((List) zVar.f34265h0));
    }

    public final void V(StringBuilder sb2, AbstractC0993b abstractC0993b) {
        AbstractC1146d Z10 = abstractC0993b.Z();
        if (Z10 != null) {
            y(sb2, Z10, Nf.e.f12811l0);
            Bg.A type = Z10.getType();
            AbstractC3557B.b0("getType(...)", type);
            sb2.append(F(type));
            sb2.append(Separators.DOT);
        }
    }

    public final void W(StringBuilder sb2, AbstractC0993b abstractC0993b) {
        AbstractC1146d Z10;
        s sVar = this.f39299a;
        if (((Boolean) sVar.f39328F.a(sVar, s.f39322X[30])).booleanValue() && (Z10 = abstractC0993b.Z()) != null) {
            sb2.append(" on ");
            Bg.A type = Z10.getType();
            AbstractC3557B.b0("getType(...)", type);
            sb2.append(Y(type));
        }
    }

    public final String Y(Bg.A a5) {
        AbstractC3557B.c0("type", a5);
        StringBuilder sb2 = new StringBuilder();
        s sVar = this.f39299a;
        Q(sb2, (Bg.A) ((wf.k) sVar.f39366y.a(sVar, s.f39322X[23])).invoke(a5));
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public final String Z(List list) {
        AbstractC3557B.c0("typeArguments", list);
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o(Separators.LESS_THAN));
        kf.t.l2(list, sb2, ", ", null, null, new j(this, 0), 60);
        sb2.append(o(Separators.GREATER_THAN));
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    @Override // mg.o
    public final void a() {
        this.f39299a.a();
    }

    public final String a0(Y y10) {
        AbstractC3557B.c0("typeConstructor", y10);
        AbstractC1000i k10 = y10.k();
        if ((k10 instanceof b0) || (k10 instanceof AbstractC0997f) || (k10 instanceof a0)) {
            AbstractC3557B.c0("klass", k10);
            if (Dg.m.f(k10)) {
                return k10.f().toString();
            }
            s sVar = this.f39299a;
            return ((AbstractC4655e) sVar.f39343b.a(sVar, s.f39322X[0])).a(k10, this);
        } else if (k10 == null) {
            if (y10 instanceof C0232z) {
                return ((C0232z) y10).c(l.f39295Y);
            }
            return y10.toString();
        } else {
            throw new IllegalStateException(("Unexpected classifier: " + k10.getClass()).toString());
        }
    }

    @Override // mg.o
    public final void b() {
        this.f39299a.b();
    }

    public final void b0(b0 b0Var, StringBuilder sb2, boolean z10) {
        boolean z11;
        if (z10) {
            sb2.append(o(Separators.LESS_THAN));
        }
        if (t()) {
            sb2.append("/*");
            sb2.append(b0Var.getIndex());
            sb2.append("*/ ");
        }
        N(sb2, b0Var.A(), "reified");
        String str = b0Var.J().f2150Y;
        boolean z12 = true;
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        N(sb2, z11, str);
        y(sb2, b0Var, null);
        P(b0Var, sb2, z10);
        int size = b0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            Bg.A a5 = (Bg.A) b0Var.getUpperBounds().iterator().next();
            if (a5 != null) {
                if (!Jf.l.x(a5) || !a5.z0()) {
                    sb2.append(" : ");
                    sb2.append(Y(a5));
                }
            } else {
                Jf.l.a(142);
                throw null;
            }
        } else if (z10) {
            for (Bg.A a10 : b0Var.getUpperBounds()) {
                if (a10 != null) {
                    if (!Jf.l.x(a10) || !a10.z0()) {
                        if (z12) {
                            sb2.append(" : ");
                        } else {
                            sb2.append(" & ");
                        }
                        sb2.append(Y(a10));
                        z12 = false;
                    }
                } else {
                    Jf.l.a(142);
                    throw null;
                }
            }
        }
        if (z10) {
            sb2.append(o(Separators.GREATER_THAN));
        }
    }

    @Override // mg.o
    public final void c() {
        this.f39299a.c();
    }

    public final void c0(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0((b0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // mg.o
    public final void d(Set set) {
        AbstractC3557B.c0("<set-?>", set);
        this.f39299a.d(set);
    }

    public final void d0(List list, StringBuilder sb2, boolean z10) {
        s sVar = this.f39299a;
        if (!((Boolean) sVar.f39364w.a(sVar, s.f39322X[21])).booleanValue() && (!list.isEmpty())) {
            sb2.append(o(Separators.LESS_THAN));
            c0(sb2, list);
            sb2.append(o(Separators.GREATER_THAN));
            if (z10) {
                sb2.append(Separators.SP);
            }
        }
    }

    @Override // mg.o
    public final boolean e() {
        return this.f39299a.e();
    }

    public final void e0(i0 i0Var, StringBuilder sb2, boolean z10) {
        String str;
        if (z10 || !(i0Var instanceof h0)) {
            if (i0Var.Y()) {
                str = "var";
            } else {
                str = "val";
            }
            sb2.append(I(str));
            sb2.append(Separators.SP);
        }
    }

    @Override // mg.o
    public final void f() {
        this.f39299a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(h0 h0Var, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        Bg.A type;
        Bg.A a5;
        Bg.A a10;
        boolean z13;
        if (z11) {
            sb2.append(I("value-parameter"));
            sb2.append(Separators.SP);
        }
        if (t()) {
            sb2.append("/*");
            sb2.append(((Pf.b0) h0Var).f14081k0);
            sb2.append("*/ ");
        }
        AbstractC0996e abstractC0996e = null;
        y(sb2, h0Var, null);
        Pf.b0 b0Var = (Pf.b0) h0Var;
        N(sb2, b0Var.f14083m0, "crossinline");
        N(sb2, b0Var.f14084n0, "noinline");
        s sVar = this.f39299a;
        q qVar = sVar.f39359r;
        Df.v[] vVarArr = s.f39322X;
        boolean z14 = false;
        if (((Boolean) qVar.a(sVar, vVarArr[16])).booleanValue()) {
            AbstractC0993b mo20k = b0Var.mo20k();
            if (mo20k instanceof AbstractC0996e) {
                abstractC0996e = (AbstractC0996e) mo20k;
            }
            if (abstractC0996e != null && ((C1154l) abstractC0996e).f14108J0) {
                z12 = true;
                if (z12) {
                    N(sb2, ((Boolean) sVar.f39360s.a(sVar, vVarArr[17])).booleanValue(), "actual");
                }
                type = ((c0) h0Var).getType();
                AbstractC3557B.b0("getType(...)", type);
                a5 = ((Pf.b0) h0Var).f14085o0;
                if (a5 != null) {
                    a10 = type;
                } else {
                    a10 = a5;
                }
                if (a5 != null) {
                    z14 = true;
                }
                N(sb2, z14, "vararg");
                if (!z12 || (z11 && !q())) {
                    e0(h0Var, sb2, z12);
                }
                if (z10) {
                    P(h0Var, sb2, z11);
                    sb2.append(": ");
                }
                sb2.append(Y(a10));
                H(h0Var, sb2);
                if (t() && a5 != null) {
                    sb2.append(" /*");
                    sb2.append(Y(type));
                    sb2.append("*/");
                }
                if (((wf.k) sVar.f39367z.a(sVar, vVarArr[24])) == null) {
                    if (sVar.k()) {
                        z13 = b0Var.w0();
                    } else {
                        z13 = AbstractC5493d.a(h0Var);
                    }
                    if (z13) {
                        StringBuilder sb3 = new StringBuilder(" = ");
                        wf.k kVar = (wf.k) sVar.f39367z.a(sVar, vVarArr[24]);
                        AbstractC3557B.Z(kVar);
                        sb3.append((String) kVar.invoke(h0Var));
                        sb2.append(sb3.toString());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z12 = false;
        if (z12) {
        }
        type = ((c0) h0Var).getType();
        AbstractC3557B.b0("getType(...)", type);
        a5 = ((Pf.b0) h0Var).f14085o0;
        if (a5 != null) {
        }
        if (a5 != null) {
        }
        N(sb2, z14, "vararg");
        if (!z12) {
        }
        e0(h0Var, sb2, z12);
        if (z10) {
        }
        sb2.append(Y(a10));
        H(h0Var, sb2);
        if (t()) {
            sb2.append(" /*");
            sb2.append(Y(type));
            sb2.append("*/");
        }
        if (((wf.k) sVar.f39367z.a(sVar, vVarArr[24])) == null) {
        }
    }

    @Override // mg.o
    public final void g(AbstractC4655e abstractC4655e) {
        this.f39299a.g(abstractC4655e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r9 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(List list, boolean z10, StringBuilder sb2) {
        boolean z11;
        Iterator it;
        s sVar = this.f39299a;
        int ordinal = ((w) sVar.f39327E.a(sVar, s.f39322X[29])).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
            }
            z11 = false;
            int size = list.size();
            ((h) s()).getClass();
            AbstractC3557B.c0("builder", sb2);
            sb2.append(Separators.LPAREN);
            it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                h0 h0Var = (h0) it.next();
                ((h) s()).getClass();
                AbstractC3557B.c0("parameter", h0Var);
                f0(h0Var, z11, sb2, false);
                ((h) s()).getClass();
                if (i10 != size - 1) {
                    sb2.append(", ");
                }
                i10 = i11;
            }
            ((h) s()).getClass();
            sb2.append(Separators.RPAREN);
        }
        z11 = true;
        int size2 = list.size();
        ((h) s()).getClass();
        AbstractC3557B.c0("builder", sb2);
        sb2.append(Separators.LPAREN);
        it = list.iterator();
        int i102 = 0;
        while (it.hasNext()) {
        }
        ((h) s()).getClass();
        sb2.append(Separators.RPAREN);
    }

    @Override // mg.o
    public final void h(w wVar) {
        this.f39299a.h(wVar);
    }

    public final boolean h0(AbstractC1007p abstractC1007p, StringBuilder sb2) {
        if (!p().contains(n.f39303i0)) {
            return false;
        }
        s sVar = this.f39299a;
        q qVar = sVar.f39355n;
        Df.v[] vVarArr = s.f39322X;
        if (((Boolean) qVar.a(sVar, vVarArr[12])).booleanValue()) {
            abstractC1007p = Mf.r.g(abstractC1007p.f12097a.c());
        }
        if (!((Boolean) sVar.f39356o.a(sVar, vVarArr[13])).booleanValue() && AbstractC3557B.K(abstractC1007p, Mf.r.f12111k)) {
            return false;
        }
        sb2.append(I(abstractC1007p.f12097a.b()));
        sb2.append(Separators.SP);
        return true;
    }

    @Override // mg.o
    public final void i() {
        this.f39299a.i();
    }

    public final void i0(StringBuilder sb2, List list) {
        s sVar = this.f39299a;
        if (((Boolean) sVar.f39364w.a(sVar, s.f39322X[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            List upperBounds = b0Var.getUpperBounds();
            AbstractC3557B.b0("getUpperBounds(...)", upperBounds);
            for (Bg.A a5 : kf.t.Z1(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                C4294f name = b0Var.getName();
                AbstractC3557B.b0("getName(...)", name);
                sb3.append(O(name, false));
                sb3.append(" : ");
                AbstractC3557B.Z(a5);
                sb3.append(Y(a5));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(Separators.SP);
            sb2.append(I("where"));
            sb2.append(Separators.SP);
            kf.t.l2(arrayList, sb2, ", ", null, null, null, 124);
        }
    }

    @Override // mg.o
    public final void j() {
        this.f39299a.j();
    }

    @Override // mg.o
    public final boolean k() {
        return this.f39299a.k();
    }

    @Override // mg.o
    public final void l() {
        z zVar = EnumC4650A.f39279Y;
        this.f39299a.l();
    }

    @Override // mg.o
    public final void m() {
        this.f39299a.m();
    }

    public final String o(String str) {
        return r().a(str);
    }

    public final Set p() {
        s sVar = this.f39299a;
        return (Set) sVar.f39346e.a(sVar, s.f39322X[3]);
    }

    public final boolean q() {
        s sVar = this.f39299a;
        return ((Boolean) sVar.f39347f.a(sVar, s.f39322X[4])).booleanValue();
    }

    public final EnumC4650A r() {
        s sVar = this.f39299a;
        return (EnumC4650A) sVar.f39326D.a(sVar, s.f39322X[28]);
    }

    public final i s() {
        s sVar = this.f39299a;
        return (i) sVar.f39325C.a(sVar, s.f39322X[27]);
    }

    public final boolean t() {
        s sVar = this.f39299a;
        return ((Boolean) sVar.f39351j.a(sVar, s.f39322X[8])).booleanValue();
    }

    public final String v(AbstractC1003l abstractC1003l) {
        AbstractC1003l mo20k;
        String str;
        String str2;
        AbstractC3557B.c0("declarationDescriptor", abstractC1003l);
        StringBuilder sb2 = new StringBuilder();
        abstractC1003l.u0(new C0631e(this), sb2);
        s sVar = this.f39299a;
        q qVar = sVar.f39344c;
        Df.v[] vVarArr = s.f39322X;
        if (((Boolean) qVar.a(sVar, vVarArr[1])).booleanValue() && !(abstractC1003l instanceof G) && !(abstractC1003l instanceof M) && (mo20k = abstractC1003l.mo20k()) != null && !(mo20k instanceof Mf.B)) {
            sb2.append(Separators.SP);
            int ordinal = r().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "<i>defined in</i>";
                } else {
                    throw new RuntimeException();
                }
            } else {
                str = "defined in";
            }
            sb2.append(str);
            sb2.append(Separators.SP);
            C4293e g10 = AbstractC4838e.g(mo20k);
            AbstractC3557B.b0("getFqName(...)", g10);
            if (g10.f37503a.isEmpty()) {
                str2 = "root package";
            } else {
                str2 = G(g10);
            }
            sb2.append(str2);
            if (((Boolean) sVar.f39345d.a(sVar, vVarArr[2])).booleanValue() && (mo20k instanceof G) && (abstractC1003l instanceof AbstractC1004m)) {
                ((AbstractC1004m) abstractC1003l).g().getClass();
            }
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String w(Nf.c cVar, Nf.e eVar) {
        AbstractC0997f abstractC0997f;
        String str;
        C4294f c4294f;
        AbstractC0996e M10;
        List S;
        AbstractC3557B.c0("annotation", cVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.f12816Y + ':');
        }
        Bg.A type = cVar.getType();
        sb2.append(Y(type));
        s sVar = this.f39299a;
        sVar.getClass();
        Df.v[] vVarArr = s.f39322X;
        Df.v vVar = vVarArr[38];
        q qVar = sVar.f39336N;
        if (((EnumC4651a) qVar.a(sVar, vVar)).f39284Y) {
            Map b10 = cVar.b();
            kf.v vVar2 = null;
            if (((Boolean) sVar.f39331I.a(sVar, vVarArr[33])).booleanValue()) {
                abstractC0997f = AbstractC5493d.d(cVar);
            } else {
                abstractC0997f = null;
            }
            if (abstractC0997f != null && (M10 = abstractC0997f.M()) != null && (S = ((AbstractC1165x) M10).S()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : S) {
                    if (((Pf.b0) ((h0) obj)).w0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC1158p) ((h0) it.next())).getName());
                }
                vVar2 = arrayList2;
            }
            if (vVar2 == null) {
                vVar2 = kf.v.f37483Y;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : vVar2) {
                AbstractC3557B.Z((C4294f) obj2);
                if (!b10.containsKey(c4294f)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C4294f) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> entrySet = b10.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC6583a.H1(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                C4294f c4294f2 = (C4294f) entry.getKey();
                AbstractC5170g abstractC5170g = (AbstractC5170g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(c4294f2.b());
                sb3.append(" = ");
                if (!vVar2.contains(c4294f2)) {
                    str = A(abstractC5170g);
                } else {
                    str = "...";
                }
                sb3.append(str);
                arrayList5.add(sb3.toString());
            }
            List E22 = kf.t.E2(kf.t.w2(arrayList5, arrayList4));
            if (((EnumC4651a) qVar.a(sVar, s.f39322X[38])).f39285Z || (!E22.isEmpty())) {
                kf.t.l2(E22, sb2, ", ", Separators.LPAREN, Separators.RPAREN, null, 112);
            }
        }
        if (t() && (Bi.c.g1(type) || (type.y0().k() instanceof E))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb4 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb4);
        return sb4;
    }

    public final void y(StringBuilder sb2, Nf.a aVar, Nf.e eVar) {
        Set set;
        if (!p().contains(n.f39306l0)) {
            return;
        }
        boolean z10 = aVar instanceof Bg.A;
        s sVar = this.f39299a;
        if (z10) {
            set = sVar.n();
        } else {
            set = (Set) sVar.f39333K.a(sVar, s.f39322X[35]);
        }
        wf.k kVar = (wf.k) sVar.f39335M.a(sVar, s.f39322X[37]);
        for (Nf.c cVar : aVar.getAnnotations()) {
            if (!kf.t.X1(set, cVar.a()) && !AbstractC3557B.K(cVar.a(), Jf.p.f9185r) && (kVar == null || ((Boolean) kVar.invoke(cVar)).booleanValue())) {
                sb2.append(w(cVar, eVar));
                if (((Boolean) sVar.f39332J.a(sVar, s.f39322X[34])).booleanValue()) {
                    sb2.append('\n');
                } else {
                    sb2.append(Separators.SP);
                }
            }
        }
    }

    public final void z(AbstractC1001j abstractC1001j, StringBuilder sb2) {
        List o10 = abstractC1001j.o();
        AbstractC3557B.b0("getDeclaredTypeParameters(...)", o10);
        List parameters = abstractC1001j.f().getParameters();
        AbstractC3557B.b0("getParameters(...)", parameters);
        if (t() && abstractC1001j.I() && parameters.size() > o10.size()) {
            sb2.append(" /*captured type parameters: ");
            c0(sb2, parameters.subList(o10.size(), parameters.size()));
            sb2.append("*/");
        }
    }
}
