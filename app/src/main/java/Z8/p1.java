package Z8;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class p1 implements AbstractC1805k0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f23400a;

    @Override // Z8.AbstractC1805k0
    public final void b(AbstractC1831y abstractC1831y, Map map) {
        AbstractC3557B.c0("event", abstractC1831y);
        AbstractC3557B.c0(DiagnosticsEntry.Event.PROPERTIES_KEY, map);
        if (!this.f23400a) {
            return;
        }
        Object b10 = ld.g.f38286a.b(com.openai.experiment.D.class);
        if (b10 != null) {
            com.openai.experiment.C a5 = ((com.openai.experiment.D) b10).a();
            F.s sVar = new F.s(abstractC1831y, map, a5, 10);
            a5.getClass();
            Ad.l.O0(a5.f27659a, null, null, new com.openai.experiment.B(a5, sVar, null), 3);
            return;
        }
        throw new ld.h("Couldn't find component of type ".concat(com.openai.experiment.D.class.getName()));
    }

    @Override // Z8.AbstractC1805k0
    public final void c(AbstractC1802j abstractC1802j, Object obj) {
        r9.y.b1(this, abstractC1802j, obj);
    }

    @Override // Z8.AbstractC1805k0
    public final void a(String str, String str2, String str3, boolean z10, boolean z11, String str4) {
    }
}
