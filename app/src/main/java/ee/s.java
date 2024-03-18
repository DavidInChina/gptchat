package ee;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;
import z.C6694e;

/* loaded from: classes.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29346Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2881B f29347Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f29348h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C2881B c2881b, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29347Z = c2881b;
        this.f29348h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new s(this.f29347Z, this.f29348h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29346Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C2881B c2881b = this.f29347Z;
            C6694e a5 = c2881b.a();
            Float f6 = new Float(((Number) c2881b.a().e()).floatValue() - C5251c.d(this.f29348h0));
            this.f29346Y = 1;
            if (a5.f(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
