package c1;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f26059Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f26060Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f26061h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f26060Z = lVar;
        this.f26061h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new i(this.f26060Z, this.f26061h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f26059Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            A0.d dVar = this.f26060Z.f26071h0;
            this.f26059Y = 1;
            if (dVar.b(this.f26061h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
