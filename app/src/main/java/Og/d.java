package Og;

import Ng.A0;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1072l;
import Ng.Q;
import Ng.T;
import Ng.x0;
import Sg.u;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import nf.AbstractC4831k;
import q.RunnableC5216j;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: Z  reason: collision with root package name */
    public final Handler f13756Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f13757h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f13758i0;

    /* renamed from: j0  reason: collision with root package name */
    public final d f13759j0;

    public d(Handler handler) {
        this(handler, null, false);
    }

    @Override // Ng.B
    public final boolean d0(AbstractC4831k abstractC4831k) {
        if (this.f13758i0 && AbstractC3557B.K(Looper.myLooper(), this.f13756Z.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f13756Z == this.f13756Z && dVar.f13758i0 == this.f13758i0) {
                return true;
            }
        }
        return false;
    }

    @Override // Ng.M
    public final void h(long j6, C1072l c1072l) {
        RunnableC5216j runnableC5216j = new RunnableC5216j(c1072l, this, 29);
        if (this.f13756Z.postDelayed(runnableC5216j, N.m(j6, 4611686018427387903L))) {
            c1072l.w(new Oc.c(this, 26, runnableC5216j));
        } else {
            w0(c1072l.f12956j0, runnableC5216j);
        }
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f13756Z);
        if (this.f13758i0) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return identityHashCode ^ i10;
    }

    @Override // Ng.M
    public final T i(long j6, final Runnable runnable, AbstractC4831k abstractC4831k) {
        if (this.f13756Z.postDelayed(runnable, N.m(j6, 4611686018427387903L))) {
            return new T() { // from class: Og.c
                @Override // Ng.T
                public final void dispose() {
                    d.this.f13756Z.removeCallbacks(runnable);
                }
            };
        }
        w0(abstractC4831k, runnable);
        return A0.f12861Y;
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        if (!this.f13756Z.post(runnable)) {
            w0(abstractC4831k, runnable);
        }
    }

    @Override // Ng.B
    public final String toString() {
        String str;
        d dVar;
        Tg.e eVar = Q.f12904a;
        x0 x0Var = u.f16684a;
        if (this == x0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = ((d) x0Var).f13759j0;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f13757h0;
            if (str2 == null) {
                str2 = this.f13756Z.toString();
            }
            if (this.f13758i0) {
                return android.gov.nist.core.a.g(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public final void w0(AbstractC4831k abstractC4831k, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) abstractC4831k.get(C1071k0.f12951Y);
        if (abstractC1073l0 != null) {
            abstractC1073l0.k(cancellationException);
        }
        Q.f12906c.r(abstractC4831k, runnable);
    }

    public d(Handler handler, String str, boolean z10) {
        this.f13756Z = handler;
        this.f13757h0 = str;
        this.f13758i0 = z10;
        this.f13759j0 = z10 ? this : new d(handler, str, true);
    }
}
