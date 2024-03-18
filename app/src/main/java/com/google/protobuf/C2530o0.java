package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;
import jh.EnumC4051n2;

/* renamed from: com.google.protobuf.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2530o0 extends AbstractList {

    /* renamed from: Y  reason: collision with root package name */
    public final List f27572Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC2527n0 f27573Z;

    public C2530o0(AbstractC2524m0 abstractC2524m0, AbstractC2527n0 abstractC2527n0) {
        this.f27572Y = abstractC2524m0;
        this.f27573Z = abstractC2527n0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object obj = this.f27572Y.get(i10);
        ((jh.L1) this.f27573Z).getClass();
        EnumC4051n2 b10 = EnumC4051n2.b(((Integer) obj).intValue());
        if (b10 == null) {
            return EnumC4051n2.UNRECOGNIZED;
        }
        return b10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27572Y.size();
    }
}
