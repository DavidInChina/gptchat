package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum R1 implements AbstractC2515j0 {
    JOINING(0),
    JOINED(1),
    ACTIVE(2),
    DISCONNECTED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36335Y;

    R1(int i10) {
        this.f36335Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36335Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
