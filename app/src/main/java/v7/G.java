package v7;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.C3636c1;

/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    public final int f47280a;

    public G(int i10) {
        this.f47280a = i10;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(s sVar);

    public abstract void d(C3636c1 c3636c1, boolean z10);
}
