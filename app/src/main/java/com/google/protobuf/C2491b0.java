package com.google.protobuf;

/* renamed from: com.google.protobuf.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2491b0 extends G {

    /* renamed from: a  reason: collision with root package name */
    public final M0 f27519a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27520b;

    /* renamed from: c  reason: collision with root package name */
    public final M0 f27521c;

    /* renamed from: d  reason: collision with root package name */
    public final C2488a0 f27522d;

    public C2491b0(M0 m02, Object obj, M0 m03, C2488a0 c2488a0) {
        if (m02 != null) {
            if (c2488a0.f27516h0 == N1.MESSAGE && m03 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f27519a = m02;
            this.f27520b = obj;
            this.f27521c = m03;
            this.f27522d = c2488a0;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public final Object a(Object obj) {
        C2488a0 c2488a0 = this.f27522d;
        if (c2488a0.f27516h0.f27433Y == O1.f27465n0) {
            return c2488a0.f27514Y.a(((Integer) obj).intValue());
        }
        return obj;
    }

    public final Object b(Object obj) {
        if (this.f27522d.f27516h0.f27433Y == O1.f27465n0) {
            return Integer.valueOf(((AbstractC2515j0) obj).a());
        }
        return obj;
    }
}
