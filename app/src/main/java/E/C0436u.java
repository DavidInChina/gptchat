package E;

import A.C0046u0;
import W.AbstractC1646z0;
import W.C1550f3;
import W.C1621u0;
import W.EnumC1555g3;
import W.X1;
import Z.l1;
import android.content.Context;
import android.graphics.Path;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import lc.AbstractC4394S;
import lc.AbstractC4407f;
import lc.C4388L;
import lc.C4389M;
import lc.C4393Q;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.C5344h;
import r0.C5345i;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5653l;
import t0.C5654m;
import wd.EnumC6206t;
import wf.AbstractC6216a;

/* renamed from: E.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436u extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3954Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f3955Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f3956h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f3957i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f3958j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f3959k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f3960l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0436u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(1);
        this.f3954Y = i10;
        this.f3955Z = obj;
        this.f3956h0 = obj2;
        this.f3957i0 = obj3;
        this.f3958j0 = obj4;
        this.f3959k0 = obj5;
        this.f3960l0 = obj6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Path path;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f3954Y;
        Object obj2 = this.f3960l0;
        Object obj3 = this.f3959k0;
        Object obj4 = this.f3958j0;
        Object obj5 = this.f3956h0;
        int i11 = 0;
        Object obj6 = this.f3957i0;
        Object obj7 = this.f3955Z;
        switch (i10) {
            case 0:
                E0.c0 c0Var = (E0.c0) obj;
                E0.d0[] d0VarArr = (E0.d0[]) obj7;
                List list = (List) obj5;
                E0.P p10 = (E0.P) obj6;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj4;
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) obj3;
                C0437v c0437v = (C0437v) obj2;
                int length = d0VarArr.length;
                int i12 = 0;
                while (i11 < length) {
                    E0.d0 d0Var = d0VarArr[i11];
                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable", d0Var);
                    AbstractC0434s.b(c0Var, d0Var, (E0.M) list.get(i12), p10.getLayoutDirection(), zVar.f37647Y, zVar2.f37647Y, c0437v.f3966a);
                    i11++;
                    i12++;
                }
                return yVar;
            case 1:
                AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
                float floor = (float) Math.floor(abstractC5650i.R(AbstractC1646z0.f20637c));
                long j6 = ((r0.r) ((l1) obj7).getValue()).f44265a;
                long j10 = ((r0.r) ((l1) obj5).getValue()).f44265a;
                float R10 = abstractC5650i.R(AbstractC1646z0.f20638d);
                float f6 = floor / 2.0f;
                C5654m c5654m = new C5654m(floor, 0.0f, 0, 0, 30);
                float d10 = C5254f.d(abstractC5650i.g());
                boolean c10 = r0.r.c(j6, j10);
                C5653l c5653l = C5653l.f45622a;
                if (c10) {
                    AbstractC5648g.m(abstractC5650i, j6, 0L, AbstractC4828h.i(d10, d10), Ng.H.b(R10, R10), c5653l, 226);
                } else {
                    long r10 = R4.b.r(floor, floor);
                    float f10 = d10 - (2 * floor);
                    long i13 = AbstractC4828h.i(f10, f10);
                    float max = Math.max(0.0f, R10 - floor);
                    AbstractC5648g.m(abstractC5650i, j6, r10, i13, Ng.H.b(max, max), c5653l, 224);
                    float f11 = d10 - floor;
                    float f12 = R10 - f6;
                    AbstractC5648g.m(abstractC5650i, j10, R4.b.r(f6, f6), AbstractC4828h.i(f11, f11), Ng.H.b(f12, f12), c5654m, 224);
                }
                long j11 = ((r0.r) ((l1) obj6).getValue()).f44265a;
                float floatValue = ((Number) ((l1) obj4).getValue()).floatValue();
                float floatValue2 = ((Number) ((l1) obj3).getValue()).floatValue();
                C1621u0 c1621u0 = (C1621u0) obj2;
                C5654m c5654m2 = new C5654m(floor, 0.0f, 2, 0, 26);
                float d11 = C5254f.d(abstractC5650i.g());
                float L10 = K4.J.L(0.4f, 0.5f, floatValue2);
                float L11 = K4.J.L(0.7f, 0.5f, floatValue2);
                float L12 = K4.J.L(0.5f, 0.5f, floatValue2);
                float L13 = K4.J.L(0.3f, 0.5f, floatValue2);
                ((C5344h) c1621u0.f20452a).d();
                r0.E e10 = c1621u0.f20452a;
                C5344h c5344h = (C5344h) e10;
                c5344h.f44241a.moveTo(0.2f * d11, L12 * d11);
                c5344h.b(L10 * d11, L11 * d11);
                c5344h.b(0.8f * d11, d11 * L13);
                C5345i c5345i = c1621u0.f20453b;
                if (e10 != null) {
                    c5345i.getClass();
                    if (e10 instanceof C5344h) {
                        path = ((C5344h) e10).f44241a;
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    path = null;
                }
                c5345i.f44245a.setPath(path, false);
                r0.E e11 = c1621u0.f20454c;
                ((C5344h) e11).d();
                c5345i.a(0.0f, c5345i.f44245a.getLength() * floatValue, e11);
                AbstractC5648g.i(abstractC5650i, c1621u0.f20454c, j11, 0.0f, c5654m2, 52);
                return yVar;
            case 2:
                C1550f3 c1550f3 = (C1550f3) obj7;
                String str = (String) obj6;
                String str2 = (String) obj4;
                Ng.F f13 = (Ng.F) obj2;
                X1 x12 = new X1((AbstractC6216a) obj3, 0);
                Df.v[] vVarArr = L0.t.f10472a;
                L0.j jVar = (L0.j) ((L0.v) obj);
                jVar.y(L0.i.f10402s, new L0.a((String) obj5, x12));
                EnumC1555g3 enumC1555g3 = (EnumC1555g3) c1550f3.f20062c.f18997f.getValue();
                EnumC1555g3 enumC1555g32 = EnumC1555g3.f20080h0;
                if (enumC1555g3 == enumC1555g32) {
                    jVar.y(L0.i.f10400q, new L0.a(str, new F.s(c1550f3, f13, c1550f3, 4)));
                } else if (c1550f3.f20062c.d().f19126a.containsKey(enumC1555g32)) {
                    jVar.y(L0.i.f10401r, new L0.a(str2, new W.B(c1550f3, 2, f13)));
                }
                return yVar;
            default:
                F.B b10 = (F.B) obj;
                AbstractC3557B.c0("$this$LazyColumn", b10);
                C4393Q c4393q = (C4393Q) obj7;
                if (c4393q.f38113b != null) {
                    E9.f.t(b10, null, new C3288a(new C4388L(c4393q, (wf.k) obj6, 0), true, -420597627), 3);
                }
                Tc.f fVar = (Tc.f) obj5;
                if (fVar.f17056a != EnumC6206t.f48461h0) {
                    E9.f.t(b10, null, AbstractC4407f.f38236b, 3);
                    wf.k kVar = (wf.k) obj6;
                    E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(16, kVar), true, 1543459611), 3);
                    E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(17, kVar), true, 1677046522), 3);
                    E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(18, kVar), true, 1810633433), 3);
                }
                E9.f.t(b10, null, AbstractC4407f.f38243i, 3);
                if (c4393q.f38112a != null) {
                    E9.f.t(b10, null, new C3288a(new C4389M(c4393q, 1), true, 1661510939), 3);
                    E9.f.t(b10, null, new C3288a(new C4388L(c4393q, (wf.k) obj6, 6), true, -2009895740), 3);
                }
                boolean z10 = c4393q.f38121j;
                if (z10) {
                    E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(19, (wf.k) obj6), true, 612138938), 3);
                }
                wf.k kVar2 = (wf.k) obj6;
                E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(20, kVar2), true, -434839338), 3);
                E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(21, kVar2), true, -1484211339), 3);
                if (c4393q.f38115d && !z10) {
                    E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(11, kVar2), true, -437233063), 3);
                }
                E9.f.t(b10, null, AbstractC4407f.f38256v, 3);
                E9.f.t(b10, null, new C3288a(new C4388L(c4393q, kVar2, 1), true, 712011955), 3);
                if (c4393q.f38117f) {
                    E9.f.t(b10, null, new C3288a(new C4388L(kVar2, c4393q, 2), true, -1486605064), 3);
                }
                if (c4393q.f38114c) {
                    E9.f.t(b10, null, new C3288a(new C4388L(c4393q, kVar2, 3), true, 1758990231), 3);
                }
                E9.f.t(b10, null, AbstractC4407f.f38219A, 3);
                if (c4393q.f38119h) {
                    E9.f.t(b10, null, new C3288a(new C4388L(kVar2, c4393q, 4), true, 709618230), 3);
                }
                E9.f.t(b10, null, new C3288a(new C4388L(c4393q, kVar2, 5), true, -1386732047), 3);
                E9.f.t(b10, null, AbstractC4407f.f38222D, 3);
                E9.f.t(b10, null, AbstractC4407f.f38223E, 3);
                E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(12, kVar2), true, -239880754), 3);
                E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(13, kVar2), true, 1038035156), 3);
                E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(14, kVar2), true, -11336845), 3);
                E9.f.t(b10, null, new C3288a(new androidx.compose.foundation.layout.f(15, kVar2), true, -1060708846), 3);
                E9.f.t(b10, null, new C3288a(new Q8.i(c4393q, fVar, (String) obj4, 13), true, -2110080847), 3);
                E9.f.t(b10, null, new C3288a(new C0046u0((AbstractC4394S) obj3, 28, (Context) obj2), true, 1135514448), 3);
                E9.f.t(b10, null, AbstractC4407f.f38234R, 3);
                return yVar;
        }
    }
}
