package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.e2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4006e2 implements AbstractC2515j0 {
    Standard(0),
    Cloud(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36422Y;

    EnumC4006e2(int i10) {
        this.f36422Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36422Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
