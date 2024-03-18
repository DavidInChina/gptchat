package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends w implements f {

    /* renamed from: f  reason: collision with root package name */
    public final Object f7725f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Object obj, Method method) {
        super(method, false, (Type[]) r0);
        Object obj2;
        AbstractC3557B.c0("method", method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes);
        if (genericParameterTypes.length <= 1) {
            obj2 = new Type[0];
        } else {
            obj2 = kf.q.c3(1, genericParameterTypes.length, genericParameterTypes);
        }
        this.f7725f = obj;
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        G2.d dVar = new G2.d(2);
        dVar.f(this.f7725f);
        dVar.g(objArr);
        ArrayList arrayList = dVar.f5857a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
