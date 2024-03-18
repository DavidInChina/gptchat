package kb;

import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f37265Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f37266Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f37267h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractActivityC4532l abstractActivityC4532l, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37266Z = fVar;
        this.f37267h0 = abstractActivityC4532l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        r rVar = new r(this.f37267h0, this.f37266Z, abstractC4825e);
        rVar.f37265Y = obj;
        return rVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((r) create((AbstractC4224i) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC4224i abstractC4224i = (AbstractC4224i) this.f37265Y;
        boolean z10 = abstractC4224i instanceof C4222g;
        Tc.f fVar = this.f37266Z;
        if (z10) {
            Tc.f.c(fVar, A7.b.G1(((C4222g) abstractC4224i).f37256a, fVar.f17059d, fVar.f17056a), 0, 14);
        } else if (abstractC4224i instanceof C4219d) {
            fVar.f17057b.p();
        } else if (abstractC4224i instanceof C4221f) {
            K8.d.O0(this.f37267h0, fVar, ((C4221f) abstractC4224i).f37255a);
        } else if (abstractC4224i instanceof C4220e) {
            Tc.f.b(fVar, Ad.l.j1(((C4220e) abstractC4224i).f37254a));
        } else if (abstractC4224i instanceof C4223h) {
            ((C4223h) abstractC4224i).getClass();
            Tc.f.b(fVar, R.string.conversations_image_download_success);
        }
        return jf.y.f36177a;
    }
}
