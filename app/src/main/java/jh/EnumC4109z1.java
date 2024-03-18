package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.z1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4109z1 implements AbstractC2515j0 {
    UNSET(0),
    DISABLED(1),
    ENABLED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36657Y;

    EnumC4109z1(int i10) {
        this.f36657Y = i10;
    }

    public static EnumC4109z1 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return ENABLED;
            }
            return DISABLED;
        }
        return UNSET;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36657Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
