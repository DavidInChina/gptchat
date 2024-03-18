package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a implements io.sentry.internal.gestures.a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f34118a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f34119b = new int[2];

    public a(boolean z10) {
        this.f34118a = z10;
    }

    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.c a(View view, float f6, float f10, io.sentry.internal.gestures.b bVar) {
        int[] iArr = this.f34119b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (f6 < i10 || f6 > i10 + width || f10 < i11 || f10 > i11 + height) {
            return null;
        }
        if (bVar == io.sentry.internal.gestures.b.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
            try {
                return new io.sentry.internal.gestures.c(view, AbstractC3557B.j1(view), R4.b.q1(view), null, "old_view_system");
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        } else if (bVar != io.sentry.internal.gestures.b.SCROLLABLE) {
            return null;
        } else {
            if (((!this.f34118a || !ScrollingView.class.isAssignableFrom(view.getClass())) && !AbsListView.class.isAssignableFrom(view.getClass()) && !ScrollView.class.isAssignableFrom(view.getClass())) || view.getVisibility() != 0) {
                return null;
            }
            try {
                return new io.sentry.internal.gestures.c(view, AbstractC3557B.j1(view), R4.b.q1(view), null, "old_view_system");
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
    }
}
