package Jf;

import id.AbstractC3557B;
import java.util.ServiceLoader;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f9100Y = new kotlin.jvm.internal.o(0);

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        ServiceLoader load = ServiceLoader.load(c.class, c.class.getClassLoader());
        AbstractC3557B.Z(load);
        c cVar = (c) kf.t.g2(load);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
