package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2460m extends AbstractC2452i {

    /* renamed from: h0  reason: collision with root package name */
    public final transient AbstractC2450h f26942h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient AbstractC2446f f26943i0;

    public C2460m(AbstractC2450h abstractC2450h, C2462n c2462n) {
        this.f26942h0 = abstractC2450h;
        this.f26943i0 = c2462n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f26942h0.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final int f(Object[] objArr) {
        return this.f26943i0.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f26943i0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C2464o) this.f26942h0).f26951k0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2452i, com.google.android.gms.internal.play_billing.AbstractC2440c
    public final AbstractC2446f y() {
        return this.f26943i0;
    }
}
