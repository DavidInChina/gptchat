package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.u2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4085u2 implements AbstractC2515j0 {
    LOW(0),
    MEDIUM(1),
    HIGH(2),
    OFF(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36635Y;

    EnumC4085u2(int i10) {
        this.f36635Y = i10;
    }

    public static EnumC4085u2 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return OFF;
                }
                return HIGH;
            }
            return MEDIUM;
        }
        return LOW;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36635Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
