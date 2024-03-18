package G9;

import Ca.D;
import H9.AbstractC0723e;
import H9.C0721c;
import H9.C0722d;
import I9.AbstractC0778q0;
import I9.C0768l0;
import I9.C0770m0;
import I9.C0772n0;
import I9.C0774o0;
import I9.C0776p0;
import Mb.AbstractC0966m;
import Mb.C0962k;
import Mb.C0964l;
import Uc.C1422g;
import Uc.C1436v;
import Uc.C1437w;
import Uc.EnumC1421f;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import dc.AbstractC2622c;
import dc.C2621b;
import f9.C2958j;
import hc.AbstractC3384B;
import hc.AbstractC3397l;
import hc.C3383A;
import hc.C3395j;
import hc.C3396k;
import ic.AbstractC3530H;
import ic.AbstractC3545o;
import ic.C3528F;
import ic.C3529G;
import ic.C3543m;
import ic.C3544n;
import id.AbstractC3557B;
import jf.y;
import s3.C5545H;
import wd.O;
import wd.q0;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6132Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f6133Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Tc.f fVar, int i10) {
        super(1);
        this.f6132Y = i10;
        this.f6133Z = fVar;
    }

    public final void a(String str) {
        int i10 = this.f6132Y;
        Tc.f fVar = this.f6133Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", str);
                Bi.c.r1(fVar.f17057b, C1437w.f17699l.p1(str));
                return;
            default:
                AbstractC3557B.c0("it", str);
                Bi.c.r1(fVar.f17057b, C1436v.f17698l.p1(str));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f6132Y;
        Tc.f fVar = this.f6133Z;
        switch (i10) {
            case 0:
                a(((O) obj).f48362a);
                return yVar;
            case 1:
                a(((O) obj).f48362a);
                return yVar;
            case 2:
                AbstractC0723e abstractC0723e = (AbstractC0723e) obj;
                AbstractC3557B.c0("effect", abstractC0723e);
                if (abstractC0723e instanceof C0722d) {
                    Tc.f.c(fVar, A7.b.G1(((C0722d) abstractC0723e).f7514a, fVar.f17059d, fVar.f17056a), 0, 14);
                } else if (abstractC0723e instanceof C0721c) {
                    Bi.c.r1(fVar.f17057b, ((C0721c) abstractC0723e).f7513a);
                }
                return yVar;
            case 3:
                AbstractC0778q0 abstractC0778q0 = (AbstractC0778q0) obj;
                AbstractC3557B.c0("effect", abstractC0778q0);
                if (abstractC0778q0 instanceof C0770m0) {
                    Bi.c.r1(fVar.f17057b, C1422g.f17674i.p1(((C0770m0) abstractC0778q0).f8418a));
                } else if (abstractC0778q0 instanceof C0776p0) {
                    Tc.f.c(fVar, A7.b.G1(((C0776p0) abstractC0778q0).f8427a, fVar.f17059d, fVar.f17056a), 0, 14);
                } else if (abstractC0778q0 instanceof C0772n0) {
                    C5545H c5545h = fVar.f17057b;
                    C1422g c1422g = C1422g.f17674i;
                    Bi.c.r1(c5545h, C1422g.q1(((C0772n0) abstractC0778q0).f8420a, null));
                } else if (abstractC0778q0 instanceof C0774o0) {
                    C5545H c5545h2 = fVar.f17057b;
                    C1422g c1422g2 = C1422g.f17674i;
                    Bi.c.r1(c5545h2, C1422g.r1(EnumC1421f.f17672j0));
                } else if (abstractC0778q0 instanceof C0768l0) {
                    Bi.c.r1(fVar.f17057b, ((C0768l0) abstractC0778q0).f8410a);
                }
                return yVar;
            case 4:
                Ab.h hVar = (Ab.h) obj;
                AbstractC3557B.c0("effect", hVar);
                if (hVar instanceof Ab.g) {
                    Tc.f.c(fVar, A7.b.G1(((Ab.g) hVar).f762a, fVar.f17059d, fVar.f17056a), 0, 14);
                } else if (hVar instanceof Ab.f) {
                    Bi.c.r1(fVar.f17057b, ((Ab.f) hVar).f761a);
                } else if (hVar instanceof Ab.e) {
                    fVar.f17057b.p();
                }
                return yVar;
            case 5:
                AbstractC0966m abstractC0966m = (AbstractC0966m) obj;
                AbstractC3557B.c0("effect", abstractC0966m);
                if (abstractC0966m instanceof C0964l) {
                    Tc.f.c(fVar, ((C0964l) abstractC0966m).f11954a, 0, 14);
                } else if (abstractC0966m instanceof C0962k) {
                    Bi.c.r1(fVar.f17057b, ((C0962k) abstractC0966m).f11951a);
                }
                return yVar;
            case 6:
                AbstractC2622c abstractC2622c = (AbstractC2622c) obj;
                AbstractC3557B.c0("effect", abstractC2622c);
                if (abstractC2622c instanceof C2621b) {
                    Tc.f.c(fVar, A7.b.G1(((C2621b) abstractC2622c).f28201a, fVar.f17059d, fVar.f17056a), 0, 14);
                }
                return yVar;
            case 7:
                AbstractC2469q0.p(obj);
                AbstractC3557B.c0("effect", null);
                return yVar;
            case 8:
                AbstractC3397l abstractC3397l = (AbstractC3397l) obj;
                AbstractC3557B.c0("effect", abstractC3397l);
                if (abstractC3397l instanceof C3395j) {
                    fVar.f17057b.o();
                } else if (abstractC3397l instanceof C3396k) {
                    q0 q0Var = ((C3396k) abstractC3397l).f32211a;
                    Throwable th2 = q0Var.f48450a;
                    if (th2 instanceof D) {
                        Tc.f.c(fVar, ((D) th2).f2813Y.f2810a, 0, 14);
                    } else {
                        Tc.f.c(fVar, A7.b.G1(q0Var, fVar.f17059d, fVar.f17056a), 0, 14);
                    }
                }
                return yVar;
            case 9:
                AbstractC3384B abstractC3384B = (AbstractC3384B) obj;
                AbstractC3557B.c0("effect", abstractC3384B);
                if (abstractC3384B instanceof C3383A) {
                    Tc.f.c(fVar, A7.b.G1(((C3383A) abstractC3384B).f32141a, fVar.f17059d, fVar.f17056a), 0, 14);
                }
                return yVar;
            case 10:
                AbstractC3545o abstractC3545o = (AbstractC3545o) obj;
                AbstractC3557B.c0("it", abstractC3545o);
                if (abstractC3545o instanceof C3544n) {
                    Tc.f.c(fVar, A7.b.G1(((C3544n) abstractC3545o).f33060a, fVar.f17059d, fVar.f17056a), 0, 14);
                } else if (abstractC3545o instanceof C3543m) {
                    Bi.c.r1(fVar.f17057b, ((C3543m) abstractC3545o).f33059a);
                }
                return yVar;
            default:
                AbstractC3530H abstractC3530H = (AbstractC3530H) obj;
                AbstractC3557B.c0("it", abstractC3530H);
                if (abstractC3530H instanceof C3529G) {
                    Tc.f.c(fVar, A7.b.G1(((C3529G) abstractC3530H).f32955a, fVar.f17059d, fVar.f17056a), 0, 14);
                } else if (abstractC3530H instanceof C3528F) {
                    Tc.f.c(fVar, ((C2958j) fVar.f17059d).a(R.string.settings_memory_reset_success), 0, 14);
                }
                return yVar;
        }
    }
}
