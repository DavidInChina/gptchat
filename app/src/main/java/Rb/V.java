package Rb;

import android.content.Context;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class V extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f15299Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f15300Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f15301h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f15302i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Tc.f fVar, AbstractC6216a abstractC6216a, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15300Z = fVar;
        this.f15301h0 = abstractC6216a;
        this.f15302i0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        V v10 = new V(this.f15300Z, this.f15301h0, this.f15302i0, abstractC4825e);
        v10.f15299Y = obj;
        return v10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((V) create((AbstractC1270p) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC1270p abstractC1270p = (AbstractC1270p) this.f15299Y;
        boolean z10 = abstractC1270p instanceof C1268n;
        Tc.f fVar = this.f15300Z;
        if (z10) {
            Tc.f.c(fVar, A7.b.G1(((C1268n) abstractC1270p).f15364a, fVar.f17059d, fVar.f17056a), 0, 14);
        } else {
            boolean K10 = AbstractC3557B.K(abstractC1270p, C1266l.f15362a);
            AbstractC6216a abstractC6216a = this.f15301h0;
            if (K10) {
                abstractC6216a.mo122invoke();
            } else {
                boolean z11 = abstractC1270p instanceof C1267m;
                Context context = this.f15302i0;
                if (z11) {
                    K8.d.O0(context, fVar, ((C1267m) abstractC1270p).f15363a);
                } else if (AbstractC3557B.K(abstractC1270p, C1269o.f15365a)) {
                    String string = context.getString(R.string.report_content_submit_successful_text);
                    AbstractC3557B.b0("getString(...)", string);
                    Tc.f.c(fVar, string, 0, 14);
                    abstractC6216a.mo122invoke();
                }
            }
        }
        return jf.y.f36177a;
    }
}
