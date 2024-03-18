package K8;

import java.lang.reflect.Method;
import n2.C4711b;

/* loaded from: classes2.dex */
public final class s extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f9579b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9580c;

    public s(Object obj, Method method) {
        this.f9579b = method;
        this.f9580c = obj;
    }

    @Override // K8.w
    public final Object a(Class cls) {
        String e10 = C4711b.e(cls);
        if (e10 == null) {
            return this.f9579b.invoke(this.f9580c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e10));
    }
}
