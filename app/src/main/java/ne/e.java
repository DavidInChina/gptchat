package ne;

import B.D;
import id.AbstractC3557B;
import java.util.Iterator;
import me.x;
import te.C5763g;
import wf.AbstractC6216a;
import wf.k;
import wf.p;

/* loaded from: classes.dex */
public final class e implements x {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f40305c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f40306d;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f40304b = "ChatGptAccountIdHeaderPlugin";

    /* renamed from: a  reason: collision with root package name */
    public final Fe.a f40303a = new Fe.a("ChatGptAccountIdHeaderPlugin");

    public e(nb.d dVar) {
        C4818b c4818b = C4818b.f40295h0;
        this.f40305c = c4818b;
        this.f40306d = dVar;
    }

    @Override // me.x
    public final void a(ge.d dVar, Object obj) {
        C4820d c4820d = (C4820d) obj;
        AbstractC3557B.c0("plugin", c4820d);
        AbstractC3557B.c0("scope", dVar);
        C4819c c4819c = new C4819c(new Fe.a(c4820d.f40300Z), dVar, c4820d.f40299Y);
        c4820d.f40301h0.invoke(c4819c);
        c4820d.f40302i0 = c4819c.f40298c;
        Iterator it = c4819c.f40297b.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            fVar.getClass();
            ((h) fVar.f40307a).getClass();
            p pVar = (p) fVar.f40308b;
            AbstractC3557B.c0("handler", pVar);
            dVar.f31598k0.f(C5763g.f46139f.k(), new D(pVar, null, 3));
        }
    }

    @Override // me.x
    public final Object c(k kVar) {
        Object mo122invoke = this.f40305c.mo122invoke();
        kVar.invoke(mo122invoke);
        return new C4820d(mo122invoke, this.f40304b, this.f40306d);
    }

    @Override // me.x
    public final Fe.a getKey() {
        return this.f40303a;
    }
}
