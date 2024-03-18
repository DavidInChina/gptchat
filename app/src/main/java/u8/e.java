package U8;

import N0.C1044c;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final C1044c f17523a = new C1044c(16);

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f17524b = new LinkedHashMap();

    public static void a(e eVar, a aVar) {
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid);
        eVar.f17524b.put("inline:".concat(uuid), aVar);
        N0.p pVar = new N0.p(Integer.MIN_VALUE, Integer.MIN_VALUE, Z0.n.f22810c, null, null, null, 0, Integer.MIN_VALUE, null);
        C1044c c1044c = eVar.f17523a;
        c1044c.g(pVar);
        if ("\ufffd".length() > 0) {
            c1044c.f("androidx.compose.foundation.text.inlineContent", uuid);
            c1044c.c("\ufffd");
            c1044c.d();
            c1044c.d();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    public final int b(o oVar) {
        LinkedHashMap linkedHashMap = this.f17524b;
        AbstractC3557B.c0("tags", linkedHashMap);
        String str = oVar.f17545a;
        if (str == null) {
            String uuid = UUID.randomUUID().toString();
            AbstractC3557B.b0("toString(...)", uuid);
            linkedHashMap.put(uuid, oVar);
            str = "format:".concat(uuid);
        }
        o.f17542b.getClass();
        return this.f17523a.f(o.f17543c, str);
    }
}
