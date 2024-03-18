package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l8.AbstractC4344b;

/* renamed from: io.sentry.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3634c {

    /* renamed from: a  reason: collision with root package name */
    public final Map f34279a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34280b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f34281c;

    /* renamed from: d  reason: collision with root package name */
    public final H f34282d;

    public C3634c(H h10) {
        this(new HashMap(), null, true, h10);
    }

    public static C3634c a(Z0 z02, r1 r1Var) {
        String str;
        String str2;
        C3634c c3634c = new C3634c(r1Var.getLogger());
        A1 a5 = z02.f33837Z.a();
        if (a5 != null) {
            str = a5.f33714Y.toString();
        } else {
            str = null;
        }
        c3634c.d("sentry-trace_id", str);
        c3634c.d("sentry-public_key", (String) new s3.z(r1Var.getDsn()).f45397d);
        c3634c.d("sentry-release", z02.f33841k0);
        c3634c.d("sentry-environment", z02.f33842l0);
        io.sentry.protocol.C c10 = z02.f33844n0;
        if (c10 != null) {
            str2 = c(c10);
        } else {
            str2 = null;
        }
        c3634c.d("sentry-user_segment", str2);
        c3634c.d("sentry-transaction", z02.f33895A0);
        c3634c.d("sentry-sample_rate", null);
        c3634c.d("sentry-sampled", null);
        c3634c.f34281c = false;
        return c3634c;
    }

    public static String c(io.sentry.protocol.C c10) {
        String str = c10.f34473i0;
        if (str != null) {
            return str;
        }
        Map map = c10.f34477m0;
        if (map != null) {
            return (String) map.get("segment");
        }
        return null;
    }

    public final String b(String str) {
        return (String) this.f34279a.get(str);
    }

    public final void d(String str, String str2) {
        if (this.f34281c) {
            this.f34279a.put(str, str2);
        }
    }

    public final void e(T t10, io.sentry.protocol.C c10, r1 r1Var, U3.n nVar) {
        String str;
        String str2;
        Double d10;
        String str3;
        Boolean bool;
        d("sentry-trace_id", t10.s().f33714Y.toString());
        d("sentry-public_key", (String) new s3.z(r1Var.getDsn()).f45397d);
        d("sentry-release", r1Var.getRelease());
        d("sentry-environment", r1Var.getEnvironment());
        String str4 = null;
        if (c10 != null) {
            str = c(c10);
        } else {
            str = null;
        }
        d("sentry-user_segment", str);
        io.sentry.protocol.B w10 = t10.w();
        if (w10 != null && !io.sentry.protocol.B.URL.equals(w10)) {
            str2 = t10.getName();
        } else {
            str2 = null;
        }
        d("sentry-transaction", str2);
        if (nVar == null) {
            d10 = null;
        } else {
            d10 = (Double) nVar.f17427Z;
        }
        if (!AbstractC4344b.B0(d10, false)) {
            str3 = null;
        } else {
            str3 = new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d10);
        }
        d("sentry-sample_rate", str3);
        if (nVar == null) {
            bool = null;
        } else {
            bool = (Boolean) nVar.f17426Y;
        }
        if (bool != null) {
            str4 = bool.toString();
        }
        d("sentry-sampled", str4);
    }

    public final G1 f() {
        String b10 = b("sentry-trace_id");
        String b11 = b("sentry-public_key");
        if (b10 != null && b11 != null) {
            G1 g1 = new G1(new io.sentry.protocol.s(b10), b11, b("sentry-release"), b("sentry-environment"), b("sentry-user_id"), b("sentry-user_segment"), b("sentry-transaction"), b("sentry-sample_rate"), b("sentry-sampled"));
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry entry : this.f34279a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!AbstractC3631b.f34275a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            g1.f33796o0 = concurrentHashMap;
            return g1;
        }
        return null;
    }

    public C3634c(Map map, String str, boolean z10, H h10) {
        this.f34279a = map;
        this.f34282d = h10;
        this.f34281c = z10;
        this.f34280b = str;
    }
}
