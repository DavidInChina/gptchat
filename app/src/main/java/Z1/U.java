package Z1;

import android.content.Context;
import android.os.Bundle;
import com.openai.feature.widget.impl.WidgetReceiver;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class U extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22906Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22907Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1751a0 f22908h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f22909i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f22910j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Bundle f22911k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AbstractC1751a0 abstractC1751a0, Context context, int i10, Bundle bundle, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22908h0 = abstractC1751a0;
        this.f22909i0 = context;
        this.f22910j0 = i10;
        this.f22911k0 = bundle;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        U u10 = new U(this.f22908h0, this.f22909i0, this.f22910j0, this.f22911k0, abstractC4825e);
        u10.f22907Z = obj;
        return u10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22906Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1751a0 abstractC1751a0 = this.f22908h0;
            Context context = this.f22909i0;
            AbstractC1751a0.a(abstractC1751a0, (Ng.F) this.f22907Z, context);
            this.f22906Y = 1;
            if (((WidgetReceiver) abstractC1751a0).f27706b.c(context, this.f22910j0, this.f22911k0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
