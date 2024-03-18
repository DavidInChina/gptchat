package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203g0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14850Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w0 f14851Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14852h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ k0 f14853i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f14854j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1203g0(w0 w0Var, AbstractC1206i abstractC1206i, k0 k0Var, Object obj, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14851Z = w0Var;
        this.f14852h0 = abstractC1206i;
        this.f14853i0 = k0Var;
        this.f14854j0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1203g0(this.f14851Z, this.f14852h0, this.f14853i0, this.f14854j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1203g0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v3, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14850Y;
        AbstractC1206i abstractC1206i = this.f14852h0;
        k0 k0Var = this.f14853i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f14850Y = 3;
                    if (abstractC1206i.b(k0Var, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    return jf.y.f36177a;
                }
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
            return jf.y.f36177a;
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        x0 x0Var = v0.f14935a;
        w0 w0Var = this.f14851Z;
        if (w0Var == x0Var) {
            this.f14850Y = 1;
            if (abstractC1206i.b(k0Var, this) == enumC5000a) {
                return enumC5000a;
            }
        } else if (w0Var == v0.f14936b) {
            D0 i11 = k0Var.i();
            ?? abstractC5163j = new AbstractC5163j(2, null);
            this.f14850Y = 2;
            if (L4.a.n0(i11, abstractC5163j, this) == enumC5000a) {
                return enumC5000a;
            }
            this.f14850Y = 3;
            if (abstractC1206i.b(k0Var, this) == enumC5000a) {
            }
        } else {
            AbstractC1206i i02 = L4.a.i0(w0Var.a(k0Var.i()));
            C1201f0 c1201f0 = new C1201f0(abstractC1206i, k0Var, this.f14854j0, null);
            this.f14850Y = 4;
            if (L4.a.b0(i02, c1201f0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
