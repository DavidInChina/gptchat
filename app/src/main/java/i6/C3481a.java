package i6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: i6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3481a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3481a f32716Z = new C3481a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3481a f32717h0 = new C3481a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3481a f32718i0 = new C3481a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3481a f32719j0 = new C3481a(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32720Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3481a(int i10) {
        super(0);
        this.f32720Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f32720Y) {
            case 0:
                return "A RumMonitor has already been registered for this SDK instance";
            case 1:
                return "SDK instance provided doesn't implement InternalSdkCore.";
            case 2:
                return "You're trying to create a RumMonitor instance, but the RUM application id was empty. No RUM data will be sent.";
            default:
                return "RUM Feature is already enabled in this SDK core, ignoring the call to enable it.";
        }
    }
}
