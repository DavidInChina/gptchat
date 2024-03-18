package Hf;

import id.AbstractC3557B;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Field field, boolean z10, int i10) {
        super(field, z10, true);
        this.f7722f = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0("field", field);
                return;
            }
            AbstractC3557B.c0("field", field);
            super(field, z10, false);
            return;
        }
        AbstractC3557B.c0("field", field);
        super(field, z10, true);
    }

    @Override // Hf.q, Hf.x
    public final void c(Object[] objArr) {
        switch (this.f7722f) {
            case 1:
                AbstractC3557B.c0("args", objArr);
                super.c(objArr);
                d(kf.q.j3(objArr));
                return;
            default:
                super.c(objArr);
                return;
        }
    }
}
