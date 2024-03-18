package A2;

import D1.P0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.util.WeakHashMap;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import s2.AbstractC5530A;
import y2.C6499B;
import y2.C6504G;
import y2.SurfaceHolder$CallbackC6500C;

/* renamed from: A2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0070n implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f576Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f577Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f578h0;

    public /* synthetic */ RunnableC0070n(Object obj, boolean z10, int i10) {
        this.f576Y = i10;
        this.f578h0 = obj;
        this.f577Z = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        r0 = null;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        P0 p02;
        int i10 = this.f576Y;
        boolean z10 = this.f577Z;
        Object obj = this.f578h0;
        switch (i10) {
            case 0:
                int i11 = AbstractC5530A.f45131a;
                C6504G c6504g = ((SurfaceHolder$CallbackC6500C) ((U3.l) obj).f17424h0).f50334Y;
                if (c6504g.S != z10) {
                    c6504g.S = z10;
                    c6504g.f50373l.l(23, new C6499B(z10));
                    return;
                }
                return;
            default:
                View view = (View) obj;
                if (z10) {
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        p02 = D1.U.c(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            } else if (context instanceof Activity) {
                                Window window = ((Activity) context).getWindow();
                                if (window != null) {
                                    p02 = new P0(window, view);
                                }
                            } else {
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                    }
                    if (p02 != null) {
                        p02.f3241a.P();
                        return;
                    }
                }
                Context context2 = view.getContext();
                Object obj2 = AbstractC5042g.f41723a;
                ((InputMethodManager) AbstractC5039d.b(context2, InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
