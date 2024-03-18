package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class q extends x {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7723e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Field field, boolean z10, boolean z11) {
        super(field, r0, r7, new Type[]{r1});
        Class<?> cls;
        Class cls2 = Void.TYPE;
        AbstractC3557B.b0("TYPE", cls2);
        if (z11) {
            cls = field.getDeclaringClass();
        } else {
            cls = null;
        }
        Type genericType = field.getGenericType();
        AbstractC3557B.b0("getGenericType(...)", genericType);
        this.f7723e = z10;
    }

    @Override // Hf.x
    public void c(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        if (this.f7723e && kf.q.s3(objArr) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    @Override // Hf.g
    public Object call(Object[] objArr) {
        Object obj;
        AbstractC3557B.c0("args", objArr);
        c(objArr);
        Field field = (Field) this.f7729a;
        if (this.f7731c != null) {
            obj = kf.q.i3(objArr);
        } else {
            obj = null;
        }
        field.set(obj, kf.q.s3(objArr));
        return jf.y.f36177a;
    }
}
