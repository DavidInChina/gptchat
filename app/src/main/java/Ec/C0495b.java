package Ec;

import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* renamed from: Ec.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0495b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f4607Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f4608Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f4609h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f4610i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495b(boolean z10, int i10, AbstractC6216a abstractC6216a, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4607Y = z10;
        this.f4608Z = i10;
        this.f4609h0 = abstractC6216a;
        this.f4610i0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0495b(this.f4607Y, this.f4608Z, this.f4609h0, this.f4610i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C0495b) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        boolean z11 = this.f4607Y;
        AbstractC1710f0 abstractC1710f0 = this.f4610i0;
        if (z11) {
            if (this.f4608Z > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            abstractC1710f0.setValue(Boolean.valueOf(z10));
        } else if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
            this.f4609h0.mo122invoke();
        }
        return jf.y.f36177a;
    }
}
