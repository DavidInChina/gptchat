package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum O1 implements AbstractC2515j0 {
    NONE(0),
    GCM(1),
    CUSTOM(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36302Y;

    O1(int i10) {
        this.f36302Y = i10;
    }

    public static O1 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return CUSTOM;
            }
            return GCM;
        }
        return NONE;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36302Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
