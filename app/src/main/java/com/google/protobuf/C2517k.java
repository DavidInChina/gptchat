package com.google.protobuf;

/* renamed from: com.google.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2517k extends AbstractC2520l {

    /* renamed from: Y  reason: collision with root package name */
    public int f27563Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final int f27564Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2534q f27565h0;

    public C2517k(AbstractC2534q abstractC2534q) {
        this.f27565h0 = abstractC2534q;
        this.f27564Z = abstractC2534q.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f27563Y < this.f27564Z) {
            return true;
        }
        return false;
    }
}
