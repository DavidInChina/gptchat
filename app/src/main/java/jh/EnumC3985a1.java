package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.a1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3985a1 implements AbstractC2515j0 {
    H264_720P_30FPS_3_LAYERS(0),
    H264_1080P_30FPS_3_LAYERS(1),
    H264_540P_25FPS_2_LAYERS(2),
    H264_720P_30FPS_1_LAYER(3),
    H264_1080P_30FPS_1_LAYER(4),
    H264_720P_30FPS_3_LAYERS_HIGH_MOTION(5),
    H264_1080P_30FPS_3_LAYERS_HIGH_MOTION(6),
    H264_540P_25FPS_2_LAYERS_HIGH_MOTION(7),
    H264_720P_30FPS_1_LAYER_HIGH_MOTION(8),
    H264_1080P_30FPS_1_LAYER_HIGH_MOTION(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36395Y;

    EnumC3985a1(int i10) {
        this.f36395Y = i10;
    }

    public static EnumC3985a1 b(int i10) {
        switch (i10) {
            case 0:
                return H264_720P_30FPS_3_LAYERS;
            case 1:
                return H264_1080P_30FPS_3_LAYERS;
            case 2:
                return H264_540P_25FPS_2_LAYERS;
            case 3:
                return H264_720P_30FPS_1_LAYER;
            case 4:
                return H264_1080P_30FPS_1_LAYER;
            case 5:
                return H264_720P_30FPS_3_LAYERS_HIGH_MOTION;
            case 6:
                return H264_1080P_30FPS_3_LAYERS_HIGH_MOTION;
            case 7:
                return H264_540P_25FPS_2_LAYERS_HIGH_MOTION;
            case 8:
                return H264_720P_30FPS_1_LAYER_HIGH_MOTION;
            case 9:
                return H264_1080P_30FPS_1_LAYER_HIGH_MOTION;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36395Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
