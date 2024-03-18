package w9;

import G0.f0;
import Z.AbstractC1710f0;
import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6216a f48256a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1710f0 f48257b;

    public j(f0 f0Var, int i10) {
        AbstractC6216a abstractC6216a = (i10 & 1) != 0 ? i.f48255Y : f0Var;
        C1724m0 Z10 = AbstractC4828h.Z(new f(false, Z0.i.f22797b), o1.f22665a);
        AbstractC3557B.c0("onDismiss", abstractC6216a);
        this.f48256a = abstractC6216a;
        this.f48257b = Z10;
    }

    public final void a() {
        AbstractC1710f0 abstractC1710f0 = this.f48257b;
        abstractC1710f0.setValue(new f(false, ((f) abstractC1710f0.getValue()).f48250b));
        this.f48256a.mo122invoke();
    }

    public final void b(long j6) {
        this.f48257b.setValue(new f(true, j6));
    }
}
