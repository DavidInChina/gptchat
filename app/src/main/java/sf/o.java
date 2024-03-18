package Sf;

import kg.C4294f;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final o f16619Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!C4294f.f(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return C4294f.e(simpleName);
    }
}
