package ee;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29329Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2881B f29330Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f29331h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C2881B c2881b, kotlin.jvm.internal.A a5, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29330Z = c2881b;
        this.f29331h0 = a5;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new l(this.f29330Z, this.f29331h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29329Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            long j6 = this.f29331h0.f37621Y;
            this.f29329Y = 1;
            C2881B c2881b = this.f29330Z;
            c2881b.getClass();
            Object e02 = Ad.l.e0(new x(c2881b, j6, null), this);
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
