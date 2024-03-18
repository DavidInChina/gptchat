package hb;

import Ng.F;
import Z.AbstractC1710f0;
import Z.l1;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ l1 f32124Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f32125Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l1 l1Var, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32124Y = l1Var;
        this.f32125Z = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new r(this.f32124Y, this.f32125Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((r) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        float f6 = s.f32126a;
        if (Z0.e.a(((Z0.e) this.f32124Y.getValue()).f22788Y, s.f32126a)) {
            this.f32125Z.setValue(Boolean.TRUE);
        }
        return jf.y.f36177a;
    }
}
