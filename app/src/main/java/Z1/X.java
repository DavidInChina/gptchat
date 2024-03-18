package Z1;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class X extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22927Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1751a0 f22928Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f22929h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f22930i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AbstractC1751a0 abstractC1751a0, Context context, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22928Z = abstractC1751a0;
        this.f22929h0 = context;
        this.f22930i0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new X(this.f22928Z, this.f22929h0, this.f22930i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22927Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Hc.c cVar = ((WidgetReceiver) this.f22928Z).f27706b;
            this.f22927Y = 1;
            if (cVar.e(this.f22929h0, this.f22930i0, null, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
