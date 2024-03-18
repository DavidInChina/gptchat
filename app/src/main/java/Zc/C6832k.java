package zc;

import Cd.X;
import Z8.AbstractC1809m0;
import Z8.Y0;
import aa.EnumC1942e;
import com.openai.experiment.ExperimentKey;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;
import x8.W;

/* renamed from: zc.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6832k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51911Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ com.openai.experiment.t f51912Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51913h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6832k(com.openai.experiment.t tVar, Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51912Z = tVar;
        this.f51913h0 = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6832k c6832k = new C6832k(this.f51912Z, this.f51913h0, abstractC4825e);
        c6832k.f51911Y = obj;
        return c6832k;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6832k) create((EnumC1942e) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        int i10 = AbstractC6830i.f51907a[((EnumC1942e) this.f51911Y).ordinal()];
        jf.y yVar = jf.y.f36177a;
        if (i10 == 1) {
            if (((com.openai.experiment.G) this.f51912Z).c(ExperimentKey.VoiceHangUpEnabled.INSTANCE)) {
                AbstractC1809m0.a().b(Y0.f23294g, kf.w.f37484Y);
                W.M(Pc.e.a(), "User hang up with voice", null, 6);
                Q q10 = this.f51913h0;
                if (Ii.q.l(((X) q10.e()).f3027b)) {
                    L4.a.E0(L4.a.I0(new C6829h(q10, null), new Qg.P(new C5426p(q10.f808e, 9))), AbstractC4828h.Q(q10));
                }
            } else {
                return yVar;
            }
        }
        return yVar;
    }
}
