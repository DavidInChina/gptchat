package lb;

import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38063Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38064Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2969F f38065h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(K k10, C2969F c2969f, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38064Z = k10;
        this.f38065h0 = c2969f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new v(this.f38064Z, this.f38065h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((v) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38063Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            T9.a aVar = this.f38064Z.f37954j;
            this.f38063Y = 1;
            if (((C4972C) aVar).m(this.f38065h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
