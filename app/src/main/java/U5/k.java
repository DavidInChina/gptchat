package u5;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.LinkedHashSet;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import wf.AbstractC6216a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class k implements AbstractC5091c {

    /* renamed from: b  reason: collision with root package name */
    public final r5.d f46444b;

    /* renamed from: c  reason: collision with root package name */
    public final h f46445c;

    /* renamed from: d  reason: collision with root package name */
    public final h f46446d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f46447e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet f46448f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashSet f46449g = new LinkedHashSet();

    public k(r5.d dVar) {
        d dVar2 = d.f46423j0;
        d dVar3 = d.f46424k0;
        this.f46444b = dVar;
        this.f46445c = (h) dVar2.mo122invoke();
        this.f46446d = (h) dVar3.mo122invoke();
    }

    public static int c(int i10) {
        int f6 = AbstractC6708l.f(i10);
        if (f6 == 0) {
            return 2;
        }
        if (f6 == 1) {
            return 3;
        }
        if (f6 == 2) {
            return 4;
        }
        if (f6 != 3) {
            if (f6 == 4) {
                return 6;
            }
            throw new RuntimeException();
        }
        return 5;
    }

    public final void a(int i10, EnumC5090b enumC5090b, AbstractC6216a abstractC6216a, Throwable th2, boolean z10, Map map) {
        r5.d dVar;
        AbstractC5368c h10;
        Map map2;
        AbstractC2469q0.q("level", i10);
        AbstractC3557B.c0("target", enumC5090b);
        int ordinal = enumC5090b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 && (dVar = this.f46444b) != null && (h10 = dVar.h("rum")) != null) {
                    String str = (String) abstractC6216a.mo122invoke();
                    if (z10) {
                        LinkedHashSet linkedHashSet = this.f46449g;
                        if (!linkedHashSet.contains(str)) {
                            linkedHashSet.add(str);
                        } else {
                            return;
                        }
                    }
                    if (i10 != 5 && i10 != 4 && th2 == null) {
                        if (map != null && !map.isEmpty()) {
                            map2 = AbstractC4268D.a1(new C3959i("type", "telemetry_debug"), new C3959i("message", str), new C3959i("additionalProperties", map));
                        } else {
                            map2 = AbstractC4268D.a1(new C3959i("type", "telemetry_debug"), new C3959i("message", str));
                        }
                    } else {
                        map2 = AbstractC4268D.a1(new C3959i("type", "telemetry_error"), new C3959i("message", str), new C3959i("throwable", th2));
                    }
                    ((y5.h) h10).a(map2);
                    return;
                }
                return;
            }
            h hVar = this.f46446d;
            if (hVar != null) {
                b(hVar, i10, abstractC6216a, th2, z10, this.f46448f);
                return;
            }
            return;
        }
        b(this.f46445c, i10, abstractC6216a, th2, z10, this.f46447e);
    }

    public final void b(h hVar, int i10, AbstractC6216a abstractC6216a, Throwable th2, boolean z10, LinkedHashSet linkedHashSet) {
        String str;
        if (!((Boolean) hVar.f46441b.invoke(Integer.valueOf(c(i10)))).booleanValue()) {
            return;
        }
        String str2 = (String) abstractC6216a.mo122invoke();
        r5.d dVar = this.f46444b;
        if (dVar != null) {
            str = dVar.getName();
        } else {
            str = null;
        }
        if (str != null) {
            str2 = android.gov.nist.core.a.k("[", str, "]: ", str2);
        }
        if (z10) {
            if (linkedHashSet.contains(str2)) {
                return;
            }
            linkedHashSet.add(str2);
        }
        int c10 = c(i10);
        AbstractC3557B.c0("message", str2);
        if (((Boolean) hVar.f46441b.invoke(Integer.valueOf(c10))).booleanValue()) {
            String str3 = hVar.f46440a;
            if (str3.length() >= 23 && Build.VERSION.SDK_INT < 24) {
                str3 = str3.substring(0, 23);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str3);
            }
            Log.println(c10, str3, str2);
            if (th2 != null) {
                Log.println(c10, str3, Log.getStackTraceString(th2));
            }
        }
    }
}
