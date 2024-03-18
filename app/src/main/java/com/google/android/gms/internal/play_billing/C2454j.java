package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.play_billing.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454j extends AbstractC2446f {

    /* renamed from: j0  reason: collision with root package name */
    public static final C2454j f26930j0 = new C2454j(0, new Object[0]);

    /* renamed from: h0  reason: collision with root package name */
    public final transient Object[] f26931h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f26932i0;

    public C2454j(int i10, Object[] objArr) {
        this.f26931h0 = objArr;
        this.f26932i0 = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final boolean I() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final Object[] M() {
        return this.f26931h0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2446f, com.google.android.gms.internal.play_billing.AbstractC2440c
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f26931h0;
        int i10 = this.f26932i0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        A7.b.Y1(i10, this.f26932i0);
        Object obj = this.f26931h0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final int r() {
        return this.f26932i0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26932i0;
    }
}
