package L;

import B.Z1;
import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: L.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0874u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10304Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f10305Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f10306h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f10307i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0874u(AbstractC1710f0 abstractC1710f0, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10306h0 = abstractC1710f0;
        this.f10307i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0874u c0874u = new C0874u(this.f10306h0, this.f10307i0, abstractC4825e);
        c0874u.f10305Z = obj;
        return c0874u;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0874u) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10304Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            B0.A a5 = (B0.A) this.f10305Z;
            C0871s c0871s = new C0871s(this.f10306h0, this.f10307i0, 1);
            this.f10304Y = 1;
            if (Z1.d(a5, null, null, c0871s, this, 7) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
