package u3;

import T0.E;
import android.view.Choreographer;

/* renamed from: u3.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5832e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new E(1, runnable));
    }
}
