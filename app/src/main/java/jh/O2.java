package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum O2 implements AbstractC2515j0 {
    UDP(0),
    TCP(1),
    TLS(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36308Y;

    O2(int i10) {
        this.f36308Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36308Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
