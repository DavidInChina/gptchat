package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201f0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14842Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14843Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14844h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ k0 f14845i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f14846j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201f0(AbstractC1206i abstractC1206i, k0 k0Var, Object obj, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14844h0 = abstractC1206i;
        this.f14845i0 = k0Var;
        this.f14846j0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1201f0 c1201f0 = new C1201f0(this.f14844h0, this.f14845i0, this.f14846j0, abstractC4825e);
        c1201f0.f14843Z = obj;
        return c1201f0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1201f0) create((u0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14842Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            int ordinal = ((u0) this.f14843Z).ordinal();
            k0 k0Var = this.f14845i0;
            if (ordinal != 0) {
                if (ordinal == 2) {
                    Q1.u uVar = s0.f14917a;
                    Object obj2 = this.f14846j0;
                    if (obj2 == uVar) {
                        k0Var.f();
                    } else {
                        k0Var.g(obj2);
                    }
                }
            } else {
                this.f14842Y = 1;
                if (this.f14844h0.b(k0Var, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
