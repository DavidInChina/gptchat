package Ng;

import Sg.AbstractC1389a;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import jf.C3961k;
import jh.H1;
import nf.AbstractC4825e;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public abstract class P extends Tg.i {

    /* renamed from: h0  reason: collision with root package name */
    public int f12903h0;

    public P(int i10) {
        super(0L, Tg.k.f17260g);
        this.f12903h0 = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract AbstractC4825e d();

    public Throwable e(Object obj) {
        C1087v c1087v;
        if (obj instanceof C1087v) {
            c1087v = (C1087v) obj;
        } else {
            c1087v = null;
        }
        if (c1087v == null) {
            return null;
        }
        return c1087v.f12988a;
    }

    public final void g(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            P4.a.m(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        AbstractC3557B.Z(th2);
        L4.a.A0(d().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        N0 n02;
        AbstractC1073l0 abstractC1073l0;
        Object obj = jf.y.f36177a;
        H1 h12 = this.f17252Z;
        try {
            AbstractC4825e d10 = d();
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", d10);
            Sg.i iVar = (Sg.i) d10;
            AbstractC4825e abstractC4825e = iVar.f16657j0;
            Object obj2 = iVar.f16659l0;
            AbstractC4831k context = abstractC4825e.getContext();
            Object e10 = AbstractC1389a.e(context, obj2);
            if (e10 != AbstractC1389a.f16646f) {
                n02 = K4.J.j0(abstractC4825e, context, e10);
            } else {
                n02 = null;
            }
            AbstractC4831k context2 = abstractC4825e.getContext();
            Object h10 = h();
            Throwable e11 = e(h10);
            if (e11 == null && Bi.c.f1(this.f12903h0)) {
                abstractC1073l0 = (AbstractC1073l0) context2.get(C1071k0.f12951Y);
            } else {
                abstractC1073l0 = null;
            }
            if (abstractC1073l0 != null && !abstractC1073l0.a()) {
                CancellationException P = abstractC1073l0.P();
                b(h10, P);
                abstractC4825e.resumeWith(com.google.android.gms.internal.play_billing.N.w(P));
            } else if (e11 != null) {
                abstractC4825e.resumeWith(com.google.android.gms.internal.play_billing.N.w(e11));
            } else {
                abstractC4825e.resumeWith(f(h10));
            }
            if (n02 == null || n02.t0()) {
                AbstractC1389a.b(context, e10);
            }
            try {
                h12.getClass();
            } catch (Throwable th2) {
                obj = com.google.android.gms.internal.play_billing.N.w(th2);
            }
            g(null, C3961k.a(obj));
        } catch (Throwable th3) {
            try {
                h12.getClass();
            } catch (Throwable th4) {
                obj = com.google.android.gms.internal.play_billing.N.w(th4);
            }
            g(th3, C3961k.a(obj));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
