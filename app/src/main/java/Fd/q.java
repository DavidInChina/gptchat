package Fd;

import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import gb.G;
import gb.H;
import gb.I;
import gb.J;
import gb.L;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f5266Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f5267Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f5268h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Tc.f fVar, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5267Z = fVar;
        this.f5268h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        q qVar = new q(this.f5267Z, this.f5268h0, abstractC4825e);
        qVar.f5266Y = obj;
        return qVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((q) create((L) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        L l10 = (L) this.f5266Y;
        boolean z10 = l10 instanceof J;
        Tc.f fVar = this.f5267Z;
        if (z10) {
            ((J) l10).getClass();
            Tc.f.b(fVar, R.string.conversations_image_download_success);
        } else if (l10 instanceof I) {
            Tc.f.c(fVar, A7.b.G1(((I) l10).f31364a, fVar.f17059d, fVar.f17056a), 0, 14);
        } else if (l10 instanceof H) {
            K8.d.O0(this.f5268h0, fVar, ((H) l10).f31363a);
        } else if (l10 instanceof G) {
            Tc.f.b(fVar, Ad.l.j1(((G) l10).f31362a));
        }
        return jf.y.f36177a;
    }
}
