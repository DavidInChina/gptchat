package Hi;

import android.os.Build;
import android.os.Trace;
import id.AbstractC3557B;
import jf.C3963m;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final C3963m f7910a = R4.b.D1(p.f7909Y);

    public static final void a(String str, int i10) {
        AbstractC3557B.c0("label", str);
        if (!d()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            F3.a.a(Gi.e.V(str), i10);
            return;
        }
        String V10 = Gi.e.V(str);
        try {
            if (Gi.e.f6523h == null) {
                Gi.e.f6523h = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            Gi.e.f6523h.invoke(null, Long.valueOf(Gi.e.f6521f), V10, Integer.valueOf(i10));
        } catch (Exception e10) {
            Gi.e.B("asyncTraceBegin", e10);
        }
    }

    public static final void b(String str) {
        AbstractC3557B.c0("label", str);
        if (!d()) {
            return;
        }
        Trace.beginSection(Gi.e.V(Lg.o.Z2(127, str)));
    }

    public static final void c(String str, int i10) {
        AbstractC3557B.c0("label", str);
        if (!d()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            F3.a.b(Gi.e.V(str), i10);
            return;
        }
        String V10 = Gi.e.V(str);
        try {
            if (Gi.e.f6524i == null) {
                Gi.e.f6524i = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Gi.e.f6524i.invoke(null, Long.valueOf(Gi.e.f6521f), V10, Integer.valueOf(i10));
        } catch (Exception e10) {
            Gi.e.B("asyncTraceEnd", e10);
        }
    }

    public static final boolean d() {
        if (e() && Gi.e.D()) {
            return true;
        }
        return false;
    }

    public static final boolean e() {
        if (AbstractC4828h.f40327i != null && ((Boolean) f7910a.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}
