package gb;

import E.AbstractC0441z;
import Z.AbstractC1725n;
import Z.C1723m;
import fa.AbstractC2965B;
import fa.C2969F;
import fa.EnumC2971H;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import w9.C6147d;
import wf.AbstractC6216a;

/* renamed from: gb.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3246x extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.k f31527Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2969F f31528Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f31529h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f31530i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f31531j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ w9.j f31532k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f31533l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3246x(C3227d c3227d, C2969F c2969f, boolean z10, C3240q c3240q, boolean z11, w9.j jVar, wf.k kVar) {
        super(3);
        this.f31527Y = c3227d;
        this.f31528Z = c2969f;
        this.f31529h0 = z10;
        this.f31530i0 = c3240q;
        this.f31531j0 = z11;
        this.f31532k0 = jVar;
        this.f31533l0 = kVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EnumC2971H enumC2971H;
        Object obj4;
        EnumC2971H enumC2971H2;
        Object obj5;
        boolean z10;
        C2969F c2969f;
        boolean z11;
        C2969F c2969f2;
        EnumC2971H enumC2971H3;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$PopupMenu", (AbstractC0441z) obj);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageContextMenu");
        if ((intValue & 81) == 16) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        C3288a c3288a = AbstractC3232i.f31448b;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-159168792);
        wf.k kVar = this.f31527Y;
        boolean g10 = rVar2.g(kVar);
        C2969F c2969f3 = this.f31528Z;
        boolean g11 = g10 | rVar2.g(c2969f3);
        Object K10 = rVar2.K();
        Object obj6 = C1723m.f22654Y;
        if (g11 || K10 == obj6) {
            K10 = new C3245w(kVar, c2969f3, 0);
            rVar2.h0(K10);
        }
        rVar2.t(false);
        Df.H.g(c3288a, (AbstractC6216a) K10, a5, AbstractC3232i.f31449c, null, false, null, null, null, rVar2, 3078, 500);
        AbstractC2965B abstractC2965B = c2969f3.f30015h;
        rVar2.W(-159168579);
        boolean z12 = abstractC2965B instanceof fa.n;
        w9.j jVar = this.f31532k0;
        if (z12) {
            C6147d c6147d = new C6147d(jVar, 1);
            fa.l lVar = fa.n.Companion;
            D.l((fa.n) abstractC2965B, c6147d, rVar2, 8);
        }
        rVar2.t(false);
        C3288a c3288a2 = AbstractC3232i.f31450d;
        rVar2.W(-159168308);
        boolean g12 = rVar2.g(kVar) | rVar2.g(c2969f3);
        Object K11 = rVar2.K();
        if (g12 || K11 == obj6) {
            K11 = new C3245w(kVar, c2969f3, 1);
            rVar2.h0(K11);
        }
        rVar2.t(false);
        Df.H.g(c3288a2, (AbstractC6216a) K11, a5, AbstractC3232i.f31451e, null, false, null, null, null, rVar2, 3078, 500);
        rVar2.W(-159168123);
        boolean z13 = this.f31529h0;
        EnumC2971H enumC2971H4 = c2969f3.f30011d;
        if (z13 && enumC2971H4 != EnumC2971H.f30046Y) {
            C3288a c3288a3 = AbstractC3232i.f31452f;
            rVar2.W(-159167924);
            wf.k kVar2 = this.f31530i0;
            boolean g13 = rVar2.g(kVar2) | rVar2.g(c2969f3);
            Object K12 = rVar2.K();
            if (g13 || K12 == obj6) {
                K12 = new C3245w(kVar2, c2969f3, 2);
                rVar2.h0(K12);
            }
            rVar2.t(false);
            obj4 = obj6;
            enumC2971H = enumC2971H4;
            Df.H.g(c3288a3, (AbstractC6216a) K12, a5, AbstractC3232i.f31453g, null, false, null, null, null, rVar2, 3078, 500);
        } else {
            enumC2971H = enumC2971H4;
            obj4 = obj6;
        }
        rVar2.t(false);
        rVar2.W(-159167709);
        EnumC2971H enumC2971H5 = EnumC2971H.f30046Y;
        boolean z14 = c2969f3.f30017j;
        if (enumC2971H != enumC2971H5 && z14) {
            C3288a c3288a4 = AbstractC3232i.f31454h;
            rVar2.W(-159167540);
            boolean g14 = rVar2.g(kVar) | rVar2.g(c2969f3);
            Object K13 = rVar2.K();
            Object obj7 = obj4;
            if (g14 || K13 == obj7) {
                K13 = new C3245w(kVar, c2969f3, 3);
                rVar2.h0(K13);
            }
            rVar2.t(false);
            obj5 = obj7;
            z10 = z14;
            enumC2971H2 = enumC2971H5;
            c2969f = c2969f3;
            z11 = false;
            Df.H.g(c3288a4, (AbstractC6216a) K13, a5, AbstractC3232i.f31455i, null, false, null, null, null, rVar2, 3078, 500);
        } else {
            c2969f = c2969f3;
            z10 = z14;
            enumC2971H2 = enumC2971H5;
            z11 = false;
            obj5 = obj4;
        }
        rVar2.t(z11);
        rVar2.W(-159167340);
        EnumC2971H enumC2971H6 = enumC2971H2;
        if (enumC2971H != enumC2971H6 && !z10) {
            C3288a c3288a5 = AbstractC3232i.f31456j;
            rVar2.W(-159167172);
            C2969F c2969f4 = c2969f;
            boolean g15 = rVar2.g(kVar) | rVar2.g(c2969f4);
            Object K14 = rVar2.K();
            if (g15 || K14 == obj5) {
                K14 = new C3245w(kVar, c2969f4, 4);
                rVar2.h0(K14);
            }
            rVar2.t(z11);
            c2969f2 = c2969f4;
            enumC2971H3 = enumC2971H6;
            Df.H.g(c3288a5, (AbstractC6216a) K14, a5, AbstractC3232i.f31457k, null, false, null, null, null, rVar2, 3078, 500);
        } else {
            enumC2971H3 = enumC2971H6;
            c2969f2 = c2969f;
        }
        rVar2.t(z11);
        EnumC2971H enumC2971H7 = enumC2971H;
        if (this.f31531j0 && enumC2971H7 != enumC2971H3 && z10) {
            Df.H.g(AbstractC3232i.f31458l, new F.s(jVar, this.f31533l0, c2969f2, 22), a5, AbstractC3232i.f31459m, null, false, null, null, null, rVar2, 3078, 500);
        }
        return jf.y.f36177a;
    }
}
