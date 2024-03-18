package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static volatile r f25106b;

    /* renamed from: c  reason: collision with root package name */
    public static final r f25107c;

    /* renamed from: a  reason: collision with root package name */
    public final Map f25108a = Collections.emptyMap();

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f25107c = new r();
    }

    public static r a() {
        r rVar = f25106b;
        if (rVar == null) {
            synchronized (r.class) {
                try {
                    rVar = f25106b;
                    if (rVar == null) {
                        Class cls = AbstractC2032q.f25103a;
                        if (cls != null) {
                            try {
                                rVar = (r) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                            f25106b = rVar;
                        }
                        rVar = f25107c;
                        f25106b = rVar;
                    }
                } finally {
                }
            }
        }
        return rVar;
    }
}
