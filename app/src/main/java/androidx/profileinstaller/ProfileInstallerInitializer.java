package androidx.profileinstaller;

import E3.b;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import m.RunnableC4517N;
import u3.AbstractC5832e;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // E3.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // E3.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new Object();
        }
        AbstractC5832e.a(new RunnableC4517N(this, 17, context.getApplicationContext()));
        return new Object();
    }
}
