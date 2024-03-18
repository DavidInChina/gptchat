package Hf;

import id.AbstractC3557B;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class n extends q implements f {

    /* renamed from: f  reason: collision with root package name */
    public final Object f7721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Field field, boolean z10, Object obj) {
        super(field, z10, false);
        AbstractC3557B.c0("field", field);
        this.f7721f = obj;
    }

    @Override // Hf.q, Hf.g
    public final Object call(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        c(objArr);
        ((Field) this.f7729a).set(this.f7721f, kf.q.i3(objArr));
        return jf.y.f36177a;
    }
}
