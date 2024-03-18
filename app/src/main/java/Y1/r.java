package y1;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes2.dex */
public abstract class r {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
