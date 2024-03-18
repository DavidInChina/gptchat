package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends x {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f7718e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Constructor constructor, int i10) {
        super(constructor, r7, null, (Type[]) r1);
        Object obj;
        this.f7718e = i10;
        Class<?> cls = null;
        if (i10 != 1) {
            AbstractC3557B.c0("constructor", constructor);
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC3557B.b0("getDeclaringClass(...)", declaringClass);
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes);
            if (genericParameterTypes.length <= 1) {
                obj = new Type[0];
            } else {
                obj = kf.q.c3(0, genericParameterTypes.length - 1, genericParameterTypes);
            }
            return;
        }
        AbstractC3557B.c0("constructor", constructor);
        Class declaringClass2 = constructor.getDeclaringClass();
        AbstractC3557B.b0("getDeclaringClass(...)", declaringClass2);
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes2);
        super(constructor, declaringClass2, cls, genericParameterTypes2);
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        int i10 = this.f7718e;
        Member member = this.f7729a;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                G2.d dVar = new G2.d(2);
                dVar.g(objArr);
                dVar.f(null);
                ArrayList arrayList = dVar.f5857a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
