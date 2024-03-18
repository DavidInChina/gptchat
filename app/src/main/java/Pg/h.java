package Pg;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.k implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final h f14202Y = new kotlin.jvm.internal.k(3, k.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k kVar = (k) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = k.f14209i0;
        kVar.getClass();
        if (obj3 == m.f14233l) {
            obj3 = new q(kVar.v());
        }
        return new s(obj3);
    }
}
