package Sh;

import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class H extends Enum implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final H f16700Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ H[] f16701Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Sh.H] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f16700Y = r12;
        f16701Z = new H[]{r12};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f16701Z.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Method method = (Method) obj;
        Method method2 = (Method) obj2;
        if (method == method2) {
            return 0;
        }
        int compareTo = method.getName().compareTo(method2.getName());
        if (compareTo == 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            if (parameterTypes.length < parameterTypes2.length) {
                return -1;
            }
            if (parameterTypes.length > parameterTypes2.length) {
                return 1;
            }
            for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                int compareTo2 = parameterTypes[i10].getName().compareTo(parameterTypes2[i10].getName());
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            return method.getReturnType().getName().compareTo(method2.getReturnType().getName());
        }
        return compareTo;
    }
}
