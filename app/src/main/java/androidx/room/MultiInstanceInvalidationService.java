package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import x3.t;
import x3.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: Y  reason: collision with root package name */
    public int f25509Y;

    /* renamed from: Z  reason: collision with root package name */
    public final LinkedHashMap f25510Z = new LinkedHashMap();

    /* renamed from: h0  reason: collision with root package name */
    public final u f25511h0 = new u(this);

    /* renamed from: i0  reason: collision with root package name */
    public final t f25512i0 = new t(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        return this.f25512i0;
    }
}
