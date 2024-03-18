package Hf;

import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class w extends x {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7728e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ w(Method method, boolean z10, int i10) {
        this(method, z10, r4);
        z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes);
    }

    public final Object e(Object obj, Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        Object invoke = ((Method) this.f7729a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        if (this.f7728e) {
            return jf.y.f36177a;
        }
        return invoke;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(Method method, boolean z10, Type[] typeArr) {
        super(method, r0, z10 ? method.getDeclaringClass() : null, typeArr);
        Type genericReturnType = method.getGenericReturnType();
        AbstractC3557B.b0("getGenericReturnType(...)", genericReturnType);
        this.f7728e = AbstractC3557B.K(genericReturnType, Void.TYPE);
    }
}
