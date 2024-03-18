package g2;

import androidx.glance.session.SessionWorker;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f31140Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31141Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ L f31142h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SessionWorker sessionWorker, L l10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f31141Z = sessionWorker;
        this.f31142h0 = l10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new v(this.f31141Z, this.f31142h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((v) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31140Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f31140Y = 1;
            obj = SessionWorker.h(this.f31141Z, this.f31142h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
