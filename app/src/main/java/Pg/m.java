package Pg;

import Ng.AbstractC1070k;
import com.statsig.androidsdk.ErrorBoundaryKt;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final t f14222a = new t(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f14223b = A7.b.K1(32, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c  reason: collision with root package name */
    public static final int f14224c = A7.b.K1(ErrorBoundaryKt.SAMPLING_RATE, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d  reason: collision with root package name */
    public static final Q1.u f14225d = new Q1.u("BUFFERED", 9, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final Q1.u f14226e = new Q1.u("SHOULD_BUFFER", 9, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final Q1.u f14227f = new Q1.u("S_RESUMING_BY_RCV", 9, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final Q1.u f14228g = new Q1.u("RESUMING_BY_EB", 9, 0);

    /* renamed from: h  reason: collision with root package name */
    public static final Q1.u f14229h = new Q1.u("POISONED", 9, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final Q1.u f14230i = new Q1.u("DONE_RCV", 9, 0);

    /* renamed from: j  reason: collision with root package name */
    public static final Q1.u f14231j = new Q1.u("INTERRUPTED_SEND", 9, 0);

    /* renamed from: k  reason: collision with root package name */
    public static final Q1.u f14232k = new Q1.u("INTERRUPTED_RCV", 9, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final Q1.u f14233l = new Q1.u("CHANNEL_CLOSED", 9, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final Q1.u f14234m = new Q1.u("SUSPEND", 9, 0);

    /* renamed from: n  reason: collision with root package name */
    public static final Q1.u f14235n = new Q1.u("SUSPEND_NO_WAITER", 9, 0);

    /* renamed from: o  reason: collision with root package name */
    public static final Q1.u f14236o = new Q1.u("FAILED", 9, 0);

    /* renamed from: p  reason: collision with root package name */
    public static final Q1.u f14237p = new Q1.u("NO_RECEIVE_RESULT", 9, 0);

    /* renamed from: q  reason: collision with root package name */
    public static final Q1.u f14238q = new Q1.u("CLOSE_HANDLER_CLOSED", 9, 0);

    /* renamed from: r  reason: collision with root package name */
    public static final Q1.u f14239r = new Q1.u("CLOSE_HANDLER_INVOKED", 9, 0);

    /* renamed from: s  reason: collision with root package name */
    public static final Q1.u f14240s = new Q1.u("NO_CLOSE_CAUSE", 9, 0);

    public static final boolean a(AbstractC1070k abstractC1070k, Object obj, wf.k kVar) {
        Q1.u x10 = abstractC1070k.x(obj, kVar);
        if (x10 != null) {
            abstractC1070k.B(x10);
            return true;
        }
        return false;
    }
}
