package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4058p implements AbstractC2515j0 {
    WS_AVAILABLE(0),
    WS_FULL(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36547Y;

    EnumC4058p(int i10) {
        this.f36547Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36547Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
