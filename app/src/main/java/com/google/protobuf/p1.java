package com.google.protobuf;

/* loaded from: classes2.dex */
public enum p1 implements AbstractC2515j0 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f27580Y;

    p1(int i10) {
        this.f27580Y = i10;
    }

    public static p1 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f27580Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
