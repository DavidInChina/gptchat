package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum W implements AbstractC2515j0 {
    H264_720P_30(0),
    H264_720P_60(1),
    H264_1080P_30(2),
    H264_1080P_60(3),
    PORTRAIT_H264_720P_30(4),
    PORTRAIT_H264_720P_60(5),
    PORTRAIT_H264_1080P_30(6),
    PORTRAIT_H264_1080P_60(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36362Y;

    W(int i10) {
        this.f36362Y = i10;
    }

    public static W b(int i10) {
        switch (i10) {
            case 0:
                return H264_720P_30;
            case 1:
                return H264_720P_60;
            case 2:
                return H264_1080P_30;
            case 3:
                return H264_1080P_60;
            case 4:
                return PORTRAIT_H264_720P_30;
            case 5:
                return PORTRAIT_H264_720P_60;
            case 6:
                return PORTRAIT_H264_1080P_30;
            case 7:
                return PORTRAIT_H264_1080P_60;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36362Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
