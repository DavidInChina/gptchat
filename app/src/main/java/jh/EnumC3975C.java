package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3975C implements AbstractC2515j0 {
    UPSTREAM(0),
    DOWNSTREAM(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36199Y;

    EnumC3975C(int i10) {
        this.f36199Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36199Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
