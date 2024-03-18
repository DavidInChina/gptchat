package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class j extends m implements f {

    /* renamed from: e  reason: collision with root package name */
    public final Object f7719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Field field, Object obj) {
        super(field, false);
        AbstractC3557B.c0("field", field);
        this.f7719e = obj;
    }

    @Override // Hf.m, Hf.g
    public final Object call(Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        return ((Field) this.f7729a).get(this.f7719e);
    }
}
