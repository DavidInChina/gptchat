package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.a2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3986a2 implements AbstractC2515j0 {
    RR_UNKNOWN(0),
    RR_SIGNAL_DISCONNECTED(1),
    RR_PUBLISHER_FAILED(2),
    RR_SUBSCRIBER_FAILED(3),
    RR_SWITCH_CANDIDATE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36403Y;

    EnumC3986a2(int i10) {
        this.f36403Y = i10;
    }

    public static EnumC3986a2 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return RR_SWITCH_CANDIDATE;
                    }
                    return RR_SUBSCRIBER_FAILED;
                }
                return RR_PUBLISHER_FAILED;
            }
            return RR_SIGNAL_DISCONNECTED;
        }
        return RR_UNKNOWN;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36403Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
