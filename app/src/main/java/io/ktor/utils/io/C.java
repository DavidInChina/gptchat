package io.ktor.utils.io;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.M0;
import Ng.Q;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class C extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f33367Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33368Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f33369h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ u f33370i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f33371j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Ng.B f33372k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(boolean z10, u uVar, wf.n nVar, Ng.B b10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33369h0 = z10;
        this.f33370i0 = uVar;
        this.f33371j0 = nVar;
        this.f33372k0 = b10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C c10 = new C(this.f33369h0, this.f33370i0, this.f33371j0, this.f33372k0, abstractC4825e);
        c10.f33368Z = obj;
        return c10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33367Y;
        u uVar = this.f33370i0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                Ng.F f6 = (Ng.F) this.f33368Z;
                if (this.f33369h0) {
                    AbstractC4829i abstractC4829i = f6.i().get(C1071k0.f12951Y);
                    AbstractC3557B.Z(abstractC4829i);
                    ((t) uVar).d((AbstractC1073l0) abstractC4829i);
                }
                B b10 = new B(f6, uVar);
                wf.n nVar = this.f33371j0;
                this.f33367Y = 1;
                if (nVar.invoke(b10, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        } catch (Throwable th2) {
            M0 m02 = Q.f12905b;
            Ng.B b11 = this.f33372k0;
            if (!AbstractC3557B.K(b11, m02) && b11 != null) {
                throw th2;
            }
            ((t) uVar).h(th2);
        }
        return jf.y.f36177a;
    }
}
