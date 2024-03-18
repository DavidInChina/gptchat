package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum R0 implements AbstractC2515j0 {
    OPUS_STEREO_96KBPS(0),
    OPUS_MONO_64KBS(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36328Y;

    R0(int i10) {
        this.f36328Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36328Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
