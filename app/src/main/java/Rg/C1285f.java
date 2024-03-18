package Rg;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Rg.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1285f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15537Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f15538Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1286g f15539h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285f(AbstractC1286g abstractC1286g, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15539h0 = abstractC1286g;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1285f c1285f = new C1285f(this.f15539h0, abstractC4825e);
        c1285f.f15538Z = obj;
        return c1285f;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1285f) create((Pg.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15537Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f15537Y = 1;
            if (this.f15539h0.h((Pg.A) this.f15538Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
