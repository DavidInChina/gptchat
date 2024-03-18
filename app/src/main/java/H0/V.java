package H0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public static final V f6881a = new Object();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view, ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }
}
