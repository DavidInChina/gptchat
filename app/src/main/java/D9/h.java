package d9;

import F.A;
import F.J;
import F.z;
import I9.j1;
import Kd.I;
import Mb.AbstractC0974q;
import Mb.C0959i0;
import Mb.C0967m0;
import Mb.C0968n;
import Mb.C0991z;
import Mb.H;
import Rb.C1273t;
import Rb.O;
import W.C1568j1;
import W.n4;
import Z.o1;
import ac.C1972e;
import cc.AbstractC2389d;
import cc.C2386a;
import com.openai.experiment.G;
import com.openai.experiment.r;
import com.openai.experiment.s;
import gc.C3252d;
import h.C3287m;
import id.AbstractC3557B;
import java.util.Set;
import jf.y;
import kf.t;
import kotlin.jvm.internal.x;
import mb.C4578C;
import mb.C4579D;
import mb.C4586K;
import mb.C4603p;
import mb.C4607t;
import mc.AbstractC4617d;
import na.D1;
import nd.C4812a;
import nf.AbstractC4828h;
import pa.C5108d;
import rb.C5436z;
import wf.AbstractC6216a;
import ya.AbstractC6572t;
import ya.C6566n;
import yc.C6576b;
import yc.C6578d;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28141Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f28142Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, Object obj) {
        super(0);
        this.f28141Y = i10;
        this.f28142Z = obj;
    }

    public final Boolean a() {
        int i10;
        int i11 = this.f28141Y;
        boolean z10 = false;
        Object obj = this.f28142Z;
        switch (i11) {
            case 2:
                J j6 = (J) obj;
                F.n nVar = (F.n) t.p2(((z) j6.h()).f5012g);
                if (nVar != null) {
                    i10 = ((A) nVar).f4826a;
                } else {
                    i10 = 0;
                }
                if (i10 >= ((z) j6.h()).f5015j - 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                C1568j1 c1568j1 = (C1568j1) ((n4) obj);
                int i12 = c1568j1.f20168a;
                if (c1568j1.f20169b.a() == 1.0f) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    public final ne.e c() {
        int i10 = this.f28141Y;
        Object obj = this.f28142Z;
        switch (i10) {
            case 27:
                C6576b c6576b = (C6576b) obj;
                Set set = C6576b.f50890d;
                c6576b.getClass();
                return new ne.e(new nb.d(24, c6576b));
            default:
                C6578d c6578d = (C6578d) obj;
                Set set2 = C6578d.f50895c;
                c6578d.getClass();
                return new ne.e(new nb.d(25, c6578d));
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        o1 o1Var = o1.f22665a;
        int i10 = this.f28141Y;
        Object obj = this.f28142Z;
        switch (i10) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                return a();
            case 3:
                switch (i10) {
                    case 3:
                        return AbstractC4828h.Z(Boolean.valueOf(((j1) obj).f8386d), o1Var);
                    default:
                        return AbstractC4828h.Z(Boolean.valueOf(((D1) obj).f39762a), o1Var);
                }
            case 4:
                return mo122invoke();
            case 5:
                fa.n.Companion.getClass();
                return ((xi.c) fa.n.f30069d.getValue()).a(((fa.n) obj).f30070b);
            case 6:
                mo122invoke();
                return yVar;
            case 7:
                switch (i10) {
                    case 3:
                        return AbstractC4828h.Z(Boolean.valueOf(((j1) obj).f8386d), o1Var);
                    default:
                        return AbstractC4828h.Z(Boolean.valueOf(((D1) obj).f39762a), o1Var);
                }
            case 8:
                mo122invoke();
                return yVar;
            case 9:
                mo122invoke();
                return yVar;
            case 10:
                return mo122invoke();
            case 11:
                return (Float) obj;
            case 12:
                mo122invoke();
                return yVar;
            case 13:
                return ((C4607t) obj).f39101c.f39110a;
            case 14:
                C4586K c4586k = (C4586K) obj;
                C4603p c4603p = (C4603p) c4586k.f39041l.get();
                Ad.l.O0(AbstractC4828h.Q(c4586k), null, null, new C4578C(c4586k, null), 3);
                Ad.l.O0(AbstractC4828h.Q(c4586k), null, null, new C4579D(c4586k, null), 3);
                return c4603p;
            case 15:
                return mo122invoke();
            case 16:
                mo122invoke();
                return yVar;
            case 17:
                return (I) ((Ab.c) obj).f754b.get();
            case 18:
                mo122invoke();
                return yVar;
            case 19:
                mo122invoke();
                return yVar;
            case 20:
                mo122invoke();
                return yVar;
            case 21:
                mo122invoke();
                return yVar;
            case 22:
                mo122invoke();
                return yVar;
            case 23:
                mo122invoke();
                return yVar;
            case 24:
                mo122invoke();
                return yVar;
            case 25:
                mo122invoke();
                return yVar;
            case 26:
                return a();
            case 27:
                return c();
            case 28:
                return c();
            default:
                return (AbstractC4617d) ((p000if.a) obj).get();
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        int i10 = this.f28141Y;
        Object obj = this.f28142Z;
        switch (i10) {
            case 4:
                return ((G) ((r) obj)).b(com.openai.experiment.k.f27689c);
            case 10:
                C4812a c4812a = ((C5108d) obj).f42862a;
                AbstractC3557B.c0("accountSession", c4812a);
                return R.a.t(new StringBuilder(), c4812a.f40278e, "_conversations.db");
            default:
                return ((G) ((C5436z) obj).f44769b).b(com.openai.experiment.k.f27689c);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f28141Y;
        Object obj = this.f28142Z;
        switch (i10) {
            case 0:
                ((pd.g) obj).j(pd.e.f43059a);
                return;
            case 1:
                ((G) obj).f27675d.setValue(s.f27697Z);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 17:
            default:
                ((gc.p) obj).j(C3252d.f31553a);
                return;
            case 6:
                K8.d.N0((p0.l) obj);
                return;
            case 8:
                ((AbstractC6572t) obj).j(C6566n.f50870a);
                return;
            case 9:
                ((x) obj).f37645Y = true;
                return;
            case 12:
                ((C3287m) obj).K(new String[]{"*/*"});
                return;
            case 16:
                ((sb.x) obj).j(sb.o.f45516a);
                return;
            case 18:
                ((H) obj).j(C0991z.f12005a);
                return;
            case 19:
                ((C0967m0) obj).j(C0959i0.f11949a);
                return;
            case 20:
                ((AbstractC0974q) obj).j(C0968n.f11963a);
                return;
            case 21:
                ((O) obj).j(C1273t.f15371a);
                return;
            case 22:
                ((Yb.h) obj).j(Yb.c.f22210a);
                return;
            case 23:
                ((ac.g) obj).j(C1972e.f24149a);
                return;
            case 24:
                ((AbstractC2389d) obj).j(C2386a.f26561a);
                return;
        }
    }
}
