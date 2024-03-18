package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class X extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1228Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1229Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0108a0 f1230h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1231i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0108a0 c0108a0, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1230h0 = c0108a0;
        this.f1231i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        X x10 = new X(this.f1230h0, this.f1231i0, abstractC4825e);
        x10.f1229Z = obj;
        return x10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1228Y;
        C0108a0 c0108a0 = this.f1230h0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                AbstractC0130h1 abstractC0130h1 = (AbstractC0130h1) this.f1229Z;
                c0108a0.f1257d.setValue(Boolean.TRUE);
                wf.n nVar = this.f1231i0;
                this.f1228Y = 1;
                if (nVar.invoke(abstractC0130h1, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            c0108a0.f1257d.setValue(Boolean.FALSE);
            return jf.y.f36177a;
        } catch (Throwable th2) {
            c0108a0.f1257d.setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
