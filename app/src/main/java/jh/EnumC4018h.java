package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4018h implements AbstractC2515j0 {
    JT_ROOM(0),
    JT_PUBLISHER(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36433Y;

    EnumC4018h(int i10) {
        this.f36433Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36433Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
