package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2015d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f25033a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f25034b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f25033a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f25034b = z10;
    }

    public static boolean a() {
        if (f25033a != null && !f25034b) {
            return true;
        }
        return false;
    }
}
