package b2;

import androidx.glance.appwidget.protobuf.AbstractC2064y;

/* renamed from: b2.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2116k implements AbstractC2064y {
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f25606Y;

    EnumC2116k(int i10) {
        this.f25606Y = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f25606Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
