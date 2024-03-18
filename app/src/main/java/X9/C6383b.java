package x9;

import B.H;
import E0.AbstractC0461u;
import G9.q;
import H9.p;
import I9.AbstractC0775p;
import I9.F;
import I9.F0;
import I9.j1;
import Z.AbstractC1706d0;
import Z.S0;
import ab.C1965s;
import android.net.Uri;
import android.view.MotionEvent;
import bb.C2152D;
import bb.C2177q;
import bb.N;
import bb.T;
import cb.C2337F;
import cb.C2350T;
import cb.C2353W;
import cb.C2356Z;
import cb.C2362c0;
import fa.C2969F;
import gb.h0;
import gb.m0;
import id.AbstractC3557B;
import id.C3556A;
import id.x;
import jf.y;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import na.D1;
import p9.C5100b;
import q0.C5251c;
import te.C5760d;
import wd.u0;
import wd.v0;
import xe.C6405J;
import ya.AbstractC6569q;
import ya.C6567o;
import za.C6783B;
import za.C6807x;
import za.EnumC6785b;

/* renamed from: x9.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6383b extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49639Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f49640Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6383b(int i10, Object obj) {
        super(1);
        this.f49639Y = i10;
        this.f49640Z = obj;
    }

    public final Object a(int i10) {
        int i11 = this.f49639Y;
        Object obj = this.f49640Z;
        switch (i11) {
            case 5:
                return ((AbstractC0775p) ((H9.o) obj).f7535f.get(i10)).getId();
            default:
                return ((AbstractC0775p) ((j1) obj).f8404v.get(i10)).getId();
        }
    }

    public final D1 c(D1 d12) {
        int i10 = this.f49639Y;
        Object obj = this.f49640Z;
        switch (i10) {
            case 10:
                AbstractC3557B.c0("$this$setState", d12);
                T9.c cVar = (T9.c) obj;
                String str = cVar.f16970e;
                T9.k kVar = cVar.f16968c;
                boolean z10 = kVar instanceof T9.g;
                return D1.e(d12, null, null, null, null, null, null, null, str, cVar.f16971f, null, null, null, null, false, false, false, null, false, z10, kVar instanceof T9.h, null, null, null, false, false, false, null, false, null, false, cVar.f16966a, -3146497, 31);
            case 11:
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, null, ((Pa.b) obj).f13891a, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -8193, 63);
            case 12:
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, (Qb.f) obj, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -4097, 63);
            case 13:
                AbstractC3557B.c0("$this$setState", d12);
                C6807x c6807x = (C6807x) obj;
                return D1.e(d12, null, null, null, null, null, null, c6807x.f51806c, null, null, c6807x.f51804a, c6807x.f51805b, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -3201, 63);
            case 14:
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, (Sc.c) obj, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -9, 63);
            case 15:
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, (J9.d) obj, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -33, 63);
            default:
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, null, (J9.b) obj, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -65, 63);
        }
    }

    public final C6783B e(C6783B c6783b) {
        int i10 = this.f49639Y;
        Object obj = this.f49640Z;
        switch (i10) {
            case 18:
                AbstractC3557B.c0("$this$setState", c6783b);
                return C6783B.e(c6783b, null, null, null, (Uri) obj, null, null, null, null, null, null, null, 131063);
            default:
                AbstractC3557B.c0("$this$setState", c6783b);
                return C6783B.e(c6783b, null, null, null, null, null, null, null, null, null, null, (EnumC6785b) obj, 129023);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f49639Y;
        boolean z10 = false;
        C2353W c2353w = null;
        Object obj2 = this.f49640Z;
        switch (i10) {
            case 0:
                AbstractC0461u abstractC0461u = (AbstractC0461u) obj;
                AbstractC3557B.c0("coordinates", abstractC0461u);
                ((S0) ((AbstractC1706d0) obj2)).i(((int) (abstractC0461u.j() >> 32)) / ((int) (abstractC0461u.j() & 4294967295L)));
                return yVar;
            case 1:
                long j6 = ((C5251c) obj).f43623a;
                C6382a c6382a = (C6382a) obj2;
                float d10 = C5251c.d(j6) - c6382a.f49637b;
                float f6 = c6382a.f49636a;
                return new C5251c(R4.b.r(d10 * f6, (C5251c.e(j6) - c6382a.f49638c) * f6));
            case 2:
                F9.i iVar = (F9.i) obj;
                AbstractC3557B.c0("$this$setState", iVar);
                F9.o oVar = (F9.o) ((u0) ((v0) obj2)).f48468a;
                x xVar = oVar.f5109a;
                String str = iVar.f5087a;
                AbstractC3557B.c0("title", str);
                return new F9.i(str, oVar.f5110b, xVar);
            case 3:
                q qVar = (q) obj;
                AbstractC3557B.c0("$this$setState", qVar);
                return q.e(qVar, null, null, false, null, ((G9.f) ((G9.g) obj2)).f6126a, 95);
            case 4:
                invoke((String) obj);
                return yVar;
            case 5:
                return a(((Number) obj).intValue());
            case 6:
                return a(((Number) obj).intValue());
            case 7:
                invoke((String) obj);
                return yVar;
            case 8:
                AbstractC3557B.c0("$this$setState", (la.m) obj);
                return (la.m) obj2;
            case 9:
                MotionEvent motionEvent = (MotionEvent) obj;
                AbstractC3557B.c0("it", motionEvent);
                C5100b c5100b = (C5100b) obj2;
                c5100b.getClass();
                c5100b.f42761a.setValue(new Z0.i(kotlin.jvm.internal.m.c((int) motionEvent.getX(), (int) motionEvent.getY())));
                return Boolean.FALSE;
            case 10:
                return c((D1) obj);
            case 11:
                return c((D1) obj);
            case 12:
                return c((D1) obj);
            case 13:
                return c((D1) obj);
            case 14:
                return c((D1) obj);
            case 15:
                return c((D1) obj);
            case 16:
                return c((D1) obj);
            case 17:
                C2969F c2969f = (C2969F) obj;
                AbstractC3557B.c0("it", c2969f);
                ((m0) obj2).j(new h0(c2969f));
                return yVar;
            case 18:
                return e((C6783B) obj);
            case 19:
                return e((C6783B) obj);
            case 20:
                AbstractC3557B.c0("$this$offset", (Z0.b) obj);
                return new Z0.i(kotlin.jvm.internal.m.c(AbstractC4344b.Y0(((H) obj2).f1088h.h()), 0));
            case 21:
                ya.x xVar2 = (ya.x) obj;
                AbstractC3557B.c0("$this$setState", xVar2);
                return ya.x.e(xVar2, ((C6567o) ((AbstractC6569q) obj2)).f50871a, false, 5);
            case 22:
                C3556A c3556a = (C3556A) obj;
                AbstractC3557B.c0("selectionState", c3556a);
                ((Ra.o) obj2).j(new Ra.c(c3556a));
                return yVar;
            case 23:
                Ra.k kVar = (Ra.k) obj;
                AbstractC3557B.c0("$this$setState", kVar);
                return Ra.k.e(kVar, null, null, (C3556A) obj2, 7);
            case 24:
                C2362c0 c2362c0 = (C2362c0) obj;
                AbstractC3557B.c0("it", c2362c0);
                return C2362c0.a(c2362c0, ((C2362c0) obj2).f26510a, null, 2);
            case 25:
                C6405J c6405j = (C6405J) obj;
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{"bootstrap"});
                R4.b.L1((C5760d) obj2, "limit", 20);
                return yVar;
            case 26:
                C1965s c1965s = (C1965s) obj;
                AbstractC3557B.c0("$this$setState", c1965s);
                return C1965s.e(c1965s, null, null, (Wa.j) obj2, 7);
            case 27:
                C2177q c2177q = (C2177q) obj;
                AbstractC3557B.c0("$this$setState", c2177q);
                String str2 = c2177q.f25888a;
                AbstractC3557B.c0("gizmoId", str2);
                return new C2177q(str2, (C2337F) obj2);
            case 28:
                C2152D c2152d = (C2152D) obj;
                AbstractC3557B.c0("$this$setState", c2152d);
                C2356Z c2356z = (C2356Z) obj2;
                Integer num = c2356z.f26500a;
                if (num != null) {
                    z10 = true;
                }
                boolean z11 = z10;
                return C2152D.e(c2152d, null, num, num, c2356z.f26501b, AbstractC3557B.K(c2356z.f26502c, Boolean.TRUE), null, z11, false, 323);
            default:
                bb.m0 m0Var = (bb.m0) obj;
                AbstractC3557B.c0("$this$setState", m0Var);
                C2350T c2350t = ((N) ((T) obj2)).f25736a;
                if (c2350t != null) {
                    c2353w = c2350t.f26486a;
                }
                return bb.m0.e(m0Var, null, c2353w, null, null, 13);
        }
    }

    public final void invoke(String str) {
        int i10 = this.f49639Y;
        Object obj = this.f49640Z;
        switch (i10) {
            case 4:
                AbstractC3557B.c0("it", str);
                ((p) obj).j(new H9.h(str));
                return;
            default:
                AbstractC3557B.c0("it", str);
                ((F) obj).j(new F0(str));
                return;
        }
    }
}
