package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum M1 implements AbstractC2515j0 {
    UNKNOWN_REASON(0),
    CLIENT_INITIATED(1),
    DUPLICATE_IDENTITY(2),
    SERVER_SHUTDOWN(3),
    PARTICIPANT_REMOVED(4),
    ROOM_DELETED(5),
    STATE_MISMATCH(6),
    JOIN_FAILURE(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36286Y;

    M1(int i10) {
        this.f36286Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36286Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
