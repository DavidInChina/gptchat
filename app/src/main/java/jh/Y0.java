package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes2.dex */
public enum Y0 implements AbstractC2515j0 {
    ENDPOINT_INACTIVE(0),
    ENDPOINT_BUFFERING(1),
    ENDPOINT_PUBLISHING(2),
    ENDPOINT_ERROR(3),
    ENDPOINT_COMPLETE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36376Y;

    Y0(int i10) {
        this.f36376Y = i10;
    }

    public static Y0 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return ENDPOINT_COMPLETE;
                    }
                    return ENDPOINT_ERROR;
                }
                return ENDPOINT_PUBLISHING;
            }
            return ENDPOINT_BUFFERING;
        }
        return ENDPOINT_INACTIVE;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36376Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
