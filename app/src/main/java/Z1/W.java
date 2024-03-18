package Z1;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class W extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22921Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22922Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1751a0 f22923h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f22924i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f22925j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ String f22926k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC1751a0 abstractC1751a0, Context context, int i10, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22923h0 = abstractC1751a0;
        this.f22924i0 = context;
        this.f22925j0 = i10;
        this.f22926k0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        W w10 = new W(this.f22923h0, this.f22924i0, this.f22925j0, this.f22926k0, abstractC4825e);
        w10.f22922Z = obj;
        return w10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22921Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1751a0 abstractC1751a0 = this.f22923h0;
            AbstractC1751a0.a(abstractC1751a0, (Ng.F) this.f22922Z, this.f22924i0);
            this.f22921Y = 1;
            if (((WidgetReceiver) abstractC1751a0).f27706b.d(this.f22924i0, this.f22925j0, this.f22926k0, null, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
