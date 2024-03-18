package K8;

import java.lang.reflect.Method;
import n2.C4711b;

/* loaded from: classes2.dex */
public final class t extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f9581b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9582c;

    public t(int i10, Method method) {
        this.f9581b = method;
        this.f9582c = i10;
    }

    @Override // K8.w
    public final Object a(Class cls) {
        String e10 = C4711b.e(cls);
        if (e10 == null) {
            return this.f9581b.invoke(null, cls, Integer.valueOf(this.f9582c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e10));
    }
}
