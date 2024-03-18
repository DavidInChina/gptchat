package hh;

import ae.AbstractC1980f;
import ae.AbstractC1983i;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import jf.AbstractC3957g;
import z.AbstractC6708l;

/* renamed from: hh.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3447o implements AbstractC1980f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f32372a;

    public C3447o(p pVar) {
        this.f32372a = pVar;
    }

    @Override // ae.AbstractC1980f
    public final void a(View view, boolean z10) {
        AbstractC3557B.d0("view", view);
        if (z10) {
            b(view);
        }
    }

    public final void b(View view) {
        int i10;
        Window.Callback callback;
        AbstractC3557B.d0("rootView", view);
        AbstractC3957g abstractC3957g = AbstractC1983i.f24164a;
        View rootView = view.getRootView();
        AbstractC3957g abstractC3957g2 = be.k.f25970a;
        AbstractC3557B.b0("rootView", rootView);
        Class cls = (Class) be.k.f25970a.getValue();
        Window.Callback callback2 = null;
        if (cls != null && cls.isInstance(rootView)) {
            i10 = 1;
        } else {
            ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            if (!(layoutParams instanceof WindowManager.LayoutParams)) {
                layoutParams = null;
            }
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            i10 = 5;
            if (layoutParams2 != null) {
                CharSequence title = layoutParams2.getTitle();
                if (AbstractC3557B.K(title, "Toast")) {
                    i10 = 4;
                } else if (AbstractC3557B.K(title, (String) AbstractC1983i.f24164a.getValue()) || AbstractC3557B.K(title, "TooltipPopup")) {
                    i10 = 3;
                } else {
                    AbstractC3557B.b0("title", title);
                    if (Lg.n.K2(title, "PopupWindow:")) {
                        i10 = 2;
                    }
                }
            }
        }
        int f6 = AbstractC6708l.f(i10);
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 != 2 && f6 != 3 && f6 != 4) {
                    throw new RuntimeException();
                }
            } else {
                return;
            }
        } else {
            Window a5 = AbstractC1983i.a(view);
            if (a5 != null && (callback = a5.getCallback()) != null) {
                AbstractC3957g abstractC3957g3 = be.i.f25961i0;
                while (callback != null) {
                    if (callback instanceof be.i) {
                        callback = ((be.i) callback).f25966h0;
                    } else {
                        Class cls2 = (Class) be.i.f25961i0.getValue();
                        if (cls2 != null && cls2.isInstance(callback)) {
                            Field field = (Field) be.i.f25962j0.getValue();
                            AbstractC3557B.Z(field);
                            callback = (Window.Callback) field.get(callback);
                        } else {
                            callback2 = callback;
                            break;
                        }
                    }
                }
            }
            if (!(callback2 instanceof Activity)) {
                if (callback2 instanceof Dialog) {
                    Context context = view.getContext();
                    AbstractC3557B.Y("rootView.context", context);
                    Context applicationContext = context.getApplicationContext();
                    AbstractC3557B.Y("rootView.context.applicationContext", applicationContext);
                    if (!applicationContext.getResources().getBoolean(R.bool.leak_canary_watcher_watch_dismissed_dialogs)) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC3446n(this, view));
    }
}
