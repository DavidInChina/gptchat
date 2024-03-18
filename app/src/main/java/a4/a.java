package A4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;
import v4.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f650d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f651a;

    /* renamed from: b  reason: collision with root package name */
    public final String f652b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f653c;

    public a(Drawable.Callback callback, Map map) {
        if (TextUtils.isEmpty(null)) {
            this.f652b = null;
            this.f653c = map;
            if (!(callback instanceof View)) {
                this.f651a = null;
                return;
            } else {
                this.f651a = ((View) callback).getContext().getApplicationContext();
                return;
            }
        }
        throw null;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f650d) {
            ((m) this.f653c.get(str)).f47234f = bitmap;
        }
    }
}
