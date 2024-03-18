package Ve;

import cf.AbstractC2408g;
import ii.C3591f;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class C0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18618Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f18619Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f18620h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(E0 e02, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18619Z = e02;
        this.f18620h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0(this.f18619Z, this.f18620h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18618Y;
        E0 e02 = this.f18619Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            long j6 = e02.f18629C0;
            this.f18618Y = 1;
            if (R4.b.p0(j6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.a(new Object[0]);
        }
        Wh.J j10 = e02.f18638l0;
        if (j10 != null) {
            ((C3591f) j10).b(3000, "Ping timeout");
        }
        return jf.y.f36177a;
    }
}
