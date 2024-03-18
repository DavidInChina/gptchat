package Ta;

import Pg.A;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public int f17005Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ long f17006Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ long f17007h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ A f17008i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(A a5, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f17008i0 = a5;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        j jVar = new j(this.f17008i0, (AbstractC4825e) obj3);
        jVar.f17006Z = longValue;
        jVar.f17007h0 = longValue2;
        return jVar.invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17005Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Jc.A a5 = new Jc.A(((float) this.f17006Z) / ((float) this.f17007h0));
            this.f17005Y = 1;
            if (((Pg.p) this.f17008i0).f14244i0.n(a5, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
