package androidx.glance.appwidget.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.glance.appwidget.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2057q {

    /* renamed from: b  reason: collision with root package name */
    public static volatile C2057q f25265b;

    /* renamed from: c  reason: collision with root package name */
    public static final C2057q f25266c = new C2057q();

    /* renamed from: a  reason: collision with root package name */
    public final Map f25267a = Collections.emptyMap();

    public static C2057q a() {
        C2057q c2057q = f25265b;
        if (c2057q == null) {
            synchronized (C2057q.class) {
                try {
                    c2057q = f25265b;
                    if (c2057q == null) {
                        Class cls = AbstractC2056p.f25263a;
                        C2057q c2057q2 = null;
                        if (cls != null) {
                            try {
                                c2057q2 = (C2057q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (c2057q2 == null) {
                            c2057q2 = f25266c;
                        }
                        f25265b = c2057q2;
                        c2057q = c2057q2;
                    }
                } finally {
                }
            }
        }
        return c2057q;
    }
}
