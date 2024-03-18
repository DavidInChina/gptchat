package rf;

import id.AbstractC3557B;
import java.lang.reflect.Method;

/* renamed from: rf.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5489a {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f44981a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC3557B.Z(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (AbstractC3557B.K(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC3557B.b0("getParameterTypes(...)", parameterTypes);
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (AbstractC3557B.K(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f44981a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !AbstractC3557B.K(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
