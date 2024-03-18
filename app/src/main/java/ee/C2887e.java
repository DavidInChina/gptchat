package ee;

import id.AbstractC3557B;
import jf.C3959i;

/* renamed from: ee.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2887e extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final C2887e f29302Y = new kotlin.jvm.internal.o(3);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C2886d c2886d = (C2886d) obj3;
        AbstractC3557B.c0("item", c2886d);
        return new C3959i(Integer.valueOf(intValue), c2886d.f29298a.invoke(Integer.valueOf(intValue2)));
    }
}
