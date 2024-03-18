package o6;

import wf.AbstractC6216a;

/* renamed from: o6.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4927f extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4927f f40848Z = new C4927f(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4927f f40849h0 = new C4927f(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4927f f40850i0 = new C4927f(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C4927f f40851j0 = new C4927f(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C4927f f40852k0 = new C4927f(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40853Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4927f(int i10) {
        super(0);
        this.f40853Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f40853Y) {
            case 0:
                return "Application has multiple active sessions when starting a new session";
            case 1:
            case 2:
                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
            case 3:
                return "Trying to update global RUM context when StopView event arrived, but the context doesn't reference this view.";
            default:
                return "Trying to update active action in the global RUM context, but the context doesn't reference this view.";
        }
    }
}
