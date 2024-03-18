package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.play_billing.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2456k extends AbstractC2446f {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2458l f26935h0;

    public C2456k(C2458l c2458l) {
        this.f26935h0 = c2458l;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final boolean I() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C2458l c2458l = this.f26935h0;
        A7.b.Y1(i10, c2458l.f26940j0);
        int i11 = i10 + i10;
        Object[] objArr = c2458l.f26939i0;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26935h0.f26940j0;
    }
}
