package V;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: V.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1457b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17915Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f17916Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1458c f17917h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ D.p f17918i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1457b(p pVar, C1458c c1458c, D.p pVar2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17916Z = pVar;
        this.f17917h0 = c1458c;
        this.f17918i0 = pVar2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1457b(this.f17916Z, this.f17917h0, this.f17918i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1457b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17915Y;
        D.p pVar = this.f17918i0;
        C1458c c1458c = this.f17917h0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                p pVar2 = this.f17916Z;
                this.f17915Y = 1;
                if (pVar2.a(this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            c1458c.f17923k0.remove(pVar);
            return jf.y.f36177a;
        } catch (Throwable th2) {
            c1458c.f17923k0.remove(pVar);
            throw th2;
        }
    }
}
