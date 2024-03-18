package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes2.dex */
public enum F1 implements AbstractC2515j0 {
    POOR(0),
    GOOD(1),
    EXCELLENT(2),
    LOST(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36233Y;

    F1(int i10) {
        this.f36233Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36233Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
