package ob;

import android.net.Uri;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import id.AbstractC3557B;
import kb.AbstractC4210D;
import kb.AbstractC4232q;
import kb.C4209C;
import kb.C4211E;
import kb.C4213G;
import kb.C4219d;
import kb.C4222g;
import kb.C4225j;
import kb.C4226k;
import kb.C4227l;
import kb.C4228m;
import kb.C4229n;
import kb.C4230o;
import kb.C4231p;
import lb.C4368e;
import nf.AbstractC4828h;
import p9.s;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import za.C6808y;

/* loaded from: classes2.dex */
public final class l extends AbstractC4210D {

    /* renamed from: j  reason: collision with root package name */
    public final C6808y f41232j;

    /* renamed from: k  reason: collision with root package name */
    public final C4211E f41233k;

    /* renamed from: l  reason: collision with root package name */
    public final C4368e f41234l;

    /* renamed from: m  reason: collision with root package name */
    public final t f41235m;

    /* renamed from: n  reason: collision with root package name */
    public final s f41236n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(C6808y c6808y, C4211E c4211e, C4368e c4368e, t tVar, s sVar, Ic.c cVar) {
        super(new C4209C(Uri.fromFile(r3.i()), Uri.fromFile(r3.i()), null, ((G) tVar).c(ExperimentKey.EditImageEnabled.INSTANCE), 0, 0, false, false));
        Sa.f fVar = (Sa.f) cVar;
        this.f41232j = c6808y;
        this.f41233k = c4211e;
        this.f41234l = c4368e;
        this.f41235m = tVar;
        this.f41236n = sVar;
        k(C4983a.f41205Y, c4211e.f37235b);
    }

    @Override // androidx.lifecycle.Y
    public final void c() {
        this.f41233k.f37234a.setValue(new C4213G());
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC4232q abstractC4232q = (AbstractC4232q) iVar;
        AbstractC3557B.c0("intent", abstractC4232q);
        if (abstractC4232q instanceof C4230o) {
            l(new d(abstractC4232q, 0));
            return;
        }
        boolean z10 = abstractC4232q instanceof C4227l;
        C4219d c4219d = C4219d.f37253a;
        if (z10) {
            f(c4219d);
            C4227l c4227l = (C4227l) abstractC4232q;
            String str = ((C4209C) e()).f37231i;
            v0 v0Var = c4227l.f37259a;
            if (v0Var instanceof u0) {
                Uri uri = (Uri) ((u0) v0Var).f48468a;
                v0 v0Var2 = c4227l.f37260b;
                if (v0Var2 != null) {
                    if (v0Var2 instanceof u0) {
                        Ad.l.O0(AbstractC4828h.Q(this), null, null, new C4984b(this, str, uri, (Uri) ((u0) v0Var2).f48468a, null), 3);
                    } else if (v0Var2 instanceof q0) {
                        f(new C4222g((q0) v0Var2));
                    } else if (!(v0Var2 instanceof p0)) {
                        throw new RuntimeException();
                    }
                }
            } else if (v0Var instanceof q0) {
                f(new C4222g((q0) v0Var));
            } else if (!(v0Var instanceof p0)) {
                throw new RuntimeException();
            }
        } else if (abstractC4232q instanceof C4231p) {
            f(c4219d);
            String uri2 = ((C4231p) abstractC4232q).f37264a.toString();
            AbstractC3557B.b0("toString(...)", uri2);
            h(new C4985c(uri2, ((C4209C) e()).f37231i, this, null));
        } else if (abstractC4232q instanceof C4229n) {
            l(new d(abstractC4232q, 1));
        } else if (AbstractC3557B.K(abstractC4232q, C4225j.f37257a)) {
            f(c4219d);
        } else if (abstractC4232q instanceof C4228m) {
            h(new g(this, abstractC4232q, null));
        } else if (abstractC4232q instanceof C4226k) {
            h(new k(this, abstractC4232q, null));
        }
    }
}
