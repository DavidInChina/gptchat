package com.google.protobuf;

/* renamed from: com.google.protobuf.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2488a0 implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2518k0 f27514Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f27515Z;

    /* renamed from: h0  reason: collision with root package name */
    public final N1 f27516h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f27517i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f27518j0;

    public C2488a0(AbstractC2518k0 abstractC2518k0, int i10, N1 n12, boolean z10, boolean z11) {
        this.f27514Y = abstractC2518k0;
        this.f27515Z = i10;
        this.f27516h0 = n12;
        this.f27517i0 = z10;
        this.f27518j0 = z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27515Z - ((C2488a0) obj).f27515Z;
    }
}
