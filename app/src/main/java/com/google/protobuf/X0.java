package com.google.protobuf;

/* loaded from: classes2.dex */
public enum X0 implements AbstractC2515j0 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f27511Y;

    X0(int i10) {
        this.f27511Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f27511Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
