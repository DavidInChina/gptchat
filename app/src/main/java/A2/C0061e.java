package A2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: A2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061e extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f540a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f541b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0062f f542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061e(C0062f c0062f, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f542c = c0062f;
        this.f540a = contentResolver;
        this.f541b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        C0062f c0062f = this.f542c;
        C0062f.a(c0062f, C0059c.b(c0062f.f543a));
    }
}
