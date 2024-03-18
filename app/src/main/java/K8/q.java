package K8;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f9578a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [K8.q] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r12;
        if (g.f9550a >= 9) {
            try {
                r12 = new o(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
            if (r12 == 0) {
                r12 = new Object();
            }
            f9578a = r12;
        }
        r12 = 0;
        if (r12 == 0) {
        }
        f9578a = r12;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
