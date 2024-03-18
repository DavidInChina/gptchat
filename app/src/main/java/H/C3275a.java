package h;

import K4.J;
import jf.y;

/* renamed from: h.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3275a {

    /* renamed from: a  reason: collision with root package name */
    public J f31645a;

    public final void a(Object obj) {
        y yVar;
        J j6 = this.f31645a;
        if (j6 != null) {
            j6.K(obj);
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return;
        }
        throw new IllegalStateException("Launcher has not been initialized".toString());
    }
}
