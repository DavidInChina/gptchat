package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.j2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4031j2 implements AbstractC2515j0 {
    SE_UNKNOWN(0),
    SE_CODEC_UNSUPPORTED(1),
    SE_TRACK_NOTFOUND(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36449Y;

    EnumC4031j2(int i10) {
        this.f36449Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36449Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
