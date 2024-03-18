package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.q2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4066q2 implements AbstractC2515j0 {
    DEFAULT_VC(0),
    H264_BASELINE(1),
    H264_MAIN(2),
    H264_HIGH(3),
    VP8(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36570Y;

    EnumC4066q2(int i10) {
        this.f36570Y = i10;
    }

    public static EnumC4066q2 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return VP8;
                    }
                    return H264_HIGH;
                }
                return H264_MAIN;
            }
            return H264_BASELINE;
        }
        return DEFAULT_VC;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36570Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
