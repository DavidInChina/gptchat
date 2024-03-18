package com.google.protobuf;

/* renamed from: com.google.protobuf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2523m implements AbstractC2518k0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27569Y;

    public /* synthetic */ C2523m(int i10) {
        this.f27569Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2518k0
    public final AbstractC2515j0 a(int i10) {
        switch (this.f27569Y) {
            case 2:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return N.CARDINALITY_REPEATED;
                        }
                        return N.CARDINALITY_REQUIRED;
                    }
                    return N.CARDINALITY_OPTIONAL;
                }
                return N.CARDINALITY_UNKNOWN;
            case 3:
                return O.b(i10);
            case 4:
                if (i10 != 0) {
                    return null;
                }
                return X0.NULL_VALUE;
            default:
                return p1.b(i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2523m(int i10, int i11) {
        this(0);
        this.f27569Y = i10;
        if (i10 != 1) {
        } else {
            this(1);
        }
    }
}
