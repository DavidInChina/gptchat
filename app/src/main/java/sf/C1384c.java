package Sf;

import id.AbstractC3557B;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: Sf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384c extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C1384c f16602Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        AbstractC3557B.c0("it", parameterizedType);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC3557B.b0("getActualTypeArguments(...)", actualTypeArguments);
        return kf.q.R2(actualTypeArguments);
    }
}
