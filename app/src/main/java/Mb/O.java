package Mb;

import android.content.Context;
import b9.AbstractC2133b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class O extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11821Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f11822Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f11823h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s10, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11822Z = s10;
        this.f11823h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new O(this.f11822Z, this.f11823h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11821Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC2133b abstractC2133b = this.f11822Z.f11836k;
            this.f11821Y = 1;
            if (((C9.l) abstractC2133b).e(this.f11823h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
