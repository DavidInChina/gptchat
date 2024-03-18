package l8;

import A.AbstractC0044t0;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import java.util.HashSet;

/* renamed from: l8.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4346d implements m8.c {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37868Y;

    /* renamed from: Z  reason: collision with root package name */
    public final m8.c f37869Z;

    public /* synthetic */ C4346d(m8.c cVar, int i10) {
        this.f37868Y = i10;
        this.f37869Z = cVar;
    }

    @Override // m8.c
    public final Object g() {
        int i10 = this.f37868Y;
        m8.c cVar = this.f37869Z;
        switch (i10) {
            case 0:
                Context context = ((C4348f) cVar).f37872Y.f24351a;
                if (context != null) {
                    AbstractC0044t0.y("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
                    new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
                    Object obj = new Object();
                    new HashSet();
                    context.getApplicationContext();
                    return obj;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                C4347e c4347e = (C4347e) cVar.g();
                if (c4347e != null) {
                    return c4347e;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
