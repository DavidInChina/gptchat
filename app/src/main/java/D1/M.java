package D1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class M implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public J0 f3235a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3236b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0374u f3237c;

    public M(View view, AbstractC0374u abstractC0374u) {
        this.f3236b = view;
        this.f3237c = abstractC0374u;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        J0 g10 = J0.g(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        AbstractC0374u abstractC0374u = this.f3237c;
        if (i10 < 30) {
            N.a(windowInsets, this.f3236b);
            if (g10.equals(this.f3235a)) {
                return abstractC0374u.e(view, g10).f();
            }
        }
        this.f3235a = g10;
        J0 e10 = abstractC0374u.e(view, g10);
        if (i10 >= 30) {
            return e10.f();
        }
        WeakHashMap weakHashMap = Z.f3247a;
        L.c(view);
        return e10.f();
    }
}
