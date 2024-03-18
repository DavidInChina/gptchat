package Z1;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import io.sentry.android.core.AbstractC3612c;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22936Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f22937Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1751a0 f22938h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Context context, AbstractC1751a0 abstractC1751a0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22937Z = context;
        this.f22938h0 = abstractC1751a0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new Z(this.f22937Z, this.f22938h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22936Y;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                Context context = this.f22937Z;
                AbstractC1751a0 abstractC1751a0 = this.f22938h0;
                T t10 = new T(context);
                Hc.c cVar = ((WidgetReceiver) abstractC1751a0).f27706b;
                this.f22936Y = 1;
                if (t10.a(abstractC1751a0, cVar, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            AbstractC3612c.d("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
        return jf.y.f36177a;
    }
}
