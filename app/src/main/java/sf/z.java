package Sf;

import bg.AbstractC2208p;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends y implements AbstractC2208p {

    /* renamed from: a  reason: collision with root package name */
    public final Method f16629a;

    public z(Method method) {
        AbstractC3557B.c0("member", method);
        this.f16629a = method;
    }

    @Override // Sf.y
    public final Member a() {
        return this.f16629a;
    }

    public final List e() {
        Method method = this.f16629a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        AbstractC3557B.b0("getParameterAnnotations(...)", parameterAnnotations);
        return c(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // bg.AbstractC2208p
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f16629a.getTypeParameters();
        AbstractC3557B.b0("getTypeParameters(...)", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new E(typeVariable));
        }
        return arrayList;
    }
}
