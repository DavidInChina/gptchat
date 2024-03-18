package Qd;

import Df.AbstractC0405d;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qd.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1185d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14595Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f14596Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f14597h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185d(i iVar, boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14596Z = iVar;
        this.f14597h0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1185d(this.f14596Z, this.f14597h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1185d) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14595Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Li.q e10 = this.f14596Z.f14611Z.e();
            D d10 = new D(0, this.f14597h0);
            AbstractC0405d b10 = kotlin.jvm.internal.C.f37623a.b(E.class);
            this.f14595Y = 1;
            if (e10.b(d10, b10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
