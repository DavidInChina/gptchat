package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class B extends C {

    /* renamed from: Z  reason: collision with root package name */
    public int f26828Z = 0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f26829h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E f26830i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e10) {
        super(0);
        this.f26830i0 = e10;
        this.f26829h0 = e10.I();
    }

    @Override // com.google.android.gms.internal.play_billing.C
    public final byte a() {
        int i10 = this.f26828Z;
        if (i10 < this.f26829h0) {
            this.f26828Z = i10 + 1;
            return this.f26830i0.y(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26828Z < this.f26829h0;
    }
}
