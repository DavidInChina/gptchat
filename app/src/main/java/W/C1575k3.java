package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;
import z.AbstractC6714o;
import z.C6694e;

/* renamed from: W.k3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1575k3 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20192Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6694e f20193Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f20194h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6714o f20195i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f20196j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575k3(C6694e c6694e, boolean z10, AbstractC6714o abstractC6714o, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20193Z = c6694e;
        this.f20194h0 = z10;
        this.f20195i0 = abstractC6714o;
        this.f20196j0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1575k3(this.f20193Z, this.f20194h0, this.f20195i0, this.f20196j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1575k3) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        float f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20192Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            if (this.f20194h0) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            Float f10 = new Float(f6);
            this.f20192Y = 1;
            if (C6694e.c(this.f20193Z, f10, this.f20195i0, null, this, 12) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f20196j0.mo122invoke();
        return jf.y.f36177a;
    }
}
