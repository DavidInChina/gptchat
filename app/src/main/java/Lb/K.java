package lb;

import Jc.AbstractC0809c;
import Jc.AbstractC0810d;
import Uc.C1423h;
import Uc.C1425j;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.AbstractC1819s;
import Z8.C1795f0;
import Z8.C1832y0;
import Z8.G0;
import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import bb.B0;
import ca.AbstractC2313e;
import ca.C2311c;
import ca.C2315g;
import ca.C2316h;
import ca.C2317i;
import ca.C2329u;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import e9.C2814g;
import fa.C2969F;
import gb.P;
import gb.Q;
import gb.S;
import gb.T;
import gb.U;
import gb.V;
import gb.W;
import gb.X;
import gb.Y;
import gb.Z;
import gb.a0;
import gb.b0;
import gb.c0;
import gb.d0;
import gb.e0;
import gb.f0;
import gb.g0;
import gb.h0;
import gb.i0;
import gb.j0;
import gb.k0;
import gb.l0;
import gb.m0;
import ha.C3370m;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.C3959i;
import kb.C4211E;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import vb.AbstractC6005a;
import wd.C6182c0;
import wd.O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes2.dex */
public final class K extends m0 {

    /* renamed from: j  reason: collision with root package name */
    public final T9.a f37954j;

    /* renamed from: k  reason: collision with root package name */
    public final Jc.F f37955k;

    /* renamed from: l  reason: collision with root package name */
    public final AbstractC0810d f37956l;

    /* renamed from: m  reason: collision with root package name */
    public final C4368e f37957m;

    /* renamed from: n  reason: collision with root package name */
    public final Va.e f37958n;

    /* renamed from: o  reason: collision with root package name */
    public final com.openai.experiment.t f37959o;

    /* renamed from: p  reason: collision with root package name */
    public final AbstractC6005a f37960p;

    /* renamed from: q  reason: collision with root package name */
    public final C4211E f37961q;

    /* renamed from: r  reason: collision with root package name */
    public final Z9.d f37962r;

    /* renamed from: s  reason: collision with root package name */
    public final p9.s f37963s;

    /* renamed from: t  reason: collision with root package name */
    public final Pc.g f37964t = Bi.c.i1(Pc.b.f13934l0);

    public K(T9.a aVar, Jc.F f6, AbstractC0810d abstractC0810d, C4368e c4368e, Va.e eVar, com.openai.experiment.t tVar, AbstractC6005a abstractC6005a, C4211E c4211e, Z9.d dVar, p9.s sVar) {
        super(new l0(null, null, false, null, null, ((com.openai.experiment.G) tVar).c(ExperimentKey.C2PAEnabled.INSTANCE)));
        this.f37954j = aVar;
        this.f37955k = f6;
        this.f37956l = abstractC0810d;
        this.f37957m = c4368e;
        this.f37958n = eVar;
        this.f37959o = tVar;
        this.f37960p = abstractC6005a;
        this.f37961q = c4211e;
        this.f37962r = dVar;
        this.f37963s = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(K k10, String str, String str2, AbstractC4825e abstractC4825e) {
        C4373j c4373j;
        int i10;
        K k11;
        C3370m c3370m;
        AbstractC2313e abstractC2313e;
        ?? r52;
        k10.getClass();
        if (abstractC4825e instanceof C4373j) {
            c4373j = (C4373j) abstractC4825e;
            int i11 = c4373j.f38018k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4373j.f38018k0 = i11 - Integer.MIN_VALUE;
                Object obj = c4373j.f38016i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4373j.f38018k0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                c3370m = (C3370m) c4373j.f38015h0;
                                str = c4373j.f38014Z;
                                k11 = c4373j.f38013Y;
                                N.B0(obj);
                                k11.l(new Ra.l(str, 8, c3370m));
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            str2 = (String) c4373j.f38015h0;
                            str = c4373j.f38014Z;
                            k10 = c4373j.f38013Y;
                            N.B0(obj);
                            abstractC2313e = (AbstractC2313e) obj;
                            if (abstractC2313e != null) {
                                k10.getClass();
                                Iterator it = abstractC2313e.b().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        r52 = it.next();
                                        if (AbstractC3557B.K(((C3370m) r52).f32071a, str2)) {
                                            break;
                                        }
                                    } else {
                                        r52 = 0;
                                        break;
                                    }
                                }
                                C3370m c3370m2 = r52;
                                if (c3370m2 != null) {
                                    Z8.r rVar = Z8.r.f23407e;
                                    c4373j.f38013Y = k10;
                                    c4373j.f38014Z = str;
                                    c4373j.f38015h0 = c3370m2;
                                    c4373j.f38018k0 = 5;
                                    if (k10.t(abstractC2313e, c3370m2, rVar, c4373j) != enumC5000a) {
                                        k11 = k10;
                                        c3370m = c3370m2;
                                        k11.l(new Ra.l(str, 8, c3370m));
                                    } else {
                                        return enumC5000a;
                                    }
                                } else {
                                    Intent intent = new Intent();
                                    A7.b.G0(intent, str2);
                                    k10.f(new gb.H(intent));
                                }
                            }
                        }
                    } else {
                        N.B0(obj);
                    }
                } else {
                    N.B0(obj);
                    Uri parse = Uri.parse(str2);
                    if (AbstractC3557B.K(parse.getScheme(), "code")) {
                        c4373j.f38018k0 = 1;
                        if (k10.w(str, c4373j) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        AbstractC3557B.c0("<this>", str2);
                        if (Lg.n.I2(str2, "file-service://", false)) {
                            c4373j.f38018k0 = 2;
                            if (k10.q(str2, c4373j) == enumC5000a) {
                                return enumC5000a;
                            }
                        } else if (Lg.n.f2(parse.getScheme(), "sandbox")) {
                            c4373j.f38018k0 = 3;
                            if (k10.r(str, parse, c4373j) == enumC5000a) {
                                return enumC5000a;
                            }
                        } else {
                            c4373j.f38013Y = k10;
                            c4373j.f38014Z = str;
                            c4373j.f38015h0 = str2;
                            c4373j.f38018k0 = 4;
                            obj = k10.s(str, c4373j);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            abstractC2313e = (AbstractC2313e) obj;
                            if (abstractC2313e != null) {
                            }
                        }
                    }
                }
                return yVar;
            }
        }
        c4373j = new C4373j(k10, abstractC4825e);
        Object obj2 = c4373j.f38016i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4373j.f38018k0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(K k10, String str, AbstractC4825e abstractC4825e) {
        C4376m c4376m;
        int i10;
        AbstractC2313e abstractC2313e;
        Iterator it;
        K k11;
        AbstractC2313e abstractC2313e2;
        boolean z10;
        k10.getClass();
        if (abstractC4825e instanceof C4376m) {
            c4376m = (C4376m) abstractC4825e;
            int i11 = c4376m.f38037k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4376m.f38037k0 = i11 - Integer.MIN_VALUE;
                Object obj = c4376m.f38035i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4376m.f38037k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            it = c4376m.f38034h0;
                            abstractC2313e = c4376m.f38033Z;
                            k11 = c4376m.f38032Y;
                            N.B0(obj);
                            while (it.hasNext()) {
                                Z8.r rVar = Z8.r.f23405c;
                                c4376m.f38032Y = k11;
                                c4376m.f38033Z = abstractC2313e;
                                c4376m.f38034h0 = it;
                                c4376m.f38037k0 = 2;
                                if (k11.t(abstractC2313e, (C3370m) it.next(), rVar, c4376m) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10 = c4376m.f38032Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c4376m.f38032Y = k10;
                    c4376m.f38037k0 = 1;
                    obj = k10.s(str, c4376m);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                abstractC2313e2 = (AbstractC2313e) obj;
                if (abstractC2313e2 != null) {
                    if (abstractC2313e2 instanceof C2316h) {
                        z10 = ((C2316h) abstractC2313e2).f26391a.f30017j;
                    } else if (abstractC2313e2 instanceof C2317i) {
                        z10 = ((C2317i) abstractC2313e2).f26392a.a();
                    } else if (!(abstractC2313e2 instanceof C2315g)) {
                        throw new RuntimeException();
                    }
                    if (z10) {
                        k11 = k10;
                        it = abstractC2313e2.b().iterator();
                        abstractC2313e = abstractC2313e2;
                        while (it.hasNext()) {
                        }
                    }
                }
                return jf.y.f36177a;
            }
        }
        c4376m = new C4376m(k10, abstractC4825e);
        Object obj2 = c4376m.f38035i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4376m.f38037k0;
        if (i10 == 0) {
        }
        abstractC2313e2 = (AbstractC2313e) obj2;
        if (abstractC2313e2 != null) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(K k10, d0 d0Var, AbstractC4825e abstractC4825e) {
        H h10;
        int i10;
        String str;
        k10.getClass();
        if (abstractC4825e instanceof H) {
            h10 = (H) abstractC4825e;
            int i11 = h10.f37945j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h10.f37945j0 = i11 - Integer.MIN_VALUE;
                Object obj = h10.f37943h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = h10.f37945j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        String str2 = h10.f37942Z;
                        K k11 = h10.f37941Y;
                        N.B0(obj);
                        str = str2;
                        k10 = k11;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    str = d0Var.f31397a;
                    AbstractC1809m0.a().b(Z8.D.f23242c, P4.a.o0(new C3959i("gizmo_id", new O(str))));
                    da.c cVar = new da.c(str);
                    h10.f37941Y = k10;
                    h10.f37942Z = str;
                    h10.f37945j0 = 1;
                    if (((C4972C) k10.f37954j).c(cVar, h10) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                k10.g(new Ad.p(Uc.z.f17704l.p1(str)));
                return jf.y.f36177a;
            }
        }
        h10 = new H(k10, abstractC4825e);
        Object obj2 = h10.f37943h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = h10.f37945j0;
        if (i10 == 0) {
        }
        k10.g(new Ad.p(Uc.z.f17704l.p1(str)));
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(K k10, C2969F c2969f, AbstractC4825e abstractC4825e) {
        I i10;
        int i11;
        v0 v0Var;
        k10.getClass();
        if (abstractC4825e instanceof I) {
            i10 = (I) abstractC4825e;
            int i12 = i10.f37949i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i10.f37949i0 = i12 - Integer.MIN_VALUE;
                Object obj = i10.f37947Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = i10.f37949i0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        k10 = i10.f37946Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    AbstractC1809m0.a().b(G0.f23249c, kf.w.f37484Y);
                    i10.f37946Y = k10;
                    i10.f37949i0 = 1;
                    obj = ((C4972C) k10.f37954j).j(c2969f, i10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (v0Var instanceof q0) {
                    k10.f(new gb.I((q0) v0Var));
                }
                return jf.y.f36177a;
            }
        }
        i10 = new I(k10, abstractC4825e);
        Object obj2 = i10.f37947Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = i10.f37949i0;
        if (i11 == 0) {
        }
        v0Var = (v0) obj2;
        if (v0Var instanceof q0) {
        }
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        k0 k0Var = (k0) iVar;
        AbstractC3557B.c0("intent", k0Var);
        if (k0Var instanceof Q) {
            AbstractC1809m0.a().b(C1832y0.f23421c, kf.w.f37484Y);
            String a5 = L.a(((Q) k0Var).f31371a.f30015h);
            if (a5 != null) {
                f(new gb.F(a5));
            }
        } else if (k0Var instanceof f0) {
            AbstractC1809m0.a().b(C1795f0.f23345c, kf.w.f37484Y);
            String a10 = L.a(((f0) k0Var).f31428a.f30015h);
            if (a10 != null) {
                l(new B0(a10, 1));
            }
        } else if (k0Var instanceof e0) {
            h(new C4363C(k0Var, this, null));
        } else if (k0Var instanceof h0) {
            h(new D(k0Var, this, null));
        } else if (k0Var instanceof b0) {
            b0 b0Var = (b0) k0Var;
            C4211E.a(this.f37961q, b0Var.f31387a, b0Var.f31388b, false, 4);
            Uc.C c10 = Uc.C.f17609i;
            String str = this.f37962r.f23425a;
            AbstractC3557B.c0("conversationId", str);
            String concat = "conversation/edit?id=".concat(str);
            AbstractC3557B.c0("internalRoute", concat);
            g(new Ad.p(concat));
            l(n.f38044m0);
        } else if (k0Var instanceof gb.N) {
            l(n.f38045n0);
        } else if (k0Var instanceof gb.M) {
            l(n.f38046o0);
        } else if (k0Var instanceof X) {
            l(n.f38047p0);
        } else if (k0Var instanceof S) {
            f(new gb.F(((S) k0Var).f31372a));
        } else if (k0Var instanceof gb.O) {
            h(new E(k0Var, this, null));
        } else if (k0Var instanceof j0) {
            C1425j c1425j = C1425j.f17681i;
            j0 j0Var = (j0) k0Var;
            g(new Ad.p(C1425j.o1(j0Var.f31467a, j0Var.f31468b, j0Var.f31469c)));
        } else if (k0Var instanceof i0) {
            C1423h c1423h = C1423h.f17677i;
            i0 i0Var = (i0) k0Var;
            wd.L l10 = i0Var.f31462b;
            String v22 = Lg.n.v2("file-service://", l10.f48357a);
            String str2 = i0Var.f31461a;
            AbstractC3557B.c0("conversationId", str2);
            String str3 = l10.f48358b;
            AbstractC3557B.c0("title", str3);
            String b10 = Fe.c.b(v22);
            String b11 = Fe.c.b(str3);
            StringBuilder t10 = android.gov.nist.core.a.t("conversation/attachment/csv?id=", str2, "&encodedFileId=", b10, "&title=");
            t10.append(b11);
            String sb2 = t10.toString();
            AbstractC3557B.c0("internalRoute", sb2);
            g(new Ad.p(sb2));
        } else if (k0Var instanceof c0) {
            h(new F(k0Var, this, null));
        } else if (k0Var instanceof T) {
            h(new G(k0Var, this, null));
        } else if (k0Var instanceof W) {
            l(n.f38039h0);
        } else if (k0Var instanceof Z) {
            h(new q(k0Var, this, null));
        } else if (k0Var instanceof Y) {
            h(new u(k0Var, this, null));
        } else if (k0Var instanceof U) {
            h(new x(k0Var, this, null));
        } else if (k0Var instanceof V) {
            h(new y(k0Var, this, null));
        } else if (k0Var instanceof a0) {
            h(new z(k0Var, this, null));
        } else if (AbstractC3557B.K(k0Var, P.f31370a)) {
            h(new C4361A(this, null));
        } else if (k0Var instanceof g0) {
            AbstractC1805k0 a11 = AbstractC1809m0.a();
            Z8.Y y10 = Z8.Y.f23283c;
            a11.b(y10, kf.w.f37484Y);
            x8.W.M(this.f37964t, y10.f23420a, null, 6);
        } else if (k0Var instanceof d0) {
            h(new C4362B(k0Var, this, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, AbstractC4825e abstractC4825e) {
        C4370g c4370g;
        int i10;
        K k10;
        Vc.x xVar;
        if (abstractC4825e instanceof C4370g) {
            c4370g = (C4370g) abstractC4825e;
            int i11 = c4370g.f38001i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4370g.f38001i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4370g.f37999Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4370g.f38001i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        k10 = c4370g.f37998Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    f(gb.K.f31365a);
                    AbstractC3557B.c0("value", str);
                    String v22 = Lg.n.v2("file-service://", str);
                    c4370g.f37998Y = this;
                    c4370g.f38001i0 = 1;
                    obj = ((Ta.l) this.f37956l).a(v22, c4370g);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    k10 = this;
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    String str2 = ((Jc.g) ((Vc.w) xVar).f18565a).f9050b;
                    if (str2 != null) {
                        Intent intent = new Intent();
                        A7.b.G0(intent, str2);
                        k10.f(new gb.H(intent));
                    }
                } else if (xVar instanceof Vc.r) {
                    k10.v((Vc.r) xVar);
                } else if (!(xVar instanceof Vc.q)) {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        c4370g = new C4370g(this, abstractC4825e);
        Object obj2 = c4370g.f37999Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4370g.f38001i0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(String str, Uri uri, AbstractC4825e abstractC4825e) {
        C4371h c4371h;
        int i10;
        K k10;
        v0 v0Var;
        Jc.F f6;
        K k11;
        String str2;
        C2311c c2311c;
        if (abstractC4825e instanceof C4371h) {
            c4371h = (C4371h) abstractC4825e;
            int i11 = c4371h.f38008l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4371h.f38008l0 = i11 - Integer.MIN_VALUE;
                Object obj = c4371h.f38006j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4371h.f38008l0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            k10 = c4371h.f38002Y;
                            N.B0(obj);
                            v0Var = (v0) obj;
                            if (!(v0Var instanceof u0)) {
                                String str3 = (String) ((u0) v0Var).f48468a;
                                if (str3 != null) {
                                    Intent intent = new Intent();
                                    A7.b.G0(intent, str3);
                                    k10.f(new gb.H(intent));
                                }
                            } else if (v0Var instanceof q0) {
                                q0 q0Var = (q0) v0Var;
                                Throwable th2 = q0Var.f48450a;
                                if (th2 instanceof AbstractC0809c) {
                                    k10.f(new gb.G((AbstractC0809c) th2));
                                } else {
                                    k10.f(new gb.I(q0Var));
                                }
                            } else if (!(v0Var instanceof p0)) {
                                throw new RuntimeException();
                            }
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f6 = c4371h.f38005i0;
                    uri = c4371h.f38004h0;
                    str2 = c4371h.f38003Z;
                    k11 = c4371h.f38002Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    f(gb.K.f31365a);
                    Rg.o oVar = ((C4972C) this.f37954j).f41058m;
                    c4371h.f38002Y = this;
                    c4371h.f38003Z = str;
                    c4371h.f38004h0 = uri;
                    Jc.F f10 = this.f37955k;
                    c4371h.f38005i0 = f10;
                    c4371h.f38008l0 = 1;
                    obj = L4.a.m0(oVar, c4371h);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    k11 = this;
                    str2 = str;
                    f6 = f10;
                }
                c2311c = (C2311c) obj;
                if (c2311c == null) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    c4371h.f38002Y = k11;
                    c4371h.f38003Z = null;
                    c4371h.f38004h0 = null;
                    c4371h.f38005i0 = null;
                    c4371h.f38008l0 = 2;
                    obj = ((Ta.p) f6).a(c2311c.f26374a, str2, path, c4371h);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    k10 = k11;
                    v0Var = (v0) obj;
                    if (!(v0Var instanceof u0)) {
                    }
                    return yVar;
                }
                return yVar;
            }
        }
        c4371h = new C4371h(this, abstractC4825e);
        Object obj2 = c4371h.f38006j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4371h.f38008l0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        c2311c = (C2311c) obj2;
        if (c2311c == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, AbstractC4825e abstractC4825e) {
        C4372i c4372i;
        int i10;
        Iterator it;
        boolean K10;
        if (abstractC4825e instanceof C4372i) {
            c4372i = (C4372i) abstractC4825e;
            int i11 = c4372i.f38012i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4372i.f38012i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4372i.f38010Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4372i.f38012i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = c4372i.f38009Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C2814g c2814g = ((C4972C) this.f37954j).f41060o;
                    c4372i.f38009Y = str;
                    c4372i.f38012i0 = 1;
                    obj = L4.a.m0(c2814g, c4372i);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                it = T9.b.b(((T9.c) obj).f16971f).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC2313e abstractC2313e = (AbstractC2313e) next;
                    abstractC2313e.getClass();
                    AbstractC3557B.c0(ParameterNames.ID, str);
                    if (abstractC2313e instanceof C2316h) {
                        K10 = AbstractC3557B.K(((C2316h) abstractC2313e).f26391a.f30008a, str);
                    } else if (abstractC2313e instanceof C2317i) {
                        List<C2969F> list = ((C2317i) abstractC2313e).f26393b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (C2969F c2969f : list) {
                                if (AbstractC3557B.K(c2969f.f30008a, str)) {
                                    return next;
                                }
                            }
                            continue;
                        }
                    } else if (abstractC2313e instanceof C2315g) {
                        K10 = AbstractC3557B.K(((C2315g) abstractC2313e).f26390a.f30008a, str);
                    } else {
                        throw new RuntimeException();
                    }
                    if (K10) {
                        return next;
                    }
                }
                return null;
            }
        }
        c4372i = new C4372i(this, abstractC4825e);
        Object obj2 = c4372i.f38010Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4372i.f38012i0;
        if (i10 == 0) {
        }
        it = T9.b.b(((T9.c) obj2).f16971f).iterator();
        while (it.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(AbstractC2313e abstractC2313e, C3370m c3370m, AbstractC1819s abstractC1819s, AbstractC4825e abstractC4825e) {
        C4375l c4375l;
        int i10;
        K k10;
        C2311c c2311c;
        if (abstractC4825e instanceof C4375l) {
            c4375l = (C4375l) abstractC4825e;
            int i11 = c4375l.f38031l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4375l.f38031l0 = i11 - Integer.MIN_VALUE;
                Object obj = c4375l.f38029j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4375l.f38031l0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        abstractC1819s = c4375l.f38028i0;
                        c3370m = c4375l.f38027h0;
                        abstractC2313e = c4375l.f38026Z;
                        k10 = c4375l.f38025Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Rg.o oVar = ((C4972C) this.f37954j).f41058m;
                    c4375l.f38025Y = this;
                    c4375l.f38026Z = abstractC2313e;
                    c4375l.f38027h0 = c3370m;
                    c4375l.f38028i0 = abstractC1819s;
                    c4375l.f38031l0 = 1;
                    obj = L4.a.m0(oVar, c4375l);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    k10 = this;
                }
                c2311c = (C2311c) obj;
                jf.y yVar = jf.y.f36177a;
                if (c2311c != null) {
                    AbstractC1805k0 a5 = AbstractC1809m0.a();
                    C3959i c3959i = new C3959i("conversation_id", c2311c.f26374a);
                    C3959i c3959i2 = new C3959i("model_slug", abstractC2313e.c().f30023p);
                    C3959i c3959i3 = new C3959i("message_id", new C6182c0(abstractC2313e.c().f30008a));
                    C3959i c3959i4 = new C3959i("url", c3370m.f32071a);
                    k10.getClass();
                    ArrayList b10 = abstractC2313e.b();
                    a5.b(abstractC1819s, AbstractC4268D.a1(c3959i, c3959i2, c3959i3, c3959i4, new C3959i("citation_number", String.valueOf(Integer.valueOf(b10.size() - b10.indexOf(c3370m))))));
                }
                return yVar;
            }
        }
        c4375l = new C4375l(this, abstractC4825e);
        Object obj2 = c4375l.f38029j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4375l.f38031l0;
        if (i10 == 0) {
        }
        c2311c = (C2311c) obj2;
        jf.y yVar2 = jf.y.f36177a;
        if (c2311c != null) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(String str, C3370m c3370m, AbstractC1819s abstractC1819s, AbstractC4825e abstractC4825e) {
        C4374k c4374k;
        int i10;
        K k10;
        AbstractC2313e abstractC2313e;
        if (abstractC4825e instanceof C4374k) {
            c4374k = (C4374k) abstractC4825e;
            int i11 = c4374k.f38024k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4374k.f38024k0 = i11 - Integer.MIN_VALUE;
                Object obj = c4374k.f38022i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4374k.f38024k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1819s = c4374k.f38021h0;
                    c3370m = c4374k.f38020Z;
                    k10 = c4374k.f38019Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c4374k.f38019Y = this;
                    c4374k.f38020Z = c3370m;
                    c4374k.f38021h0 = abstractC1819s;
                    c4374k.f38024k0 = 1;
                    obj = s(str, c4374k);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    k10 = this;
                }
                abstractC2313e = (AbstractC2313e) obj;
                if (abstractC2313e != null) {
                    return null;
                }
                c4374k.f38019Y = null;
                c4374k.f38020Z = null;
                c4374k.f38021h0 = null;
                c4374k.f38024k0 = 2;
                if (k10.t(abstractC2313e, c3370m, abstractC1819s, c4374k) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        c4374k = new C4374k(this, abstractC4825e);
        Object obj2 = c4374k.f38022i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4374k.f38024k0;
        if (i10 == 0) {
        }
        abstractC2313e = (AbstractC2313e) obj2;
        if (abstractC2313e != null) {
        }
    }

    public final void v(Vc.r rVar) {
        Throwable th2 = rVar.f18561a;
        if (th2 instanceof AbstractC0809c) {
            f(new gb.G((AbstractC0809c) th2));
        } else {
            f(new gb.I(Vc.x.a(rVar)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(String str, AbstractC4825e abstractC4825e) {
        J j6;
        Object obj;
        int i10;
        K k10;
        C2317i c2317i;
        N n10;
        C2329u c2329u;
        if (abstractC4825e instanceof J) {
            j6 = (J) abstractC4825e;
            int i11 = j6.f37953i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j6.f37953i0 = i11 - Integer.MIN_VALUE;
                obj = j6.f37951Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = j6.f37953i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        k10 = j6.f37950Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    j6.f37950Y = this;
                    j6.f37953i0 = 1;
                    obj = s(str, j6);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    k10 = this;
                }
                String str2 = null;
                if (!(obj instanceof C2317i)) {
                    c2317i = (C2317i) obj;
                } else {
                    c2317i = null;
                }
                if (c2317i == null) {
                    n10 = c2317i.f26395d;
                } else {
                    n10 = null;
                }
                if (!(n10 instanceof C2329u)) {
                    c2329u = (C2329u) n10;
                } else {
                    c2329u = null;
                }
                if (c2329u != null) {
                    str2 = c2329u.f26421g;
                }
                k10.l(new B0(str2, 2));
                return jf.y.f36177a;
            }
        }
        j6 = new J(this, abstractC4825e);
        obj = j6.f37951Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = j6.f37953i0;
        if (i10 == 0) {
        }
        String str22 = null;
        if (!(obj instanceof C2317i)) {
        }
        if (c2317i == null) {
        }
        if (!(n10 instanceof C2329u)) {
        }
        if (c2329u != null) {
        }
        k10.l(new B0(str22, 2));
        return jf.y.f36177a;
    }
}
