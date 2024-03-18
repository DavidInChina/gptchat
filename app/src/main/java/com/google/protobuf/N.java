package com.google.protobuf;

/* loaded from: classes.dex */
public enum N implements AbstractC2515j0 {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f27425Y;

    N(int i10) {
        this.f27425Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f27425Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
