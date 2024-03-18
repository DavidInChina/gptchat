package Y0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final float f22021a = 0.5f;

    /* renamed from: b  reason: collision with root package name */
    public static final float f22022b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public static final float f22023c = 1.0f;

    static {
        a(0.0f);
        a(0.5f);
        a(-1.0f);
        a(1.0f);
    }

    public static void a(float f6) {
        if ((0.0f <= f6 && f6 <= 1.0f) || f6 == -1.0f) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
    }
}
