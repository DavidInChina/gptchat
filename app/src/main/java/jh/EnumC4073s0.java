package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4073s0 implements AbstractC2515j0 {
    DEFAULT_SEGMENTED_FILE_PROTOCOL(0),
    HLS_PROTOCOL(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36587Y;

    EnumC4073s0(int i10) {
        this.f36587Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36587Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
