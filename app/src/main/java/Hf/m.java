package Hf;

import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class m extends x {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Field field, boolean z10) {
        super(field, r0, r4, new Type[0]);
        Class<?> cls;
        Type genericType = field.getGenericType();
        AbstractC3557B.b0("getGenericType(...)", genericType);
        if (z10) {
            cls = field.getDeclaringClass();
        } else {
            cls = null;
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
        return field.get(obj);
    }
}
