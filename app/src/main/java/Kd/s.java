package Kd;

import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f9764Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I f9765Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9765Z = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        s sVar = new s(this.f9765Z, abstractC4825e);
        sVar.f9764Y = obj;
        return sVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((s) create((m) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        m mVar = (m) this.f9764Y;
        boolean K10 = AbstractC3557B.K(mVar, C0835k.f9748a);
        I i10 = this.f9765Z;
        if (K10) {
            C0830f c0830f = (C0830f) i10.f9692o.getValue();
            c0830f.getClass();
            Ad.l.O0(c0830f.f9733a, null, null, new C0828d(c0830f, R.raw.hangup_0db, null), 3);
        } else if (AbstractC3557B.K(mVar, l.f9749a)) {
            C0830f c0830f2 = (C0830f) i10.f9692o.getValue();
            c0830f2.getClass();
            Ad.l.O0(c0830f2.f9733a, null, null, new C0828d(c0830f2, R.raw.error_0db, null), 3);
        }
        return jf.y.f36177a;
    }
}
