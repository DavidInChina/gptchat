package w7;

import android.content.Intent;
import v7.AbstractC5989g;

/* loaded from: classes2.dex */
public final class p extends q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Intent f48190Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC5989g f48191Z;

    public p(Intent intent, AbstractC5989g abstractC5989g) {
        this.f48190Y = intent;
        this.f48191Z = abstractC5989g;
    }

    @Override // w7.q
    public final void a() {
        Intent intent = this.f48190Y;
        if (intent != null) {
            this.f48191Z.startActivityForResult(intent, 2);
        }
    }
}
