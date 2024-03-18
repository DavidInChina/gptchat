package dg;

import Mf.V;
import Sf.AbstractC1385d;
import android.gov.nist.javax.sip.header.ParameterNames;
import fg.C3039g;
import fg.C3044l;
import fg.C3051t;
import fg.C3056y;
import fg.EnumC3041i;
import fg.Q;
import fg.W;
import fg.Z;
import hg.AbstractC3427f;
import hg.AbstractC3428g;
import hg.C3430i;
import id.AbstractC3557B;
import ig.C3577c;
import ig.C3579e;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kg.C4290b;
import l8.AbstractC4344b;
import lg.AbstractC4456a;
import lg.AbstractC4468m;
import lg.C4464i;
import lg.C4470o;
import pg.AbstractC5170g;
import pg.C5167d;
import pg.C5174k;
import pg.C5183t;
import pg.C5185v;
import pg.C5188y;
import xg.AbstractC6448c;
import xg.AbstractC6451f;
import xg.C6445B;
import xg.EnumC6447b;
import yf.AbstractC6583a;

/* renamed from: dg.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2666f implements AbstractC6448c, AbstractC6451f {

    /* renamed from: a  reason: collision with root package name */
    public final x f28312a;

    /* renamed from: b  reason: collision with root package name */
    public final Ag.n f28313b;

    public AbstractC2666f(Ag.q qVar, Rf.d dVar) {
        this.f28312a = dVar;
        this.f28313b = qVar.b(new Xf.f(5, this));
    }

    public static /* synthetic */ List m(AbstractC2666f abstractC2666f, xg.D d10, C2656E c2656e, boolean z10, Boolean bool, boolean z11, int i10) {
        boolean z12;
        boolean z13;
        if ((i10 & 4) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        Boolean bool2 = bool;
        if ((i10 & 32) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        return abstractC2666f.l(d10, c2656e, z12, false, bool2, z13);
    }

    public static C2656E n(AbstractC4456a abstractC4456a, AbstractC3428g abstractC3428g, C3430i c3430i, EnumC6447b enumC6447b, boolean z10) {
        AbstractC3557B.c0("proto", abstractC4456a);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("kind", enumC6447b);
        if (abstractC4456a instanceof C3044l) {
            C4464i c4464i = jg.i.f36194a;
            jg.e a5 = jg.i.a((C3044l) abstractC4456a, abstractC3428g, c3430i);
            if (a5 == null) {
                return null;
            }
            return Cf.k.j(a5);
        } else if (abstractC4456a instanceof C3056y) {
            C4464i c4464i2 = jg.i.f36194a;
            jg.e c10 = jg.i.c((C3056y) abstractC4456a, abstractC3428g, c3430i);
            if (c10 == null) {
                return null;
            }
            return Cf.k.j(c10);
        } else if (!(abstractC4456a instanceof fg.G)) {
            return null;
        } else {
            C4470o c4470o = ig.k.f33235d;
            AbstractC3557B.b0("propertySignature", c4470o);
            C3579e c3579e = (C3579e) A7.b.P0((AbstractC4468m) abstractC4456a, c4470o);
            if (c3579e == null) {
                return null;
            }
            int ordinal = enumC6447b.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 || (c3579e.f33187Z & 8) != 8) {
                        return null;
                    }
                    C3577c c3577c = c3579e.f33191k0;
                    AbstractC3557B.b0("getSetter(...)", c3577c);
                    return Cf.k.k(abstractC3428g, c3577c);
                } else if ((c3579e.f33187Z & 4) != 4) {
                    return null;
                } else {
                    C3577c c3577c2 = c3579e.f33190j0;
                    AbstractC3557B.b0("getGetter(...)", c3577c2);
                    return Cf.k.k(abstractC3428g, c3577c2);
                }
            }
            return AbstractC3557B.r1((fg.G) abstractC4456a, abstractC3428g, c3430i, true, true, z10);
        }
    }

    @Override // xg.AbstractC6451f
    public final List a(xg.D d10, fg.G g10) {
        AbstractC3557B.c0("proto", g10);
        return s(d10, g10, EnumC2667g.f28315Z);
    }

    @Override // xg.AbstractC6451f
    public final ArrayList b(W w10, AbstractC3428g abstractC3428g) {
        AbstractC3557B.c0("proto", w10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        Object i10 = w10.i(ig.k.f33239h);
        AbstractC3557B.b0("getExtension(...)", i10);
        Iterable<C3039g> iterable = (Iterable) i10;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            AbstractC3557B.Z(c3039g);
            arrayList.add(((C2673m) this).f28343e.k(c3039g, abstractC3428g));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6451f
    public final List c(C6445B c6445b, C3051t c3051t) {
        AbstractC3557B.c0("container", c6445b);
        AbstractC3557B.c0("proto", c3051t);
        String b10 = c6445b.f49967a.b(c3051t.f30721i0);
        String c10 = c6445b.f49963f.c();
        AbstractC3557B.b0("asString(...)", c10);
        return m(this, c6445b, Cf.k.i(b10, jg.b.b(c10)), false, null, false, 60);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if ((r9.f30311h0 & 64) != 64) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r9.f49965h != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        if ((r9.f30768h0 & 64) != 64) goto L24;
     */
    @Override // xg.AbstractC6451f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d(xg.D d10, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b, int i10, Z z10) {
        AbstractC3557B.c0("container", d10);
        AbstractC3557B.c0("callableProto", abstractC4456a);
        AbstractC3557B.c0("kind", enumC6447b);
        AbstractC3557B.c0("proto", z10);
        int i11 = 0;
        C2656E n10 = n(abstractC4456a, d10.f49967a, d10.f49968b, enumC6447b, false);
        if (n10 != null) {
            if (abstractC4456a instanceof C3056y) {
                C3056y c3056y = (C3056y) abstractC4456a;
                if (!c3056y.o()) {
                }
                i11 = 1;
                return m(this, d10, Cf.k.m(n10, i10 + i11), false, null, false, 60);
            } else if (abstractC4456a instanceof fg.G) {
                fg.G g10 = (fg.G) abstractC4456a;
                if (!g10.o()) {
                }
                i11 = 1;
                return m(this, d10, Cf.k.m(n10, i10 + i11), false, null, false, 60);
            } else if (abstractC4456a instanceof C3044l) {
                C6445B c6445b = (C6445B) d10;
                if (c6445b.f49964g == EnumC3041i.ENUM_CLASS) {
                    i11 = 2;
                }
                return m(this, d10, Cf.k.m(n10, i10 + i11), false, null, false, 60);
            } else {
                throw new UnsupportedOperationException("Unsupported message: " + abstractC4456a.getClass());
            }
        }
        return kf.v.f37483Y;
    }

    @Override // xg.AbstractC6451f
    public final List e(xg.D d10, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b) {
        AbstractC3557B.c0("proto", abstractC4456a);
        AbstractC3557B.c0("kind", enumC6447b);
        C2656E n10 = n(abstractC4456a, d10.f49967a, d10.f49968b, enumC6447b, false);
        if (n10 != null) {
            return m(this, d10, Cf.k.m(n10, 0), false, null, false, 60);
        }
        return kf.v.f37483Y;
    }

    @Override // xg.AbstractC6448c
    public final Object f(xg.D d10, fg.G g10, Bg.A a5) {
        AbstractC3557B.c0("proto", g10);
        return r(d10, g10, EnumC6447b.f49994h0, a5, C2661a.f28304Y);
    }

    @Override // xg.AbstractC6451f
    public final ArrayList g(Q q10, AbstractC3428g abstractC3428g) {
        AbstractC3557B.c0("proto", q10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        Object i10 = q10.i(ig.k.f33237f);
        AbstractC3557B.b0("getExtension(...)", i10);
        Iterable<C3039g> iterable = (Iterable) i10;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            AbstractC3557B.Z(c3039g);
            arrayList.add(((C2673m) this).f28343e.k(c3039g, abstractC3428g));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6448c
    public final Object h(xg.D d10, fg.G g10, Bg.A a5) {
        AbstractC3557B.c0("proto", g10);
        return r(d10, g10, EnumC6447b.f49993Z, a5, C2665e.f28311Y);
    }

    @Override // xg.AbstractC6451f
    public final List i(xg.D d10, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b) {
        AbstractC3557B.c0("proto", abstractC4456a);
        AbstractC3557B.c0("kind", enumC6447b);
        if (enumC6447b == EnumC6447b.f49993Z) {
            return s(d10, (fg.G) abstractC4456a, EnumC2667g.f28314Y);
        }
        C2656E n10 = n(abstractC4456a, d10.f49967a, d10.f49968b, enumC6447b, false);
        if (n10 == null) {
            return kf.v.f37483Y;
        }
        return m(this, d10, n10, false, null, false, 60);
    }

    @Override // xg.AbstractC6451f
    public final ArrayList j(C6445B c6445b) {
        C2655D c2655d;
        AbstractC3557B.c0("container", c6445b);
        V v10 = c6445b.f49969c;
        AbstractC2653B abstractC2653B = null;
        if (v10 instanceof C2655D) {
            c2655d = (C2655D) v10;
        } else {
            c2655d = null;
        }
        if (c2655d != null) {
            abstractC2653B = c2655d.f28290b;
        }
        if (abstractC2653B != null) {
            ArrayList arrayList = new ArrayList(1);
            Class cls = ((Rf.c) abstractC2653B).f15499a;
            AbstractC3557B.c0("klass", cls);
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            AbstractC3557B.b0("getDeclaredAnnotations(...)", declaredAnnotations);
            for (Annotation annotation : declaredAnnotations) {
                AbstractC3557B.Z(annotation);
                Class k12 = R4.b.k1(R4.b.d1(annotation));
                C2672l q10 = q(AbstractC1385d.a(k12), new Rf.a(annotation), arrayList);
                if (q10 != null) {
                    AbstractC4344b.R0(q10, annotation, k12);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + c6445b.a()).toString());
    }

    @Override // xg.AbstractC6451f
    public final List k(xg.D d10, fg.G g10) {
        AbstractC3557B.c0("proto", g10);
        return s(d10, g10, EnumC2667g.f28316h0);
    }

    public final List l(xg.D d10, C2656E c2656e, boolean z10, boolean z11, Boolean bool, boolean z12) {
        List list;
        C2655D c2655d;
        AbstractC2653B n10 = Cf.k.n(d10, z10, z11, bool, z12, this.f28312a, ((C2673m) this).f28344f);
        if (n10 == null) {
            if (d10 instanceof C6445B) {
                V v10 = ((C6445B) d10).f49969c;
                if (v10 instanceof C2655D) {
                    c2655d = (C2655D) v10;
                } else {
                    c2655d = null;
                }
                if (c2655d != null) {
                    n10 = c2655d.f28290b;
                }
            }
            n10 = null;
        }
        kf.v vVar = kf.v.f37483Y;
        if (n10 != null && (list = (List) ((C2668h) this.f28313b.invoke(n10)).f28318h.get(c2656e)) != null) {
            return list;
        }
        return vVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final boolean o(C4290b c4290b) {
        AbstractC3557B.c0("classId", c4290b);
        if (c4290b.f() == null || !AbstractC3557B.K(c4290b.i().b(), "Container")) {
            return false;
        }
        AbstractC2653B L10 = P4.a.L(this.f28312a, c4290b, ((C2673m) this).f28344f);
        if (L10 == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = If.b.f8592a;
        ?? obj = new Object();
        AbstractC4344b.I0(((Rf.c) L10).f15499a, new If.a(obj));
        if (!obj.f37645Y) {
            return false;
        }
        return true;
    }

    public abstract C2672l p(C4290b c4290b, V v10, List list);

    public final C2672l q(C4290b c4290b, Rf.a aVar, List list) {
        AbstractC3557B.c0("result", list);
        if (If.b.f8592a.contains(c4290b)) {
            return null;
        }
        return p(c4290b, aVar, list);
    }

    public final Object r(xg.D d10, fg.G g10, EnumC6447b enumC6447b, Bg.A a5, wf.n nVar) {
        Object invoke;
        C5188y c5188y;
        C2655D c2655d;
        AbstractC2653B n10 = Cf.k.n(d10, true, true, AbstractC3427f.f32299B.c(g10.f30312i0), jg.i.d(g10), this.f28312a, ((C2673m) this).f28344f);
        if (n10 == null) {
            if (d10 instanceof C6445B) {
                V v10 = ((C6445B) d10).f49969c;
                if (v10 instanceof C2655D) {
                    c2655d = (C2655D) v10;
                } else {
                    c2655d = null;
                }
                if (c2655d != null) {
                    n10 = c2655d.f28290b;
                }
            }
            n10 = null;
        }
        if (n10 == null) {
            return null;
        }
        jg.g gVar = (jg.g) ((Rf.c) n10).f15500b.f40438d;
        jg.g gVar2 = o.f28349e;
        gVar.getClass();
        AbstractC3557B.c0(ParameterNames.VERSION, gVar2);
        C2656E n11 = n(g10, d10.f49967a, d10.f49968b, enumC6447b, gVar.a(gVar2.f32291b, gVar2.f32292c, gVar2.f32293d));
        if (n11 == null || (invoke = nVar.invoke(this.f28313b.invoke(n10), n11)) == null) {
            return null;
        }
        if (Jf.u.a(a5)) {
            AbstractC5170g abstractC5170g = (AbstractC5170g) invoke;
            if (abstractC5170g instanceof C5167d) {
                c5188y = new C5188y(((Number) ((C5167d) abstractC5170g).f43144a).byteValue());
            } else if (abstractC5170g instanceof C5185v) {
                c5188y = new C5188y(((Number) ((C5185v) abstractC5170g).f43144a).shortValue());
            } else if (abstractC5170g instanceof C5174k) {
                c5188y = new C5188y(((Number) ((C5174k) abstractC5170g).f43144a).intValue());
            } else if (abstractC5170g instanceof C5183t) {
                c5188y = new C5188y(((Number) ((C5183t) abstractC5170g).f43144a).longValue());
            } else {
                return abstractC5170g;
            }
            return c5188y;
        }
        return invoke;
    }

    public final List s(xg.D d10, fg.G g10, EnumC2667g enumC2667g) {
        Boolean c10 = AbstractC3427f.f32299B.c(g10.f30312i0);
        boolean d11 = jg.i.d(g10);
        EnumC2667g enumC2667g2 = EnumC2667g.f28314Y;
        kf.v vVar = kf.v.f37483Y;
        if (enumC2667g == enumC2667g2) {
            C2656E s12 = AbstractC3557B.s1(g10, d10.f49967a, d10.f49968b, false, true, 40);
            if (s12 != null) {
                return m(this, d10, s12, true, c10, d11, 8);
            }
            return vVar;
        }
        C2656E s13 = AbstractC3557B.s1(g10, d10.f49967a, d10.f49968b, true, false, 48);
        if (s13 != null) {
            boolean z10 = false;
            boolean Z12 = Lg.n.Z1(s13.f28291a, "$delegate", false);
            if (enumC2667g == EnumC2667g.f28316h0) {
                z10 = true;
            }
            if (Z12 == z10) {
                return l(d10, s13, true, true, c10, d11);
            }
            return vVar;
        }
        return vVar;
    }
}
