package j9;

import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.C1794f;
import id.AbstractC3557B;
import java.lang.Thread;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;

/* renamed from: j9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3928d implements Thread.UncaughtExceptionHandler {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3928d f36085Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static Thread.UncaughtExceptionHandler f36086Z;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        String o10;
        AbstractC3557B.c0("t", thread);
        AbstractC3557B.c0("e", th2);
        try {
            AbstractC1805k0 a5 = AbstractC1809m0.a();
            C1794f c1794f = C1794f.f23344c;
            C3959i[] c3959iArr = new C3959i[4];
            c3959iArr[0] = new C3959i("thread", thread.getName());
            Class<?> cls = th2.getClass();
            D d10 = C.f37623a;
            String o11 = d10.b(cls).o();
            String str = "Unknown";
            if (o11 == null) {
                o11 = str;
            }
            c3959iArr[1] = new C3959i("exception_type", o11);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            c3959iArr[2] = new C3959i("exception_message", message);
            Throwable cause = th2.getCause();
            if (cause != null && (o10 = d10.b(cause.getClass()).o()) != null) {
                str = o10;
            }
            c3959iArr[3] = new C3959i("exception_cause_type", str);
            a5.b(c1794f, AbstractC4268D.a1(c3959iArr));
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f36086Z;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        } catch (Throwable th3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = f36086Z;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th2);
            }
            throw th3;
        }
    }
}
