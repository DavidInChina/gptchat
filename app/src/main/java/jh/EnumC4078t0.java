package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4078t0 implements AbstractC2515j0 {
    INDEX(0),
    TIMESTAMP(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36628Y;

    EnumC4078t0(int i10) {
        this.f36628Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36628Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
