package q1;

import android.content.pm.ShortcutInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: q1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5259e {
    public static String a(List list) {
        Iterator it = list.iterator();
        int i10 = -1;
        String str = null;
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (shortcutInfo.getRank() > i10) {
                str = shortcutInfo.getId();
                i10 = shortcutInfo.getRank();
            }
        }
        return str;
    }
}
