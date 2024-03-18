package Hi;

/* loaded from: classes2.dex */
public enum o {
    NO_PROCESS(1),
    NO_PROCESS_FIRST_LAUNCH_AFTER_INSTALL(1),
    NO_PROCESS_FIRST_LAUNCH_AFTER_UPGRADE(1),
    NO_PROCESS_FIRST_LAUNCH_AFTER_CLEAR_DATA(1),
    PROCESS_WAS_LAUNCHING_IN_BACKGROUND(2),
    NO_ACTIVITY_NO_SAVED_STATE(2),
    NO_ACTIVITY_BUT_SAVED_STATE(2),
    ACTIVITY_WAS_STOPPED(3);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f7908Y;

    o(int i10) {
        this.f7908Y = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name() + '(' + E9.f.N(this.f7908Y) + ')';
    }
}
