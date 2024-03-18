package ta;

import A.C0039q0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6808y;

/* renamed from: ta.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5691G extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f45818Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X f45819Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f45820h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5691G(X x10, String str, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45819Z = x10;
        this.f45820h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5691G(this.f45819Z, this.f45820h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C5691G) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45818Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6808y c6808y = this.f45819Z.f45864k;
            C0039q0 c0039q0 = new C0039q0(this.f45820h0, 11);
            this.f45818Y = 1;
            c6808y.a(c0039q0);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
