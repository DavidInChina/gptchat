package ta;

import Z8.AbstractC1809m0;
import Z8.V0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.AbstractC6806w;
import za.C6808y;

/* renamed from: ta.O  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5699O extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f45838Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X f45839Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6806w f45840h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5699O(X x10, AbstractC6806w abstractC6806w, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45839Z = x10;
        this.f45840h0 = abstractC6806w;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5699O(this.f45839Z, this.f45840h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C5699O) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45838Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1809m0.a().b(V0.f23278c, kf.w.f37484Y);
            C6808y c6808y = this.f45839Z.f45864k;
            C5697M c5697m = new C5697M(this.f45840h0, 1);
            this.f45838Y = 1;
            c6808y.a(c5697m);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
