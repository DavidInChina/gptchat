package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10, Method method) {
        super(method, false, 6);
        this.f7727f = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0("method", method);
                return;
            }
            AbstractC3557B.c0("method", method);
            super(method, false, 6);
            return;
        }
        AbstractC3557B.c0("method", method);
        super(method, true, 4);
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        Object[] objArr2;
        Object[] objArr3;
        switch (this.f7727f) {
            case 0:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = kf.q.c3(1, objArr.length, objArr);
                }
                return e(obj, objArr2);
            case 1:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                d(kf.q.j3(objArr));
                if (objArr.length <= 1) {
                    objArr3 = new Object[0];
                } else {
                    objArr3 = kf.q.c3(1, objArr.length, objArr);
                }
                return e(null, objArr3);
            default:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                return e(null, objArr);
        }
    }
}
