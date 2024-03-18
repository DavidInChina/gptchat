package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class X extends AbstractC2490b {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2497d0 f27506Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC2497d0 f27507Z;

    public X(AbstractC2497d0 abstractC2497d0) {
        this.f27506Y = abstractC2497d0;
        if (!abstractC2497d0.isMutable()) {
            this.f27507Z = abstractC2497d0.newMutableInstance();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void g(AbstractC2497d0 abstractC2497d0, Object obj) {
        C2495c1.f27531c.b(abstractC2497d0).c(abstractC2497d0, obj);
    }

    public final AbstractC2497d0 b() {
        AbstractC2497d0 c10 = c();
        if (c10.isInitialized()) {
            return c10;
        }
        throw new u1();
    }

    public final AbstractC2497d0 c() {
        if (!this.f27507Z.isMutable()) {
            return this.f27507Z;
        }
        this.f27507Z.makeImmutable();
        return this.f27507Z;
    }

    public final Object clone() {
        X newBuilderForType = this.f27506Y.newBuilderForType();
        newBuilderForType.f27507Z = c();
        return newBuilderForType;
    }

    public final void d() {
        if (!this.f27507Z.isMutable()) {
            AbstractC2497d0 newMutableInstance = this.f27506Y.newMutableInstance();
            g(newMutableInstance, this.f27507Z);
            this.f27507Z = newMutableInstance;
        }
    }

    public final void e(AbstractC2543v abstractC2543v, J j6) {
        d();
        try {
            AbstractC2504f1 b10 = C2495c1.f27531c.b(this.f27507Z);
            AbstractC2497d0 abstractC2497d0 = this.f27507Z;
            T0.m mVar = abstractC2543v.f27625d;
            if (mVar == null) {
                mVar = new T0.m(abstractC2543v);
            }
            b10.i(abstractC2497d0, mVar, j6);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }

    public final void f(AbstractC2497d0 abstractC2497d0) {
        if (this.f27506Y.equals(abstractC2497d0)) {
            return;
        }
        d();
        g(this.f27507Z, abstractC2497d0);
    }

    @Override // com.google.protobuf.N0
    public final M0 getDefaultInstanceForType() {
        return this.f27506Y;
    }

    @Override // com.google.protobuf.N0
    public final boolean isInitialized() {
        return AbstractC2497d0.isInitialized(this.f27507Z, false);
    }
}
