package S8;

import L.C0871s;
import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class H extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f16228Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f16229Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16230h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f16231i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16232j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(wf.k kVar, AbstractC1710f0 abstractC1710f0, wf.k kVar2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f16230h0 = kVar;
        this.f16231i0 = abstractC1710f0;
        this.f16232j0 = kVar2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        H h10 = new H(this.f16230h0, this.f16231i0, this.f16232j0, abstractC4825e);
        h10.f16229Z = obj;
        return h10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f16228Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0871s c0871s = new C0871s(this.f16231i0, this.f16232j0, 3);
            this.f16228Y = 1;
            Object e02 = Ad.l.e0(new V8.h((B0.A) this.f16229Z, null, this.f16230h0, null, null, c0871s, V8.j.f18485a), this);
            if (e02 != enumC5000a) {
                e02 = yVar;
            }
            if (e02 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
