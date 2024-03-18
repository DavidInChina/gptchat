package C6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kf.t;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import r5.AbstractC5366a;
import r5.AbstractC5368c;
import y5.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final r5.d f2705a;

    /* renamed from: b  reason: collision with root package name */
    public final M6.e f2706b;

    /* renamed from: c  reason: collision with root package name */
    public Set f2707c = R4.b.X1(g.f2720Y, g.f2723i0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f2708d = true;

    /* renamed from: e  reason: collision with root package name */
    public double f2709e = 100.0d;

    /* renamed from: f  reason: collision with root package name */
    public final String f2710f = "";

    /* renamed from: g  reason: collision with root package name */
    public final int f2711g = 5;

    /* renamed from: h  reason: collision with root package name */
    public final SecureRandom f2712h = new SecureRandom();

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f2713i = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r1v1, types: [M6.e, java.lang.Object] */
    public d(AbstractC5092d abstractC5092d) {
        AbstractC3557B.c0("sdkCore", abstractC5092d);
        ?? obj = new Object();
        this.f2705a = (r5.d) abstractC5092d;
        this.f2706b = obj;
    }

    public final e a() {
        E6.a aVar;
        U6.a aVar2;
        r5.d dVar = this.f2705a;
        AbstractC5368c h10 = dVar.h("tracing");
        if (h10 != null) {
            AbstractC5366a abstractC5366a = ((h) h10).f50813b;
            AbstractC3557B.a0("null cannot be cast to non-null type T of com.datadog.android.core.internal.SdkFeature.unwrap", abstractC5366a);
            aVar = (E6.a) abstractC5366a;
        } else {
            aVar = null;
        }
        AbstractC5368c h11 = dVar.h("rum");
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (aVar == null) {
            P4.a.m0(dVar.l(), 5, enumC5090b, c.f2701Z, null, false, 56);
        }
        if (this.f2708d && h11 == null) {
            P4.a.m0(dVar.l(), 4, enumC5090b, c.f2702h0, null, false, 56);
            this.f2708d = false;
        }
        Properties properties = new Properties();
        String str = this.f2710f;
        if (str.length() == 0) {
            String g10 = dVar.g();
            if (g10.length() == 0) {
                P4.a.m0(dVar.l(), 5, enumC5090b, c.f2703i0, null, false, 56);
            }
            str = g10;
        }
        properties.setProperty("service.name", str);
        properties.setProperty("trace.partial.flush.min.spans", String.valueOf(this.f2711g));
        LinkedHashMap linkedHashMap = this.f2713i;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            arrayList.add(key + ":" + value);
        }
        properties.setProperty("tags", t.m2(arrayList, Separators.COMMA, null, null, null, 62));
        properties.setProperty("trace.sample.rate", String.valueOf(this.f2709e / 100.0d));
        String m22 = t.m2(this.f2707c, Separators.COMMA, null, null, null, 62);
        properties.setProperty("propagation.style.extract", m22);
        properties.setProperty("propagation.style.inject", m22);
        R6.b bVar = R6.b.f15063v0;
        if (!properties.isEmpty()) {
            bVar = new R6.b(properties, bVar);
        }
        AbstractC3557B.b0("get(properties())", bVar);
        if (aVar == null || (aVar2 = aVar.f4540d) == null) {
            aVar2 = new F6.a(0);
        }
        return new e(this.f2705a, bVar, aVar2, this.f2712h, this.f2706b, this.f2708d);
    }
}
