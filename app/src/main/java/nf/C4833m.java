package nf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.C3960j;
import of.EnumC5000a;
import pf.AbstractC5157d;

/* renamed from: nf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4833m implements AbstractC4825e, AbstractC5157d {

    /* renamed from: Z  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f40335Z = AtomicReferenceFieldUpdater.newUpdater(C4833m.class, Object.class, "result");

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4825e f40336Y;
    private volatile Object result;

    public C4833m(EnumC5000a enumC5000a, AbstractC4825e abstractC4825e) {
        this.f40336Y = abstractC4825e;
        this.result = enumC5000a;
    }

    public final Object b() {
        Object obj = this.result;
        EnumC5000a enumC5000a = EnumC5000a.f41329Z;
        if (obj == enumC5000a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40335Z;
            EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC5000a, enumC5000a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC5000a) {
                    obj = this.result;
                }
            }
            return EnumC5000a.f41328Y;
        }
        if (obj == EnumC5000a.f41330h0) {
            return EnumC5000a.f41328Y;
        }
        if (!(obj instanceof C3960j)) {
            return obj;
        }
        throw ((C3960j) obj).f36157Y;
    }

    @Override // pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        AbstractC4825e abstractC4825e = this.f40336Y;
        if (abstractC4825e instanceof AbstractC5157d) {
            return (AbstractC5157d) abstractC4825e;
        }
        return null;
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return this.f40336Y.getContext();
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC5000a enumC5000a = EnumC5000a.f41329Z;
            if (obj2 == enumC5000a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40335Z;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC5000a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC5000a) {
                        break;
                    }
                }
                return;
            }
            EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
            if (obj2 == enumC5000a2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40335Z;
                EnumC5000a enumC5000a3 = EnumC5000a.f41330h0;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC5000a2, enumC5000a3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != enumC5000a2) {
                        break;
                    }
                }
                this.f40336Y.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f40336Y;
    }

    public C4833m(AbstractC4825e abstractC4825e) {
        this(EnumC5000a.f41329Z, abstractC4825e);
    }
}
