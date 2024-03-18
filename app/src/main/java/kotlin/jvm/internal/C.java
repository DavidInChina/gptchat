package kotlin.jvm.internal;

import Gf.w0;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public static final D f37623a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.D] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r02 = 0;
        try {
            r02 = (D) w0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        f37623a = r02;
    }

    public static Df.w a(Class cls) {
        D d10 = f37623a;
        return d10.k(d10.b(cls), Collections.emptyList());
    }
}
