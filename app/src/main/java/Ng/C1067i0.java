package Ng;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* renamed from: Ng.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1067i0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f12947Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f12948Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1067i0(AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12948Z = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1067i0 c1067i0 = new C1067i0(this.f12948Z, abstractC4825e);
        c1067i0.f12947Y = obj;
        return c1067i0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1067i0) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC4831k i10 = ((F) this.f12947Y).i();
        AbstractC6216a abstractC6216a = this.f12948Z;
        try {
            AbstractC1073l0 v02 = Ad.l.v0(i10);
            I0 i02 = new I0(v02);
            i02.f12890Z = v02.m0(true, true, i02);
            while (true) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I0.f12888h0;
                int i11 = atomicIntegerFieldUpdater.get(i02);
                if (i11 != 0) {
                    if (i11 != 2 && i11 != 3) {
                        I0.c(i11);
                        throw null;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(i02, i11, 0)) {
                    break;
                }
            }
            Object mo122invoke = abstractC6216a.mo122invoke();
            i02.a();
            return mo122invoke;
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
