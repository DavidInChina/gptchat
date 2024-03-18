package Sg;

import Ng.H;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16672Y = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16673Z = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev$volatile");

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16674h0 = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        r6 = ((Sg.w) r6).f16685a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r5.get(r4) == r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16673Z;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            p pVar2 = pVar;
            while (true) {
                p pVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16672Y;
                    Object obj = atomicReferenceFieldUpdater2.get(pVar2);
                    if (obj == this) {
                        if (pVar == pVar2) {
                            return pVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, pVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != pVar) {
                                break;
                            }
                        }
                        return pVar2;
                    } else if (m()) {
                        return null;
                    } else {
                        if (obj == null) {
                            return pVar2;
                        }
                        if (obj instanceof v) {
                            ((v) obj).a(pVar2);
                            break;
                        } else if (obj instanceof w) {
                            if (pVar3 != null) {
                                break;
                            }
                            pVar2 = (p) atomicReferenceFieldUpdater.get(pVar2);
                        } else {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", obj);
                            pVar3 = pVar2;
                            pVar2 = (p) obj;
                        }
                    }
                }
                pVar2 = pVar3;
            }
        }
    }

    public final void g(p pVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16673Z;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(pVar);
            if (i() != pVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(pVar, pVar2, this)) {
                if (atomicReferenceFieldUpdater.get(pVar) != pVar2) {
                    break;
                }
            }
            if (m()) {
                pVar.f();
                return;
            }
            return;
        }
    }

    public final Object i() {
        while (true) {
            Object obj = f16672Y.get(this);
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).a(this);
        }
    }

    public final p j() {
        w wVar;
        p pVar;
        Object i10 = i();
        if (i10 instanceof w) {
            wVar = (w) i10;
        } else {
            wVar = null;
        }
        if (wVar == null || (pVar = wVar.f16685a) == null) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", i10);
            return (p) i10;
        }
        return pVar;
    }

    public boolean m() {
        return i() instanceof w;
    }

    public String toString() {
        return new kotlin.jvm.internal.w(this, H.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + H.q(this);
    }
}
