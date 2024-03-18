package y5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: y5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6544c extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6544c f50768Z = new C6544c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6544c f50769h0 = new C6544c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C6544c f50770i0 = new C6544c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C6544c f50771j0 = new C6544c(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C6544c f50772k0 = new C6544c(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50773Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6544c(int i10) {
        super(0);
        this.f50773Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f50773Y) {
            case 0:
                return "Unable to read your application's version name";
            case 1:
                return "Unable to launch a synchronize local time with an NTP server.";
            case 2:
                return "Thread was unable to set its own interrupted state";
            case 3:
                return "Trying to shut down Kronos when it is already not running";
            default:
                return "Cannot generate SHA-256 hash.";
        }
    }
}
