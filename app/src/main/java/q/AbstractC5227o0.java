package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: q.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5227o0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C5229p0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
