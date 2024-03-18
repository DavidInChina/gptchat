package Sf;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final p f16620Y = new kotlin.jvm.internal.j(1);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return kotlin.jvm.internal.C.f37623a.b(z.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        AbstractC3557B.c0("p0", method);
        return new z(method);
    }
}
