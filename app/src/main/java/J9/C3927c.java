package j9;

import id.AbstractC3557B;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import l9.C4355c;
import p5.EnumC5090b;
import r5.AbstractC5366a;
import r5.AbstractC5368c;
import wf.p;
import y5.h;

/* renamed from: j9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3927c implements Pc.c {

    /* renamed from: a  reason: collision with root package name */
    public final e f36082a;

    /* renamed from: b  reason: collision with root package name */
    public final V5.c f36083b;

    /* renamed from: c  reason: collision with root package name */
    public V5.c f36084c;

    public C3927c(C4355c c4355c, e eVar) {
        AbstractC3557B.c0("datadogConfig", c4355c);
        AbstractC3557B.c0("logObserver", eVar);
        this.f36082a = eVar;
        V5.c f6 = f(C3926b.f36079Z);
        this.f36083b = f6;
        this.f36084c = f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static V5.c f(C3926b c3926b) {
        W5.c cVar;
        Z5.c cVar2;
        V5.b bVar = new V5.b();
        bVar.f18397b = true;
        bVar.f18399d = true;
        bVar.f18398c = true;
        c3926b.invoke(bVar);
        r5.d dVar = bVar.f18396a;
        AbstractC5368c h10 = dVar.h("logs");
        if (h10 != null) {
            AbstractC5366a abstractC5366a = ((h) h10).f50813b;
            AbstractC3557B.a0("null cannot be cast to non-null type T of com.datadog.android.core.internal.SdkFeature.unwrap", abstractC5366a);
            cVar = (W5.c) abstractC5366a;
        } else {
            cVar = null;
        }
        if (bVar.f18400e > 0.0f) {
            if (cVar == null) {
                P4.a.m0(dVar.l(), 5, EnumC5090b.f42738Y, V5.a.f18395Y, null, false, 56);
                cVar2 = new Object();
            } else {
                cVar2 = new Z5.c(cVar.f20748e, new X5.a(dVar.g()), dVar, cVar.f20746c, bVar.f18397b, bVar.f18398c, bVar.f18399d, new S5.c(bVar.f18400e), bVar.f18401f);
            }
        } else {
            cVar2 = new Object();
        }
        return new V5.c(cVar2);
    }

    @Override // Pc.c
    public final void a(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e(5, str, th2, AbstractC4268D.e1(C4355c.f37891e, map));
    }

    @Override // Pc.c
    public final void b(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e(6, str, th2, AbstractC4268D.e1(C4355c.f37891e, map));
    }

    @Override // Pc.c
    public final void c(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e(4, str, th2, AbstractC4268D.e1(C4355c.f37891e, map));
    }

    @Override // Pc.c
    public final void d(String str, Throwable th2, Map map) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        e(3, str, th2, AbstractC4268D.e1(C4355c.f37891e, map));
    }

    public final void e(int i10, String str, Throwable th2, LinkedHashMap linkedHashMap) {
        if (i10 >= 4) {
            V5.c cVar = this.f36084c;
            LinkedHashMap e12 = AbstractC4268D.e1(C4355c.f37891e, linkedHashMap);
            cVar.getClass();
            AbstractC3557B.c0("message", str);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(cVar.f18403b);
            linkedHashMap2.putAll(e12);
            cVar.f18402a.g(i10, str, th2, linkedHashMap2, new HashSet(cVar.f18404c), null);
            e eVar = this.f36082a;
            eVar.getClass();
            Iterator it = eVar.f36087a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).h(Integer.valueOf(i10), str, th2, linkedHashMap);
            }
        }
    }
}
