package Pc;

import id.AbstractC3557B;
import java.util.Map;
import kf.AbstractC4268D;

/* loaded from: classes2.dex */
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Map f13944a;

    public g(Map map) {
        this.f13944a = map;
    }

    @Override // Pc.c
    public final void a(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e.a().a(str, th2, AbstractC4268D.e1(this.f13944a, map));
    }

    @Override // Pc.c
    public final void b(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e.a().b(str, th2, AbstractC4268D.e1(this.f13944a, map));
    }

    @Override // Pc.c
    public final void c(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e.a().c(str, th2, AbstractC4268D.e1(this.f13944a, map));
    }

    @Override // Pc.c
    public final void d(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e.a().d(str, th2, AbstractC4268D.e1(this.f13944a, map));
    }
}
