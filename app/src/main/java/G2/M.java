package g2;

import java.util.concurrent.atomic.AtomicReference;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class M extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31059Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31060Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f31061h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ H f31062i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f31063j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f31064k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(wf.n nVar, H h10, Ng.F f6, AtomicReference atomicReference, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31061h0 = nVar;
        this.f31062i0 = h10;
        this.f31063j0 = f6;
        this.f31064k0 = atomicReference;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        M m10 = new M(this.f31061h0, this.f31062i0, this.f31063j0, this.f31064k0, abstractC4825e);
        m10.f31060Z = obj;
        return m10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31059Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            L l10 = new L((Ng.F) this.f31060Z, this.f31062i0, this.f31063j0, this.f31061h0, this.f31064k0);
            this.f31059Y = 1;
            obj = this.f31061h0.invoke(l10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
