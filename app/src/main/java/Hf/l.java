package Hf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f7720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Field field, int i10) {
        super(field, true);
        this.f7720e = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0("field", field);
                return;
            }
            AbstractC3557B.c0("field", field);
            super(field, false);
            return;
        }
        AbstractC3557B.c0("field", field);
        super(field, true);
    }

    @Override // Hf.x
    public final void c(Object[] objArr) {
        switch (this.f7720e) {
            case 1:
                AbstractC3557B.c0("args", objArr);
                N.f(this, objArr);
                d(kf.q.j3(objArr));
                return;
            default:
                N.f(this, objArr);
                return;
        }
    }
}
