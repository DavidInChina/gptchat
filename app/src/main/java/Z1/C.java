package Z1;

import android.content.BroadcastReceiver;
import io.sentry.android.core.AbstractC3612c;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class C extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22819Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22820Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f22821h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f22822i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f22823j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(wf.n nVar, Ng.F f6, BroadcastReceiver.PendingResult pendingResult, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22821h0 = nVar;
        this.f22822i0 = f6;
        this.f22823j0 = pendingResult;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C c10 = new C(this.f22821h0, this.f22822i0, this.f22823j0, abstractC4825e);
        c10.f22820Z = obj;
        return c10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22819Y;
        BroadcastReceiver.PendingResult pendingResult = this.f22823j0;
        Ng.F f6 = this.f22822i0;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ng.F f10 = (Ng.F) this.f22820Z;
                    wf.n nVar = this.f22821h0;
                    this.f22819Y = 1;
                    if (nVar.invoke(f10, this) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                Ad.l.P(f6, null);
                return jf.y.f36177a;
            } catch (CancellationException e10) {
                throw e10;
            }
        } finally {
            try {
                pendingResult.finish();
            } catch (IllegalStateException e11) {
                AbstractC3612c.d("GlanceAppWidget", "Error thrown when trying to finish broadcast", e11);
            }
        }
    }
}
