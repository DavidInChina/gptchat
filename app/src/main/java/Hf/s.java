package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s extends w implements f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Method method) {
        super(method, false, 4);
        AbstractC3557B.c0("method", method);
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        return e(null, objArr);
    }
}
