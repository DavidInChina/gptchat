package w7;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class o extends q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Intent f48187Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f48188Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f48189h0 = 2;

    public o(Activity activity, Intent intent) {
        this.f48187Y = intent;
        this.f48188Z = activity;
    }

    @Override // w7.q
    public final void a() {
        Intent intent = this.f48187Y;
        if (intent != null) {
            this.f48188Z.startActivityForResult(intent, this.f48189h0);
        }
    }
}
