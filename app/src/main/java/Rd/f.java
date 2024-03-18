package Rd;

import Lg.n;
import Qd.C1183b;
import Qd.p;
import Qd.r;
import com.segment.analytics.kotlin.core.ScreenEvent;
import dh.C2682H;
import dh.u0;
import eh.AbstractC2904d;
import eh.AbstractC2911k;
import eh.C2903c;
import eh.C2914n;
import eh.C2917q;
import id.AbstractC3557B;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {
    public static final b Companion = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final ScreenEvent f15433i;

    /* renamed from: a  reason: collision with root package name */
    public final Qd.i f15434a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15435b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15436c;

    /* renamed from: d  reason: collision with root package name */
    public String f15437d;

    /* renamed from: g  reason: collision with root package name */
    public final U3.c f15440g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15441h = false;

    /* renamed from: e  reason: collision with root package name */
    public Pg.k f15438e = Bi.c.d(Integer.MAX_VALUE, null, 6);

    /* renamed from: f  reason: collision with root package name */
    public Pg.k f15439f = Bi.c.d(Integer.MAX_VALUE, null, 6);

    /* JADX WARN: Type inference failed for: r0v0, types: [Rd.b, java.lang.Object] */
    static {
        ScreenEvent screenEvent = new ScreenEvent("#!flush", "#!flush", p.f14647a);
        screenEvent.n("#!flush");
        f15433i = screenEvent;
    }

    public f(Qd.i iVar, String str, String str2, List list, String str3) {
        AbstractC3557B.c0("logTag", str);
        AbstractC3557B.c0("apiKey", str2);
        AbstractC3557B.c0("flushPolicies", list);
        AbstractC3557B.c0("apiHost", str3);
        this.f15434a = iVar;
        this.f15435b = str;
        this.f15436c = list;
        this.f15437d = str3;
        this.f15440g = new U3.c(str2, iVar.f14610Y.f14634o);
        Runtime.getRuntime().addShutdownHook(new x2.j(4, this));
    }

    public static final boolean a(f fVar, Exception exc, File file) {
        if (exc instanceof r) {
            r.f.M(fVar.f15434a, fVar.f15435b + " exception while uploading, " + exc.getMessage());
            int i10 = ((r) exc).f14649Y;
            if (400 <= i10 && i10 < 500 && i10 != 429) {
                AbstractC3557B.s2(Qd.i.Companion, "Payloads were rejected by server. Marked for removal.", 1);
                return true;
            }
            AbstractC3557B.s2(Qd.i.Companion, "Error while uploading payloads", 1);
        } else {
            C1183b c1183b = Qd.i.Companion;
            AbstractC3557B.s2(c1183b, Bi.c.N1("\n                    | Error uploading events from batch file\n                    | fileUrl=\"" + file.getPath() + "\"\n                    | msg=" + exc.getMessage() + "\n                "), 1);
        }
        return false;
    }

    public static String c(com.segment.analytics.kotlin.core.a aVar) {
        C2917q c2917q = Vd.h.f18603a;
        c2917q.getClass();
        kotlinx.serialization.json.c g10 = AbstractC2911k.g(c2917q.c(com.segment.analytics.kotlin.core.a.Companion.serializer(), aVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : g10.f37662Y.entrySet()) {
            String str = (String) entry.getKey();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
            if (!AbstractC3557B.K(str, "userId") || !n.n2(AbstractC2911k.h(bVar).r())) {
                if (!AbstractC3557B.K(str, "traits") || !AbstractC3557B.K(bVar, p.f14647a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        C2903c c2903c = AbstractC2904d.f29415d;
        c2903c.getClass();
        return c2903c.d(new C2682H(u0.f28491a, C2914n.f29467a, 1), linkedHashMap);
    }

    public final void b() {
        if (!this.f15441h) {
            return;
        }
        this.f15441h = false;
        this.f15439f.k(null);
        this.f15438e.k(null);
        for (Ud.b bVar : this.f15436c) {
            bVar.f();
        }
    }
}
