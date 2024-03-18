package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6808y;

/* renamed from: na.o1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4779o1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f40077Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f40078Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z f40079h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4779o1(B1 b1, Z z10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f40078Z = b1;
        this.f40079h0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4779o1(this.f40078Z, this.f40079h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4779o1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40077Y;
        jf.y yVar = jf.y.f36177a;
        B1 b1 = this.f40078Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6808y c6808y = b1.f39715p;
            C4776n1 c4776n1 = new C4776n1(b1, this.f40079h0);
            this.f40077Y = 1;
            c6808y.a(c4776n1);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        b1.l(C4745d0.f39960w0);
        return yVar;
    }
}
