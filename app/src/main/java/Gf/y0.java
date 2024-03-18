package Gf;

import Mf.AbstractC0997f;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Pf.AbstractC1158p;
import Pf.AbstractC1159q;
import android.gov.nist.javax.sip.parser.TokenNames;
import fg.C3044l;
import fg.C3056y;
import id.AbstractC3557B;
import ig.C3579e;
import java.lang.reflect.Method;
import kg.C4290b;
import kg.C4291c;
import lg.AbstractC4456a;
import lg.C4464i;
import lg.C4470o;
import ng.AbstractC4838e;
import ng.AbstractC4842i;
import rg.AbstractC5493d;
import zg.AbstractC6855b;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C4290b f6500a = C4290b.j(new C4291c("java.lang.Void"));

    public static C0638l a(AbstractC1013w abstractC1013w) {
        String U10 = P4.a.U(abstractC1013w);
        if (U10 == null) {
            if (abstractC1013w instanceof Mf.Q) {
                String b10 = AbstractC5493d.k(abstractC1013w).getName().b();
                AbstractC3557B.b0("asString(...)", b10);
                U10 = Uf.C.a(b10);
            } else if (abstractC1013w instanceof Mf.S) {
                String b11 = AbstractC5493d.k(abstractC1013w).getName().b();
                AbstractC3557B.b0("asString(...)", b11);
                U10 = Uf.C.b(b11);
            } else {
                U10 = ((AbstractC1158p) abstractC1013w).getName().b();
                AbstractC3557B.b0("asString(...)", U10);
            }
        }
        return new C0638l(new jg.e(U10, L4.a.e0(abstractC1013w, 1)));
    }

    public static U3.f b(Mf.P p10) {
        Rf.h hVar;
        Sf.u uVar;
        Mf.V v10;
        Rf.h hVar2;
        Sf.u uVar2;
        Sf.z zVar;
        AbstractC3557B.c0("possiblyOverriddenProperty", p10);
        Mf.P mo24a = ((Mf.P) AbstractC4838e.t(p10)).mo24a();
        AbstractC3557B.b0("getOriginal(...)", mo24a);
        C0638l c0638l = null;
        Method method = null;
        if (mo24a instanceof zg.r) {
            zg.r rVar = (zg.r) mo24a;
            C4470o c4470o = ig.k.f33235d;
            AbstractC3557B.b0("propertySignature", c4470o);
            fg.G g10 = rVar.f52082G0;
            C3579e c3579e = (C3579e) A7.b.P0(g10, c4470o);
            if (c3579e != null) {
                return new C0641o(mo24a, g10, c3579e, rVar.f52083H0, rVar.f52084I0);
            }
        } else if (mo24a instanceof Wf.g) {
            Mf.V g11 = ((Wf.g) mo24a).g();
            if (g11 instanceof Rf.h) {
                hVar = (Rf.h) g11;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                uVar = hVar.f15508b;
            } else {
                uVar = null;
            }
            if (uVar instanceof Sf.w) {
                return new C0639m(((Sf.w) uVar).f16627a);
            }
            if (uVar instanceof Sf.z) {
                Method method2 = ((Sf.z) uVar).f16629a;
                Mf.S b10 = mo24a.b();
                if (b10 != null) {
                    v10 = ((AbstractC1159q) b10).g();
                } else {
                    v10 = null;
                }
                if (v10 instanceof Rf.h) {
                    hVar2 = (Rf.h) v10;
                } else {
                    hVar2 = null;
                }
                if (hVar2 != null) {
                    uVar2 = hVar2.f15508b;
                } else {
                    uVar2 = null;
                }
                if (uVar2 instanceof Sf.z) {
                    zVar = (Sf.z) uVar2;
                } else {
                    zVar = null;
                }
                if (zVar != null) {
                    method = zVar.f16629a;
                }
                return new C0640n(method2, method);
            }
            throw new Lc.l("Incorrect resolution sequence for Java field " + mo24a + " (source = " + uVar + ')', 3);
        }
        Pf.P d10 = mo24a.d();
        AbstractC3557B.Z(d10);
        C0638l a5 = a(d10);
        Mf.S b11 = mo24a.b();
        if (b11 != null) {
            c0638l = a(b11);
        }
        return new C0642p(a5, c0638l);
    }

    public static R4.b c(AbstractC1013w abstractC1013w) {
        Rf.h hVar;
        Rf.h hVar2;
        Object obj;
        Method method;
        AbstractC3557B.c0("possiblySubstitutedFunction", abstractC1013w);
        AbstractC1013w mo24a = ((AbstractC1013w) AbstractC4838e.t(abstractC1013w)).mo24a();
        AbstractC3557B.b0("getOriginal(...)", mo24a);
        if (mo24a instanceof AbstractC6855b) {
            AbstractC6855b abstractC6855b = (AbstractC6855b) mo24a;
            AbstractC4456a z10 = abstractC6855b.z();
            if (z10 instanceof C3056y) {
                C4464i c4464i = jg.i.f36194a;
                jg.e c10 = jg.i.c((C3056y) z10, abstractC6855b.T(), abstractC6855b.O());
                if (c10 != null) {
                    return new C0638l(c10);
                }
            }
            if (z10 instanceof C3044l) {
                C4464i c4464i2 = jg.i.f36194a;
                jg.e a5 = jg.i.a((C3044l) z10, abstractC6855b.T(), abstractC6855b.O());
                if (a5 != null) {
                    AbstractC1003l mo20k = abstractC1013w.mo20k();
                    AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                    if (AbstractC4842i.b(mo20k)) {
                        return new C0638l(a5);
                    }
                    AbstractC1003l mo20k2 = abstractC1013w.mo20k();
                    AbstractC3557B.b0("getContainingDeclaration(...)", mo20k2);
                    if (AbstractC4842i.c(mo20k2)) {
                        AbstractC1002k abstractC1002k = (AbstractC1002k) abstractC1013w;
                        boolean v10 = abstractC1002k.v();
                        String str = a5.f36185a;
                        String str2 = a5.f36186b;
                        if (v10) {
                            if (!AbstractC3557B.K(str, "constructor-impl") || !Lg.n.c2(str2, ")V", false)) {
                                throw new IllegalArgumentException(("Invalid signature: " + a5).toString());
                            }
                        } else if (AbstractC3557B.K(str, "constructor-impl")) {
                            AbstractC0997f x10 = abstractC1002k.x();
                            AbstractC3557B.b0("getConstructedClass(...)", x10);
                            C4290b f6 = AbstractC5493d.f(x10);
                            AbstractC3557B.Z(f6);
                            String c11 = f6.c();
                            AbstractC3557B.b0("asString(...)", c11);
                            String b10 = jg.b.b(c11);
                            if (Lg.n.c2(str2, ")V", false)) {
                                String str3 = Lg.n.w2(TokenNames.f24320V, str2) + b10;
                                AbstractC3557B.c0("name", str);
                                AbstractC3557B.c0("desc", str3);
                                a5 = new jg.e(str, str3);
                            } else if (!Lg.n.c2(str2, b10, false)) {
                                throw new IllegalArgumentException(("Invalid signature: " + a5).toString());
                            }
                        } else {
                            throw new IllegalArgumentException(("Invalid signature: " + a5).toString());
                        }
                        return new C0638l(a5);
                    }
                    return new C0637k(a5);
                }
            }
            return a(mo24a);
        }
        Sf.u uVar = null;
        Sf.z zVar = null;
        if (mo24a instanceof Wf.f) {
            Mf.V g10 = ((Wf.f) mo24a).g();
            if (g10 instanceof Rf.h) {
                hVar2 = (Rf.h) g10;
            } else {
                hVar2 = null;
            }
            if (hVar2 != null) {
                obj = hVar2.f15508b;
            } else {
                obj = null;
            }
            if (obj instanceof Sf.z) {
                zVar = (Sf.z) obj;
            }
            if (zVar != null && (method = zVar.f16629a) != null) {
                return new C0636j(method);
            }
            throw new Lc.l("Incorrect resolution sequence for Java method " + mo24a, 3);
        } else if (mo24a instanceof Wf.b) {
            Mf.V g11 = ((Wf.b) mo24a).g();
            if (g11 instanceof Rf.h) {
                hVar = (Rf.h) g11;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                uVar = hVar.f15508b;
            }
            if (uVar instanceof Sf.t) {
                return new C0635i(((Sf.t) uVar).f16625a);
            }
            if (uVar instanceof Sf.q) {
                Sf.q qVar = (Sf.q) uVar;
                if (qVar.f16621a.isAnnotation()) {
                    return new C0634h(qVar.f16621a);
                }
            }
            throw new Lc.l("Incorrect resolution sequence for Java constructor " + mo24a + " (" + uVar + ')', 3);
        } else {
            AbstractC1158p abstractC1158p = (AbstractC1158p) mo24a;
            if ((abstractC1158p.getName().equals(Jf.q.f9196c) && R4.b.u1(mo24a)) || ((abstractC1158p.getName().equals(Jf.q.f9194a) && R4.b.u1(mo24a)) || (AbstractC3557B.K(abstractC1158p.getName(), Lf.a.f11062e) && mo24a.S().isEmpty()))) {
                return a(mo24a);
            }
            throw new Lc.l("Unknown origin of " + mo24a + " (" + mo24a.getClass() + ')', 3);
        }
    }
}
