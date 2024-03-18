package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.m3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4047m3 implements AbstractC2515j0 {
    PUBLISHER(0),
    SUBSCRIBER(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36507Y;

    EnumC4047m3(int i10) {
        this.f36507Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36507Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
