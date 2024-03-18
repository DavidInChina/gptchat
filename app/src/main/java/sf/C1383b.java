package Sf;

import id.AbstractC3557B;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: Sf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C1383b f16601Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        AbstractC3557B.c0("it", parameterizedType);
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
