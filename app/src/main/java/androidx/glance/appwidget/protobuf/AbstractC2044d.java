package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2044d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f25207a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f25208b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f25207a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f25208b = z10;
    }

    public static boolean a() {
        if (f25207a != null && !f25208b) {
            return true;
        }
        return false;
    }
}
