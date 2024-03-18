package x3;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class u extends RemoteCallbackList {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f48730a;

    public u(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f48730a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        AbstractC3557B.c0("callback", (i) iInterface);
        AbstractC3557B.c0(ParameterNames.COOKIE, obj);
        this.f48730a.f25510Z.remove((Integer) obj);
    }
}
