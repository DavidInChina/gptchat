package E5;

import F5.g;
import H5.h;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.pairip.VMRunner;
import java.util.Set;
import q5.C5274d;

/* loaded from: classes2.dex */
public final class a extends L5.a implements e {

    /* renamed from: j0  reason: collision with root package name */
    public static final Set f4517j0 = R4.b.X1(0, 4, 5, 2, 3);

    /* renamed from: k0  reason: collision with root package name */
    public static final Set f4518k0 = R4.b.X1(1, 2, 4, 7, 11, 16);

    /* renamed from: l0  reason: collision with root package name */
    public static final Set f4519l0 = R4.b.X1(3, 5, 6, 8, 9, 10, 12, 14, 15, 17);

    /* renamed from: m0  reason: collision with root package name */
    public static final Set f4520m0 = R4.b.X1(13, 18, 19);

    /* renamed from: n0  reason: collision with root package name */
    public static final Set f4521n0 = R4.b.W1(20);

    /* renamed from: Z  reason: collision with root package name */
    public final g f4522Z;

    /* renamed from: h0  reason: collision with root package name */
    public final R4.a f4523h0;

    /* renamed from: i0  reason: collision with root package name */
    public C5274d f4524i0 = new C5274d(0, null, null, null, null, null, null, 127);

    /* JADX WARN: Type inference failed for: r0v0, types: [R4.a, java.lang.Object] */
    public a(h hVar) {
        ?? obj = new Object();
        this.f4522Z = hVar;
        this.f4523h0 = obj;
    }

    @Override // E5.e
    public final void F(Context context) {
        onReceive(context, b(context, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")));
    }

    @Override // E5.e
    public final C5274d R() {
        return this.f4524i0;
    }

    @Override // E5.e
    public final void a(Context context) {
        if (this.f10744Y.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("A3nMACwzuqgFmlRm", new Object[]{this, context, intent});
    }
}
