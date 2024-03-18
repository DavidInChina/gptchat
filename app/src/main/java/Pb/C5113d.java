package pb;

import Ad.i;
import Ad.l;
import Z8.AbstractC1809m0;
import Z8.C1827w;
import Z8.F0;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import gb.C3235l;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import lb.L;
import nf.AbstractC4828h;
import sb.o;
import sb.p;
import sb.q;
import sb.r;
import sb.s;
import sb.v;
import sb.x;

/* renamed from: pb.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5113d extends x {

    /* renamed from: j  reason: collision with root package name */
    public final K9.a f42887j;

    /* renamed from: k  reason: collision with root package name */
    public final T9.a f42888k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f42889l;

    public C5113d(K9.a aVar, T9.a aVar2, t tVar) {
        super(v.f45527a);
        this.f42887j = aVar;
        this.f42888k = aVar2;
        this.f42889l = ((G) tVar).c(ExperimentKey.DetailedMessageFeedbackEnabled.INSTANCE);
    }

    public static void m(C3235l c3235l, boolean z10) {
        String str;
        String str2;
        String str3 = c3235l.f31472a;
        if (str3 != null && (str = c3235l.f31473b) != null && (str2 = c3235l.f31478g) != null) {
            AbstractC1809m0.a().b(C1827w.f23416c, AbstractC4268D.a1(new C3959i("liked", Boolean.valueOf(z10)), new C3959i("conversationId", str3), new C3959i("messageId", str), new C3959i("generationId", str2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [Ad.h, java.lang.Object] */
    @Override // Ad.g
    public final void i(i iVar) {
        sb.t tVar = (sb.t) iVar;
        AbstractC3557B.c0("intent", tVar);
        if (tVar instanceof s) {
            AbstractC1809m0.a().b(F0.f23247c, L.f37965a);
            l.O0(AbstractC4828h.Q(this), null, null, new C5112c(this, ((s) tVar).f45523a, null), 3);
        } else if (tVar instanceof r) {
            l(C5110a.f42872h0);
            l.O0(AbstractC4828h.Q(this), null, null, new C5111b(this, (r) tVar, null), 3);
        } else if (tVar instanceof q) {
            m(((q) tVar).f45518a, true);
        } else if (tVar instanceof p) {
            m(((p) tVar).f45517a, false);
        } else if (tVar instanceof o) {
            f(new Object());
            l(C5110a.f42871Z);
        }
    }
}
