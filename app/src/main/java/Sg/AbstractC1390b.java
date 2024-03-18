package Sg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Sg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1390b extends v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16647a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1390b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = AbstractC1389a.f16641a;

    @Override // Sg.v
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16647a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Q1.u uVar = AbstractC1389a.f16641a;
        if (obj2 == uVar) {
            Q1.u c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == uVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, c10)) {
                        obj2 = c10;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != uVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Q1.u c(Object obj);
}
