package ee;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29322Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f29323Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f29324h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2881B f29325i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, C2881B c2881b, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29324h0 = qVar;
        this.f29325i0 = c2881b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        j jVar = new j(this.f29324h0, this.f29325i0, abstractC4825e);
        jVar.f29323Z = obj;
        return jVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29322Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C0.d dVar = new C0.d();
            C2881B c2881b = this.f29325i0;
            C2891i c2891i = new C2891i(this.f29324h0, (B0.A) this.f29323Z, c2881b, dVar, null);
            this.f29322Y = 1;
            if (Ad.l.e0(c2891i, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
