package Z8;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class i1 implements AbstractC1805k0 {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f23355a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f23356b;

    public i1(p1 p1Var, n1 n1Var) {
        this.f23355a = p1Var;
        this.f23356b = n1Var;
    }

    @Override // Z8.AbstractC1805k0
    public final void a(String str, String str2, String str3, boolean z10, boolean z11, String str4) {
        this.f23355a.getClass();
        this.f23356b.a(str, str2, str3, z10, z11, str4);
    }

    @Override // Z8.AbstractC1805k0
    public final void b(AbstractC1831y abstractC1831y, Map map) {
        AbstractC3557B.c0("event", abstractC1831y);
        AbstractC3557B.c0(DiagnosticsEntry.Event.PROPERTIES_KEY, map);
        this.f23355a.b(abstractC1831y, map);
        this.f23356b.b(abstractC1831y, map);
    }

    @Override // Z8.AbstractC1805k0
    public final void c(AbstractC1802j abstractC1802j, Object obj) {
        r9.y.b1(this, abstractC1802j, obj);
    }
}
