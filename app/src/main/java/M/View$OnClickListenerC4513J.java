package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.gov.nist.core.Separators;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnClickListenerC4513J implements View.OnClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final View f38666Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f38667Z;

    /* renamed from: h0  reason: collision with root package name */
    public Method f38668h0;

    /* renamed from: i0  reason: collision with root package name */
    public Context f38669i0;

    public View$OnClickListenerC4513J(View view, String str) {
        this.f38666Y = view;
        this.f38667Z = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.f38668h0 == null) {
            View view2 = this.f38666Y;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f38667Z;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f38668h0 = method;
                            this.f38669i0 = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    if (view2.getId() == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + Separators.QUOTE;
                    }
                    StringBuilder s10 = android.gov.nist.core.a.s("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    s10.append(view2.getClass());
                    s10.append(str);
                    throw new IllegalStateException(s10.toString());
                }
            }
        }
        try {
            this.f38668h0.invoke(this.f38669i0, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
