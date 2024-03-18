package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.o2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4056o2 implements AbstractC2515j0 {
    AUDIO(0),
    VIDEO(1),
    DATA(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36534Y;

    EnumC4056o2(int i10) {
        this.f36534Y = i10;
    }

    public static EnumC4056o2 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return DATA;
            }
            return VIDEO;
        }
        return AUDIO;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36534Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
