package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends A {
    @Override // Hf.g
    public final Object call(Object[] objArr) {
        Object[] objArr2;
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        Object obj = objArr[0];
        if (objArr.length <= 1) {
            objArr2 = new Object[0];
        } else {
            objArr2 = kf.q.c3(1, objArr.length, objArr);
        }
        return this.f7680a.invoke(obj, Arrays.copyOf(objArr2, objArr2.length));
    }
}
