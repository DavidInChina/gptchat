package w6;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f48033Z = new c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final c f48034h0 = new c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final c f48035i0 = new c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final c f48036j0 = new c(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final c f48037k0 = new c(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final c f48038l0 = new c(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final c f48039m0 = new c(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final c f48040n0 = new c(7);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48041Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f48041Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f48041Y) {
            case 0:
                return "Activity stopped but window was not tracked";
            case 1:
                return "Trying to disable JankStats instance which was already disabled before, this shouldn't happen.";
            case 2:
                return "Failed to disable JankStats tracking";
            case 3:
                return "Unable to attach JankStatsListener to window";
            case 4:
                return "Unable to attach JankStatsListener to window, decorView is null or not hardware accelerated";
            case 5:
                return "Unable to create JankStats";
            case 6:
                return "Unable to detach JankStatsListener to window, most probably because it wasn't attached";
            default:
                return "Unable to attach JankStats to the current window";
        }
    }
}
