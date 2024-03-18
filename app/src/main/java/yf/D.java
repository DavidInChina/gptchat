package Yf;

import bg.AbstractC2205m;
import id.AbstractC3557B;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final D f22304Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC2205m abstractC2205m = (AbstractC2205m) obj;
        AbstractC3557B.c0("it", abstractC2205m);
        return Boolean.valueOf(Modifier.isStatic(((Sf.y) abstractC2205m).a().getModifiers()));
    }
}
