package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6694e;
import z.C6735y0;

/* loaded from: classes2.dex */
public final class I3 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f19228Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6694e f19229Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f19230h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(C6694e c6694e, float f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f19229Z = c6694e;
        this.f19230h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new I3(this.f19229Z, this.f19230h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I3) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f19228Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Float f6 = new Float(this.f19230h0);
            C6735y0 c6735y0 = M3.f19377f;
            this.f19228Y = 1;
            if (C6694e.c(this.f19229Z, f6, c6735y0, null, this, 12) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
