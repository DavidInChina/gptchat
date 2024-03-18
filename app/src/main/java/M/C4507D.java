package m;

import A2.C0062f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* renamed from: m.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4507D extends BroadcastReceiver {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f38590c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38591a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f38592b;

    public /* synthetic */ C4507D(int i10, Object obj) {
        this.f38591a = i10;
        this.f38592b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("hP1J40oAjs7oV4fe", new Object[]{this, context, intent});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4507D(C0062f c0062f) {
        this(3, c0062f);
        this.f38591a = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4507D(s2.s sVar) {
        this(1, sVar);
        this.f38591a = 1;
    }
}
