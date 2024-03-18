package D1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: D1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345d implements AbstractC0347e {

    /* renamed from: Y  reason: collision with root package name */
    public final ContentInfo.Builder f3258Y;

    public C0345d(ClipData clipData, int i10) {
        this.f3258Y = A1.b.g(clipData, i10);
    }

    @Override // D1.AbstractC0347e
    public final C0353h f() {
        ContentInfo build;
        build = this.f3258Y.build();
        return new C0353h(new F4.a(build));
    }

    @Override // D1.AbstractC0347e
    public final void i(Bundle bundle) {
        this.f3258Y.setExtras(bundle);
    }

    @Override // D1.AbstractC0347e
    public final void j(Uri uri) {
        this.f3258Y.setLinkUri(uri);
    }

    @Override // D1.AbstractC0347e
    public final void k(int i10) {
        this.f3258Y.setFlags(i10);
    }
}
