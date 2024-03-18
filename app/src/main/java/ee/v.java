package ee;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6694e;
import z.C6736z;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29355Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2881B f29356Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f29357h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C2881B c2881b, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29356Z = c2881b;
        this.f29357h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f29356Z, this.f29357h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29355Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C6694e a5 = this.f29356Z.a();
            Float f6 = new Float(-Z0.p.b(this.f29357h0));
            C6736z p10 = AbstractC6696f.p();
            this.f29355Y = 1;
            if (C6694e.b(a5, f6, p10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
