package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import k6.AbstractC4194d;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class u extends w implements f {

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f7726f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(Method method, Object[] objArr) {
        super(method, false, (Type[]) r0.toArray(new Type[0]));
        Collection collection;
        AbstractC3557B.c0("method", method);
        AbstractC3557B.c0("boundReceiverComponents", objArr);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC3557B.b0("getGenericParameterTypes(...)", genericParameterTypes);
        int length = objArr.length;
        if (length >= 0) {
            int length2 = genericParameterTypes.length - length;
            length2 = length2 < 0 ? 0 : length2;
            if (length2 >= 0) {
                if (length2 == 0) {
                    collection = kf.v.f37483Y;
                } else {
                    int length3 = genericParameterTypes.length;
                    if (length2 >= length3) {
                        collection = kf.q.z3(genericParameterTypes);
                    } else if (length2 == 1) {
                        collection = AbstractC4344b.F0(genericParameterTypes[length3 - 1]);
                    } else {
                        ArrayList arrayList = new ArrayList(length2);
                        for (int i10 = length3 - length2; i10 < length3; i10++) {
                            arrayList.add(genericParameterTypes[i10]);
                        }
                        collection = arrayList;
                    }
                }
                this.f7726f = objArr;
                return;
            }
            throw new IllegalArgumentException(AbstractC4194d.v("Requested element count ", length2, " is less than zero.").toString());
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Requested element count ", length, " is less than zero.").toString());
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        G2.d dVar = new G2.d(2);
        dVar.g(this.f7726f);
        dVar.g(objArr);
        ArrayList arrayList = dVar.f5857a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
