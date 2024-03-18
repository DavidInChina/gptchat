package Ac;

import Fd.u;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.n;

/* loaded from: classes.dex */
public final class b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final b f785Y = new o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        u uVar = (u) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        AbstractC3557B.c0("$this$setOnEach", uVar);
        return u.e(uVar, Boolean.valueOf(!booleanValue), false, false, 29);
    }
}
