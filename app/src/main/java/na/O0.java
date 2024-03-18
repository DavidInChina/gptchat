package na;

import fa.C2969F;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class O0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39845Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39846Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B1 f39847h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39847h0 = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        O0 o02 = new O0(this.f39847h0, abstractC4825e);
        o02.f39846Z = obj;
        return o02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((C2969F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39845Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2969F c2969f = (C2969F) this.f39846Z;
            if (c2969f != null) {
                T9.a aVar = this.f39847h0.f39710k;
                this.f39845Y = 1;
                if (((C4972C) aVar).m(c2969f, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
