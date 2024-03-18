package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2458l extends AbstractC2452i {

    /* renamed from: h0  reason: collision with root package name */
    public final transient AbstractC2450h f26938h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient Object[] f26939i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient int f26940j0;

    public C2458l(AbstractC2450h abstractC2450h, Object[] objArr, int i10) {
        this.f26938h0 = abstractC2450h;
        this.f26939i0 = objArr;
        this.f26940j0 = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2452i
    public final AbstractC2446f T() {
        return new C2456k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f26938h0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final int f(Object[] objArr) {
        return y().f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return y().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26940j0;
    }
}
