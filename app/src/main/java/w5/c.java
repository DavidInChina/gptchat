package W5;

import A.C0007a0;
import Ii.q;
import M3.H;
import N.D;
import W.I;
import android.content.Context;
import b6.C2129a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.C3963m;
import p5.EnumC5090b;
import q5.C5274d;
import q5.g;
import r5.AbstractC5367b;
import r5.AbstractC5368c;
import r5.d;
import r5.e;
import s5.AbstractC5577b;
import t5.AbstractC5675a;
import t5.C5677c;
import x5.C6275a;

/* loaded from: classes.dex */
public final class c implements e, AbstractC5367b {

    /* renamed from: a  reason: collision with root package name */
    public final d f20744a;

    /* renamed from: b  reason: collision with root package name */
    public final U5.a f20745b;

    /* renamed from: h  reason: collision with root package name */
    public final C3963m f20751h;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC5675a f20746c = new q(0);

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f20747d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public String f20748e = "";

    /* renamed from: f  reason: collision with root package name */
    public final X5.a f20749f = new X5.a(null);

    /* renamed from: g  reason: collision with root package name */
    public final String f20750g = "logs";

    /* renamed from: i  reason: collision with root package name */
    public final C5677c f20752i = C5677c.f45749a;

    public c(d dVar, String str, U5.a aVar) {
        AbstractC3557B.c0("eventMapper", aVar);
        this.f20744a = dVar;
        this.f20745b = aVar;
        this.f20751h = R4.b.D1(new C0007a0(str, 25, this));
    }

    @Override // r5.e
    public final C5677c a() {
        return this.f20752i;
    }

    @Override // r5.AbstractC5367b
    public final void b(Object obj) {
        Long l10;
        String str;
        String str2;
        Map map;
        Long l11;
        String str3;
        String str4;
        Map map2;
        LinkedHashMap linkedHashMap;
        C5274d c5274d;
        g gVar;
        boolean z10 = obj instanceof C6275a;
        String str5 = this.f20750g;
        d dVar = this.f20744a;
        if (z10) {
            C6275a c6275a = (C6275a) obj;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AbstractC5368c h10 = dVar.h(str5);
            if (h10 != null) {
                H.B0(h10, new D(this, c6275a, countDownLatch, 5));
            }
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e10) {
                P4.a.m0(dVar.l(), 5, EnumC5090b.f42739Z, a.f20733Z, e10, false, 48);
                return;
            }
        }
        boolean z11 = obj instanceof Map;
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (!z11) {
            P4.a.m0(dVar.l(), 4, enumC5090b, new R5.c(1, obj), null, false, 56);
            return;
        }
        Map map3 = (Map) obj;
        LinkedHashMap linkedHashMap2 = null;
        if (AbstractC3557B.K(map3.get("type"), "ndk_crash")) {
            Object obj2 = map3.get(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            if (obj2 instanceof Long) {
                l11 = (Long) obj2;
            } else {
                l11 = null;
            }
            Object obj3 = map3.get("message");
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            } else {
                str3 = null;
            }
            Object obj4 = map3.get("loggerName");
            if (obj4 instanceof String) {
                str4 = (String) obj4;
            } else {
                str4 = null;
            }
            Object obj5 = map3.get("attributes");
            if (obj5 instanceof Map) {
                map2 = (Map) obj5;
            } else {
                map2 = null;
            }
            if (map2 != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry.getKey() instanceof String) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap = new LinkedHashMap(P4.a.n0(linkedHashMap3.size()));
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    Object key = entry2.getKey();
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", key);
                    linkedHashMap.put((String) key, entry2.getValue());
                }
            } else {
                linkedHashMap = null;
            }
            Object obj6 = map3.get("networkInfo");
            if (obj6 instanceof C5274d) {
                c5274d = (C5274d) obj6;
            } else {
                c5274d = null;
            }
            Object obj7 = map3.get("userInfo");
            if (obj7 instanceof g) {
                gVar = (g) obj7;
            } else {
                gVar = null;
            }
            if (str4 != null && str3 != null && l11 != null && linkedHashMap != null) {
                AbstractC5368c h11 = dVar.h(str5);
                if (h11 != null) {
                    H.B0(h11, new b(this, str3, linkedHashMap, l11, str4, gVar, c5274d));
                    return;
                }
                return;
            }
            P4.a.m0(dVar.l(), 4, enumC5090b, a.f20734h0, null, false, 56);
        } else if (AbstractC3557B.K(map3.get("type"), "span_log")) {
            Object obj8 = map3.get(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            if (obj8 instanceof Long) {
                l10 = (Long) obj8;
            } else {
                l10 = null;
            }
            Object obj9 = map3.get("message");
            if (obj9 instanceof String) {
                str = (String) obj9;
            } else {
                str = null;
            }
            Object obj10 = map3.get("loggerName");
            if (obj10 instanceof String) {
                str2 = (String) obj10;
            } else {
                str2 = null;
            }
            Object obj11 = map3.get("attributes");
            if (obj11 instanceof Map) {
                map = (Map) obj11;
            } else {
                map = null;
            }
            if (map != null) {
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry3 : map.entrySet()) {
                    if (entry3.getKey() instanceof String) {
                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                    }
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(P4.a.n0(linkedHashMap4.size()));
                for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                    Object key2 = entry4.getKey();
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", key2);
                    linkedHashMap5.put((String) key2, entry4.getValue());
                }
                linkedHashMap2 = linkedHashMap5;
            }
            if (str2 != null && str != null && linkedHashMap2 != null && l10 != null) {
                AbstractC5368c h12 = dVar.h(str5);
                if (h12 != null) {
                    H.B0(h12, new I(this, str, linkedHashMap2, l10, str2, 4));
                    return;
                }
                return;
            }
            P4.a.m0(dVar.l(), 4, enumC5090b, a.f20735i0, null, false, 56);
        } else {
            P4.a.m0(dVar.l(), 4, enumC5090b, new R5.c(2, obj), null, false, 56);
        }
    }

    @Override // r5.AbstractC5366a
    public final void c() {
        this.f20744a.f(this.f20750g);
        this.f20746c = new q(0);
        this.f20748e = "";
        this.f20747d.set(false);
    }

    @Override // r5.e
    public final AbstractC5577b d() {
        return (AbstractC5577b) this.f20751h.getValue();
    }

    @Override // r5.AbstractC5366a
    public final void e(Context context) {
        String str = this.f20750g;
        d dVar = this.f20744a;
        dVar.b(str, this);
        String packageName = context.getPackageName();
        AbstractC3557B.b0("appContext.packageName", packageName);
        this.f20748e = packageName;
        this.f20746c = new C2129a(new U5.b(new Y5.b(this.f20745b, dVar.l()), new Y5.c(dVar.l())), dVar.l());
        this.f20747d.set(true);
    }

    @Override // r5.AbstractC5366a
    public final String getName() {
        return this.f20750g;
    }
}
