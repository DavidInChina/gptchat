package gc;

import com.openai.experiment.ExperimentKey;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ g f31576Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g gVar) {
        super(1);
        this.f31576Y = gVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        o oVar = (o) obj;
        AbstractC3557B.c0("$this$setState", oVar);
        List<C3251c> list = oVar.f31572b;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (C3251c c3251c : list) {
            ExperimentKey.BooleanKey booleanKey = c3251c.f31550a;
            C3254f c3254f = (C3254f) this.f31576Y;
            if (AbstractC3557B.K(booleanKey, c3254f.f31555a)) {
                c3251c = C3251c.a(c3251c, c3254f.f31556b, true);
            }
            arrayList.add(c3251c);
        }
        return o.e(oVar, null, arrayList, 1);
    }
}
