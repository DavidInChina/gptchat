package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends A implements f {

    /* renamed from: d  reason: collision with root package name */
    public final Object f7733d;

    public y(Object obj, Method method) {
        super(method, kf.v.f37483Y);
        this.f7733d = obj;
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        return this.f7680a.invoke(this.f7733d, Arrays.copyOf(objArr, objArr.length));
    }
}
