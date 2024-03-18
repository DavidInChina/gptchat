package androidx.core.view;

import J0.a;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* loaded from: classes2.dex */
public final class GestureDetectorCompat {

    /* renamed from: a  reason: collision with root package name */
    public final a f24927a;

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J0.a] */
    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        ?? obj = new Object();
        obj.f8729Y = new GestureDetector(context, onGestureListener, handler);
        this.f24927a = obj;
    }
}
