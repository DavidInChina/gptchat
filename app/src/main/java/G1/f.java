package G1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: Y  reason: collision with root package name */
    public final InputContentInfo f5853Y;

    public f(Object obj) {
        this.f5853Y = (InputContentInfo) obj;
    }

    @Override // G1.g
    public final Uri a() {
        return this.f5853Y.getContentUri();
    }

    @Override // G1.g
    public final void d() {
        this.f5853Y.requestPermission();
    }

    @Override // G1.g
    public final Uri e() {
        return this.f5853Y.getLinkUri();
    }

    @Override // G1.g
    public final Object f() {
        return this.f5853Y;
    }

    @Override // G1.g
    public final ClipDescription getDescription() {
        return this.f5853Y.getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f5853Y = new InputContentInfo(uri, clipDescription, uri2);
    }
}
