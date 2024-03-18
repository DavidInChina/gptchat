package androidx.work;

import E3.b;
import L3.C0889a;
import L3.s;
import M3.F;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25517a = s.f("WrkMgrInitializer");

    @Override // E3.b
    public final List a() {
        return Collections.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        r2 = r5.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (M3.F.f11515q != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        M3.F.f11515q = M3.H.L(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        M3.F.f11514p = M3.F.f11515q;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [R4.a, java.lang.Object] */
    @Override // E3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context) {
        s.d().a(f25517a, "Initializing WorkManager with default configuration.");
        C0889a c0889a = new C0889a(new Object());
        synchronized (F.f11516r) {
            try {
                F f6 = F.f11514p;
                if (f6 != null && F.f11515q != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return F.g0(context);
    }
}
