package gc;

import com.openai.experiment.G;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ s f31575Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(1);
        this.f31575Y = sVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        o oVar = (o) obj;
        AbstractC3557B.c0("$this$setState", oVar);
        List<C3251c> list = oVar.f31572b;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (C3251c c3251c : list) {
            arrayList.add(C3251c.a(c3251c, ((G) this.f31575Y.f31577j).c(c3251c.f31550a), false));
        }
        return o.e(oVar, null, arrayList, 1);
    }
}
