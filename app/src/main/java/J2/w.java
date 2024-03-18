package J2;

import android.os.Handler;
import m.RunnableC4517N;
import p2.r0;
import y2.C6520g;
import y2.SurfaceHolder$CallbackC6500C;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f8836a;

    /* renamed from: b  reason: collision with root package name */
    public final x f8837b;

    public w(Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C) {
        this.f8836a = handler;
        this.f8837b = surfaceHolder$CallbackC6500C;
    }

    public final void a(C6520g c6520g) {
        synchronized (c6520g) {
        }
        Handler handler = this.f8836a;
        if (handler != null) {
            handler.post(new v(this, c6520g, 1));
        }
    }

    public final void b(r0 r0Var) {
        Handler handler = this.f8836a;
        if (handler != null) {
            handler.post(new RunnableC4517N(this, 14, r0Var));
        }
    }
}
