package Fe;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f5364a;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z10 = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z10 = true;
        }
        f5364a = z10;
    }
}
