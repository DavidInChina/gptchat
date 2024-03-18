package b2;

import androidx.glance.appwidget.protobuf.AbstractC2064y;

/* renamed from: b2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2106a implements AbstractC2064y {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f25576Y;

    EnumC2106a(int i10) {
        this.f25576Y = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f25576Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
