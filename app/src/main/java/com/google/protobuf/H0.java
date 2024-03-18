package com.google.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Map;

/* loaded from: classes.dex */
public final class H0 {
    public static U3.i a(Object obj) {
        return ((F0) obj).f27395a;
    }

    public static G0 b(Object obj) {
        return (G0) obj;
    }

    public static int c(Object obj, int i10, Object obj2) {
        G0 g02 = (G0) obj;
        F0 f02 = (F0) obj2;
        int i11 = 0;
        if (!g02.isEmpty()) {
            for (Map.Entry entry : g02.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                f02.getClass();
                int o02 = AbstractC2549y.o0(i10);
                int a5 = F0.a(f02.f27395a, key, value);
                i11 = AbstractC2469q0.e(a5, a5, o02, i11);
            }
        }
        return i11;
    }

    public static boolean d(Object obj) {
        return !((G0) obj).f27400Y;
    }

    public static G0 e(Object obj, Object obj2) {
        G0 g02 = (G0) obj;
        G0 g03 = (G0) obj2;
        if (!g03.isEmpty()) {
            if (!g02.f27400Y) {
                g02 = g02.c();
            }
            g02.b();
            if (!g03.isEmpty()) {
                g02.putAll(g03);
            }
        }
        return g02;
    }

    public static G0 f() {
        return G0.f27399Z.c();
    }

    public static void g(Object obj) {
        ((G0) obj).f27400Y = false;
    }
}
