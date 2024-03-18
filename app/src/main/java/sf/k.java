package Sf;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final k f16615Y = new kotlin.jvm.internal.j(1);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return kotlin.jvm.internal.C.f37623a.b(t.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        AbstractC3557B.c0("p0", constructor);
        return new t(constructor);
    }
}
