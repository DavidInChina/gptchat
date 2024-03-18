package D1;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class W implements OnReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0375v f3242a;

    public W(AbstractC0375v abstractC0375v) {
        this.f3242a = abstractC0375v;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0353h c0353h = new C0353h(new F4.a(contentInfo));
        C0353h a5 = ((H1.y) this.f3242a).a(view, c0353h);
        if (a5 == null) {
            return null;
        }
        if (a5 == c0353h) {
            return contentInfo;
        }
        ContentInfo m10 = a5.f3268a.m();
        Objects.requireNonNull(m10);
        return A1.b.i(m10);
    }
}
