package Hf;

import id.AbstractC3557B;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Method f7680a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7681b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f7682c;

    public A(Method method, List list) {
        this.f7680a = method;
        this.f7681b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC3557B.b0("getReturnType(...)", returnType);
        this.f7682c = returnType;
    }

    @Override // Hf.g
    public final List a() {
        return this.f7681b;
    }

    @Override // Hf.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // Hf.g
    public final Type getReturnType() {
        return this.f7682c;
    }
}
