package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.y1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4104y1 implements AbstractC2515j0 {
    DEFAULT_AC(0),
    OPUS(1),
    AAC(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36651Y;

    EnumC4104y1(int i10) {
        this.f36651Y = i10;
    }

    public static EnumC4104y1 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return AAC;
            }
            return OPUS;
        }
        return DEFAULT_AC;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36651Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
