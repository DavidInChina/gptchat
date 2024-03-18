package x9;

import B.Z1;
import B0.A;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import mh.P;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f49641Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f49642Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ P f49643h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f49644i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f49645j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(P p10, l lVar, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f49643h0 = p10;
        this.f49644i0 = lVar;
        this.f49645j0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c cVar = new c(this.f49643h0, this.f49644i0, this.f49645j0, abstractC4825e);
        cVar.f49642Z = obj;
        return cVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((A) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f49641Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            A a5 = (A) this.f49642Z;
            C6.a aVar = new C6.a(this.f49643h0, this.f49644i0, this.f49645j0, 3);
            this.f49641Y = 1;
            if (Z1.d(a5, null, null, aVar, this, 7) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
