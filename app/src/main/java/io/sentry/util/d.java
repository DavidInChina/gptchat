package io.sentry.util;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34775a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f34776b;

    static {
        boolean z10;
        try {
            f34775a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f34775a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                if (Double.valueOf(property).doubleValue() >= 9.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f34776b = z10;
                return;
            }
            f34776b = false;
        } catch (Throwable unused2) {
            f34776b = false;
        }
    }
}
