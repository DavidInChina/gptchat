package z;

import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.l1;
import Z.o1;
import id.AbstractC3557B;
import java.util.Map;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5254f;

/* renamed from: z.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6704j {

    /* renamed from: a  reason: collision with root package name */
    public static final C6697f0 f51301a = AbstractC6696f.u(0.0f, 0.0f, null, 7);

    /* renamed from: b  reason: collision with root package name */
    public static final C6697f0 f51302b = AbstractC6696f.u(0.0f, 0.0f, new Z0.e(0.1f), 3);

    static {
        Map map = AbstractC6670J0.f51158a;
        int i10 = C5254f.f43639d;
        AbstractC4828h.i(0.5f, 0.5f);
        int i11 = C5251c.f43622e;
        R4.b.r(0.5f, 0.5f);
        int i12 = Z0.i.f22798c;
        kotlin.jvm.internal.m.c(1, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [z.f0] */
    public static final l1 a(float f6, C6735y0 c6735y0, String str, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1407150062);
        C6735y0 c6735y02 = c6735y0;
        if ((i11 & 2) != 0) {
            c6735y02 = f51302b;
        }
        C6735y0 c6735y03 = c6735y02;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        l1 c10 = c(new Z0.e(f6), AbstractC6652A0.f51118c, c6735y03, null, str, null, rVar, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
        rVar.t(false);
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [z.o] */
    /* JADX WARN: Type inference failed for: r1v0, types: [z.f0] */
    public static final l1 b(float f6, C6735y0 c6735y0, String str, AbstractC1725n abstractC1725n, int i10, int i11) {
        C6735y0 c6735y02;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(668842840);
        int i12 = i11 & 2;
        ?? r12 = f51301a;
        if (i12 != 0) {
            c6735y0 = r12;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        rVar.W(841393662);
        if (c6735y0 == r12) {
            Float valueOf = Float.valueOf(0.01f);
            rVar.W(1157296644);
            boolean g10 = rVar.g(valueOf);
            Object K10 = rVar.K();
            if (g10 || K10 == C1723m.f22654Y) {
                K10 = AbstractC6696f.u(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                rVar.h0(K10);
            }
            rVar.t(false);
            c6735y02 = (AbstractC6714o) K10;
        } else {
            c6735y02 = c6735y0;
        }
        rVar.t(false);
        l1 c10 = c(Float.valueOf(f6), AbstractC6652A0.f51116a, c6735y02, Float.valueOf(0.01f), str2, null, rVar, (i10 << 3) & 57344, 0);
        rVar.t(false);
        return c10;
    }

    public static final l1 c(Object obj, C6737z0 c6737z0, AbstractC6714o abstractC6714o, Float f6, String str, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        Float f10;
        AbstractC6714o abstractC6714o2 = abstractC6714o;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1994373980);
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if ((i11 & 8) != 0) {
            f10 = null;
        } else {
            f10 = f6;
        }
        rVar.W(-492369756);
        Object K10 = rVar.K();
        if (K10 == iVar) {
            K10 = AbstractC4828h.Z(null, o1.f22665a);
            rVar.h0(K10);
        }
        rVar.t(false);
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        rVar.W(-492369756);
        Object K11 = rVar.K();
        if (K11 == iVar) {
            K11 = new C6694e(obj, c6737z0, f10);
            rVar.h0(K11);
        }
        rVar.t(false);
        C6694e c6694e = (C6694e) K11;
        AbstractC1710f0 g02 = AbstractC4828h.g0(kVar, rVar);
        if (f10 != null && (abstractC6714o2 instanceof C6697f0)) {
            C6697f0 c6697f0 = (C6697f0) abstractC6714o2;
            if (!AbstractC3557B.K(c6697f0.f51257c, f10)) {
                abstractC6714o2 = new C6697f0(c6697f0.f51255a, c6697f0.f51256b, f10);
            }
        }
        AbstractC1710f0 g03 = AbstractC4828h.g0(abstractC6714o2, rVar);
        rVar.W(-492369756);
        Object K12 = rVar.K();
        if (K12 == iVar) {
            K12 = Bi.c.d(-1, null, 6);
            rVar.h0(K12);
        }
        rVar.t(false);
        Pg.o oVar = (Pg.o) K12;
        AbstractC1734s.g(new C6698g(oVar, obj), rVar);
        AbstractC1734s.e(oVar, new C6702i(oVar, c6694e, g03, g02, null), rVar);
        l1 l1Var = (l1) abstractC1710f0.getValue();
        if (l1Var == null) {
            l1Var = c6694e.f51230c;
        }
        rVar.t(false);
        return l1Var;
    }
}
