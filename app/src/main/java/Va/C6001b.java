package va;

import B.H;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: va.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6001b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f47420Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f47421Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6001b(H h10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f47421Z = h10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6001b(this.f47421Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6001b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f47420Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Boolean bool = Boolean.FALSE;
            this.f47420Y = 1;
            H h10 = this.f47421Z;
            if (AbstractC4828h.r(h10, bool, h10.f1089i.h(), this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
