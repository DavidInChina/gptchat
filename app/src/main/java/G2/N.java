package g2;

import Ng.AbstractC1073l0;
import java.util.concurrent.atomic.AtomicReference;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31065Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31066Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f31067h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ H f31068i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(H h10, AbstractC4825e abstractC4825e, wf.n nVar) {
        super(2, abstractC4825e);
        this.f31067h0 = nVar;
        this.f31068i0 = h10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        N n10 = new N(this.f31068i0, abstractC4825e, this.f31067h0);
        n10.f31066Z = obj;
        return n10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31065Y;
        if (i10 != 0) {
            if (i10 == 1) {
                atomicReference = (AtomicReference) this.f31066Z;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f6 = (Ng.F) this.f31066Z;
            AtomicReference atomicReference2 = new AtomicReference(null);
            M m10 = new M(this.f31067h0, this.f31068i0, f6, atomicReference2, null);
            this.f31066Z = atomicReference2;
            this.f31065Y = 1;
            Object e02 = Ad.l.e0(m10, this);
            if (e02 == enumC5000a) {
                return enumC5000a;
            }
            atomicReference = atomicReference2;
            obj = e02;
        }
        AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) atomicReference.get();
        if (abstractC1073l0 != null) {
            abstractC1073l0.k(null);
        }
        return obj;
    }
}
