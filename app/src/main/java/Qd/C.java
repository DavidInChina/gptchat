package Qd;

import com.segment.analytics.kotlin.core.Settings;
import id.AbstractC3557B;
import java.util.Set;
import kf.AbstractC4273I;

/* loaded from: classes2.dex */
public final class C implements Li.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14571a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14572b;

    public C(Settings settings) {
        AbstractC3557B.c0("settings", settings);
        this.f14572b = settings;
    }

    @Override // Li.a
    public final /* bridge */ /* synthetic */ Li.b a(Li.b bVar) {
        switch (this.f14571a) {
            case 0:
                return b((E) bVar);
            case 1:
                return b((E) bVar);
            default:
                return b((E) bVar);
        }
    }

    public final E b(E e10) {
        Settings settings;
        kotlinx.serialization.json.c cVar;
        switch (this.f14571a) {
            case 0:
                AbstractC3557B.c0("state", e10);
                androidx.lifecycle.D d10 = new androidx.lifecycle.D(6);
                Settings settings2 = e10.f14576b;
                if (settings2 != null && (cVar = settings2.f27796a) != null) {
                    Vd.h.b(d10, cVar);
                }
                Df.H.l0(d10, (String) this.f14572b, Boolean.TRUE);
                kotlinx.serialization.json.c c10 = d10.c();
                if (settings2 != null) {
                    kotlinx.serialization.json.c cVar2 = settings2.f27797b;
                    AbstractC3557B.c0("plan", cVar2);
                    kotlinx.serialization.json.c cVar3 = settings2.f27798c;
                    AbstractC3557B.c0("edgeFunction", cVar3);
                    kotlinx.serialization.json.c cVar4 = settings2.f27799d;
                    AbstractC3557B.c0("middlewareSettings", cVar4);
                    settings = new Settings(c10, cVar2, cVar3, cVar4);
                } else {
                    settings = null;
                }
                return new E(e10.f14575a, settings, e10.f14577c, e10.f14578d, e10.f14579e);
            case 1:
                AbstractC3557B.c0("state", e10);
                return new E(e10.f14575a, e10.f14576b, e10.f14577c, AbstractC4273I.u2(e10.f14578d, (Set) this.f14572b), e10.f14579e);
            default:
                AbstractC3557B.c0("state", e10);
                return new E(e10.f14575a, (Settings) this.f14572b, e10.f14577c, e10.f14578d, e10.f14579e);
        }
    }

    public C(String str) {
        AbstractC3557B.c0("destinationKey", str);
        this.f14572b = str;
    }

    public C(Set set) {
        this.f14572b = set;
    }
}
