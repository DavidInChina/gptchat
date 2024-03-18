package Sg;

import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Sg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1393e {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16650Y = AtomicReferenceFieldUpdater.newUpdater(AbstractC1393e.class, Object.class, "_next$volatile");

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16651Z = AtomicReferenceFieldUpdater.newUpdater(AbstractC1393e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC1393e(AbstractC1393e abstractC1393e) {
        this._prev$volatile = abstractC1393e;
    }

    public final void a() {
        f16651Z.set(this, null);
    }

    public final AbstractC1393e b() {
        Object obj = f16650Y.get(this);
        if (obj == AbstractC1389a.f16642b) {
            return null;
        }
        return (AbstractC1393e) obj;
    }

    public abstract boolean c();

    public final void d() {
        AbstractC1393e abstractC1393e;
        AbstractC1393e b10;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16651Z;
            AbstractC1393e abstractC1393e2 = (AbstractC1393e) atomicReferenceFieldUpdater.get(this);
            while (abstractC1393e2 != null && abstractC1393e2.c()) {
                abstractC1393e2 = (AbstractC1393e) atomicReferenceFieldUpdater.get(abstractC1393e2);
            }
            AbstractC1393e b11 = b();
            AbstractC3557B.Z(b11);
            while (b11.c() && (b10 = b11.b()) != null) {
                b11 = b10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b11);
                if (((AbstractC1393e) obj) == null) {
                    abstractC1393e = null;
                } else {
                    abstractC1393e = abstractC1393e2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b11, obj, abstractC1393e)) {
                    if (atomicReferenceFieldUpdater.get(b11) != obj) {
                        break;
                    }
                }
            }
            if (abstractC1393e2 != null) {
                f16650Y.set(abstractC1393e2, b11);
            }
            if (!b11.c() || b11.b() == null) {
                if (abstractC1393e2 == null || !abstractC1393e2.c()) {
                    return;
                }
            }
        }
    }
}
