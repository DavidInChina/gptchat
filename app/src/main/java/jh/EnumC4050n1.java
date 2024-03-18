package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.n1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4050n1 implements AbstractC2515j0 {
    STARTING_UP(0),
    SERVING(1),
    SHUTTING_DOWN(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36513Y;

    EnumC4050n1(int i10) {
        this.f36513Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36513Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
