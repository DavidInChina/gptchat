package b2;

import androidx.glance.appwidget.protobuf.AbstractC2064y;

/* renamed from: b2.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2115j implements AbstractC2064y {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_TYPE(0),
    ROW(1),
    COLUMN(2),
    BOX(3),
    TEXT(4),
    /* JADX INFO: Fake field, exist only in values array */
    LAZY_COLUMN(5),
    /* JADX INFO: Fake field, exist only in values array */
    LIST_ITEM(6),
    /* JADX INFO: Fake field, exist only in values array */
    CHECK_BOX(7),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTON(8),
    SPACER(9),
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH(10),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_REMOTE_VIEWS(11),
    REMOTE_VIEWS_ROOT(12),
    IMAGE(13),
    /* JADX INFO: Fake field, exist only in values array */
    VERTICAL_GRID_ITEM(14),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_GROUP(15),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_BUTTON(16),
    /* JADX INFO: Fake field, exist only in values array */
    VERTICAL_GRID_ITEM(17),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_GROUP(18),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_BUTTON(19),
    RADIO_ROW(20),
    RADIO_COLUMN(21),
    SIZE_BOX(22),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f25602Y;

    EnumC2115j(int i10) {
        this.f25602Y = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f25602Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
