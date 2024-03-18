package ae;

import G.X;
import M3.H;
import U3.n;
import android.view.View;
import android.view.Window;
import be.k;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* renamed from: ae.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1983i {

    /* renamed from: a  reason: collision with root package name */
    public static final AbstractC3957g f24164a = R4.b.C1(EnumC3958h.f36153Z, C1975a.f24156h0);

    public static final Window a(View view) {
        Field field;
        AbstractC3557B.c0("$this$phoneWindow", view);
        AbstractC3957g abstractC3957g = k.f25970a;
        View rootView = view.getRootView();
        AbstractC3557B.b0("rootView", rootView);
        Class cls = (Class) k.f25970a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) k.f25971b.getValue()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        if (obj != null) {
            return (Window) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.Window");
    }

    public static final CopyOnWriteArrayList b(Window window) {
        AbstractC3957g abstractC3957g = be.i.f25961i0;
        return (CopyOnWriteArrayList) H.S(window).f17426Y;
    }

    public static final void c(Window window, X x10) {
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            x10.invoke(peekDecorView);
            return;
        }
        AbstractC3957g abstractC3957g = be.i.f25961i0;
        n S = H.S(window);
        ((CopyOnWriteArrayList) S.f17428h0).add(new C1982h(S, window, x10));
    }
}
