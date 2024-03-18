package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum U implements AbstractC2515j0 {
    DEFAULT_FILETYPE(0),
    MP4(1),
    OGG(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36351Y;

    U(int i10) {
        this.f36351Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36351Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
