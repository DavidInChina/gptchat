package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0162s1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1491Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ A1 f1492Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f1493h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162s1(A1 a12, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1492Z = a12;
        this.f1493h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0162s1(this.f1492Z, this.f1493h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0162s1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1491Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            A1 a12 = this.f1492Z;
            AbstractC0168u1 abstractC0168u1 = a12.f1022a;
            A.B0 b02 = A.B0.f15Z;
            C0159r1 c0159r1 = new C0159r1(a12, this.f1493h0, null);
            this.f1491Y = 1;
            if (abstractC0168u1.c(b02, c0159r1, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
