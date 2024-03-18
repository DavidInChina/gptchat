package Tc;

import Ng.F;
import Qg.m0;
import com.google.android.gms.internal.play_billing.N;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17037Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ad.g f17038Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f17039h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ f f17040i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f17041j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Ad.g gVar, AbstractActivityC4532l abstractActivityC4532l, f fVar, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17038Z = gVar;
        this.f17039h0 = abstractActivityC4532l;
        this.f17040i0 = fVar;
        this.f17041j0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new A(this.f17038Z, this.f17039h0, this.f17040i0, this.f17041j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17037Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            m0 m0Var = this.f17038Z.f811h;
            z zVar = new z(this.f17039h0, this.f17040i0, this.f17041j0, null);
            this.f17037Y = 1;
            if (L4.a.b0(m0Var, zVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
