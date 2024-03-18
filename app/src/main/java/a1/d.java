package A1;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public final c f379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity) {
        super(activity);
        AbstractC3557B.c0("activity", activity);
        this.f379b = new c(this, activity);
    }

    @Override // A1.e
    public final void a() {
        Activity activity = this.f380a;
        Resources.Theme theme = activity.getTheme();
        AbstractC3557B.b0("activity.theme", theme);
        b(theme, new TypedValue());
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f379b);
    }
}
