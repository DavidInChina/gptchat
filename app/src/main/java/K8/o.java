package K8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f9577b;

    public o(Method method) {
        this.f9577b = method;
    }

    @Override // K8.q
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f9577b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e10) {
            throw new RuntimeException("Failed invoking canAccess", e10);
        }
    }
}
