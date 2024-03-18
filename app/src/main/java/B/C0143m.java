package B;

import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1411Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f1412Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f1413h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143m(H h10, float f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1412Z = h10;
        this.f1413h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0143m(this.f1412Z, this.f1413h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0143m) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1411Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f1411Y = 1;
            H h10 = this.f1412Z;
            Object value = h10.f1085e.getValue();
            if (true ^ Float.isNaN(h10.e())) {
                float e10 = h10.e();
                float f6 = this.f1413h0;
                Object c10 = h10.c(e10, f6, value);
                if (!((Boolean) h10.f1082b.invoke(c10)).booleanValue() ? (obj2 = AbstractC4828h.r(h10, value, f6, this)) != enumC5000a : (obj2 = AbstractC4828h.r(h10, c10, f6, this)) != enumC5000a) {
                    obj2 = yVar;
                }
                if (obj2 == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
            }
        }
        return yVar;
    }
}
