package K8;

import java.lang.reflect.Method;
import n2.C4711b;

/* loaded from: classes2.dex */
public final class u extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f9583b;

    public u(Method method) {
        this.f9583b = method;
    }

    @Override // K8.w
    public final Object a(Class cls) {
        String e10 = C4711b.e(cls);
        if (e10 == null) {
            return this.f9583b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e10));
    }
}
