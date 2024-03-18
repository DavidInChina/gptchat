package Pg;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.C3960j;
import jf.C3961k;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14250Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14251Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D f14252h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f14253i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(D d10, Object obj, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14252h0 = d10;
        this.f14253i0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        u uVar = new u(this.f14252h0, this.f14253i0, abstractC4825e);
        uVar.f14251Z = obj;
        return uVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14250Y;
        Object obj3 = jf.y.f36177a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                F f6 = (F) this.f14251Z;
                D d10 = this.f14252h0;
                Object obj4 = this.f14253i0;
                this.f14250Y = 1;
                if (d10.n(obj4, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            obj2 = obj3;
        } catch (Throwable th2) {
            obj2 = N.w(th2);
        }
        if (!(!(obj2 instanceof C3960j))) {
            obj3 = new q(C3961k.a(obj2));
        }
        return new s(obj3);
    }
}
