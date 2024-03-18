package q6;

import android.view.MotionEvent;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes2.dex */
public final class f extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public static final f f43962Y = new o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        AbstractC3557B.c0("it", motionEvent);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        AbstractC3557B.b0("obtain(it)", obtain);
        return obtain;
    }
}
