package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes2.dex */
public enum D0 implements AbstractC2515j0 {
    DEFAULT_PROTOCOL(0),
    RTMP(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36218Y;

    D0(int i10) {
        this.f36218Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36218Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
