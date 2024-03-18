package bb;

import Cd.C0337w;
import aa.C1939b;
import cb.C2334C;
import ec.C2861m;
import ec.C2862n;
import ec.C2866r;
import fc.C3010e;
import fc.C3020o;
import fc.C3021p;
import gb.C3234k;
import gb.C3235l;
import gc.C3253e;
import hc.C3401p;
import id.AbstractC3557B;
import jf.C3959i;
import l8.AbstractC4344b;
import lc.C4423v;
import lc.C4424w;
import lc.C4425x;
import lc.C4427z;
import q0.C5251c;
import wd.C6205s;
import wd.C6209w;

/* renamed from: bb.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2162e0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25808Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f25809Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2162e0(int i10, wf.k kVar) {
        super(1);
        this.f25808Y = i10;
        this.f25809Z = kVar;
    }

    public final void a(C3235l c3235l) {
        int i10 = this.f25808Y;
        wf.k kVar = this.f25809Z;
        switch (i10) {
            case 1:
                AbstractC3557B.c0("image", c3235l);
                kVar.invoke(new gb.b0(0, AbstractC4344b.F0(new C3234k(c3235l.f31474c, c3235l.f31478g))));
                return;
            case 2:
            default:
                AbstractC3557B.c0("image", c3235l);
                kVar.invoke(new gb.b0(0, AbstractC4344b.F0(new C3234k(c3235l.f31474c, c3235l.f31478g))));
                return;
            case 3:
                AbstractC3557B.c0("image", c3235l);
                kVar.invoke(new gb.b0(0, AbstractC4344b.F0(new C3234k(c3235l.f31474c, c3235l.f31478g))));
                return;
        }
    }

    public final void c(String str) {
        int i10 = this.f25808Y;
        wf.k kVar = this.f25809Z;
        switch (i10) {
            case 27:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new gb.Z(str));
                return;
            default:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new gb.Y(str));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f25808Y;
        wf.k kVar = this.f25809Z;
        switch (i10) {
            case 0:
                invoke((String) obj);
                return yVar;
            case 1:
                a((C3235l) obj);
                return yVar;
            case 2:
                String str = ((wd.O) obj).f48362a;
                AbstractC3557B.c0("gizmoId", str);
                kVar.invoke(new gb.d0(str));
                return yVar;
            case 3:
                a((C3235l) obj);
                return yVar;
            case 4:
                a((C3235l) obj);
                return yVar;
            case 5:
                C3959i c3959i = (C3959i) obj;
                AbstractC3557B.c0("it", c3959i);
                kVar.invoke(new gb.U((C1939b) c3959i.f36155Y, (ha.K) c3959i.f36156Z));
                return yVar;
            case 6:
                invoke((String) obj);
                return yVar;
            case 7:
                invoke((String) obj);
                return yVar;
            case 8:
                Qb.e eVar = (Qb.e) obj;
                AbstractC3557B.c0("it", eVar);
                kVar.invoke(eVar);
                return yVar;
            case 9:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 10:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 11:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 12:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 13:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 14:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 15:
                invoke((String) obj);
                return yVar;
            case 16:
                T0.z zVar = (T0.z) obj;
                AbstractC3557B.c0("it", zVar);
                kVar.invoke(new C3401p(zVar));
                return yVar;
            case 17:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 18:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 19:
                invoke((String) obj);
                return yVar;
            case 20:
                ((Number) obj).intValue();
                kVar.invoke(new Object());
                return yVar;
            case 21:
                kVar.invoke(new ic.M((C2334C) obj));
                return yVar;
            case 22:
                C6205s c6205s = (C6205s) obj;
                AbstractC3557B.c0("it", c6205s);
                kVar.invoke(new C4427z(c6205s));
                return yVar;
            case 23:
                zd.d dVar = (zd.d) obj;
                AbstractC3557B.c0("it", dVar);
                kVar.invoke(new C4424w(dVar));
                return yVar;
            case 24:
                invoke(((Boolean) obj).booleanValue());
                return yVar;
            case 25:
                Ec.o oVar = (Ec.o) obj;
                AbstractC3557B.c0("it", oVar);
                kVar.invoke(new C4425x(oVar));
                return yVar;
            case 26:
                pc.m0 m0Var = (pc.m0) obj;
                AbstractC3557B.c0("$this$setState", m0Var);
                return m0Var instanceof pc.l0 ? (pc.m0) kVar.invoke(m0Var) : m0Var;
            case 27:
                c(((C6209w) obj).f48469a);
                return yVar;
            case 28:
                c(((C6209w) obj).f48469a);
                return yVar;
            default:
                long j6 = ((C5251c) obj).f43623a;
                x8.W.F(Pc.e.a(), "VoiceModeScreen onTap", null, 6);
                kVar.invoke(C0337w.f3074a);
                return yVar;
        }
    }

    public final void invoke(String str) {
        int i10 = this.f25808Y;
        wf.k kVar = this.f25809Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new Q(str));
                return;
            case 6:
                AbstractC3557B.c0("it", str);
                kVar.invoke(Kb.q.d(str));
                return;
            case 7:
                AbstractC3557B.c0("value", str);
                kVar.invoke(Kb.q.d(str));
                return;
            case 15:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new C3253e(str));
                return;
            default:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new ic.J(str));
                return;
        }
    }

    public final void invoke(boolean z10) {
        int i10 = this.f25808Y;
        wf.k kVar = this.f25809Z;
        switch (i10) {
            case 9:
                kVar.invoke(new C2862n(z10));
                return;
            case 10:
                kVar.invoke(new C2866r(!z10));
                return;
            case 11:
                kVar.invoke(new C2861m(z10));
                return;
            case 12:
                kVar.invoke(new C3010e(z10));
                return;
            case 13:
                kVar.invoke(new C3020o(z10));
                return;
            case 14:
                kVar.invoke(new C3021p(z10));
                return;
            case 15:
            case 16:
            default:
                kVar.invoke(new C4423v(z10));
                return;
            case 17:
                kVar.invoke(new hc.D(z10));
                return;
            case 18:
                kVar.invoke(new ic.r(z10));
                return;
        }
    }
}
