package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class N {
    public static void a(Object obj, Object obj2) {
        M m10 = (M) obj;
        AbstractC2469q0.p(obj2);
        if (!m10.isEmpty()) {
            Iterator it = m10.entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static M b(Object obj, Object obj2) {
        M m10 = (M) obj;
        M m11 = (M) obj2;
        if (!m11.isEmpty()) {
            if (!m10.f25167Y) {
                m10 = m10.c();
            }
            m10.b();
            if (!m11.isEmpty()) {
                m10.putAll(m11);
            }
        }
        return m10;
    }

    public static void c(Object obj) {
        ((M) obj).f25167Y = false;
    }
}
