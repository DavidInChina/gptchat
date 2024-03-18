package A1;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f380a;

    public e(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.f380a = activity;
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f380a.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        b(theme, typedValue);
    }

    public final void b(Resources.Theme theme, TypedValue typedValue) {
        int i10;
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i10 = typedValue.resourceId) != 0) {
            this.f380a.setTheme(i10);
        }
    }
}
