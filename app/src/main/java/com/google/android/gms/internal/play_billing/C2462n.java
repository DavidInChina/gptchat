package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.play_billing.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2462n extends AbstractC2446f {

    /* renamed from: h0  reason: collision with root package name */
    public final transient Object[] f26945h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f26946i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient int f26947j0;

    public C2462n(int i10, int i11, Object[] objArr) {
        this.f26945h0 = objArr;
        this.f26946i0 = i10;
        this.f26947j0 = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final boolean I() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        A7.b.Y1(i10, this.f26947j0);
        Object obj = this.f26945h0[i10 + i10 + this.f26946i0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26947j0;
    }
}
