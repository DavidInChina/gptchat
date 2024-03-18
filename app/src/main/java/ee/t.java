package ee;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;
import z.C6694e;

/* loaded from: classes.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29349Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2881B f29350Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f29351h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C2881B c2881b, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29350Z = c2881b;
        this.f29351h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new t(this.f29350Z, this.f29351h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29349Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C2881B c2881b = this.f29350Z;
            C6694e b10 = c2881b.b();
            Float f6 = new Float(((Number) c2881b.b().e()).floatValue() - C5251c.e(this.f29351h0));
            this.f29349Y = 1;
            if (b10.f(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
