package q6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: q6.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5278c extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5278c f43944Z = new C5278c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5278c f43945h0 = new C5278c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5278c f43946i0 = new C5278c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C5278c f43947j0 = new C5278c(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C5278c f43948k0 = new C5278c(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C5278c f43949l0 = new C5278c(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43950Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5278c(int i10) {
        super(0);
        this.f43950Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f43950Y) {
            case 0:
                return "We could not find a valid target for the SCROLL or SWIPE event. The DecorView was empty and either transparent or not clickable for this Activity.";
            case 1:
                return "We could not find a valid target for the TAP event. The DecorView was empty and either transparent or not clickable for this Activity.";
            case 2:
                return "Received null KeyEvent";
            case 3:
                return "Error processing MotionEvent";
            case 4:
                return "Received null MotionEvent";
            default:
                return "Wrapped Window.Callback failed processing event";
        }
    }
}
