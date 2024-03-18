package Sg;

import Ng.AbstractC1053b0;
import Ng.C1087v;
import Ng.C1088w;
import Ng.G0;
import Ng.H;
import Ng.P;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import pf.AbstractC5157d;

/* loaded from: classes2.dex */
public final class i extends P implements AbstractC5157d, AbstractC4825e {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16655m0 = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: i0  reason: collision with root package name */
    public final Ng.B f16656i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC4825e f16657j0;

    /* renamed from: k0  reason: collision with root package name */
    public Object f16658k0 = AbstractC1389a.f16643c;

    /* renamed from: l0  reason: collision with root package name */
    public final Object f16659l0;

    public i(Ng.B b10, AbstractC4825e abstractC4825e) {
        super(-1);
        this.f16656i0 = b10;
        this.f16657j0 = abstractC4825e;
        this.f16659l0 = AbstractC1389a.d(abstractC4825e.getContext());
    }

    @Override // Ng.P
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C1088w) {
            ((C1088w) obj).f12992b.invoke(cancellationException);
        }
    }

    @Override // pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        AbstractC4825e abstractC4825e = this.f16657j0;
        if (abstractC4825e instanceof AbstractC5157d) {
            return (AbstractC5157d) abstractC4825e;
        }
        return null;
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return this.f16657j0.getContext();
    }

    @Override // Ng.P
    public final Object h() {
        Object obj = this.f16658k0;
        this.f16658k0 = AbstractC1389a.f16643c;
        return obj;
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        Object obj2;
        AbstractC4825e abstractC4825e = this.f16657j0;
        AbstractC4831k context = abstractC4825e.getContext();
        Throwable a5 = C3961k.a(obj);
        if (a5 == null) {
            obj2 = obj;
        } else {
            obj2 = new C1087v(a5, false);
        }
        Ng.B b10 = this.f16656i0;
        if (b10.d0(context)) {
            this.f16658k0 = obj2;
            this.f12903h0 = 0;
            b10.r(context, this);
            return;
        }
        AbstractC1053b0 a10 = G0.a();
        if (a10.R0()) {
            this.f16658k0 = obj2;
            this.f12903h0 = 0;
            a10.F0(this);
            return;
        }
        a10.P0(true);
        try {
            AbstractC4831k context2 = abstractC4825e.getContext();
            Object e10 = AbstractC1389a.e(context2, this.f16659l0);
            abstractC4825e.resumeWith(obj);
            AbstractC1389a.b(context2, e10);
            do {
            } while (a10.T0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f16656i0 + ", " + H.x(this.f16657j0) + ']';
    }

    @Override // Ng.P
    public final AbstractC4825e d() {
        return this;
    }
}
