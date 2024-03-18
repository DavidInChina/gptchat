package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends x implements f {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f7716e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f7717f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Constructor constructor, Object obj, int i10) {
        super(constructor, r8, null, (Type[]) r1);
        Object obj2;
        this.f7716e = i10;
        if (i10 != 1) {
            AbstractC3557B.c0("constructor", constructor);
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC3557B.b0("getDeclaringClass(...)", declaringClass);
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes);
            if (genericParameterTypes.length <= 2) {
                obj2 = new Type[0];
            } else {
                obj2 = kf.q.c3(1, genericParameterTypes.length - 1, genericParameterTypes);
            }
            this.f7717f = obj;
            return;
        }
        AbstractC3557B.c0("constructor", constructor);
        Class declaringClass2 = constructor.getDeclaringClass();
        AbstractC3557B.b0("getDeclaringClass(...)", declaringClass2);
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes2);
        super(constructor, declaringClass2, null, genericParameterTypes2);
        this.f7717f = obj;
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        int i10 = this.f7716e;
        Object obj = this.f7717f;
        Member member = this.f7729a;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                G2.d dVar = new G2.d(3);
                dVar.f(obj);
                dVar.g(objArr);
                dVar.f(null);
                ArrayList arrayList = dVar.f5857a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                G2.d dVar2 = new G2.d(2);
                dVar2.f(obj);
                dVar2.g(objArr);
                ArrayList arrayList2 = dVar2.f5857a;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
