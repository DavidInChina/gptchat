package D1;

import android.view.View;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f3310a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f3311b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f3312c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3313d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3310a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3311b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3312c = declaredField3;
            declaredField3.setAccessible(true);
            f3313d = true;
        } catch (ReflectiveOperationException e10) {
            AbstractC3612c.s("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }
}
